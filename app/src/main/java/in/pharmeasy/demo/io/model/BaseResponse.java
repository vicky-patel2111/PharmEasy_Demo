package in.pharmeasy.demo.io.model;

/**
 * Created by Jignesh on 26/12/15.
 */
public class BaseResponse {
    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
