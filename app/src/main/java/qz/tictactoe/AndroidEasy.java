package qz.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by zaid on 06-02-2018.
 */

public class AndroidEasy extends Activity {


    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn = 0, preTurn = 0;
    int Win[][] = new int[3][3];
    int arch[] = new int[9];
    ImageButton NG, HM;
    LinearLayout BGP, ML;
    Context ctx;
    ImageView p1, p2;
    int back, theme;
    int C, P;
    TextView ps1, ps2, pn1, pn2;
    int PS1, PS2, mainDec;
    int chance;
    int ctr;
    Animation myanim, myanim250;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.android_ttt);

        ctx = this;

        initialize();

        back = getIntent().getIntExtra("back", 3);
        theme = getIntent().getIntExtra("theme", 1);
        PS1 = getIntent().getIntExtra("PS1", 0);
        PS2 = getIntent().getIntExtra("PS2", 0);
        turn = getIntent().getIntExtra("Turn", 0);
        preTurn = turn;

        if (back == 1) {
            ML.setBackgroundResource(R.mipmap.paper_img2);
        } else if (back == 2) {
            ML.setBackgroundResource(R.mipmap.paper_img3);
        } else if (back == 3) {
            ML.setBackgroundResource(R.mipmap.paper_img4);
        } else if (back == 4) {
            ML.setBackgroundResource(R.mipmap.paper_img5);
        } else if (back == 5) {
            ps1.setTextColor(Color.BLACK);
            ps2.setTextColor(Color.BLACK);
            pn1.setTextColor(Color.BLACK);
            pn2.setTextColor(Color.BLACK);
            ML.setBackgroundResource(R.mipmap.paper_img6);
        } else if (back == 6) {
            ML.setBackgroundResource(R.mipmap.paper_img7);
        } else {
            ps1.setTextColor(Color.BLACK);
            ps2.setTextColor(Color.BLACK);
            pn1.setTextColor(Color.BLACK);
            pn2.setTextColor(Color.BLACK);
            ML.setBackgroundResource(R.mipmap.paper_img8);
        }


        if (theme == 1) {
            inserting(R.mipmap.abg, R.mipmap.axt, R.mipmap.aot, R.mipmap.ax, R.mipmap.ao);
        } else if (theme == 2) {
            inserting(R.mipmap.bbg, R.mipmap.bxt, R.mipmap.bot, R.mipmap.bx, R.mipmap.bo);
        } else if (theme == 3) {
            inserting(R.mipmap.cbg, R.mipmap.cxt, R.mipmap.cot, R.mipmap.cx, R.mipmap.co);
        } else if (theme == 4) {
            inserting(R.mipmap.dbg, R.mipmap.dxt, R.mipmap.dot, R.mipmap.dx, R.mipmap.doo);
        } else if (theme == 5) {
            inserting(R.mipmap.ebg, R.mipmap.ext, R.mipmap.eot, R.mipmap.ex, R.mipmap.eo);
        } else {
            inserting(R.mipmap.fbg, R.mipmap.fxt, R.mipmap.fot, R.mipmap.fx, R.mipmap.fo);
        }

        ps1.setText(String.valueOf(PS1));
        ps2.setText(String.valueOf(PS2));

        ML.setAnimation(myanim);

        if (turn == 1) {
            mainDec = 1;
            makeCompMove();
        }

        NG.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent New_Game = new Intent(ctx, AndroidEasy.class);
                New_Game.putExtra("back", back);
                New_Game.putExtra("theme", theme);
                New_Game.putExtra("PS1", PS1);
                New_Game.putExtra("PS2", PS2);
                New_Game.putExtra("Turn", (turn + 1) % 2);

                startActivity(New_Game);
                AndroidEasy.this.finish();
            }
        });
        HM.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent Home = new Intent(ctx, HomePage.class);
                startActivity(Home);
                AndroidEasy.this.finish();
            }
        });

    }

    public void B1(View v) {
        try {

            if (arch[0] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[0] = 1;
                Win[0][0] = 5;
                b1.setBackgroundResource(P);
                chance++;
                b1.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B2(View v) {
        try {

            if (arch[1] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[1] = 1;
                Win[0][1] = 5;
                b2.setBackgroundResource(P);
                chance++;
                b2.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B3(View v) {
        try {

            if (arch[2] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[2] = 1;
                Win[0][2] = 5;
                b3.setBackgroundResource(P);
                chance++;
                b3.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B4(View v) {
        try {

            if (arch[3] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[3] = 1;
                Win[1][0] = 5;
                b4.setBackgroundResource(P);
                chance++;
                b4.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B5(View v) {
        try {

            if (arch[4] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[4] = 1;
                Win[1][1] = 5;
                b5.setBackgroundResource(P);
                chance++;
                b5.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B6(View v) {
        try {

            if (arch[5] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[5] = 1;
                Win[1][2] = 5;
                b6.setBackgroundResource(P);
                chance++;
                b6.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B7(View v) {
        try {

            if (arch[6] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[6] = 1;
                Win[2][0] = 5;
                b7.setBackgroundResource(P);
                chance++;
                b7.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B8(View v) {
        try {

            if (arch[7] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[7] = 1;
                Win[2][1] = 5;
                b8.setBackgroundResource(P);
                chance++;
                b8.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void B9(View v) {
        try {

            if (arch[8] == 0 && checkWin() == 0 && turn == 0) {
                turn = 1;
                mainDec = 1;
                arch[8] = 1;
                Win[2][2] = 5;
                b9.setBackgroundResource(P);
                chance++;
                b9.setAnimation(myanim250);
            }

            if (turn == 1 && checkWin() == 0 && mainDec == 1) {
                turn = 0;
                makeCompMove();
            }
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    void makeCompMove() {
        int pos = 0;

        if (chance <= 2) {
            pos = generalMove();
        } else {
            pos = DefenciveMove();
        }
        CompMoveDone(pos);
    }

    int generalMove() {
        int FirstMove[] = {1, 3, 5, 7, 9};
        Random Rn = new Random();
        int pos = Rn.nextInt(5);

        if (checkValidMove(FirstMove[pos]) == 1 && mainDec == 1) {
            return FirstMove[pos];
        } else {
            return generalMove();
        }
    }

    int DefenciveMove() {

        int pos;

        if (((Win[0][0] + Win[0][1]) == 10) && checkValidMove(3) == 1 && mainDec == 1) {
            pos = 3;
        } else if (((Win[0][0] + Win[0][2]) == 10) && checkValidMove(2) == 1 && mainDec == 1) {
            pos = 2;
        } else if (((Win[0][1] + Win[0][2]) == 10) && checkValidMove(1) == 1 && mainDec == 1) {
            pos = 1;
        } else if (((Win[1][0] + Win[1][1]) == 10) && checkValidMove(6) == 1 && mainDec == 1) {
            pos = 6;
        } else if (((Win[1][0] + Win[1][2]) == 10) && checkValidMove(5) == 1 && mainDec == 1) {
            pos = 5;
        } else if (((Win[1][1] + Win[1][2]) == 10) && checkValidMove(4) == 1 && mainDec == 1) {
            pos = 4;
        } else if (((Win[2][0] + Win[2][1]) == 10) && checkValidMove(9) == 1 && mainDec == 1) {
            pos = 9;
        } else if (((Win[2][0] + Win[2][2]) == 10) && checkValidMove(8) == 1 && mainDec == 1) {
            pos = 8;
        } else if (((Win[2][1] + Win[2][2]) == 10) && checkValidMove(7) == 1 && mainDec == 1) {
            pos = 7;
        } else if (((Win[0][0] + Win[1][0]) == 10) && checkValidMove(7) == 1 && mainDec == 1) {
            pos = 7;
        } else if (((Win[0][0] + Win[2][0]) == 10) && checkValidMove(4) == 1 && mainDec == 1) {
            pos = 4;
        } else if (((Win[1][0] + Win[2][0]) == 10) && checkValidMove(2) == 1 && mainDec == 1) {
            pos = 1;
        } else if (((Win[0][1] + Win[1][1]) == 10) && checkValidMove(8) == 1 && mainDec == 1) {
            pos = 8;
        } else if (((Win[0][1] + Win[2][1]) == 10) && checkValidMove(5) == 1 && mainDec == 1) {
            pos = 5;
        } else if (((Win[1][1] + Win[2][1]) == 10) && checkValidMove(2) == 1 && mainDec == 1) {
            pos = 2;
        } else if (((Win[0][2] + Win[1][2]) == 10) && checkValidMove(9) == 1 && mainDec == 1) {
            pos = 9;
        } else if (((Win[0][2] + Win[2][2]) == 10) && checkValidMove(6) == 1 && mainDec == 1) {
            pos = 6;
        } else if (((Win[1][2] + Win[2][2]) == 10) && checkValidMove(3) == 1 && mainDec == 1) {
            pos = 3;
        } else if (((Win[1][1] + Win[2][2]) == 10) && checkValidMove(1) == 1 && mainDec == 1) {
            pos = 1;
        } else if (((Win[0][0] + Win[2][2]) == 10) && checkValidMove(5) == 1 && mainDec == 1) {
            pos = 5;
        } else if (((Win[0][0] + Win[1][1]) == 10) && checkValidMove(9) == 1 && mainDec == 1) {
            pos = 9;
        } else if (((Win[1][1] + Win[2][0]) == 10) && checkValidMove(3) == 1 && mainDec == 1) {
            pos = 3;
        } else if (((Win[0][2] + Win[2][0]) == 10) && checkValidMove(5) == 1 && mainDec == 1) {
            pos = 5;
        } else if (((Win[0][2] + Win[1][1]) == 10) && checkValidMove(7) == 1 && mainDec == 1) {
            pos = 7;
        } else {
            pos = DummyMove();
        }

        return pos;
    }

    int DummyMove() {
        int pos = 0;

        for (int i = 1; i <= 9; i++) {
            if (checkValidMove(i) == 1) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    int checkWin() {
        int flag = 0;
        int res = 0;
        int bgI = 10;
        int draw = arch[0] + arch[1] + arch[2] + arch[3] + arch[4] + arch[5] + arch[6] + arch[7] + arch[8];

        for (int i = 0; i < 3; i++) {
            if (Win[i][0] == Win[i][1] && Win[i][1] == Win[i][2] && Win[i][0] != 0) {
                flag = 1;
                bgI += (i + 1);
                res = Win[i][0];
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (Win[0][i] == Win[1][i] && Win[1][i] == Win[2][i] && Win[0][i] != 0) {
                flag = 1;
                bgI -= (i + 1);
                res = Win[0][i];
                break;
            }
        }
        if (Win[0][0] == Win[1][1] && Win[1][1] == Win[2][2] && Win[0][0] != 0) {
            flag = 1;
            bgI = 19;
            res = Win[0][0];
        }
        if (Win[0][2] == Win[1][1] && Win[1][1] == Win[2][0] && Win[0][2] != 0) {
            flag = 1;
            bgI = 91;
            res = Win[0][2];
        }

        if (flag == 1) {
            ChangeBack(bgI);
            if (res == 5) {
                LayoutInflater inflator = getLayoutInflater();
                View layout = inflator.inflate(R.layout.toasterx, (ViewGroup) findViewById(R.id.RLX));
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            } else if (res == 3) {
                LayoutInflater inflator = getLayoutInflater();
                View layout = inflator.inflate(R.layout.toastero, (ViewGroup) findViewById(R.id.RLO));
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }

            if (ctr == 0) {
                ctr = 1;
                if (res == 5)
                    PS1++;
                if (res == 3)
                    PS2++;
            }
        }
        if (draw == 9 && flag == 0) {

            turn = preTurn;

            LayoutInflater inflator = getLayoutInflater();
            View layout = inflator.inflate(R.layout.toaster, (ViewGroup) findViewById(R.id.RL));
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }

        ps1.setText(String.valueOf(PS1));
        ps2.setText(String.valueOf(PS2));

        return flag;
    }

    int checkValidMove(int pos) {
        if (arch[pos - 1] == 0) {
            return 1;
        }
        return -1;
    }

    void ChangeBack(int op) {

        switch (op) {
            case 19: {
                b1.setImageResource(R.mipmap.p1);
                b5.setImageResource(R.mipmap.p2);
                b9.setImageResource(R.mipmap.p3);
                b2.setImageResource(R.mipmap.pd12);
                b6.setImageResource(R.mipmap.pd12);
                b4.setImageResource(R.mipmap.pd21);
                b8.setImageResource(R.mipmap.pd21);
                break;
            }
            case 91: {
                b7.setImageResource(R.mipmap.d1);
                b5.setImageResource(R.mipmap.d2);
                b3.setImageResource(R.mipmap.d3);
                b2.setImageResource(R.mipmap.dd12);
                b4.setImageResource(R.mipmap.dd12);
                b6.setImageResource(R.mipmap.dd21);
                b8.setImageResource(R.mipmap.dd21);
                break;
            }
            case 11: {
                b1.setImageResource(R.mipmap.h1);
                b2.setImageResource(R.mipmap.h2);
                b3.setImageResource(R.mipmap.h3);
                break;
            }
            case 12: {
                b4.setImageResource(R.mipmap.h1);
                b5.setImageResource(R.mipmap.h2);
                b6.setImageResource(R.mipmap.h3);
                break;
            }
            case 13: {
                b7.setImageResource(R.mipmap.h1);
                b8.setImageResource(R.mipmap.h2);
                b9.setImageResource(R.mipmap.h3);
                break;
            }
            case 9: {
                b1.setImageResource(R.mipmap.v1);
                b4.setImageResource(R.mipmap.v2);
                b7.setImageResource(R.mipmap.v3);
                break;
            }
            case 8: {
                b2.setImageResource(R.mipmap.v1);
                b5.setImageResource(R.mipmap.v2);
                b8.setImageResource(R.mipmap.v3);
                break;
            }
            case 7: {
                b3.setImageResource(R.mipmap.v1);
                b6.setImageResource(R.mipmap.v2);
                b9.setImageResource(R.mipmap.v3);
                break;
            }
            default: {
                break;
            }
        }
    }

    void initialize() {
        NG = (ImageButton) findViewById(R.id.NGA);
        HM = (ImageButton) findViewById(R.id.HMA);
        b1 = (ImageButton) findViewById(R.id.B1A);
        b2 = (ImageButton) findViewById(R.id.B2A);
        b3 = (ImageButton) findViewById(R.id.B3A);
        b4 = (ImageButton) findViewById(R.id.B4A);
        b5 = (ImageButton) findViewById(R.id.B5A);
        b6 = (ImageButton) findViewById(R.id.B6A);
        b7 = (ImageButton) findViewById(R.id.B7A);
        b8 = (ImageButton) findViewById(R.id.B8A);
        b9 = (ImageButton) findViewById(R.id.B9A);

        ps1 = (TextView) findViewById(R.id.PlayerScore1A);
        ps2 = (TextView) findViewById(R.id.PlayerScore2A);
        pn1 = (TextView) findViewById(R.id.PN1);
        pn2 = (TextView) findViewById(R.id.PN2);

        BGP = (LinearLayout) findViewById(R.id.BGPA);
        ML = (LinearLayout) findViewById(R.id.BackgroundA);
        p1 = (ImageView) findViewById(R.id.PlayerImage1A);
        p2 = (ImageView) findViewById(R.id.PlayerImage2A);
        myanim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in1);
        myanim250 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
    }

    void CompMoveDone(int pos) {
        chance++;
        mainDec = 0;
        turn = 0;

        switch (pos) {
            case 1: {
                b1.setBackgroundResource(C);
                b1.setAnimation(myanim250);
                arch[0] = 1;
                Win[0][0] = 3;
                break;
            }
            case 2: {
                b2.setBackgroundResource(C);
                b2.setAnimation(myanim250);
                arch[1] = 1;
                Win[0][1] = 3;
                break;
            }
            case 3: {
                b3.setBackgroundResource(C);
                b3.setAnimation(myanim250);
                arch[2] = 1;
                Win[0][2] = 3;
                break;
            }
            case 4: {
                b4.setBackgroundResource(C);
                b4.setAnimation(myanim250);
                arch[3] = 1;
                Win[1][0] = 3;
                break;
            }
            case 5: {
                b5.setBackgroundResource(C);
                b5.setAnimation(myanim250);
                arch[4] = 1;
                Win[1][1] = 3;
                break;
            }
            case 6: {
                b6.setBackgroundResource(C);
                b6.setAnimation(myanim250);
                arch[5] = 1;
                Win[1][2] = 3;
                break;
            }
            case 7: {
                b7.setBackgroundResource(C);
                b7.setAnimation(myanim250);
                arch[6] = 1;
                Win[2][0] = 3;
                break;
            }
            case 8: {
                b8.setBackgroundResource(C);
                b8.setAnimation(myanim250);
                arch[7] = 1;
                Win[2][1] = 3;
                break;
            }
            case 9: {
                b9.setBackgroundResource(C);
                b9.setAnimation(myanim250);
                arch[8] = 1;
                Win[2][2] = 3;
                break;
            }
            default: {
                break;
            }
        }
        checkWin();
    }

    void inserting(int bg, int xt, int ot, int xx, int oo) {
        BGP.setBackgroundResource(bg);
        p1.setBackgroundResource(xt);
        p2.setBackgroundResource(ot);
        P = xx;
        C = oo;
    }
}
