package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.phrases_where_going), "minto wuksus"));
        words.add(new Word(getString(R.string.phrases_your_name), "tinnә oyaase'nә"));
        words.add(new Word(getString(R.string.phrases_my_name), "oyaaset..."));
        words.add(new Word(getString(R.string.phrases_how_feeling), "michәksәs?"));
        words.add(new Word(getString(R.string.phrases_feeling_good), "kuchi achit"));
        words.add(new Word(getString(R.string.phrases_are_coming), "әәnәs'aa?"));
        words.add(new Word(getString(R.string.phrases_yes_coming), "hәә’ әәnәm"));
        words.add(new Word(getString(R.string.phrases_coming), "әәnәm"));
        words.add(new Word(getString(R.string.phrases_lets_go), "yoowutis"));
        words.add(new Word(getString(R.string.phrases_come_here), "әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
