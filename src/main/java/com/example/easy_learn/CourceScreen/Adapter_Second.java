package com.example.easy_learn.CourceScreen;

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

public class Adapter_Second extends ArrayAdapter<ModelClass_Second> {

    private Context context;
    private ArrayList<ModelClass_Second> modelClassArrayList;

    public Adapter_Second(ArrayList<ModelClass_Second> data, Context context) {
        super(context, R.layout.list_second, data);
        this.context = context;
        this.modelClassArrayList = data;

    }

    private static class ViewHolder {

        TextView unitTxt;
        TextView subTxt;
        Button percentBtn;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        ModelClass_Second dataModel = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.list_second, parent, false);

            viewHolder.unitTxt = (TextView) convertView.findViewById(R.id.unitTxt);
            viewHolder.subTxt = (TextView) convertView.findViewById(R.id.subText);
            viewHolder.percentBtn = (Button) convertView.findViewById(R.id.percentBtn);

            result = convertView;
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        // Get the data from the model class

        viewHolder.unitTxt.setText(dataModel.getUnitNo());
        viewHolder.subTxt.setText(dataModel.getSubText());
        viewHolder.percentBtn.setText(dataModel.getPercentage());

        return convertView;

    }
}
