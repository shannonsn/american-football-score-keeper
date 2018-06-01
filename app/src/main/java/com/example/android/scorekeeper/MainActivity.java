package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreKeepeerTeamA = 0;
    int scoreKeepeerTeamB = 0;

    int touchDownTeamA = 0;
    int touchDownTeamB = 0;

    int extraPointTeamA = 0;
    int extraPointTeamB = 0;

    int twoPointConversionTeamA = 0;
    int twoPointConversionTeamB = 0;

    int fieldGoalTeamA = 0;
    int fieldGoalTeamB = 0;

    int safetyTeamA = 0;
    int safetyTeamB = 0;

    public void touchDownTeamA(View view){
        scoreKeepeerTeamA = scoreKeepeerTeamA + 6;
        touchDownTeamA = touchDownTeamA + 1;
        displayForTeamA(scoreKeepeerTeamA);
        displayTouchDownTeamA(touchDownTeamA);
    }

    public void touchDownTeamB(View view){
        scoreKeepeerTeamB = scoreKeepeerTeamB + 6;
        touchDownTeamB = touchDownTeamB + 1;
        displayForTeamB(scoreKeepeerTeamB);
        displayTouchDownTeamB(touchDownTeamB);
    }

    public void extraPointTeamA(View View){
        scoreKeepeerTeamA = scoreKeepeerTeamA + 1;
        extraPointTeamA = extraPointTeamA + 1;
        displayForTeamA(scoreKeepeerTeamA);
        displayExtraPointTeamA(extraPointTeamA);
    }

    public void extraPointTeamB(View View){
        scoreKeepeerTeamB = scoreKeepeerTeamB + 1;
        extraPointTeamB = extraPointTeamB + 1;
        displayForTeamB(scoreKeepeerTeamB);
        displayExtraPointTeamB(extraPointTeamB);
    }

    public void pointConversionTeamA(View View){
        scoreKeepeerTeamA = scoreKeepeerTeamA + 2;
        twoPointConversionTeamA = twoPointConversionTeamA + 1;
        displayForTeamA(scoreKeepeerTeamA);
        displayTwoPointConversionTeamA(twoPointConversionTeamA);
    }
    public void pointConversionTeamB(View View){
        scoreKeepeerTeamB = scoreKeepeerTeamB + 2;
        twoPointConversionTeamB = twoPointConversionTeamB + 1;
        displayForTeamB(scoreKeepeerTeamB);
        displayTwoPointConversionTeamB(twoPointConversionTeamB);
    }

    public void fieldGoalTeamA(View View){
        scoreKeepeerTeamA = scoreKeepeerTeamA + 3;
        fieldGoalTeamA = fieldGoalTeamA + 1;
        displayForTeamA(scoreKeepeerTeamA);
        displayFieldGoalTeamA(fieldGoalTeamA);
    }
    public void fieldGoalTeamB(View View){
        scoreKeepeerTeamB = scoreKeepeerTeamB + 3;
        fieldGoalTeamB = fieldGoalTeamB + 1;
        displayForTeamB(scoreKeepeerTeamB);
        displayFieldGoalTeamB(fieldGoalTeamB);
    }

    public void safetyTeamA(View View){
        scoreKeepeerTeamA = scoreKeepeerTeamA + 2;
        safetyTeamA = safetyTeamA + 1;
        displayForTeamA(scoreKeepeerTeamA);
      displaySafetyTeamA(safetyTeamA);
    }
    public void safetyTeamB(View View){
        scoreKeepeerTeamB = scoreKeepeerTeamB + 2;
        safetyTeamB = safetyTeamB + 1;
        displayForTeamB(scoreKeepeerTeamB);
        displaySafetyTeamB(safetyTeamB);
    }
    public void reset(View view){
        scoreKeepeerTeamA = 0;
        scoreKeepeerTeamB = 0;

        touchDownTeamA = 0;
        touchDownTeamB = 0;

        extraPointTeamA = 0;
        extraPointTeamB = 0;

        twoPointConversionTeamA = 0;
        twoPointConversionTeamB = 0;

        fieldGoalTeamA = 0;
        fieldGoalTeamB = 0;

        safetyTeamA = 0;
        safetyTeamB = 0;
        displayForTeamA(scoreKeepeerTeamA);
        displayForTeamB(scoreKeepeerTeamB);

        displayTouchDownTeamA(touchDownTeamA);
        displayTouchDownTeamB(touchDownTeamB);

        displayExtraPointTeamA(extraPointTeamA);
        displayExtraPointTeamB(extraPointTeamB);

        displayTwoPointConversionTeamA(twoPointConversionTeamA);
        displayTwoPointConversionTeamB(twoPointConversionTeamB);

        displayFieldGoalTeamA(fieldGoalTeamA);
        displayFieldGoalTeamB(fieldGoalTeamB);

        displaySafetyTeamA(safetyTeamA);
        displaySafetyTeamB(safetyTeamB);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_score_a);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_score_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTouchDownTeamA(int touchDownScoreA){
        TextView scoreView = (TextView) findViewById(R.id.touchDownTeamA);
        scoreView.setText(String.valueOf(touchDownScoreA));
    }
    public void displayTouchDownTeamB(int touchDownScoreB){
        TextView scoreView = (TextView) findViewById(R.id.touchDownTeamB);
        scoreView.setText(String.valueOf(touchDownScoreB));
    }

    public void displayExtraPointTeamA(int extraPointTeamA){
        TextView scoreView = (TextView) findViewById(R.id.extraPointTeamA);
        scoreView.setText(String.valueOf(extraPointTeamA));
    }
    public void displayExtraPointTeamB(int extraPointTeamB){
        TextView scoreView = (TextView) findViewById(R.id.extraPointTeamB);
        scoreView.setText(String.valueOf(extraPointTeamB));
    }

    public void displayTwoPointConversionTeamA(int pointConversionTeamA){
        TextView scoreView = (TextView) findViewById(R.id.twoPointTeamA);
        scoreView.setText(String.valueOf(pointConversionTeamA));
    }
    public void displayTwoPointConversionTeamB(int pointConversionTeamB){
        TextView scoreView = (TextView) findViewById(R.id.twoPointTeamB);
        scoreView.setText(String.valueOf(pointConversionTeamB));
    }

    public void displayFieldGoalTeamA(int fieldGoalTeamA){
        TextView scoreView = (TextView) findViewById(R.id.fieldGoalTeamA);
        scoreView.setText(String.valueOf(fieldGoalTeamA));
    }
    public void displayFieldGoalTeamB(int fielGoalTeamB){
        TextView scoreView = (TextView) findViewById(R.id.fieldGoalTeamB);
        scoreView.setText(String.valueOf(fieldGoalTeamB));
    }

    public void displaySafetyTeamA(int safetyTeamA){
        TextView scoreView = (TextView) findViewById(R.id.safetyTeamA);
        scoreView.setText(String.valueOf(safetyTeamA));
    }
    public void displaySafetyTeamB(int safetyTeamB){
        TextView scoreView = (TextView) findViewById(R.id.safetyTeamB);
        scoreView.setText(String.valueOf(safetyTeamB));
    }
}
