package th.co.geniustree.trademark.ocr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Created by pramoth on 10/8/2016 AD.
 */
@Configuration
public class CustomWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new LocalDateConverter(Constants.ISO_DATE_OPTIONAL_TIME));
        registry.addConverter(new LocalDateTimeConverter(Constants.ISO_DATE_OPTIONAL_TIME));
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        //argumentResolvers.add(new MyAuthenticationPrincipalArgumentResolver(fwUserRepository));
    }

    public static class LocalDateConverter implements Converter<String, LocalDate> {

        private final DateTimeFormatter formatter;

        public LocalDateConverter(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public LocalDate convert(String source) {
            if (source == null || source.isEmpty()) {
                return null;
            }

            return LocalDate.parse(source, formatter);
        }
    }

    public static class LocalDateTimeConverter implements Converter<String, LocalDateTime> {

        private final DateTimeFormatter formatter;

        public LocalDateTimeConverter(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public LocalDateTime convert(String source) {
            if (source == null || source.isEmpty()) {
                return null;
            }

            return LocalDateTime.parse(source, formatter);
        }
    }
}
