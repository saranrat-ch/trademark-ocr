package th.co.geniustree.trademark.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.geniustree.trademark.ocr.domain.*;
import th.co.geniustree.trademark.ocr.exception.ResourceExistException;
import th.co.geniustree.trademark.ocr.exception.ResourceNotFoundException;
import th.co.geniustree.trademark.ocr.repository.*;
import th.co.geniustree.trademark.ocr.service.CtltService;
import th.co.geniustree.trademark.ocr.service.TransferService;
import th.co.geniustree.trademark.ocr.service.dto.*;

import java.util.List;
import java.util.Optional;


@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private SistRecvTmRepo sistRecvTmRepo;

    @Autowired
    private RpstTrademarkRepo rpstTrademarkRepo;

    @Autowired
    private CtltService ctltService;

    @Autowired
    private SistNo04Repo sistNo04Repo;

    @Autowired
    private SistNo04AuthRepo sistNo04AuthRepo;

    @Autowired
    private SistNo04AgencyRepo sistNo04AgencyRepo;

    @Autowired
    private CtltNiceClassRepo ctltNiceClassRepo;

    @Autowired
    private RpstTrClassRepo rpstTrClassRepo;

    @Autowired
    private RpstTrGoodsRepo rpstTrGoodsRepo;

    @Autowired
    private SistNo04ClassRepo sistNo04ClassRepo;

    @Autowired
    private SistNo04GoodsRepo sistNo04GoodsRepo;

    @Override
    public String saveTransfer(TransferDto transferDto) {
        Optional<SistRecvTm> sistRecvTmOptional = sistRecvTmRepo.findByPayRefNo(transferDto.getPayRefNo());
        if (!sistRecvTmOptional.isPresent()) {
            throw new ResourceNotFoundException("ไม่เจอเลขอ้างอิงการชำระเงิน");
        }
        Optional<SistNo04> sistNo04Optional = sistNo04Repo.findBySistRecvTm(sistRecvTmOptional.get());
        if (!sistNo04Optional.isPresent()) {
            Optional<RpstTrademark> rpstTrademark = rpstTrademarkRepo.findByTrNo(transferDto.getTrNo());
            RpstTrademark trademark = rpstTrademark.get();
            SistNo04 sistNo04 = new SistNo04();
            sistNo04.setTrNo(transferDto.getTrNo());
            sistNo04.setTrNo04Date(transferDto.getTrwDate());
            sistNo04.setFeeAmount(transferDto.getFeeAmount());
            sistNo04.setRpstTrademark(trademark);
            sistNo04.setTrDate(trademark.getTrDate());
            sistNo04.setContTo(transferDto.getContractType().getNumber());
            sistNo04.setContCardNo(transferDto.getContractCardNo());
            sistNo04.setContName(transferDto.getContractName());
            sistNo04.setContAddr(transferDto.getContractAddr());
            CtltLocation location = ctltService.findCtltLocation(transferDto.getProvCode(), transferDto.getAumpCode(), transferDto.getTumbonStr());
            sistNo04.setCtltLocation(location);
            sistNo04.setContPostcode(transferDto.getContractPostcode());
            sistNo04.setContPhone(transferDto.getContractPhone());
            sistNo04.setContFax(transferDto.getContractFax());
            sistNo04.setContEmail(transferDto.getContractEmail());
            sistNo04.setAuthType(transferDto.getTransferKind().getNumber());
            sistNo04.setAuthTypeSub(transferDto.getTransferType().getNumber());
            sistNo04.setSistRecvTm(sistRecvTmOptional.get());
            sistNo04 = sistNo04Repo.save(sistNo04);

            generateTransferee(transferDto.getTransfereeList(), sistNo04);
            if (transferDto.getAgencyDtoList() != null) {
                generateAgency(transferDto.getAgencyDtoList(), sistNo04);
            }
            generateNicClass(transferDto.getNiceClasses(), sistNo04);

            return "บันทึกข้อมูลสำเร็จ";
        } else {
            throw new ResourceExistException("ข้อมูลถูกบันทึกแล้ว ไม่สามารถบันทึกซ้ำ");
        }
    }


    private void generateTransferee(List<OwnerDto> ownerDtos, SistNo04 sistNo04) {
        Long seq = 1L;
        for (OwnerDto owner : ownerDtos) {
            SistNo04Auth sistNo04Transferee = new SistNo04Auth();
            sistNo04Transferee.setAuthSeq(seq);
            seq++;
            sistNo04Transferee.setAuthCardType(owner.getOwnerCardType().getNumber());
            sistNo04Transferee.setAuthCardNo(owner.getCardNo());
            sistNo04Transferee.setAuthName(owner.getName());
            sistNo04Transferee.setAuthAddr(owner.getAddress());
            sistNo04Transferee.setAuthPostcode(owner.getPostcode());
            sistNo04Transferee.setAuthPhone(owner.getPhone());
            sistNo04Transferee.setAuthFax(owner.getFax());
            sistNo04Transferee.setAuthEmail(owner.getEmail());
            sistNo04Transferee.setCtltNation(ctltService.findCtltNation(owner.getNatId()));
            sistNo04Transferee.setCtltOccupation(ctltService.findCtltOccupation(owner.getOccuId()));
            CtltLocation location = ctltService.findCtltLocation(owner.getProvCode(), owner.getAumpCode(), owner.getTumbonStr());
            sistNo04Transferee.setCtltLocation(location);
            sistNo04Transferee.setCtltCountry(ctltService.findCtltCountry(owner.getCountryId()));
            sistNo04Transferee.setSistNo04(sistNo04);
            sistNo04AuthRepo.save(sistNo04Transferee);

        }
    }

    private void generateAgency(List<AgencyDto> agencyDtos, SistNo04 sistNo04) {
        Long seq = 1L;
        for (AgencyDto agency : agencyDtos) {

            SistNo04Agency sistNo04Agency = new SistNo04Agency();
            sistNo04Agency.setAgenSeq(seq);
            seq++;
            sistNo04Agency.setAgenCardType(agency.getAgencyCardType().getNumber());
            sistNo04Agency.setAndOrType(agency.getAndOrType().getNumber());
            sistNo04Agency.setAgenCardNo(agency.getCardNo());
            sistNo04Agency.setAgenKind(agency.getAgencyKind().getNumber());
            sistNo04Agency.setAgenType(agency.getAgencyType().getNumber());
            sistNo04Agency.setAgenName(agency.getName());
            sistNo04Agency.setCtltNation(ctltService.findCtltNation(agency.getNatId()));
            sistNo04Agency.setCtltOccupation(ctltService.findCtltOccupation(agency.getOccuId()));
            sistNo04Agency.setAgenAddr(agency.getAddress());
            CtltLocation location = ctltService.findCtltLocation(agency.getProvCode(), agency.getAumpCode(), agency.getTumbonStr());
            sistNo04Agency.setCtltLocation(location);
            sistNo04Agency.setAgenPostcode(agency.getPostcode());
            sistNo04Agency.setCtltCountry(ctltService.findCtltCountry(agency.getCountryId()));
            sistNo04Agency.setAgenPhone(agency.getPhone());
            sistNo04Agency.setAgenFax(agency.getFax());
            sistNo04Agency.setAgenEmail(agency.getEmail());
            sistNo04Agency.setSistNo04(sistNo04);
            sistNo04AgencyRepo.save(sistNo04Agency);
        }

    }


    private void generateNicClass(List<NiceClassDto> niceClassDtoList, SistNo04 sistNo04) {
        for (NiceClassDto niceClass : niceClassDtoList) {
            SistNo04Class sistNo04Class = new SistNo04Class();
            sistNo04Class.setCtltNiceClass(ctltNiceClassRepo.findOne(niceClass.getNiceClassId()));
            Optional<RpstTrClass> rpstTrClass = rpstTrClassRepo.findByRpstTrademarkAndCtltNiceClass(sistNo04.getRpstTrademark(), sistNo04Class.getCtltNiceClass());
            if (!rpstTrClass.isPresent()) {
                throw new ResourceNotFoundException("ไม่พบรายการสินค้าเดิม");
            } else {
                sistNo04Class.setRpstTrClass(rpstTrClass.get());
            }
            sistNo04Class.setSistNo04(sistNo04);
            sistNo04Class = sistNo04ClassRepo.save(sistNo04Class);
            generateGoods(niceClass.getGoodsDtoList(), sistNo04Class);
        }

    }

    private void generateGoods(List<GoodsDto> goodsDtoList, SistNo04Class sistNo04Class) {
        for (GoodsDto goodsDto : goodsDtoList) {
            SistNo04Goods sistNo04Goods = new SistNo04Goods();
            sistNo04Goods.setCtltNiceClass(sistNo04Class.getCtltNiceClass());
            sistNo04Goods.setGoodsServices(goodsDto.getGoodsServices());
            List<RpstTrGoods> trGoodsList = rpstTrGoodsRepo.findByRpstTrClassAndCtltNiceClass(sistNo04Class.getRpstTrClass(), sistNo04Class.getCtltNiceClass());
            sistNo04Goods.setRpstTrGoods(trGoodsList.get(0));
            sistNo04Goods.setSistNo04Class(sistNo04Class);
            sistNo04GoodsRepo.save(sistNo04Goods);
        }
    }


}
