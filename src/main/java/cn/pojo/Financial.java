package cn.pojo;

import java.util.Date;

public class Financial {

    private Integer id;
    private Integer xm_id;
    private Date check_time;
    private String rw;
    private Integer goqian;
    private String jindu;
    private Date modify_time;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getXm_id() {
        return xm_id;
    }
    public void setXm_id(Integer xm_id) {
        this.xm_id = xm_id;
    }
    public Date getCheck_time() {
        return check_time;
    }
    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }
    public String getRw() {
        return rw;
    }
    public void setRw(String rw) {
        this.rw = rw;
    }
    public Integer getGoqian() {
        return goqian;
    }
    public void setGoqian(Integer goqian) {
        this.goqian = goqian;
    }
    public String getJindu() {
        return jindu;
    }
    public void setJindu(String jindu) {
        this.jindu = jindu;
    }
    public Date getModify_time() {
        return modify_time;
    }
    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }



}
