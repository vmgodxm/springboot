package com.example.demo.model;

public class UserReservation {
    // 헤어스타일 번호
    private Long styleNo;

    // 헤어스타일 이름
    private String styleName;

    // 헤어스타일 설명
    private String styleComment;

    // 헤어스타일 운영시간(시간)
    private String hairUseHour;

    // 헤어스타일 운영시간(분)
    private String hairUseMinute;

    // 헤어스타일 가격
    private String hairPrice;

    // 디자이너 번호
    private Long designerNo;

    // 디자이너 닉네임
    private String designerNickName;

    // 디자이너 연락처
    private String designerPhone;

    // 디자이너 이메일
    private String designerEmail;

    // 디자이너 사업장
    private String designerCompanyName;

    // 사업장 운영시간(시작시간)
    private String startTime;

    // 사업장 운영시간(종료시간)
    private String endTime;

    // 헤어스타일 썸네일
    private String hairThumbNailFileName;

    // 디자이너 썸네일
    private String designerThumbNailFileName;

    // 예약 번호
    private Long resNo;

    // 예약시간
    private String resDate;

    // 사용자 요청사항
    private String useComment;

    public UserReservation() { }


    public UserReservation(Long styleNo, String styleName, String styleComment, String hairUseHour, String hairUseMinute, String hairPrice, Long designerNo, String designerNickName, String designerPhone, String designerEmail, String designerCompanyName, String startTime, String endTime, String hairThumbNailFileName, String designerThumbNailFileName, Long resNo, String resDate, String useComment) {
        this.styleNo = styleNo;
        this.styleName = styleName;
        this.styleComment = styleComment;
        this.hairUseHour = hairUseHour;
        this.hairUseMinute = hairUseMinute;
        this.hairPrice = hairPrice;
        this.designerNo = designerNo;
        this.designerNickName = designerNickName;
        this.designerPhone = designerPhone;
        this.designerEmail = designerEmail;
        this.designerCompanyName = designerCompanyName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.hairThumbNailFileName = hairThumbNailFileName;
        this.designerThumbNailFileName = designerThumbNailFileName;
        this.resNo = resNo;
        this.resDate = resDate;
        this.useComment = useComment;
    }

    public Long getStyleNo() {
        return this.styleNo;
    }

    public void setStyleNo(Long styleNo) {
        this.styleNo = styleNo;
    }

    public String getStyleName() {
        return this.styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getStyleComment() {
        return this.styleComment;
    }

    public void setStyleComment(String styleComment) {
        this.styleComment = styleComment;
    }

    public String getHairUseHour() {
        return this.hairUseHour;
    }

    public void setHairUseHour(String hairUseHour) {
        this.hairUseHour = hairUseHour;
    }

    public String getHairUseMinute() {
        return this.hairUseMinute;
    }

    public void setHairUseMinute(String hairUseMinute) {
        this.hairUseMinute = hairUseMinute;
    }

    public String getHairPrice() {
        return this.hairPrice;
    }

    public void setHairPrice(String hairPrice) {
        this.hairPrice = hairPrice;
    }

    public Long getDesignerNo() {
        return this.designerNo;
    }

    public void setDesignerNo(Long designerNo) {
        this.designerNo = designerNo;
    }

    public String getDesignerNickName() {
        return this.designerNickName;
    }

    public void setDesignerNickName(String designerNickName) {
        this.designerNickName = designerNickName;
    }

    public String getDesignerPhone() {
        return this.designerPhone;
    }

    public void setDesignerPhone(String designerPhone) {
        this.designerPhone = designerPhone;
    }

    public String getDesignerEmail() {
        return this.designerEmail;
    }

    public void setDesignerEmail(String designerEmail) {
        this.designerEmail = designerEmail;
    }

    public String getDesignerCompanyName() {
        return this.designerCompanyName;
    }

    public void setDesignerCompanyName(String designerCompanyName) {
        this.designerCompanyName = designerCompanyName;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getHairThumbNailFileName() {
        return this.hairThumbNailFileName;
    }

    public void setHairThumbNailFileName(String hairThumbNailFileName) {
        this.hairThumbNailFileName = hairThumbNailFileName;
    }

    public String getDesignerThumbNailFileName() {
        return this.designerThumbNailFileName;
    }

    public void setDesignerThumbNailFileName(String designerThumbNailFileName) {
        this.designerThumbNailFileName = designerThumbNailFileName;
    }

    public Long getResNo() {
        return this.resNo;
    }

    public void setResNo(Long resNo) {
        this.resNo = resNo;
    }

    public String getResDate() {
        return this.resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }

    public String getUseComment() {
        return this.useComment;
    }

    public void setUseComment(String useComment) {
        this.useComment = useComment;
    }

    @Override
    public String toString() {
        return "{" +
            " styleNo='" + getStyleNo() + "'" +
            ", styleName='" + getStyleName() + "'" +
            ", styleComment='" + getStyleComment() + "'" +
            ", hairUseHour='" + getHairUseHour() + "'" +
            ", hairUseMinute='" + getHairUseMinute() + "'" +
            ", hairPrice='" + getHairPrice() + "'" +
            ", designerNo='" + getDesignerNo() + "'" +
            ", designerNickName='" + getDesignerNickName() + "'" +
            ", designerPhone='" + getDesignerPhone() + "'" +
            ", designerEmail='" + getDesignerEmail() + "'" +
            ", designerCompanyName='" + getDesignerCompanyName() + "'" +
            ", startTime='" + getStartTime() + "'" +
            ", endTime='" + getEndTime() + "'" +
            ", hairThumbNailFileName='" + getHairThumbNailFileName() + "'" +
            ", designerThumbNailFileName='" + getDesignerThumbNailFileName() + "'" +
            ", resNo='" + getResNo() + "'" +
            ", resDate='" + getResDate() + "'" +
            ", useComment='" + getUseComment() + "'" +
            "}";
    }


}