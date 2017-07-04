package th.co.geniustree.trademark.ocr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.trademark.ocr.service.AppealService;
import th.co.geniustree.trademark.ocr.service.dto.AppealDto;

/**
 * Created by saranrat on 4/7/2560.
 */
@RestController
@RequestMapping(path = "/api/appeal")
public class AppealResource {

    @Autowired
    private AppealService appealService;


    @PostMapping
    public String saveBirth(@RequestBody @Validated AppealDto appealDto){
        return appealService.saveAppeal(appealDto);
    }


}
