package th.co.geniustree.trademark.ocr.service;

import th.co.geniustree.trademark.ocr.domain.*;

/**
 * Created by saranrat on 3/7/2560.
 */
public interface CtltService {
    CtltLocation findCtltLocation(String provCode, String aumpCode, String tumbonName);
    CtltNation findCtltNation(Long natId);
    CtltOccupation findCtltOccupation(Long occuId);
    CtltCountry findCtltCountry(Long countryId);
    CtltNiceClass findCtltNiceClass(Long niceClassId);
}
