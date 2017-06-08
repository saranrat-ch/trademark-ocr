package th.co.geniustree.trademark.ocr.config;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * Created by pramoth on 9/23/2016 AD.
 */
final public class Constants {

    public static final String SPRING_PROFILE_PRODUCTION = "prod";

    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";

    public static final String SPRING_PROFILE_STAGING = "stg";

    public static final DateTimeFormatter ISO_DATE_OPTIONAL_TIME =
            new DateTimeFormatterBuilder()
                    .append(DateTimeFormatter.ISO_LOCAL_DATE)
                    .optionalStart()
                    .appendLiteral('T')
                    .append(DateTimeFormatter.ISO_LOCAL_TIME)
                    .toFormatter();
}
