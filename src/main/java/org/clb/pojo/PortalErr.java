package org.clb.pojo;

/**
 * @Description
 * @Classname PortalErr
 * @Date 2021/5/11 15:25
 * @Author clb
 */
public class PortalErr {
    private double offset_com_value;
    private String pk_portal_err;

    public PortalErr() {
    }

    public PortalErr(double offset_com_value, String pk_portal_err) {
        this.offset_com_value = offset_com_value;
        this.pk_portal_err = pk_portal_err;
    }

    public double getOffset_com_value() {
        return offset_com_value;
    }

    public void setOffset_com_value(double offset_com_value) {
        this.offset_com_value = offset_com_value;
    }

    public String getPk_portal_err() {
        return pk_portal_err;
    }

    public void setPk_portal_err(String pk_portal_err) {
        this.pk_portal_err = pk_portal_err;
    }
}
