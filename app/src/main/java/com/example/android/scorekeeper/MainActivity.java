package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;
    private int faulTeamA;
    private int faulTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPointForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addFaulForTeamA(View view) {
        faulTeamA += 1;
        displayFaulForTeamA(faulTeamA);
    }

    public void addPointForTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addFaulForTeamB(View view) {
        faulTeamB += 1;
        displayFaulForTeamB(faulTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaulForTeamA(int faul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fauls);
        scoreView.setText(String.valueOf(faul));
    }

    public void displayFaulForTeamB(int faul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fauls);
        scoreView.setText(String.valueOf(faul));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        faulTeamA = 0;
        faulTeamB = 0;
        displayFaulForTeamA(faulTeamA);
        displayFaulForTeamB(faulTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
