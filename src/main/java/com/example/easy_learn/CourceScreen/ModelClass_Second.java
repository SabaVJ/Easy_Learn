package com.example.easy_learn.CourceScreen;

public class ModelClass_Second {
    private String unitNo;
    private String subText;
    private String percentage;
    public ModelClass_Second(String unitNo, String subText, String percentage) {
        this.unitNo = unitNo;
        this.subText = subText;
        this.percentage = percentage;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }


}
