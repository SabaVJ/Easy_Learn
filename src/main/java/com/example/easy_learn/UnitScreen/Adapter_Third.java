package com.example.easy_learn.UnitScreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.easy_learn.R;

import java.util.ArrayList;

public class Adapter_Third extends ArrayAdapter<ModelClass_Third> {
    private Context context;
    private ArrayList<ModelClass_Third> arrayList;

    public Adapter_Third(@NonNull Context context, ArrayList<ModelClass_Third> arrayList) {
        super(context, R.layout.list_third,arrayList);
        this.context = context;
        this.arrayList = arrayList;
    }

    private static class ViewHolder{

        TextView chapterTxt;
        TextView subChapterTxt;
        Button percentBtn;

        TextView unitTitle;
        TextView subTitle;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ModelClass_Third dataModel = getItem(position);

        ViewHolder viewHolder;
        final View result;

        if (convertView == null){
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.list_third,parent,false);

            viewHolder.chapterTxt = (TextView) convertView.findViewById(R.id.chapterTxt);
            viewHolder.subChapterTxt = (TextView) convertView.findViewById(R.id.chapSubTxt);
            viewHolder.percentBtn = (Button) convertView.findViewById(R.id.chapPercent);
            viewHolder.unitTitle = (TextView)convertView.findViewById(R.id.unitTitle);
            viewHolder.subTitle = (TextView)convertView.findViewById(R.id.subTitle);


            result = convertView;

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.chapterTxt.setText(dataModel.getChapterNo());
        viewHolder.subChapterTxt.setText(dataModel.getSubChapterTxt());
        viewHolder.percentBtn.setText(dataModel.getPercentage());
        viewHolder.unitTitle.setText(dataModel.getUnitTitle());
        viewHolder.subTitle.setText(dataModel.getSubTitle());


        return convertView;

    }
}
