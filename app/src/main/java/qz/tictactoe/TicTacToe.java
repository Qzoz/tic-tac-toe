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

public class TicTacToe extends Activity {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int turn = 1;
    int Win[][] = new int[3][3];
    int arch[] = new int[9];
    ImageButton NG, HM;
    LinearLayout BGP, ML;
    Context ctx;
    ImageView p1, p2;
    int back, theme;
    int x, o;
    TextView ps1, ps2, pn1, pn2;
    int PS1, PS2;
    int ttt;
    Animation myanim, myanim501, myanim502, myanim503, myanim504, myanim505, myanim506, myanim507, myanim508, myanim509;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.tictactoe);

        ctx = this;

        initialize();

        back = getIntent().getIntExtra("back", 1);
        theme = getIntent().getIntExtra("theme", 1);
        PS1 = getIntent().getIntExtra("PS1", 0);
        PS2 = getIntent().getIntExtra("PS2", 0);

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

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[0] == 0 && checkWin() == 0) {
                    arch[0] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[0][0] = 1;
                        b1.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[0][0] = -1;
                        b1.setBackgroundResource(o);
                    }
                }
                b1.setAnimation(myanim501);
                checkWin();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[1] == 0 && checkWin() == 0) {
                    arch[1] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[0][1] = 1;
                        b2.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[0][1] = -1;
                        b2.setBackgroundResource(o);
                    }
                }
                b2.setAnimation(myanim502);
                checkWin();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[2] == 0 && checkWin() == 0) {
                    arch[2] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[0][2] = 1;
                        b3.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[0][2] = -1;
                        b3.setBackgroundResource(o);
                    }
                }
                b3.setAnimation(myanim503);
                checkWin();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[3] == 0 && checkWin() == 0) {
                    arch[3] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[1][0] = 1;
                        b4.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[1][0] = -1;
                        b4.setBackgroundResource(o);
                    }
                }
                b4.setAnimation(myanim504);
                checkWin();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[4] == 0 && checkWin() == 0) {
                    arch[4] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[1][1] = 1;
                        b5.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[1][1] = -1;
                        b5.setBackgroundResource(o);
                    }
                }
                b5.setAnimation(myanim505);
                checkWin();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[5] == 0 && checkWin() == 0) {
                    arch[5] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[1][2] = 1;
                        b6.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[1][2] = -1;
                        b6.setBackgroundResource(o);
                    }
                }
                b6.setAnimation(myanim506);
                checkWin();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[6] == 0 && checkWin() == 0) {
                    arch[6] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[2][0] = 1;
                        b7.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[2][0] = -1;
                        b7.setBackgroundResource(o);
                    }
                }
                b7.setAnimation(myanim507);
                checkWin();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[7] == 0 && checkWin() == 0) {
                    arch[7] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[2][1] = 1;
                        b8.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[2][1] = -1;
                        b8.setBackgroundResource(o);
                    }
                }
                b8.setAnimation(myanim508);
                checkWin();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (arch[8] == 0 && checkWin() == 0) {
                    arch[8] = 1;
                    if (turn == 1) {
                        turn = 2;
                        Win[2][2] = 1;
                        b9.setBackgroundResource(x);
                    } else if (turn == 2) {
                        turn = 1;
                        Win[2][2] = -1;
                        b9.setBackgroundResource(o);
                    }
                }
                b9.setAnimation(myanim509);
                checkWin();
            }
        });

        NG.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent New_Game = new Intent(ctx, TicTacToe.class);
                New_Game.putExtra("back", back);
                New_Game.putExtra("theme", theme);
                New_Game.putExtra("PS1", PS1);
                New_Game.putExtra("PS2", PS2);
                startActivity(New_Game);
                TicTacToe.this.finish();
            }
        });
        HM.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent Home = new Intent(ctx, HomePage.class);
                startActivity(Home);
                TicTacToe.this.finish();
            }
        });

    }

    int checkWin() {
        int flag = 0;
        int res = 0;
        int bgI = 10;
        int draw = arch[0] + arch[1] + arch[2] + arch[3] + arch[4] + arch[5] + arch[6] + arch[7] + arch[8];

        if (flag == 0) {
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
        }

        if (flag == 1) {
            ChangeBack(bgI);

            if (res == 1) {
                if (ttt == 0) {
                    PS1++;
                }
                LayoutInflater inflator = getLayoutInflater();
                View layout = inflator.inflate(R.layout.toasterx, (ViewGroup) findViewById(R.id.RLX));
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            } else if (res == -1) {
                if (ttt == 0) {
                    PS2++;
                }
                LayoutInflater inflator = getLayoutInflater();
                View layout = inflator.inflate(R.layout.toastero, (ViewGroup) findViewById(R.id.RLO));
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }
            ttt = 1;
        }
        if (draw == 9 && flag == 0) {
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
        BGP = (LinearLayout) findViewById(R.id.BGP);
        ML = (LinearLayout) findViewById(R.id.Background);
        p1 = (ImageView) findViewById(R.id.PlayerImage1);
        p2 = (ImageView) findViewById(R.id.PlayerImage2);
        pn1 = (TextView) findViewById(R.id.PN1);
        pn2 = (TextView) findViewById(R.id.PN2);

        ps1 = (TextView) findViewById(R.id.PlayerScore1);
        ps2 = (TextView) findViewById(R.id.PlayerScore2);

        myanim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in1);
        myanim501 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim502 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim503 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim504 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim505 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim506 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim507 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim508 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);
        myanim509 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in500);

        NG = (ImageButton) findViewById(R.id.NG);
        HM = (ImageButton) findViewById(R.id.HM);
        b1 = (ImageButton) findViewById(R.id.B1);
        b2 = (ImageButton) findViewById(R.id.B2);
        b3 = (ImageButton) findViewById(R.id.B3);
        b4 = (ImageButton) findViewById(R.id.B4);
        b5 = (ImageButton) findViewById(R.id.B5);
        b6 = (ImageButton) findViewById(R.id.B6);
        b7 = (ImageButton) findViewById(R.id.B7);
        b8 = (ImageButton) findViewById(R.id.B8);
        b9 = (ImageButton) findViewById(R.id.B9);
    }

    void inserting(int bg, int xt, int ot, int xx, int oo) {
        BGP.setBackgroundResource(bg);
        p1.setBackgroundResource(xt);
        p2.setBackgroundResource(ot);
        x = xx;
        o = oo;
    }

}
