package sdkd.com.ec.model;

import java.util.Date;

/**
 * Created by sdust on 2016/7/7.
 */
public class EbBBS {
    private int ebbsId;
    private String ebbsTitle;
    private String ebbsConnect;
    private Date ebbsCreateTime;

    public int getEbbsId() {
        return ebbsId;
    }

    public void setEbbsId(int ebbsId) {
        this.ebbsId = ebbsId;
    }

    public String getEbbsTitle() {
        return ebbsTitle;
    }

    public void setEbbsTitle(String ebbsTitle) {
        this.ebbsTitle = ebbsTitle;
    }

    public String getEbbsConnect() {
        return ebbsConnect;
    }

    public void setEbbsConnect(String ebbsConnect) {
        this.ebbsConnect = ebbsConnect;
    }

    public Date getEbbsCreateTime() {
        return ebbsCreateTime;
    }

    public void setEbbsCreateTime(Date ebbsCreateTime) {
        this.ebbsCreateTime = ebbsCreateTime;
    }
}
