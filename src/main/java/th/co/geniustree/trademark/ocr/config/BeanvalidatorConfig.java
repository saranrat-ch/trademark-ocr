package th.co.geniustree.trademark.ocr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Created by best on 26/10/2559.
 */
@Configuration
public class BeanvalidatorConfig {

    @Bean
    public Validator validator() {
        return new LocalValidatorFactoryBean();
    }
}
