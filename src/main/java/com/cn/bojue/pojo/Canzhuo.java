package com.cn.bojue.pojo;

public class Canzhuo {
    private Integer id;

    private String czNo;

    private String czName;

    private String czRes;

    private String czType;

    private String czSpec;

    private Integer czNum;

    private String czColor;

    private Integer czPrice;

    private String czDes;

    public String getCzKind() {
        return czKind;
    }

    public void setCzKind(String czKind) {
        this.czKind = czKind;
    }

    private String czKind;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCzNo() {
        return czNo;
    }

    public void setCzNo(String czNo) {
        this.czNo = czNo == null ? null : czNo.trim();
    }

    public String getCzName() {
        return czName;
    }

    public void setCzName(String czName) {
        this.czName = czName == null ? null : czName.trim();
    }

    public String getCzRes() {
        return czRes;
    }

    public void setCzRes(String czRes) {
        this.czRes = czRes == null ? null : czRes.trim();
    }

    public String getCzType() {
        return czType;
    }

    public void setCzType(String czType) {
        this.czType = czType == null ? null : czType.trim();
    }

    public String getCzSpec() {
        return czSpec;
    }

    public void setCzSpec(String czSpec) {
        this.czSpec = czSpec == null ? null : czSpec.trim();
    }

    public Integer getCzNum() {
        return czNum;
    }

    public void setCzNum(Integer czNum) {
        this.czNum = czNum;
    }

    public String getCzColor() {
        return czColor;
    }

    public void setCzColor(String czColor) {
        this.czColor = czColor == null ? null : czColor.trim();
    }

    public Integer getCzPrice() {
        return czPrice;
    }

    public void setCzPrice(Integer czPrice) {
        this.czPrice = czPrice;
    }

    public String getCzDes() {
        return czDes;
    }

    public void setCzDes(String czDes) {
        this.czDes = czDes == null ? null : czDes.trim();
    }
}