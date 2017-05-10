package com.example.android.football;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int FoulA=0;
    int OutA=0;
    int FoulB=0;
    int OutB=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addFoulA(View v) {
        FoulA = FoulA + 1;
        displayFoulA(FoulA);
    }


    public void addOutA(View v) {
        OutA = OutA +1 ;
        displayOutA(OutA);
    }


    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    public void addFoulB(View v) {
        FoulB = FoulB + 1;
        displayFoulB(FoulB);
    }


    public void addOutB(View v) {
        OutB = OutB +1 ;
        displayOutB(OutB);
    }

    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        FoulA=0;
        OutA=0;
        FoulB=0;
        OutB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulA(FoulA);
        displayFoulB(FoulB);
        displayOutA(OutA);
        displayOutB(OutB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayOutA(int Out) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out);
        scoreView.setText(String.valueOf(Out));
    }
    public void displayOutB(int Out) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out);
        scoreView.setText(String.valueOf(Out));
    }
    public void displayFoulA(int Foul) {
        TextView FoulView = (TextView) findViewById(R.id.team_a_foul);
        FoulView.setText(String.valueOf(Foul));
    }
    public void displayFoulB(int Foul) {
        TextView FoulView = (TextView) findViewById(R.id.team_b_foul);
        FoulView.setText(String.valueOf(Foul));
    }
}