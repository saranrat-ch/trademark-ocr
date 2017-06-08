package th.co.geniustree.trademark.ocr.config;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class JacksonConfiguration implements Jackson2ObjectMapperBuilderCustomizer {

    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {

        jacksonObjectMapperBuilder.defaultViewInclusion(false)
                .deserializerByType(LocalDate.class, new LocalDateDeserializer(Constants.ISO_DATE_OPTIONAL_TIME))
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer(Constants.ISO_DATE_OPTIONAL_TIME))
                .serializerByType(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ISO_LOCAL_DATE))
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(Constants.ISO_DATE_OPTIONAL_TIME))
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    }
}
