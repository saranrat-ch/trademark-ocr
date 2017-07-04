package th.co.geniustree.trademark.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import th.co.geniustree.trademark.ocr.domain.*;
import th.co.geniustree.trademark.ocr.exception.ResourceExistException;
import th.co.geniustree.trademark.ocr.exception.ResourceNotFoundException;
import th.co.geniustree.trademark.ocr.repository.*;
import th.co.geniustree.trademark.ocr.service.AppealService;
import th.co.geniustree.trademark.ocr.service.CtltService;
import th.co.geniustree.trademark.ocr.service.dto.AgencyDto;
import th.co.geniustree.trademark.ocr.service.dto.AppealDto;
import th.co.geniustree.trademark.ocr.service.dto.OwnerDto;

import java.util.List;
import java.util.Optional;

/**
 * Created by saranrat on 4/7/2560.
 */
@Service
public class AppealServiceImpl implements AppealService {

    @Autowired
    private RpstTrademarkRepo rpstTrademarkRepo;

    @Autowired
    private CtltService ctltService;

    @Autowired
    private SistRecvTmRepo sistRecvTmRepo;

    @Autowired
    private SistNo03Repo sistNo03Repo;

    @Autowired
    private SistNo03OwnerRepo sistNo03OwnerRepo;

    @Autowired
    private SistNo03AgencyRepo sistNo03AgencyRepo;


    @Override
    public String saveAppeal(AppealDto appealDto) {
        Optional<SistRecvTm> sistRecvTmOptional = sistRecvTmRepo.findByPayRefNo(appealDto.getPayRefNo());
        if (!sistRecvTmOptional.isPresent()) {
            throw new ResourceNotFoundException("ไม่เจอเลขอ้างอิงการชำระเงิน");
        }
        Optional<SistNo03> sistNo03Optional = sistNo03Repo.findBySistRecvTm(sistRecvTmOptional.get());
        if (!sistNo03Optional.isPresent()) {
            Optional<RpstTrademark> rpstTrademark = rpstTrademarkRepo.findByTrNo(appealDto.getTrNo());
            RpstTrademark trademark = rpstTrademark.get();
            SistNo03 sistNo03 = new SistNo03();
            sistNo03.setTrNo(appealDto.getTrNo());
            sistNo03.setTrNo03Date(appealDto.getTrwDate());
            sistNo03.setFeeAmount(appealDto.getFeeAmount());
            sistNo03.setRpstTrademark(trademark);
            sistNo03.setTrDate(trademark.getTrDate());
            sistNo03.setApplDesc(appealDto.getAppealSection());
            sistNo03.setRemark(appealDto.getAppealRemark());
            sistNo03.setContTo(appealDto.getContractType().getNumber());
            sistNo03.setContCardNo(appealDto.getContractCardNo());
            sistNo03.setContName(appealDto.getContractName());
            sistNo03.setContAddr(appealDto.getContractAddr());
            CtltLocation location = ctltService.findCtltLocation(appealDto.getProvCode(), appealDto.getAumpCode(), appealDto.getTumbonStr());
            sistNo03.setCtltLocation(location);
            sistNo03.setContPostcode(appealDto.getContractPostcode());
            sistNo03.setContPhone(appealDto.getContractPhone());
            sistNo03.setContFax(appealDto.getContractFax());
            sistNo03.setContEmail(appealDto.getContractEmail());

            Optional<SistRecvTm> sistRecvTm = sistRecvTmRepo.findByPayRefNo(appealDto.getPayRefNo());
            if (!sistRecvTm.isPresent()) {
                throw new ResourceNotFoundException("ไม่มีข้อมูลเลขคำขอ");
            }
            sistNo03.setSistRecvTm(sistRecvTm.get());
            sistNo03 = sistNo03Repo.save(sistNo03);
            generateOpponent(appealDto.getOwners(), sistNo03);
            if (appealDto.getAgencies() != null) {
                generateAgency(appealDto.getAgencies(), sistNo03);
            }
            return "บันทึกข้อมูลสำเร็จ";
        } else {
            throw new ResourceExistException("ข้อมูลถูกบันทึกแล้ว ไม่สามารถบันทึกซ้ำ");
        }
    }


    private void generateOpponent(List<OwnerDto> ownerDtos, SistNo03 sistNo03) {
        Long seq = 1L;
        for (OwnerDto owner : ownerDtos) {
            SistNo03Owner sistNo03Owner = new SistNo03Owner();
            sistNo03Owner.setOwnerSeq(seq);
            seq++;
            sistNo03Owner.setOwnerCardType(owner.getOwnerCardType().getNumber());
            sistNo03Owner.setOwnerCardNo(owner.getCardNo());
            sistNo03Owner.setOwnerName(owner.getName());
            sistNo03Owner.setOwnerAddr(owner.getAddress());
            sistNo03Owner.setOwnerPostcode(owner.getPostcode());
            sistNo03Owner.setOwnerPhone(owner.getPhone());
            sistNo03Owner.setOwnerFax(owner.getFax());
            sistNo03Owner.setOwnerEmail(owner.getEmail());
            sistNo03Owner.setCtltNation(ctltService.findCtltNation(owner.getNatId()));
            sistNo03Owner.setCtltOccupation(ctltService.findCtltOccupation(owner.getOccuId()));
            CtltLocation location = ctltService.findCtltLocation(owner.getProvCode(), owner.getAumpCode(), owner.getTumbonStr());
            sistNo03Owner.setCtltLocation(location);
            sistNo03Owner.setCtltCountry(ctltService.findCtltCountry(owner.getCountryId()));
            sistNo03Owner.setSistNo03(sistNo03);
            sistNo03OwnerRepo.save(sistNo03Owner);

        }
    }

    private void generateAgency(List<AgencyDto> agencyDtos, SistNo03 sistNo03) {
        Long seq = 1L;
        for (AgencyDto agency : agencyDtos) {

            SistNo03Agency sistNo03Agency = new SistNo03Agency();
            sistNo03Agency.setAgenSeq(seq);
            seq++;
            sistNo03Agency.setAgenCardType(agency.getAgencyCardType().getNumber());
            sistNo03Agency.setAndOrType(agency.getAndOrType().getNumber());
            sistNo03Agency.setAgenCardNo(agency.getCardNo());
            sistNo03Agency.setAgenKind(agency.getAgencyKind().getNumber());
            sistNo03Agency.setAgenType(agency.getAgencyType().getNumber());
            sistNo03Agency.setAgenName(agency.getName());
            sistNo03Agency.setCtltNation(ctltService.findCtltNation(agency.getNatId()));
            sistNo03Agency.setCtltOccupation(ctltService.findCtltOccupation(agency.getOccuId()));
            sistNo03Agency.setAgenAddr(agency.getAddress());
            CtltLocation location = ctltService.findCtltLocation(agency.getProvCode(), agency.getAumpCode(), agency.getTumbonStr());
            sistNo03Agency.setCtltLocation(location);
            sistNo03Agency.setAgenPostcode(agency.getPostcode());
            sistNo03Agency.setCtltCountry(ctltService.findCtltCountry(agency.getCountryId()));
            sistNo03Agency.setAgenPhone(agency.getPhone());
            sistNo03Agency.setAgenFax(agency.getFax());
            sistNo03Agency.setAgenEmail(agency.getEmail());
            sistNo03Agency.setSistNo03(sistNo03);
            sistNo03AgencyRepo.save(sistNo03Agency);
        }

    }
}
