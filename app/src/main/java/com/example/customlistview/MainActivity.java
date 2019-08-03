package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //a List of type hero for holding list items
    List<com.example.customlistview.Hero> heroList;
    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView) ;

        //adding some values to our list
        heroList.add(new com.example.customlistview.Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        heroList.add(new com.example.customlistview.Hero(R.drawable.joker, "Joker", "InjusticeGang"));
        heroList.add(new com.example.customlistview.Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroList.add(new com.example.customlistview.Hero(R.drawable.doctorstrange, "DoctorStrange", "Avengers"));
        heroList.add(new com.example.customlistview.Hero(R.drawable.captainamerica, "CaptainAmerica", "Avengers"));
        heroList.add(new com.example.customlistview.Hero(R.drawable.batman, "Batman", "JusticeLeague"));

        //creating the adapter
        com.example.customlist.MyListAdapter adapter = new com.example.customlist.MyListAdapter(this, R.layout.customlist, heroList);
//attaching adapter to the listview
        listView.setAdapter(adapter);
    }
}