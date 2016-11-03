package com.xilai.core.entity;

import java.util.Date;

public class TbXilaicoreIkuaidiXilaiorder {
    private String servicecode;

    private String xilaino;

    private String sendname;

    private String sendphone;

    private Integer sendcitycode;

    private String sendaddress;

    private Double sendaddlon;

    private Double sendaddlat;

    private String sendcardid;

    private String sendcompany;

    private String takename;

    private String takephone;

    private Integer takecitycode;

    private String takeaddress;

    private Double takeaddlon;

    private Double takeaddla;

    private Integer activitytype;

    private Date senddate;

    private Date takedate;

    private String source;

    private String sourcecode;

    private Integer status;

    private Integer isvip;

    private String loginuc;

    private String sendcity;

    public String getServicecode() {
        return servicecode;
    }

    public void setServicecode(String servicecode) {
        this.servicecode = servicecode == null ? null : servicecode.trim();
    }

    public String getXilaino() {
        return xilaino;
    }

    public void setXilaino(String xilaino) {
        this.xilaino = xilaino == null ? null : xilaino.trim();
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname == null ? null : sendname.trim();
    }

    public String getSendphone() {
        return sendphone;
    }

    public void setSendphone(String sendphone) {
        this.sendphone = sendphone == null ? null : sendphone.trim();
    }

    public Integer getSendcitycode() {
        return sendcitycode;
    }

    public void setSendcitycode(Integer sendcitycode) {
        this.sendcitycode = sendcitycode;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    public Double getSendaddlon() {
        return sendaddlon;
    }

    public void setSendaddlon(Double sendaddlon) {
        this.sendaddlon = sendaddlon;
    }

    public Double getSendaddlat() {
        return sendaddlat;
    }

    public void setSendaddlat(Double sendaddlat) {
        this.sendaddlat = sendaddlat;
    }

    public String getSendcardid() {
        return sendcardid;
    }

    public void setSendcardid(String sendcardid) {
        this.sendcardid = sendcardid == null ? null : sendcardid.trim();
    }

    public String getSendcompany() {
        return sendcompany;
    }

    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany == null ? null : sendcompany.trim();
    }

    public String getTakename() {
        return takename;
    }

    public void setTakename(String takename) {
        this.takename = takename == null ? null : takename.trim();
    }

    public String getTakephone() {
        return takephone;
    }

    public void setTakephone(String takephone) {
        this.takephone = takephone == null ? null : takephone.trim();
    }

    public Integer getTakecitycode() {
        return takecitycode;
    }

    public void setTakecitycode(Integer takecitycode) {
        this.takecitycode = takecitycode;
    }

    public String getTakeaddress() {
        return takeaddress;
    }

    public void setTakeaddress(String takeaddress) {
        this.takeaddress = takeaddress == null ? null : takeaddress.trim();
    }

    public Double getTakeaddlon() {
        return takeaddlon;
    }

    public void setTakeaddlon(Double takeaddlon) {
        this.takeaddlon = takeaddlon;
    }

    public Double getTakeaddla() {
        return takeaddla;
    }

    public void setTakeaddla(Double takeaddla) {
        this.takeaddla = takeaddla;
    }

    public Integer getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Integer activitytype) {
        this.activitytype = activitytype;
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Date getTakedate() {
        return takedate;
    }

    public void setTakedate(Date takedate) {
        this.takedate = takedate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSourcecode() {
        return sourcecode;
    }

    public void setSourcecode(String sourcecode) {
        this.sourcecode = sourcecode == null ? null : sourcecode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsvip() {
        return isvip;
    }

    public void setIsvip(Integer isvip) {
        this.isvip = isvip;
    }

    public String getLoginuc() {
        return loginuc;
    }

    public void setLoginuc(String loginuc) {
        this.loginuc = loginuc == null ? null : loginuc.trim();
    }

    public String getSendcity() {
        return sendcity;
    }

    public void setSendcity(String sendcity) {
        this.sendcity = sendcity == null ? null : sendcity.trim();
    }
}