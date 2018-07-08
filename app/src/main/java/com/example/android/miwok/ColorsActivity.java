package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.color_red), "weṭeṭṭi"));
        words.add(new Word(getString(R.string.color_green), "chokokki"));
        words.add(new Word(getString(R.string.color_brown), "ṭakaakki"));
        words.add(new Word(getString(R.string.color_gray), "ṭopoppi"));
        words.add(new Word(getString(R.string.color_black), "kululli"));
        words.add(new Word(getString(R.string.color_white), "kelelli"));
        words.add(new Word(getString(R.string.color_dusty_yellow), "ṭopiisә"));
        words.add(new Word(getString(R.string.color_mustard_yellow), "chiwiiṭә"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
