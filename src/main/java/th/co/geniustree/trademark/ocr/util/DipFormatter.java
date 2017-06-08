package th.co.geniustree.trademark.ocr.util;



import th.co.geniustree.trademark.ocr.config.UtilityConstant;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pramoth
 */
public class DipFormatter {
    public static String convertDateToStringDDMMYYYYThaiFormat(Date date) {
        String dateStr = "";
        if (date != null) {
            SimpleDateFormat dateThaiFormat = new SimpleDateFormat("dd/MM/yyyy", UtilityConstant.LOCALE_TH);
            dateStr = dateThaiFormat.format(date);
        }
        return dateStr;
    }
}
