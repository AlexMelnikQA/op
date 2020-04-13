package DTO.FinderFilter;

import java.util.List;

public class FinderFilterGroupTitle {

    private String Title;
    private List<FinderMeetingSubGroups> MeetingSubGroups;


    public String getTitle() {
        return Title;
    }

    public void setTitle(final String title) {
        Title = title;
    }

    public void setMeetingSubGroups(final List<FinderMeetingSubGroups> meetingSubGroups) {
        MeetingSubGroups = meetingSubGroups;
    }

    public List<FinderMeetingSubGroups> getMeetingSubGroups() {
        return MeetingSubGroups;
    }
}