package com.example.allan.testlistviews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends ArrayAdapter {

    private Context context;
    private int resource;
    private ArrayList<Student> objects;

    public StudentAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Student> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(resource, null);
        }

        TextView name = convertView.findViewById(R.id.name);
        TextView mark = convertView.findViewById(R.id.mark);

        Student student = objects.get(position);

        name.setText(student.getName());
        mark.setText(String.valueOf(student.getMark()));

        return convertView;
    }
}
