package com.example.allan.testlistviews;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        ArrayList<Student> names = new ArrayList<>();

        Student allan = new Student(R.drawable.ic_contacts,"Allan", 50);
        names.add(allan);
        names.add(new Student(R.drawable.ic_android,"Hannan", 80));
        names.add(new Student(R.drawable.ic_contacts,"Mohammad", 80));
        names.add(new Student(R.drawable.ic_android,"Dali", 80));
        names.add(new Student(R.drawable.ic_contacts,"Allan", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));
        names.add(new Student(R.drawable.ic_android,"Ibrahim", 80));


        StudentAdapter namesAdapter = new StudentAdapter(this, R.layout.list_item, names);

        listView.setAdapter(namesAdapter);
    }
}
