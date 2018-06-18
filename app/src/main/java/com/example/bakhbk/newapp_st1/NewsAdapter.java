package com.example.bakhbk.newapp_st1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, List<News> news) {
        super(context, 0, news);
    }

    //Returns a list item view that displays information about the news at the given position in the list of news
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID section name
        TextView sectionName = listItemView.findViewById(R.id.section_name);
        // Display the sectionName of the current news in that TextView
        sectionName.setText(currentNews.getSectionName());

        // Find the TextView with view ID web title
        TextView webTitle = listItemView.findViewById(R.id.web_title);
        // Display the webTitle of the current news in that TextView
        webTitle.setText(currentNews.getWebTitle());

        // Get a date and reformat to new format
        String mDate = currentNews.getDate();
        SimpleDateFormat spf = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss aaa");
        Date newDate = new Date();
        try {
            newDate = spf.parse(mDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        spf = new SimpleDateFormat("hh:mm aaa, MMM dd");
        mDate = spf.format(newDate);

        // Find the TextView with view ID date
        TextView date = listItemView.findViewById(R.id.date);
        // Display the date of the current news in that TextView
        date.setText(mDate);

        // Find the TextView with view ID web title
        TextView articleAuthor = listItemView.findViewById(R.id.article_author);
        // Display the webTitle of the current news in that TextView
        articleAuthor.setText(currentNews.getArticleAuthor());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}