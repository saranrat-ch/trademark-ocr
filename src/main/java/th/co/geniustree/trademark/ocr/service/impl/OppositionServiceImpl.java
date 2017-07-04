package th.co.geniustree.trademark.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.geniustree.trademark.ocr.domain.*;
import th.co.geniustree.trademark.ocr.exception.ResourceExistException;
import th.co.geniustree.trademark.ocr.exception.ResourceNotFoundException;
import th.co.geniustree.trademark.ocr.repository.*;
import th.co.geniustree.trademark.ocr.service.CtltService;
import th.co.geniustree.trademark.ocr.service.OppositionService;
import th.co.geniustree.trademark.ocr.service.dto.AgencyDto;
import th.co.geniustree.trademark.ocr.service.dto.OppositionDto;
import th.co.geniustree.trademark.ocr.service.dto.OppositionRefTrNoDto;
import th.co.geniustree.trademark.ocr.service.dto.OwnerDto;

import java.util.List;
import java.util.Optional;


/**
 * Created by saranrat on 3/7/2560.
 */
@Service
public class OppositionServiceImpl implements OppositionService {

    @Autowired
    private CtltService ctltService;

    @Autowired
    private RpstTrademarkRepo rpstTrademarkRepo;

    @Autowired
    private SistNo02OpponentRepo sistNo02OpponentRepo;

    @Autowired
    private SistNo02AgencyRepo sistNo02AgencyRepo;

    @Autowired
    private SistRecvTmRepo sistRecvTmRepo;

    @Autowired
    private SistNo02Repo sistNo02Repo;

    @Autowired
    private SistNo02TrnoRepo  sistNo02TrnoRepo;


    @Override
    public String saveOpposition(OppositionDto oppositionDto) {
        Optional<SistRecvTm> sistRecvTmOptional = sistRecvTmRepo.findByPayRefNo(oppositionDto.getPayRefNo());
        if(!sistRecvTmOptional.isPresent()){
            throw new ResourceNotFoundException("ไม่เจอเลขอ้างอิงการชำระเงิน");
        }
        Optional<SistNo02> sistNo02Optional = sistNo02Repo.findBySistRecvTm(sistRecvTmOptional.get());
        if(!sistNo02Optional.isPresent()){
            SistNo02 sistNo02 = new SistNo02();
            sistNo02.setTrNo02Date(oppositionDto.getTrwDate());
            sistNo02.setFeeAmount(oppositionDto.getFeeAmount());
            Optional<RpstTrademark> rpstTrademark = rpstTrademarkRepo.findByTrNo(oppositionDto.getTrNo());
            RpstTrademark trademark = rpstTrademark.get();
            sistNo02.setTrDate(trademark.getTrDate());
            sistNo02.setRpstTrademark(trademark);
            sistNo02.setTrNo(trademark.getTrNo());
            sistNo02.setContTo(oppositionDto.getContractType().getNumber());
            sistNo02.setContCardNo(oppositionDto.getContractCardNo());
            sistNo02.setContName(oppositionDto.getContractName());
            sistNo02.setContAddr(oppositionDto.getContractAddr());
            CtltLocation location = ctltService.findCtltLocation(oppositionDto.getProvCode(), oppositionDto.getAumpCode(), oppositionDto.getTumbonStr());
            sistNo02.setCtltLocation(location);
            sistNo02.setContPostcode(oppositionDto.getContractPostcode());
            sistNo02.setContPhone(oppositionDto.getContractPhone());
            sistNo02.setContFax(oppositionDto.getContractFax());
            sistNo02.setContEmail(oppositionDto.getContractEmail());
            Optional<SistRecvTm> sistRecvTm = sistRecvTmRepo.findByPayRefNo(oppositionDto.getPayRefNo());
            if (!sistRecvTm.isPresent()) {
                throw new ResourceNotFoundException("ไม่มีข้อมูลเลขคำขอ");
            }
            sistNo02.setSistRecvTm(sistRecvTm.get());

            sistNo02 = sistNo02Repo.save(sistNo02);
            generateOpponent(oppositionDto.getApplicants(), sistNo02);
            if (oppositionDto.getAgencies() != null) {
                generateAgency(oppositionDto.getAgencies(), sistNo02);
            }

            if (oppositionDto.getRefTrNoList() != null) {
                generateTrNoRef(oppositionDto.getRefTrNoList(), sistNo02);
            }
            return  "บันทึกข้อมูลสำเร็จ";
        }else {
           throw new ResourceExistException("ข้อมูลถูกบันทึกแล้ว ไม่สามารถบันทึกซ้ำ");
        }

    }

