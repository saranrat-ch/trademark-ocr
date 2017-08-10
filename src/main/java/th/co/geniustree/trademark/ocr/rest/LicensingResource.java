package th.co.geniustree.trademark.ocr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.trademark.ocr.service.LicensingService;
import th.co.geniustree.trademark.ocr.service.dto.LicensingDto;

@RestController
@RequestMapping(path = "/api/licensing")
public class LicensingResource {

    @Autowired
    private LicensingService licensingService;


    @PostMapping
    public String saveBirth(@RequestBody @Validated LicensingDto licensingDto){
        return licensingService.saveLicensing(licensingDto);
    }
}
