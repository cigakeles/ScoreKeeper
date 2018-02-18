package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int yellowTeamA = 0;
    int redTeamA = 0;
    int yelloowTeamB = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addGoalForTeamA(View V) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);


    }

    public void addYellowForTeamA(View V) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);

    }

    public void addRedForTeamA(View V) {
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);

    }


    public void addGoalForTeamB(View V) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    public void addYellowForTeamB(View V) {

        yelloowTeamB = yelloowTeamB + 1;
        displayYellowForTeamB(yelloowTeamB);
    }

    public void addRedForTeamB(View V) {

        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }

    public void resetScore(View V) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        yellowTeamA = 0;
        yelloowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayRedForTeamA(redTeamA);
        displayYellowForTeamB(yelloowTeamB);
        displayRedForTeamB(redTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayYellowForTeamA(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.team_a_yellow);
        yellowView.setText(String.valueOf(yellow));
    }

    public void displayRedForTeamA(int red) {
        TextView redView = (TextView) findViewById(R.id.team_a_red);
        redView.setText(String.valueOf(red));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void displayYellowForTeamB(int yellow) {
        TextView yellowView = (TextView) findViewById(R.id.team_b_yellow);
        yellowView.setText(String.valueOf(yellow));
    }

    public void displayRedForTeamB(int red) {
        TextView redView = (TextView) findViewById(R.id.team_b_red);
        redView.setText(String.valueOf(red));
    }


}


