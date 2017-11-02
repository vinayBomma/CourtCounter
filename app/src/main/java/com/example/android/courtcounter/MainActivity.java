package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;
import static com.example.android.courtcounter.R.id.reset_btn;
import static com.example.android.courtcounter.R.id.team_a_res;
import static com.example.android.courtcounter.R.id.team_b_res;

public class MainActivity extends AppCompatActivity {

    int team_a = 0;
    int team_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pointA3(View view) {
        team_a = team_a + 3;
        displayTeamA(team_a);
    }

    public void pointA2(View view) {
        team_a = team_a + 2;
        displayTeamA(team_a);
    }

    public void pointA1(View view) {
        team_a = team_a + 1;
        displayTeamA(team_a);
    }

    public void pointB3(View view) {
        team_b = team_b + 3;
        displayTeamB(team_b);
    }

    public void pointB2(View view) {
        team_b = team_b + 2;
        displayTeamB(team_b);
    }

    public void pointB1(View view) {
        team_b = team_b + 1;
        displayTeamB(team_b);
    }

    public void btn_reset(View view) {
        team_a = 0;
        team_b = 0;
        displayTeamA(team_a);
        displayTeamB(team_b);
    }


    private void displayTeamA(int number) {
        TextView team_a_res = (TextView) findViewById(R.id.team_a_res);
        team_a_res.setText("" + number);
    }

    private void displayTeamB(int number) {
        TextView team_b_res = (TextView) findViewById(R.id.team_b_res);
        team_b_res.setText("" + number);
    }


}
