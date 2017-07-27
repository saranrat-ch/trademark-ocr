package th.co.geniustree.trademark.ocr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.trademark.ocr.service.TransferService;
import th.co.geniustree.trademark.ocr.service.dto.TransferDto;

@RestController
@RequestMapping(path = "/api/transfer")
public class TransferResource {

    @Autowired
    private TransferService transferService;


    @PostMapping
    public String saveOpposition(@RequestBody @Validated TransferDto transferDto){
        return transferService.saveTransfer(transferDto);
    }

}
