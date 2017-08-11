package th.co.geniustree.trademark.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import th.co.geniustree.trademark.ocr.domain.*;
import th.co.geniustree.trademark.ocr.exception.ResourceExistException;
import th.co.geniustree.trademark.ocr.exception.ResourceNotFoundException;
import th.co.geniustree.trademark.ocr.repository.*;
import th.co.geniustree.trademark.ocr.repository.specification.CtltLocationSpecification;
import th.co.geniustree.trademark.ocr.service.BirthService;
import th.co.geniustree.trademark.ocr.service.CtltService;
import th.co.geniustree.trademark.ocr.service.dto.*;

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
    private CtltService ctltService;

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

    @Autowired
    private SistNo01CombineRepo sistNo01CombineRepo;

    @Override
    public String saveBirth(BirthDto birthDto) {
        Optional<SistNo01> sistNo01Optional = sistNo01Repo.findByTrNo(birthDto.getTrNo());

        if(!sistNo01Optional.isPresent()) {
           SistNo01 sistNo01 = new SistNo01();
            sistNo01.setTrNo(birthDto.getTrNo());
            sistNo01.setTrDate(birthDto.getTrwDate());
            sistNo01.setTrType(birthDto.getMarkType().getNumber());
            sistNo01.setFeeAmount(birthDto.getFeeAmount());
            sistNo01.setContTo(birthDto.getContractType().getNumber());
            sistNo01.setContCardNo(birthDto.getContractCardNo());
            sistNo01.setContName(birthDto.getContractName());
            sistNo01.setContAddr(birthDto.getContractAddr());
            CtltLocation location = ctltService.findCtltLocation(birthDto.getProvCode(), birthDto.getAumpCode(), birthDto.getTumbonStr());
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
            Optional<SistRecvTm> sistRecvTm = sistRecvTmRepo.findByTrNoAndFormType(birthDto.getTrNo(),"01");
            if (!sistRecvTm.isPresent()) {
                throw new ResourceNotFoundException("ไม่มีข้อมูลเลขคำขอ");
            }
            sistNo01.setSistRecvTm(sistRecvTm.get());

            sistNo01 = sistNo01Repo.save(sistNo01);
            generateOwner(birthDto.getOwners(), sistNo01);
            if (birthDto.getAgencies() != null) {
                generateAgency(birthDto.getAgencies(), sistNo01);
            }

            generateSistNo01Nice(birthDto.getNiceClasses(), sistNo01);
            if (birthDto.getCombines() != null) {
                generateSistNo01Combine(birthDto.getCombines(), sistNo01);
            }
            return "บันทึกข้อมูลสำเร็จ";
        } else {
            throw new ResourceExistException("คำขอนี้ถูกบันทึกแล้ว");
        }
    }


    private void generateOwner(List<OwnerDto> birthOwnerDtos, SistNo01 sistNo01) {
        List<SistNo01Owner> sistNo01OwnerList= new ArrayList<>();
        Long seq =1L;
        for (OwnerDto owner : birthOwnerDtos) {

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
            sistNo01Owner.setCtltNation(ctltService.findCtltNation(owner.getNatId()));
            sistNo01Owner.setCtltOccupation(ctltService.findCtltOccupation(owner.getOccuId()));
            CtltLocation location = ctltService.findCtltLocation(owner.getProvCode(), owner.getAumpCode(), owner.getTumbonStr());
            sistNo01Owner.setCtltLocation(location);
            sistNo01Owner.setCtltCountry(ctltService.findCtltCountry(owner.getCountryId()));
            sistNo01Owner.setSistNo01(sistNo01);
            sistNo01OwnerRepo.save(sistNo01Owner);


            sistNo01OwnerList.add(sistNo01Owner);
        }
//        return sistNo01OwnerList;
    }

    private void generateAgency(List<AgencyDto> birthAgencyDtos, SistNo01 sistNo01) {
        Long seq =1L;
        List<SistNo01Agency> sistNo01AgencyList = new ArrayList<>();
        for (AgencyDto agency : birthAgencyDtos) {

            SistNo01Agency sistNo01Agency = new SistNo01Agency();
            sistNo01Agency.setAgenSeq(seq);
            seq++;
            sistNo01Agency.setAgenCardType(agency.getAgencyCardType().getNumber());
            sistNo01Agency.setAndOrType(agency.getAndOrType().getNumber());
            sistNo01Agency.setAgenCardNo(agency.getCardNo());
            sistNo01Agency.setAgenKind(agency.getAgencyKind().getNumber());
            sistNo01Agency.setAgenType(agency.getAgencyType().getNumber());
            sistNo01Agency.setAgenName(agency.getName());
            sistNo01Agency.setCtltNation(ctltService.findCtltNation(agency.getNatId()));
            sistNo01Agency.setCtltOccupation(ctltService.findCtltOccupation(agency.getOccuId()));
            sistNo01Agency.setAgenAddr(agency.getAddress());
            CtltLocation location = ctltService.findCtltLocation(agency.getProvCode(), agency.getAumpCode(), agency.getTumbonStr());
            sistNo01Agency.setCtltLocation(location);
            sistNo01Agency.setAgenPostcode(agency.getPostcode());
            sistNo01Agency.setCtltCountry(ctltService.findCtltCountry(agency.getCountryId()));
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

            sistNo01Nice.setCtltNiceClass(ctltService.findCtltNiceClass(niceClass.getNiceClassId()));
            sistNo01Nice.setNiceDetail(niceClass.getNiceDetail());
            sistNo01Nice.setSistNo01(sistNo01);
            sistNo01NiceRepo.save(sistNo01Nice);
            sistNo01NiceList.add(sistNo01Nice);
        }
//        return sistNo01NiceList;
    }

    private void generateSistNo01Combine(List<BirthCombineDto> birthCombineDtos,SistNo01 sistNo01){
        Long seq =1L;
        List<SistNo01Combine> sistNo01CombineList = new ArrayList<>();
        for(BirthCombineDto combine:birthCombineDtos){
            SistNo01Combine sistNo01Combine = new SistNo01Combine();
            sistNo01Combine.setCombineSeq(seq);
            seq ++;
            sistNo01Combine.setCombineType(combine.getCombineType().getNumber());
            sistNo01Combine.setCombineCardNo(combine.getCardNo());
            sistNo01Combine.setCombineCardType(combine.getCombineCardType().getNumber());
            sistNo01Combine.setCtltNation(ctltService.findCtltNation(combine.getNatId()));
            sistNo01Combine.setCtltOccupation(ctltService.findCtltOccupation(combine.getOccuId()));
            CtltLocation location = ctltService.findCtltLocation(combine.getProvCode(), combine.getAumpCode(), combine.getTumbonStr());
            sistNo01Combine.setCtltLocation(location);
            sistNo01Combine.setLocCode(location.getLocCode());
            sistNo01Combine.setCombinePostcode(combine.getPostcode());
            sistNo01Combine.setCtltCountry(ctltService.findCtltCountry(combine.getCountryId()));
            sistNo01Combine.setCombinePhone(combine.getPhone());
            sistNo01Combine.setCombineFax(combine.getFax());
            sistNo01Combine.setCombineEmail(combine.getEmail());
            sistNo01Combine.setCombineAddr(combine.getAddress());
            sistNo01Combine.setCombineName(combine.getName());
            sistNo01Combine.setSistNo01(sistNo01);
            sistNo01CombineRepo.save(sistNo01Combine);
        }
    }

}
