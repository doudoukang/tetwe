package com.meizu.media.makejartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.meizu.media.testlibrary.ShowWord;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tet);
        ShowWord showWord = new ShowWord();
        textView.setText(showWord.showWord());
    }
}
