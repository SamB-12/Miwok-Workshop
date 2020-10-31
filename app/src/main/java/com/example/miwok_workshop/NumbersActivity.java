package com.example.miwok_workshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final List<MiwokModel> number = new ArrayList<>();
        number.add(new MiwokModel("one","lutti",R.drawable.number_one));
        number.add(new MiwokModel("two","otiiko", R.drawable.number_two));
        number.add(new MiwokModel("three","tolookosu",R.drawable.number_three));
        number.add(new MiwokModel("four","oyyisa",R.drawable.number_four));
        number.add(new MiwokModel("five","massokka",R.drawable.number_five));
        number.add(new MiwokModel("six","temmokka",R.drawable.number_six));
        number.add(new MiwokModel("seven","kenekaku",R.drawable.number_seven));
        number.add(new MiwokModel("eight","kawinta",R.drawable.number_eight));
        number.add(new MiwokModel("nine","wo'e",R.drawable.number_nine));
        number.add(new MiwokModel("ten","na'aacha",R.drawable.number_ten));

        RecyclerView numbers_recyclerView = findViewById(R.id.RecyclerView3);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numbers_recyclerView.setLayoutManager(layoutManager);

        MiwokAdapter miwokAdapter = new MiwokAdapter(this,number,R.color.category_numbers);
        numbers_recyclerView.setAdapter(miwokAdapter);
    }
}