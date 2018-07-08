package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.family_father), "әpә"));
        words.add(new Word(getString(R.string.family_mother), "әṭa"));
        words.add(new Word(getString(R.string.family_son), "angsi"));
        words.add(new Word(getString(R.string.family_daughter), "tune"));
        words.add(new Word(getString(R.string.family_older_brother), "taachi"));
        words.add(new Word(getString(R.string.family_younger_brother), "chalitti"));
        words.add(new Word(getString(R.string.family_older_sister), "teṭe"));
        words.add(new Word(getString(R.string.family_younger_sister), "kolliti"));
        words.add(new Word(getString(R.string.family_grandfather), "paapa"));
        words.add(new Word(getString(R.string.family_grandmother), "ama"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
