package th.co.geniustree.trademark.ocr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.trademark.ocr.service.OppositionService;
import th.co.geniustree.trademark.ocr.service.dto.OppositionDto;

/**
 * Created by saranrat on 3/7/2560.
 */
@RestController
@RequestMapping(path = "/api/opposition")
public class OppositionAndDebateResource {

    @Autowired
    private OppositionService oppositionService;


    @PostMapping
    public String saveOpposition(@RequestBody @Validated OppositionDto oppositionDto){
        return oppositionService.saveOpposition(oppositionDto);
    }

}
