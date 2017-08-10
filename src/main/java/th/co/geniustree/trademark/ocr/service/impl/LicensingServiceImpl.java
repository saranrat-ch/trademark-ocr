package th.co.geniustree.trademark.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.geniustree.trademark.ocr.domain.*;
import th.co.geniustree.trademark.ocr.exception.ResourceExistException;
import th.co.geniustree.trademark.ocr.exception.ResourceNotFoundException;
import th.co.geniustree.trademark.ocr.repository.*;
import th.co.geniustree.trademark.ocr.service.CtltService;
import th.co.geniustree.trademark.ocr.service.LicensingService;
import th.co.geniustree.trademark.ocr.service.dto.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class LicensingServiceImpl implements LicensingService {

    @Autowired
    private SistRecvTmRepo sistRecvTmRepo;

    @Autowired
    private RpstTrademarkRepo rpstTrademarkRepo;

    @Autowired
    private CtltService ctltService;

    @Autowired
    private SistNo05AgencyRepo sistNo05AgencyRepo;

    @Autowired
    private SistNo05PermitRepo sistNo05PermitRepo;

    @Autowired
    private CtltNiceClassRepo ctltNiceClassRepo;

    @Autowired
    private RpstTrClassRepo rpstTrClassRepo;

    @Autowired
    private SistNo05ClassRepo sistNo05ClassRepo;

    @Autowired
    private RpstTrGoodsRepo rpstTrGoodsRepo;

    @Autowired
    private SistNo05GoodsRepo sistNo05GoodsRepo;

    @Autowired
    private SistNo05Repo sistNo05Repo;

    @Override
    public String saveLicensing(LicensingDto licensingDto) {
        Optional<SistRecvTm> sistRecvTmOptional = sistRecvTmRepo.findByPayRefNo(licensingDto.getPayRefNo());
        if (!sistRecvTmOptional.isPresent()) {
            throw new ResourceNotFoundException("ไม่เจอเลขอ้างอิงการชำระเงิน");
        }
        Optional<SistNo05> sistNo05Optional = sistNo05Repo.findBySistRecvTm(sistRecvTmOptional.get());
        if (!sistNo05Optional.isPresent()) {
            Optional<RpstTrademark> rpstTrademark = rpstTrademarkRepo.findByTrNo(licensingDto.getTrNo());
            RpstTrademark trademark = rpstTrademark.get();
            SistNo05 sistNo05 = new SistNo05();
            sistNo05.setTrNo(licensingDto.getTrNo());
            sistNo05.setTrNo05Date(licensingDto.getTrwDate());
            sistNo05.setFeeAmount(licensingDto.getFeeAmount());
            sistNo05.setRpstTrademark(trademark);
            sistNo05.setTrDate(trademark.getTrDate());
            sistNo05.setContTo(licensingDto.getContractType().getNumber());
            sistNo05.setContCardNo(licensingDto.getContractCardNo());
            sistNo05.setContName(licensingDto.getContractName());
            sistNo05.setContAddr(licensingDto.getContractAddr());
            CtltLocation location = ctltService.findCtltLocation(licensingDto.getProvCode(), licensingDto.getAumpCode(), licensingDto.getTumbonStr());
            sistNo05.setCtltLocation(location);
            sistNo05.setContPostcode(licensingDto.getContractPostcode());
            sistNo05.setContPhone(licensingDto.getContractPhone());
            sistNo05.setContFax(licensingDto.getContractFax());
            sistNo05.setContEmail(licensingDto.getContractEmail());
            sistNo05.setRegTrType(licensingDto.getType().getNumber());
            if (Objects.equals(licensingDto.getRegPermit(), Boolean.TRUE)) {
                sistNo05.setRegPermitFlag("1");
            }
            if (Objects.equals(licensingDto.getRegRenew(), Boolean.TRUE)) {
                sistNo05.setRegRenewFlag("1");
            }
            sistNo05.setSistRecvTm(sistRecvTmOptional.get());

            sistNo05 = sistNo05Repo.save(sistNo05);

            if (licensingDto.getAgencies() != null) {
                generateAgency(licensingDto.getAgencies(), sistNo05);
            }
            generatePermit(licensingDto.getPermits(), sistNo05);
            generateNicClass(licensingDto.getNiceClasses(), sistNo05);
            return "บันทึกข้อมูลสำเร็จ";
        } else {
            throw new ResourceExistException("ข้อมูลถูกบันทึกแล้ว ไม่สามารถบันทึกซ้ำ");
        }
    }

    private void generateAgency(List<AgencyDto> agencyDtos, SistNo05 sistNo05) {
        Long seq = 1L;
        for (AgencyDto agency : agencyDtos) {

            SistNo05Agency sistNo05Agency = new SistNo05Agency();
            sistNo05Agency.setAgenSeq(seq);
            seq++;
            sistNo05Agency.setAgenCardType(agency.getAgencyCardType().getNumber());
            sistNo05Agency.setAndOrType(agency.getAndOrType().getNumber());
            sistNo05Agency.setAgenCardNo(agency.getCardNo());
            sistNo05Agency.setAgenKind(agency.getAgencyKind().getNumber());
            sistNo05Agency.setAgenType(agency.getAgencyType().getNumber());
            sistNo05Agency.setAgenName(agency.getName());
            sistNo05Agency.setCtltNation(ctltService.findCtltNation(agency.getNatId()));
            sistNo05Agency.setCtltOccupation(ctltService.findCtltOccupation(agency.getOccuId()));
            sistNo05Agency.setAgenAddr(agency.getAddress());
            CtltLocation location = ctltService.findCtltLocation(agency.getProvCode(), agency.getAumpCode(), agency.getTumbonStr());
            sistNo05Agency.setCtltLocation(location);
            sistNo05Agency.setAgenPostcode(agency.getPostcode());
            sistNo05Agency.setCtltCountry(ctltService.findCtltCountry(agency.getCountryId()));
            sistNo05Agency.setAgenPhone(agency.getPhone());
            sistNo05Agency.setAgenFax(agency.getFax());
            sistNo05Agency.setAgenEmail(agency.getEmail());
            sistNo05Agency.setSistNo05(sistNo05);
            sistNo05AgencyRepo.save(sistNo05Agency);
        }

    }

    private void generatePermit(List<OwnerDto> ownerDtos, SistNo05 sistNo05) {
        Long seq = 1L;
        for (OwnerDto owner : ownerDtos) {
            SistNo05Permit sistNo05Permit = new SistNo05Permit();
            sistNo05Permit.setPermitSeq(seq);
            seq++;
            sistNo05Permit.setPermitCardType(owner.getOwnerCardType().getNumber());
            sistNo05Permit.setPermitCardNo(owner.getCardNo());
            sistNo05Permit.setPermitName(owner.getName());
            sistNo05Permit.setPermitAddr(owner.getAddress());
            sistNo05Permit.setPermitPostcode(owner.getPostcode());
            sistNo05Permit.setPermitPhone(owner.getPhone());
            sistNo05Permit.setPermitFax(owner.getFax());
            sistNo05Permit.setPermitEmail(owner.getEmail());
            sistNo05Permit.setCtltNation(ctltService.findCtltNation(owner.getNatId()));
            sistNo05Permit.setCtltOccupation(ctltService.findCtltOccupation(owner.getOccuId()));
            CtltLocation location = ctltService.findCtltLocation(owner.getProvCode(), owner.getAumpCode(), owner.getTumbonStr());
            sistNo05Permit.setCtltLocation(location);
            sistNo05Permit.setCtltCountry(ctltService.findCtltCountry(owner.getCountryId()));
            sistNo05Permit.setSistNo05(sistNo05);
            sistNo05PermitRepo.save(sistNo05Permit);

        }
    }


    private void generateNicClass(List<NiceClassDto> niceClassDtoList, SistNo05 sistNo05) {
        for (NiceClassDto niceClass : niceClassDtoList) {
            SistNo05Class sistNo05Class = new SistNo05Class();
            sistNo05Class.setCtltNiceClass(ctltNiceClassRepo.findOne(niceClass.getNiceClassId()));
            Optional<RpstTrClass> rpstTrClass = rpstTrClassRepo.findByRpstTrademarkAndCtltNiceClass(sistNo05.getRpstTrademark(), sistNo05Class.getCtltNiceClass());
            if (!rpstTrClass.isPresent()) {
                throw new ResourceNotFoundException("ไม่พบรายการสินค้าเดิม");
            } else {
                sistNo05Class.setRpstTrClass(rpstTrClass.get());
            }
            sistNo05Class.setSistNo05(sistNo05);
            sistNo05Class = sistNo05ClassRepo.save(sistNo05Class);
            generateGoods(niceClass.getGoodsDtoList(), sistNo05Class);
        }

    }

    private void generateGoods(List<GoodsDto> goodsDtoList, SistNo05Class sistNo05Class) {
        for (GoodsDto goodsDto : goodsDtoList) {
            SistNo05Goods sistNo05Goods = new SistNo05Goods();
            sistNo05Goods.setCtltNiceClass(sistNo05Class.getCtltNiceClass());
            sistNo05Goods.setGoodsServices(goodsDto.getGoodsServices());
            List<RpstTrGoods> trGoodsList = rpstTrGoodsRepo.findByRpstTrClassAndCtltNiceClass(sistNo05Class.getRpstTrClass(), sistNo05Class.getCtltNiceClass());
            sistNo05Goods.setRpstTrGoods(trGoodsList.get(0));
            sistNo05Goods.setSistNo05Class(sistNo05Class);
            sistNo05GoodsRepo.save(sistNo05Goods);
        }
    }

}

