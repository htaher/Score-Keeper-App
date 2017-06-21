package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int foulTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFoulForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayFoulForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Reset the score.
     */
    public void resetScoreAndFoul(View v) {
        scoreTeamA = 0;
        foulTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayFoulForTeamA(foulTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamB(foulTeamB);

    }

    /**
     * This method displays the score for team A.
     */
    public void addGoalTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * This method displays the foul for team A.
     */
    public void addFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    /**
     * This method displays the score for team B.
     */
    public void addGoalTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * This method displays the foul for team B.
     */
    public void addFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }


}
