package DTO.Sports;

import DTO.FinderFilter.FinderFilterGroupTitle;

import java.util.List;

public class SportData {

    private List<FinderFilterGroupTitle> AllMeetings;

    private List<BinariesData> Binaries;

    private TotalsMeetingsData TotalsMeetings;

    private LongTermMeetingsData LongTermMeetings;

    public List<FinderFilterGroupTitle> getAllMeetings() {
        return AllMeetings;
    }

    public List<BinariesData> getBinaries() {
        return Binaries;
    }

    public TotalsMeetingsData getTotalsMeetings() {
        return TotalsMeetings;
    }

    public LongTermMeetingsData getLongTermMeetings() {
        return LongTermMeetings;
    }
}