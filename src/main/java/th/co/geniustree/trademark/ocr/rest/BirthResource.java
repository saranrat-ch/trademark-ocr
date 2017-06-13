package th.co.geniustree.trademark.ocr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.trademark.ocr.service.BirthService;
import th.co.geniustree.trademark.ocr.service.dto.BirthDto;

/**
 * Created by saranrat on 5/6/2560.
 */
@RestController
@RequestMapping(path = "/api/birth")
public class BirthResource {

    @Autowired
    private BirthService birthService;


    @PostMapping
    public String saveBirth(@RequestBody @Validated BirthDto birthDto){
        return birthService.saveBirth(birthDto);
    }

}
