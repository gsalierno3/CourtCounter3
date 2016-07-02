package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * updates the score of team A
     * @param v
     */
    public void updateScoreA(View v)
    {
        String score = (String)v.getTag();
        switch (score)
        {
            case "1":
                scoreA += 1;
                break;
            case "2":
                scoreA +=2;
                break;
            default:
                scoreA +=3;

        }
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * updates the score of Team B
     * @param v
     */
    public void updateScoreB(View v)
    {
        String score = (String)v.getTag();
        switch (score)
        {
            case "1":
                scoreB += 1;
                break;
            case "2":
                scoreB +=2;
                break;
            default:
                scoreB +=3;

        }
        displayForTeamB(scoreB);
    }

    /**
     * resets scores
     * @param v
     */
    public void reset(View v)
    {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
