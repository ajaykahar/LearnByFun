package com.example.learnbyfun;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceID)
    {
        super(context,0,words);
        mColorResourceId=colorResourceID;
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Word currentWord = getItem(position);

        TextView Eng_TextView = (TextView)listItemView.findViewById(R.id.English_word_TextView);
        Eng_TextView.setText(currentWord.getEng_word());

        TextView Hin_TextView = (TextView)listItemView.findViewById(R.id.Hindi_word_TextView);
        Hin_TextView.setText(currentWord.getHindi_word());


        ImageView icon_image_view = (ImageView)listItemView.findViewById(R.id.Image_view);
        if(currentWord.hasImage()) {
            icon_image_view.setImageResource(currentWord.getImage_resource_id());
        }
        else { icon_image_view.setVisibility(View.GONE); }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
