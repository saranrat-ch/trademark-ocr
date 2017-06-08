/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.trademark.ocr.domain;

/**
 *
 * @author best
 */
public enum ActYear {
    OLD("OLD", "พรบเก่า"), A59("A59", "พรบใหม่2559");

    private String value;
    private String label;

    private ActYear(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static ActYear getActYearByValue(String value) {
        if (ActYear.A59.getValue().equalsIgnoreCase(value)) {
            return ActYear.A59;
        }
        if (ActYear.OLD.getValue().equalsIgnoreCase(value)) {
            return ActYear.OLD;
        }
        return null;
    }

}
