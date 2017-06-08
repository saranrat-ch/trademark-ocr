package th.co.geniustree.trademark.ocr.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by saranrat on 5/6/2560.
 */
@RestController
@RequestMapping(path = "/api/test")
public class TestResource {

    @GetMapping
    public LocalDate test(){
        return LocalDate.now();
    }
}
