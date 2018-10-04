package com.example.hemant_pc.vcv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Jobsearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobsearch);
        AutoCompleteTextView textView = findViewById(R.id.autocomplete_jobs);
        String[] countries = getResources().getStringArray(R.array.Jobs);
        ArrayAdapter<String> adapterau =
                new ArrayAdapter(this, R.layout.semple_list_21, countries);
        textView.setAdapter(adapterau);
    }

}
