package th.co.geniustree.trademark.ocr.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;
import th.co.geniustree.trademark.ocr.domain.*;
import th.co.geniustree.trademark.ocr.exception.ResourceNotFoundException;
import th.co.geniustree.trademark.ocr.repository.*;
import th.co.geniustree.trademark.ocr.repository.specification.CtltLocationSpecification;
import th.co.geniustree.trademark.ocr.service.CtltService;

import java.util.List;
import java.util.Optional;

/**
 * Created by saranrat on 3/7/2560.
 */
@Service
public class CtltServiceImpl implements CtltService {

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

    @Override
    public CtltLocation findCtltLocation(String provCode, String aumpCode, String tumbonName) {
        Specifications<CtltLocation> spec = Specifications.where(CtltLocationSpecification.provCodeEqual(provCode))
                .and(CtltLocationSpecification.aumpCodeEqal(aumpCode))
                .and(CtltLocationSpecification.tumbonNameEqal(tumbonName));
        List<CtltLocation> locationList = ctltLocationRepo.findAll(spec);


        if (locationList.isEmpty()) {
            throw new ResourceNotFoundException("ไม่พบที่อยู่");
        }
        return locationList.get(0);
    }

    @Override
    public CtltNation findCtltNation(Long natId) {
        Optional<CtltNation> ctltNation = Optional.ofNullable(ctltNationRepo.findOne(natId));
        if(!ctltNation.isPresent()){
            throw new ResourceNotFoundException("ไม่พบเชื้อชาติ");
        }
        return ctltNation.get();
    }

    @Override
    public CtltOccupation findCtltOccupation(Long occuId) {
        return ctltOccupationRepo.findOne(occuId);
    }

    @Override
    public CtltCountry findCtltCountry(Long countryId) {
        return ctltCountryRepo.findOne(countryId);
    }

    @Override
    public CtltNiceClass findCtltNiceClass(Long niceClassId) {
        return ctltNiceClassRepo.findOne(niceClassId);
    }
}
