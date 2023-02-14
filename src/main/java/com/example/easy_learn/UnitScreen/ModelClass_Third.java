package com.example.easy_learn.UnitScreen;

public class ModelClass_Third {
    private String chapterNo;
    private String subChapterTxt;
    private String percentage;
    private String unitTitle;
    private String subTitle;
    public ModelClass_Third(String chapterNo, String subChapterTxt, String percentage, String unitTitle, String subTitle) {
        this.chapterNo = chapterNo;
        this.subChapterTxt = subChapterTxt;
        this.percentage = percentage;
        this.unitTitle = unitTitle;
        this.subTitle = subTitle;
    }
    public String getChapterNo() {
        return chapterNo;
    }

    public void setChapterNo(String chapterNo) {
        this.chapterNo = chapterNo;
    }

    public String getSubChapterTxt() {
        return subChapterTxt;
    }

    public void setSubChapterTxt(String subChapterTxt) {
        this.subChapterTxt = subChapterTxt;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getUnitTitle() {
        return unitTitle;
    }

    public void setUnitTitle(String unitTitle) {
        this.unitTitle = unitTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }



}
