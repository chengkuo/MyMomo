package bean;

import android.util.Log;

/**
 * Created by a452542253 on 2016/11/10.
 */

public class RenBean {
    private String url_touxiang;
    private String name;
    private String qianming;
    private String shijian_didian;

    public String getUrl_touxiang() {
        Log.i("tmd", "getUrl_touxiang: 222222222222222");
        Log.i("tmd", "getUrl_touxiang: 333333333333333333");
        return url_touxiang;
    }

    public void setUrl_touxiang(String url_touxiang) {
        this.url_touxiang = url_touxiang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQianming() {
        return qianming;
    }

    public void setQianming(String qianming) {
        this.qianming = qianming;
    }

    public String getShijian_didian() {
        return shijian_didian;
    }

    public void setShijian_didian(String shijian_didian) {
        this.shijian_didian = shijian_didian;
    }

}
