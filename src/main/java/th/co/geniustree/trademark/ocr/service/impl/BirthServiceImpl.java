package th.co.geniustree.trademark.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import th.co.geniustree.trademark.ocr.domain.*;
import th.co.geniustree.trademark.ocr.exception.ResourceNotFoundException;
import th.co.geniustree.trademark.ocr.repository.*;
import th.co.geniustree.trademark.ocr.repository.specification.CtltLocationSpecification;
import th.co.geniustree.trademark.ocr.service.BirthService;
import th.co.geniustree.trademark.ocr.service.dto.BirthAgencyDto;
import th.co.geniustree.trademark.ocr.service.dto.BirthDto;
import th.co.geniustree.trademark.ocr.service.dto.BirthOwnerDto;
import th.co.geniustree.trademark.ocr.service.dto.NiceClassDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by saranrat on 7/6/2560.
 */
@Service
@Transactional
public class BirthServiceImpl implements BirthService {

    @Autowired
    private CtltCountryRepo ctltCountryRepo;

    @Autowired
    private CtltLocationRepo ctltLocationRepo;

    @Autowired
    private CtltNationRepo ctltNationRepo;

    @Autowired
    private CtltOccupationRepo ctltOccupationRepo;

    @Autowired
    private CtltNiceClassRepo ctltNiceClassRepo;

    @Autowired
    private SistNo01Repo sistNo01Repo;

    @Autowired
    private SistNo01OwnerRepo sistNo01OwnerRepo;

    @Autowired
    private SistNo01AgencyRepo sistNo01AgencyRepo;

    @Autowired
    private SistNo01NiceRepo sistNo01NiceRepo;

    @Autowired
    private SistRecvTmRepo sistRecvTmRepo;

    @Override
    public void saveBirth(BirthDto birthDto) {
        SistNo01 sistNo01 = new SistNo01();
        sistNo01.setTrNo(birthDto.getTrNo());
        sistNo01.setTrDate(birthDto.getTrwDate());
        sistNo01.setTrType(birthDto.getMarkType().getNumber());
        sistNo01.setFeeAmount(birthDto.getFeeAmount());
        sistNo01.setContName(birthDto.getContractName());
        sistNo01.setContAddr(birthDto.getContractAddr());
        CtltLocation location = findCtltLocation(birthDto.getProvCode(), birthDto.getAumpCode(), birthDto.getTumbonStr());
        sistNo01.setCtltLocation(location);
        sistNo01.setContPostcode(birthDto.getContractPostcode());
        sistNo01.setContPhone(birthDto.getContractPhone());
        sistNo01.setContFax(birthDto.getContractFax());
        sistNo01.setContEmail(birthDto.getContractEmail());
        sistNo01.setOtopType(birthDto.getOtopType().getNumber());
        sistNo01.setOtopNo(birthDto.getOtopNo());
        sistNo01.setThreeDFlag(birthDto.getThreeDShapesFlag().getNumber());
        sistNo01.setColourgrpFlag(birthDto.getColorGroupsFlag().getNumber());
        sistNo01.setSoundFlag(birthDto.getSoundMarkFlag().getNumber());
        sistNo01.setRuleDesc(birthDto.getRuleDescription());
        SistRecvTm sistRecvTm = sistRecvTmRepo.findByTrNo(birthDto.getTrNo());
        sistNo01.setSistRecvTm(sistRecvTm);

        sistNo01 = sistNo01Repo.save(sistNo01);
        generateOwner(birthDto.getOwners(),sistNo01);
        generateAgency(birthDto.getAgencies(),sistNo01);
        generateSistNo01Nice(birthDto.getNiceClasses(),sistNo01);
    }


    private void generateOwner(List<BirthOwnerDto> birthOwnerDtos,SistNo01 sistNo01) {
        List<SistNo01Owner> sistNo01OwnerList= new ArrayList<>();
        Long seq =1L;
        for (BirthOwnerDto owner : birthOwnerDtos) {

            SistNo01Owner sistNo01Owner = new SistNo01Owner();
            sistNo01Owner.setOwnerSeq(seq);
            seq++;
            sistNo01Owner.setOwnerCardType(owner.getOwnerCardType().getNumber());
            sistNo01Owner.setOwnerCardNo(owner.getCardNo());
            sistNo01Owner.setOwnerName(owner.getName());
            sistNo01Owner.setOwnerAddr(owner.getAddress());
            sistNo01Owner.setOwnerPostcode(owner.getPostcode());
            sistNo01Owner.setOwnerPhone(owner.getPhone());
            sistNo01Owner.setOwnerFax(owner.getFax());
            sistNo01Owner.setOwnerEmail(owner.getEmail());
            sistNo01Owner.setCtltNation(findCtltNation(owner.getNatId()));
            sistNo01Owner.setCtltOccupation(findCtltOccupation(owner.getOccuId()));
            CtltLocation location = findCtltLocation(owner.getProvCode(), owner.getAumpCode(), owner.getTumbonStr());
            sistNo01Owner.setCtltLocation(location);
            sistNo01Owner.setCtltCountry(findCtltCountry(owner.getCountryId()));
            sistNo01Owner.setSistNo01(sistNo01);
            sistNo01OwnerRepo.save(sistNo01Owner);


            sistNo01OwnerList.add(sistNo01Owner);
        }
//        return sistNo01OwnerList;
    }

