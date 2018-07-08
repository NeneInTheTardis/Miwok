package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.number_one), "lutti"));
        words.add(new Word(getString(R.string.number_two), "otiiko"));
        words.add(new Word(getString(R.string.number_three), "tolookosu"));
        words.add(new Word(getString(R.string.number_four), "oyyisa"));
        words.add(new Word(getString(R.string.number_five), "massokka"));
        words.add(new Word(getString(R.string.number_six), "temmokka"));
        words.add(new Word(getString(R.string.number_seven), "kenekaku"));
        words.add(new Word(getString(R.string.number_eight), "kawinta"));
        words.add(new Word(getString(R.string.number_nine), "wo’e"));
        words.add(new Word(getString(R.string.number_ten), "na’aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
