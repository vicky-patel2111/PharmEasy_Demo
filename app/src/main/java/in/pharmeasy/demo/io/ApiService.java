package in.pharmeasy.demo.io;

import in.pharmeasy.demo.io.model.SearchResult;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Jignesh on 26/12/15.
 */
public interface ApiService {

    @GET("/api/v1/search/autocomplete")
    Call<SearchResult> searchAutoComplete(@Query("name") String name, @Query("pageSize") long pageSize);
}
