package com.example.randytia.newsapp;

/**
 * Created by Randytia on 24/08/2017.
 */

public class News {

    private String mSectionName;
    private String mWebTitle;
    private String mWebUrl;
    private String mTime;

    public News(String sectionName, String webTitle, String url, String time) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mWebUrl = url;
        mTime = time;
    }

    public String getmSectionName() {
        return mSectionName;
    }

    public String getmWebTitle() {
        return mWebTitle;
    }

    public String getmWebUrl() {
        return mWebUrl;
    }

    public String getmTime() {
        return mTime;
    }
}