    private void generateAgency(List<BirthAgencyDto> birthAgencyDtos,SistNo01 sistNo01) {
        Long seq =1L;
        List<SistNo01Agency> sistNo01AgencyList = new ArrayList<>();
        for (BirthAgencyDto agency : birthAgencyDtos) {

            SistNo01Agency sistNo01Agency = new SistNo01Agency();
            sistNo01Agency.setAgenSeq(seq);
            seq++;
            sistNo01Agency.setAgenCardType(agency.getAgencyCardType().getNumber());
            sistNo01Agency.setAndOrType(agency.getAndOrType().getNumber());
            sistNo01Agency.setAgenCardNo(agency.getCardNo());
            sistNo01Agency.setAgenKind(agency.getAgencyKind().getNumber());
            sistNo01Agency.setAgenType(agency.getAgencyType().getNumber());
            sistNo01Agency.setAgenName(agency.getName());
            sistNo01Agency.setCtltNation(findCtltNation(agency.getNatId()));
            sistNo01Agency.setCtltOccupation(findCtltOccupation(agency.getOccuId()));
            sistNo01Agency.setAgenAddr(agency.getAddress());
            CtltLocation location = findCtltLocation(agency.getProvCode(), agency.getAumpCode(), agency.getTumbonStr());
            sistNo01Agency.setCtltLocation(location);
            sistNo01Agency.setAgenPostcode(agency.getPostcode());
            sistNo01Agency.setCtltCountry(findCtltCountry(agency.getCountryId()));
            sistNo01Agency.setAgenPhone(agency.getPhone());
            sistNo01Agency.setAgenFax(agency.getFax());
            sistNo01Agency.setAgenEmail(agency.getEmail());
            sistNo01Agency.setSistNo01(sistNo01);

            sistNo01AgencyRepo.save(sistNo01Agency);
            sistNo01AgencyList.add(sistNo01Agency);
        }
//        return sistNo01AgencyList;
    }

    private void generateSistNo01Nice(List<NiceClassDto> niceClassDtos,SistNo01 sistNo01) {

        List<SistNo01Nice>  sistNo01NiceList = new ArrayList<>();
        for (NiceClassDto niceClass : niceClassDtos) {
            SistNo01Nice sistNo01Nice = new SistNo01Nice();

            sistNo01Nice.setCtltNiceClass(findCtltNiceClass(niceClass.getNiceClassId()));
            sistNo01Nice.setNiceDetail(niceClass.getNiceDetail());
            sistNo01Nice.setSistNo01(sistNo01);
            sistNo01NiceRepo.save(sistNo01Nice);
            sistNo01NiceList.add(sistNo01Nice);
        }
//        return sistNo01NiceList;
    }

    private CtltLocation findCtltLocation(String provCode, String aumpCode, String tumbonName) {
        Specifications<CtltLocation> spec = Specifications.where(CtltLocationSpecification.provCodeEqual(provCode))
                .and(CtltLocationSpecification.aumpCodeEqal(aumpCode))
                .and(CtltLocationSpecification.tumbonNameEqal(tumbonName));
        List<CtltLocation> locationList = ctltLocationRepo.findAll(spec);

//        Optional<CtltLocation> location  = ctltLocationRepo.findByProvCodeAndAndAumpCodeAndTumbonName(provCode,aumpCode,tumbonName);
        if (locationList.isEmpty()) {
            throw new ResourceNotFoundException("ไม่พบที่อยู่");
        }
        return locationList.get(0);
    }

    private CtltNation findCtltNation(Long natId){
        Optional<CtltNation> ctltNation = Optional.ofNullable(ctltNationRepo.findOne(natId));
        if(!ctltNation.isPresent()){
            throw new ResourceNotFoundException("ไม่พบเชื้อชาติ");
        }
        return ctltNation.get();
    }

    private CtltOccupation findCtltOccupation(Long occuId){
        return ctltOccupationRepo.findOne(occuId);
    }

    private CtltCountry findCtltCountry(Long countryId){
        return ctltCountryRepo.findOne(countryId);
    }

    private CtltNiceClass findCtltNiceClass(Long niceClassId){
        return ctltNiceClassRepo.findOne(niceClassId);
    }
}
