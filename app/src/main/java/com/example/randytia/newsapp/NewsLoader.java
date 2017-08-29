package com.example.randytia.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Randytia on 24/08/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    public List<News> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<News> newses = QueryUtils.fetchNewsData(mUrl);
        return newses;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}
