package Utils;

import DTO.FinderFilter.FinderFiltersDto;
import DTO.InPlayFilters.InPlayFiltersDto;
import DTO.ListOfSports.SportsDto;
import com.google.gson.Gson;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RestClient {

    private static final String REST_URI_ALL_SPORTS = "https://mobile.sportingindex.com/do/Data/Get?dataKey=allsports";
    private static final String REST_URI_INPLAY_PAGE = "https://mobile.sportingindex.com/do/Data/Get?dataKey=inplay-page";
    private static final String REST_URI_ALL_DATA_BY_SPORT_ID = "https://mobile.sportingindex.com/do/Data/Get?dataKey=cats|";


    public static SportsDto getListOfAllActualSports() throws IOException {
        Request request = new Request.Builder().url(REST_URI_ALL_SPORTS).build();
        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);
        Response response = call.execute();
        Gson gson = new Gson();
        return gson.fromJson(response.body().string(), SportsDto.class);
    }

    public static InPlayFiltersDto getInPlayFilters() throws IOException {
        Request request = new Request.Builder().url(REST_URI_INPLAY_PAGE).build();
        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);
        Response response = call.execute();
        Gson gson = new Gson();
        return gson.fromJson(response.body().string(), InPlayFiltersDto.class);
    }

    public static FinderFiltersDto getAllDataBySportName(String sport) throws IOException {
        Request request = new Request.Builder().url(REST_URI_ALL_DATA_BY_SPORT_ID + sport).build();
        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);
        Response response = call.execute();
        Gson gson = new Gson();
        return gson.fromJson(response.body().string(), FinderFiltersDto.class);
    }
}