package DTO.MyBet;

public class QuickBetDto {
    private String meetingName;
    private String stakeType;
    private String amount;


    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(final String meetingName) {
        this.meetingName = meetingName;
    }

    public String getStakeType() {
        return stakeType;
    }

    public void setStakeType(final String stakeType) {
        this.stakeType = stakeType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(final String amount) {
        this.amount = amount;
    }
}