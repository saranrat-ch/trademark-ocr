package th.co.geniustree.trademark.ocr.util;


import org.apache.commons.lang3.StringUtils;

public class DipUtils {

    public static String lpad(String str, int length, String padStr) {
        String newGen = "";
        int strLength = StringUtils.isNotBlank(str) ? str.length() : 0;
        if (strLength < length) {
            while ((newGen.length() + strLength) < length) {
                newGen = newGen.concat(padStr);
            }
            return newGen.concat(str);
        } else if (strLength == length) {
            return str;
        } else {
            return str.subSequence(0, length).toString();
        }
    }

}
