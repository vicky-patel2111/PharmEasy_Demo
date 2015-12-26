package in.pharmeasy.demo.io.model;

import com.google.gson.JsonArray;

import org.json.JSONArray;

/**
 * Created by Jignesh on 26/12/15.
 */
public class SearchResult extends BaseResponse {
    private JsonArray result;

    public JsonArray getResult() {
        return result;
    }

    public void setResult(JsonArray result) {
        this.result = result;
    }
}
