package DTO.MyBet;

public class BetSleepDto {
    private String sportName;
    private String meetingName;
    private String meetingDetails;
    private String placeButtonName;
    private String meetingLabel;
    private String meetingComment;
    private String amount;

    public String getSportName() {
        return sportName;
    }

    public void setSportName(final String sportName) {
        this.sportName = sportName;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(final String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingDetails() {
        return meetingDetails;
    }

    public void setMeetingDetails(final String meetingDetails) {
        this.meetingDetails = meetingDetails;
    }

    public String getPlaceButtonName() {
        return placeButtonName;
    }

    public void setPlaceButtonName(final String placeButtonName) {
        this.placeButtonName = placeButtonName;
    }

    public String getMeetingLabel() {
        return meetingLabel;
    }

    public void setMeetingLabel(final String meetingLabel) {
        this.meetingLabel = meetingLabel;
    }

    public String getMeetingComment() {
        return meetingComment;
    }

    public void setMeetingComment(final String meetingComment) {
        this.meetingComment = meetingComment;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(final String amount) {
        this.amount = amount;
    }
}