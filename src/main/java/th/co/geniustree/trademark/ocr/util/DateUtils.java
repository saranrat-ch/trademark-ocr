/*
 * Copy right 2016 Genius-Tree Co., Ltd.
 */
package th.co.geniustree.trademark.ocr.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

import static org.springframework.util.StringUtils.hasText;

/**
 * @author jittagornp
 */
public class DateUtils {

    private static final String STANDARD_DATE_FORMAT = "dd/MM/yyyy";
    private static final String STANDARD_DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss.S";

    private DateUtils() {

    }

    private static Locale getThaiLocale() {
        return new Locale("th", "TH");
    }

    /**
     * @param dateString
     * @return
     */
    public static Date createDateFromString(String dateString) {
        return createDateFromStringWithLocale(dateString, null);
    }

    /**
     * @param dateString
     * @return
     */
    public static Date createDateFromStringWithThaiLocale(String dateString) {
        return createDateFromStringWithLocale(dateString, getThaiLocale());
    }

    private static Date createDateFromStringWithLocaleAndFormat(String dateString, Locale locale, String format) {
        if (!hasText(dateString)) {
            throw new IllegalArgumentException("require dateString.");
        }

        if (locale == null) {
            return parseDate(dateString, format);
        }

        return parseDateWithLocale(dateString, locale, format);
    }

    private static Date parseDate(String dateString, String format) {
        try {
            return new SimpleDateFormat(format)
                .parse(dateString);
        } catch (ParseException ex) {
            throw new IllegalArgumentException("invalid dateString.");
        }
    }

    private static Date parseDateWithLocale(String dateString, Locale locale, String format) {
        try {
            return new SimpleDateFormat(format, locale)
                .parse(dateString);
        } catch (ParseException ex) {
            throw new IllegalArgumentException("invalid dateString.");
        }
    }

    /**
     * @param dateString
     * @param locale
     * @return
     */
    public static Date createDateFromStringWithLocale(String dateString, Locale locale) {
        return createDateFromStringWithLocaleAndFormat(dateString, locale, STANDARD_DATE_FORMAT);
    }

    /**
     * @param dateString
     * @param locale
     * @return
     */
    public static Date createDateTimeFromStringWithLocale(String dateString, Locale locale) {
        return createDateFromStringWithLocaleAndFormat(dateString, locale, STANDARD_DATE_TIME_FORMAT);
    }

    /**
     * @param dateString
     * @return
     */
    public static Date createDateTimeFromString(String dateString) {
        return createDateTimeFromStringWithLocale(dateString, null);
    }

    /**
     * @param dateString
     * @return
     */
    public static Date createDateTimeFromStringWithThaiLocale(String dateString) {
        return createDateTimeFromStringWithLocale(dateString, getThaiLocale());
    }

    /**
     * @param date
     * @return
     */
    public static Date toStartTimeOfDay(Date date) {

        if (date == null) {
            throw new IllegalArgumentException("require date.");
        }

        return new DateTime(date.getTime())
            .withTimeAtStartOfDay()
            .toDate();
    }

    /**
     * @param date
     * @return
     */
    public static Date toEndTimeOfDay(Date date) {

        if (date == null) {
            throw new IllegalArgumentException("require date.");
        }

        return new DateTime(date.getTime())
            .plusDays(1)
            .withTimeAtStartOfDay()
            .minusMillis(1)
            .toDate();
    }

    /**
     * @param date
     * @return
     */
    public static boolean isHoliday(Date date) {
        LocalDate localDate = LocalDate.fromDateFields(date);
        return localDate.getDayOfWeek() == DateTimeConstants.SATURDAY
            || localDate.getDayOfWeek() == DateTimeConstants.SUNDAY;
    }

    /**
     * @param date
     * @param days
     * @return
     */
    public static Date addDays(Date date, int days) {

        if (date == null) {
            throw new IllegalArgumentException("require date.");
        }

        if (days < 0) {
            throw new IllegalArgumentException("invalid days, must positive number.");
        }

        if (days == 0) {
            return date;
        }

        return new DateTime(date.getTime())
            .plusDays(days)
            .toDate();
    }

    public static String getCurrentDateNoSlash() {
        return convertDateToStringDDMMYYYYThaiFormatNoSlash(new Date());
    }

    public static String convertDateToStringDDMMYYYYThaiFormatNoSlash(Date date) {
        String dateStr = "";
        if (date != null) {
            SimpleDateFormat dateThaiFormat = new SimpleDateFormat("ddMMyyyy", new Locale("th", "TH"));
            dateStr = dateThaiFormat.format(date);
        }
        return dateStr;
    }

    public static Date asDate(java.time.LocalDate localDate) {
        return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
}
