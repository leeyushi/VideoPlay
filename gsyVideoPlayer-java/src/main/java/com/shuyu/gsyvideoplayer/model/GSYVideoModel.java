package com.shuyu.gsyvideoplayer.model;

import java.io.Serializable;

/**
 * Created by shuyu on 2016/12/20.
 */

public class GSYVideoModel implements Serializable {

    private String mUrl;
    private String mTitle;


    public GSYVideoModel() {

    }

    public GSYVideoModel(String url, String title) {
        mUrl = url;
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}
