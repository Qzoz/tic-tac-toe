package qz.tictactoe;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

/*
  Created by zaid on 26-01-2018.
 */

public class HomePage extends FragmentActivity {

    ImageButton Music, Info;
    Button Singly, Doubly;
    Button Exit;
    Animation anim, anim2;
    RelativeLayout MainLaout;
    Context ctx;
    int Audio;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.home_page);

        ctx = this;

        initialize();

        MainLaout.startAnimation(anim);
        Music.startAnimation(anim2);
        Info.startAnimation(anim2);
        Singly.startAnimation(anim2);
        Doubly.startAnimation(anim2);
        Exit.startAnimation(anim2);

        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Audio == 0) {
                    Audio=1;
                    Music.setBackgroundResource(R.mipmap.music_off);
                    Toast.makeText(getApplicationContext(), "Music OFF", Toast.LENGTH_SHORT).show();
                } else {
                    Audio=0;
                    Music.setBackgroundResource(R.mipmap.music_on);
                    Toast.makeText(getApplicationContext(), "Music ON", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Singly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Sing=new Intent(ctx,first_page.class);
                startActivity(Sing);
            }
        });

        Doubly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Doub=new Intent(ctx,Doubleys.class);
                startActivity(Doub);
            }
        });

        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoDialog dialog = new InfoDialog();
                dialog.show(getSupportFragmentManager(), "Info_Dialog");
            }
        });

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomePage.this.finish();
                System.exit(0);
            }
        });
    }

    void initialize() {
        MainLaout = (RelativeLayout) findViewById(R.id.mainLay);
        Exit = (Button) findViewById(R.id.Close);
        Singly = (Button) findViewById(R.id.Singley);
        Doubly = (Button) findViewById(R.id.Doubley);
        Music = (ImageButton) findViewById(R.id.Audio);
        Info = (ImageButton) findViewById(R.id.AuthInfo);
        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in);
        anim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in2);
    }
}