    private void generateOpponent(List<OwnerDto> ownerDtos, SistNo02 sistNo02) {
        Long seq = 1L;
        for (OwnerDto owner : ownerDtos) {
            SistNo02Opponent sistNo02Opponent = new SistNo02Opponent();
            sistNo02Opponent.setOppoSeq(seq);
            seq++;
            sistNo02Opponent.setOppoCardType(owner.getOwnerCardType().getNumber());
            sistNo02Opponent.setOppoCardNo(owner.getCardNo());
            sistNo02Opponent.setOppoName(owner.getName());
            sistNo02Opponent.setOppoAddr(owner.getAddress());
            sistNo02Opponent.setOppoPostcode(owner.getPostcode());
            sistNo02Opponent.setOppoPhone(owner.getPhone());
            sistNo02Opponent.setOppoFax(owner.getFax());
            sistNo02Opponent.setOppoEmail(owner.getEmail());
            sistNo02Opponent.setCtltNation(ctltService.findCtltNation(owner.getNatId()));
            sistNo02Opponent.setCtltOccupation(ctltService.findCtltOccupation(owner.getOccuId()));
            CtltLocation location = ctltService.findCtltLocation(owner.getProvCode(), owner.getAumpCode(), owner.getTumbonStr());
            sistNo02Opponent.setCtltLocation(location);
            sistNo02Opponent.setCtltCountry(ctltService.findCtltCountry(owner.getCountryId()));
            sistNo02Opponent.setSistNo02(sistNo02);
            sistNo02OpponentRepo.save(sistNo02Opponent);
        }
    }

    private void generateAgency(List<AgencyDto> agencyDtos, SistNo02 sistNo02) {
        Long seq =1L;;
        for (AgencyDto agency : agencyDtos) {

            SistNo02Agency sistNo02Agency = new SistNo02Agency();
            sistNo02Agency.setAgenSeq(seq);
            seq++;
            sistNo02Agency.setAgenCardType(agency.getAgencyCardType().getNumber());
            sistNo02Agency.setAndOrType(agency.getAndOrType().getNumber());
            sistNo02Agency.setAgenCardNo(agency.getCardNo());
            sistNo02Agency.setAgenKind(agency.getAgencyKind().getNumber());
            sistNo02Agency.setAgenType(agency.getAgencyType().getNumber());
            sistNo02Agency.setAgenName(agency.getName());
            sistNo02Agency.setCtltNation(ctltService.findCtltNation(agency.getNatId()));
            sistNo02Agency.setCtltOccupation(ctltService.findCtltOccupation(agency.getOccuId()));
            sistNo02Agency.setAgenAddr(agency.getAddress());
            CtltLocation location = ctltService.findCtltLocation(agency.getProvCode(), agency.getAumpCode(), agency.getTumbonStr());
            sistNo02Agency.setCtltLocation(location);
            sistNo02Agency.setAgenPostcode(agency.getPostcode());
            sistNo02Agency.setCtltCountry(ctltService.findCtltCountry(agency.getCountryId()));
            sistNo02Agency.setAgenPhone(agency.getPhone());
            sistNo02Agency.setAgenFax(agency.getFax());
            sistNo02Agency.setAgenEmail(agency.getEmail());
            sistNo02Agency.setSistNo02(sistNo02);
            sistNo02AgencyRepo.save(sistNo02Agency);
        }

    }

    private void generateTrNoRef(List<OppositionRefTrNoDto> oppositionRefTrNoDtos, SistNo02 sistNo02){
        for (OppositionRefTrNoDto oppositionRefTrNoDto : oppositionRefTrNoDtos) {
            Optional<RpstTrademark> rpstTrademark = rpstTrademarkRepo.findByTrNo(oppositionRefTrNoDto.getTrNo());
            if(rpstTrademark.isPresent()){
                SistNo02Trno sistNo02Trno = new SistNo02Trno();
                RpstTrademark trademark = rpstTrademark.get();
                sistNo02Trno.setRpstTrademark(trademark);
                sistNo02Trno.setSistNo02(sistNo02);
                sistNo02Trno.setTrDate(trademark.getTrDate());
                sistNo02Trno.setTrNo(trademark.getTrNo());
                sistNo02Trno.setTrnoId(sistNo02.getTrNo02Id());
                sistNo02Trno.setTrOwner(trademark.getRpstTrOwners().stream().filter(e -> e.getSeqNo() == 1).map(e -> e.getOwnerName()).findFirst().orElse(""));
                sistNo02TrnoRepo.save(sistNo02Trno);
            }


        }
    }

}
