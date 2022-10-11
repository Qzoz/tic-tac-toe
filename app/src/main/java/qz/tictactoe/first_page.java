/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qz.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;


public class first_page extends Activity {

    Button Start, BACK;
    RadioGroup RG;
    RadioButton RB;
    ImageButton img1, img2, img3, img4, img5, img6, img7, demo1, demo2, demo3, demo4, demo5, demo6;
    int Back = 2, Theme = 2;
    Context ctx;
    LinearLayout FirstPage;
    Animation myanim1, anim;
    Handler handler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.page_first);
        ctx = this;
        init();

        FirstPage.startAnimation(anim);

        img1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Back = 1;
                img1.setImageResource(R.mipmap.tick);
                img6.setImageResource(R.drawable.trans_bkgd);
                img5.setImageResource(R.drawable.trans_bkgd);
                img4.setImageResource(R.drawable.trans_bkgd);
                img3.setImageResource(R.drawable.trans_bkgd);
                img2.setImageResource(R.drawable.trans_bkgd);
                img7.setImageResource(R.drawable.trans_bkgd);
            }
        });
        img2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Back = 2;
                img2.setImageResource(R.mipmap.tick);
                img6.setImageResource(R.drawable.trans_bkgd);
                img5.setImageResource(R.drawable.trans_bkgd);
                img4.setImageResource(R.drawable.trans_bkgd);
                img3.setImageResource(R.drawable.trans_bkgd);
                img1.setImageResource(R.drawable.trans_bkgd);
                img7.setImageResource(R.drawable.trans_bkgd);
            }
        });
        img3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Back = 3;
                img3.setImageResource(R.mipmap.tick);
                img6.setImageResource(R.drawable.trans_bkgd);
                img5.setImageResource(R.drawable.trans_bkgd);
                img4.setImageResource(R.drawable.trans_bkgd);
                img2.setImageResource(R.drawable.trans_bkgd);
                img1.setImageResource(R.drawable.trans_bkgd);
                img7.setImageResource(R.drawable.trans_bkgd);
            }
        });
        img4.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Back = 4;
                img4.setImageResource(R.mipmap.tick);
                img6.setImageResource(R.drawable.trans_bkgd);
                img5.setImageResource(R.drawable.trans_bkgd);
                img3.setImageResource(R.drawable.trans_bkgd);
                img2.setImageResource(R.drawable.trans_bkgd);
                img1.setImageResource(R.drawable.trans_bkgd);
                img7.setImageResource(R.drawable.trans_bkgd);
            }
        });
        img5.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Back = 5;
                img5.setImageResource(R.mipmap.tick);
                img6.setImageResource(R.drawable.trans_bkgd);
                img4.setImageResource(R.drawable.trans_bkgd);
                img3.setImageResource(R.drawable.trans_bkgd);
                img2.setImageResource(R.drawable.trans_bkgd);
                img1.setImageResource(R.drawable.trans_bkgd);
                img7.setImageResource(R.drawable.trans_bkgd);
            }
        });
        img6.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Back = 6;
                img6.setImageResource(R.mipmap.tick);
                img5.setImageResource(R.drawable.trans_bkgd);
                img4.setImageResource(R.drawable.trans_bkgd);
                img3.setImageResource(R.drawable.trans_bkgd);
                img2.setImageResource(R.drawable.trans_bkgd);
                img1.setImageResource(R.drawable.trans_bkgd);
                img7.setImageResource(R.drawable.trans_bkgd);
            }
        });
        img7.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Back = 7;
                img7.setImageResource(R.mipmap.tick);
                img5.setImageResource(R.drawable.trans_bkgd);
                img4.setImageResource(R.drawable.trans_bkgd);
                img3.setImageResource(R.drawable.trans_bkgd);
                img2.setImageResource(R.drawable.trans_bkgd);
                img1.setImageResource(R.drawable.trans_bkgd);
                img6.setImageResource(R.drawable.trans_bkgd);
            }
        });

        demo1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Theme = 1;
                demo1.setImageResource(R.mipmap.tick);
                demo2.setImageResource(R.drawable.trans_bkgd);
                demo3.setImageResource(R.drawable.trans_bkgd);
                demo4.setImageResource(R.drawable.trans_bkgd);
                demo5.setImageResource(R.drawable.trans_bkgd);
                demo6.setImageResource(R.drawable.trans_bkgd);
            }
        });
        demo2.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Theme = 2;
                demo2.setImageResource(R.mipmap.tick);
                demo1.setImageResource(R.drawable.trans_bkgd);
                demo3.setImageResource(R.drawable.trans_bkgd);
                demo4.setImageResource(R.drawable.trans_bkgd);
                demo5.setImageResource(R.drawable.trans_bkgd);
                demo6.setImageResource(R.drawable.trans_bkgd);
            }
        });
        demo3.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Theme = 3;
                demo3.setImageResource(R.mipmap.tick);
                demo2.setImageResource(R.drawable.trans_bkgd);
                demo1.setImageResource(R.drawable.trans_bkgd);
                demo4.setImageResource(R.drawable.trans_bkgd);
                demo5.setImageResource(R.drawable.trans_bkgd);
                demo6.setImageResource(R.drawable.trans_bkgd);
            }
        });
        demo4.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Theme = 4;
                demo4.setImageResource(R.mipmap.tick);
                demo2.setImageResource(R.drawable.trans_bkgd);
                demo3.setImageResource(R.drawable.trans_bkgd);
                demo1.setImageResource(R.drawable.trans_bkgd);
                demo5.setImageResource(R.drawable.trans_bkgd);
                demo6.setImageResource(R.drawable.trans_bkgd);
            }
        });
        demo5.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Theme = 5;
                demo5.setImageResource(R.mipmap.tick);
                demo4.setImageResource(R.drawable.trans_bkgd);
                demo3.setImageResource(R.drawable.trans_bkgd);
                demo2.setImageResource(R.drawable.trans_bkgd);
                demo1.setImageResource(R.drawable.trans_bkgd);
                demo6.setImageResource(R.drawable.trans_bkgd);
            }
        });
        demo6.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Theme = 6;
                demo6.setImageResource(R.mipmap.tick);
                demo5.setImageResource(R.drawable.trans_bkgd);
                demo4.setImageResource(R.drawable.trans_bkgd);
                demo3.setImageResource(R.drawable.trans_bkgd);
                demo2.setImageResource(R.drawable.trans_bkgd);
                demo1.setImageResource(R.drawable.trans_bkgd);
            }
        });

        Start.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                int selected = RG.getCheckedRadioButtonId();
                if (selected == R.id.RB1) {
                    Intent New_Game = new Intent(ctx, AndroidEasy.class);
                    New_Game.putExtra("back", Back);
                    New_Game.putExtra("theme", Theme);
                    New_Game.putExtra("PS1", 0);
                    New_Game.putExtra("PS2", 0);
                    New_Game.putExtra("turn", 0);

                    FirstPage.startAnimation(myanim1);

                    startActivity(New_Game);
                    first_page.this.finish();

                } else if (selected == R.id.RB2) {
                    Intent TTT = new Intent(ctx, AndroidTTT.class);
                    TTT.putExtra("back", Back);
                    TTT.putExtra("theme", Theme);
                    TTT.putExtra("PS1", 0);
                    TTT.putExtra("PS2", 0);
                    TTT.putExtra("turn", 0);

                    FirstPage.startAnimation(myanim1);


                    startActivity(TTT);
                    first_page.this.finish();
                } else if (selected == R.id.RB3) {
                    Intent Hardy = new Intent(ctx, AndroidHard.class);
                    Hardy.putExtra("back", Back);
                    Hardy.putExtra("theme", Theme);
                    Hardy.putExtra("PS1", 0);
                    Hardy.putExtra("PS2", 0);
                    Hardy.putExtra("turn", 0);

                    FirstPage.startAnimation(myanim1);


                    startActivity(Hardy);
                    first_page.this.finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Select Level", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BACK.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(ctx, HomePage.class);
                startActivity(Home);
                first_page.this.finish();
            }
        });

    }

    void init() {
        Start = (Button) findViewById(R.id.start);
        BACK = (Button) findViewById(R.id.Back);
        RG = (RadioGroup) findViewById(R.id.RG);
        RB = (RadioButton) findViewById(R.id.RB1);
        img1 = (ImageButton) findViewById(R.id.img1);
        img2 = (ImageButton) findViewById(R.id.img2);
        img3 = (ImageButton) findViewById(R.id.img3);
        img4 = (ImageButton) findViewById(R.id.img4);
        img5 = (ImageButton) findViewById(R.id.img5);
        img6 = (ImageButton) findViewById(R.id.img6);
        img7 = (ImageButton) findViewById(R.id.img7);
        demo1 = (ImageButton) findViewById(R.id.ademo);
        demo2 = (ImageButton) findViewById(R.id.bdemo);
        demo3 = (ImageButton) findViewById(R.id.cdemo);
        demo4 = (ImageButton) findViewById(R.id.ddemo);
        demo5 = (ImageButton) findViewById(R.id.edemo);
        demo6 = (ImageButton) findViewById(R.id.fdemo);
        FirstPage = (LinearLayout) findViewById(R.id.FirstPageLayout);
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in1);
        myanim1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_out);
        handler = new Handler();
    }
}
