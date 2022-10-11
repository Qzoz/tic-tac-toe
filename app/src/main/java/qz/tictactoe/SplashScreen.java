package qz.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class SplashScreen extends Activity {

    TextView tv1,tv2;
    ImageView iv;
    LinearLayout LLS;
    Animation myanim1,myanim3,myanim;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        iv=(ImageView)findViewById(R.id.iv);
        LLS=(LinearLayout)findViewById(R.id.LLS);

        myanim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in);
        myanim1=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_in1);
        myanim3=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fader_out1);

        tv1.setAnimation(myanim);
        tv2.setAnimation(myanim1);
        iv.setAnimation(myanim);
        LLS.setAnimation(myanim3);

        Thread sp=new Thread(){
            public void run(){
                try{
                    sleep(3*1000);
                    Intent i=new Intent(getApplicationContext(), HomePage.class);
                    startActivity(i);
                    finish();
                }catch(Exception e){
                    Toast.makeText(getApplicationContext(),"Some Error Occured \n"+e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        };
        sp.start();
    }

}
