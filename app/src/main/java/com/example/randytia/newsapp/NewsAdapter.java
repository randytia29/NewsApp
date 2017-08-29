package com.example.randytia.newsapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Randytia on 24/08/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> newses) {
        super(context, 0, newses);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.text_view_section_name);
        sectionNameView.setText(currentNews.getmSectionName());

        TextView webTitleView = (TextView) listItemView.findViewById(R.id.text_view_web_title);
        webTitleView.setText(currentNews.getmWebTitle());

        String originalTime = currentNews.getmTime();

        TextView dateView = (TextView) listItemView.findViewById(R.id.text_view_date);

        TextView timeView = (TextView) listItemView.findViewById(R.id.text_view_time);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        try {
            Date date = format.parse(originalTime);

            SimpleDateFormat formatDate = new SimpleDateFormat("dd MMM yyyy");
            String tanggal = formatDate.format(date);
            dateView.setText(tanggal);

            SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm:ss");
            String waktu = formatTime.format(date);
            timeView.setText(waktu);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return listItemView;
    }
}
