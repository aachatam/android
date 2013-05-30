package com.aaa.memorygame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by aaa.
 */
public class WelcomeActivity extends Activity {

    Button startButton;

    final View.OnClickListener playAction = new View.OnClickListener() {
        public void onClick(View v) {
            startGame();
        }
    };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        startButton = (Button)findViewById(R.id.start_button);
        startButton.setOnClickListener(playAction);
    }

    private void startGame(){
    }
}