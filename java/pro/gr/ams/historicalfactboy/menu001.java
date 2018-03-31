package pro.gr.ams.historicalfactboy;

import android.app.Dialog;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class menu001 extends AppCompatActivity {

    //exitalertdialog
    public Dialog mDialog;
    public Button mDialogyes,mDialogno;
    //exitalertdialog

    public Button menutocreateuserbutton001;
    public Button menutoprespanisheramultiplechoicebutton001;
    public Button menutoscorelogsbutton001;
    public Button menutoaboutbutton001;
    public Button menutodevelopersoptionbutton001;

    MediaPlayer menubackgroundmusic001;
    private TextView hideoneclickawaytodevelopersoptionbutton001;
    private TextView hidetwoclickawaytodevelopersoptionbutton001;
    private TextView hidethreeclickawaytodevelopersoptionbutton001;
    private TextView hidefourclickawaytodevelopersoptionbutton001;
    private TextView hidefiveclickawaytodevelopersoptionbutton001;
    private Handler handler001 = new Handler();
    private MediaPlayer clickaudio001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_menu001);

        createDialog();   //exitalertdialog

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        menutoprespanisheramultiplechoicerandom001();
        menutoscorelogs001();
        menutoabout001();
        menutodevelopersoption001();

        menubackgroundmusic001 = MediaPlayer.create(this, R.raw.backgroundsfx005);
        menubackgroundmusic001.setAudioStreamType
                (AudioManager.STREAM_MUSIC);
        menubackgroundmusic001.setLooping(true);
        //menubackgroundmusic001.start();

        clickaudio001= MediaPlayer.create(getApplicationContext(),R.raw.soundeffects003);

    }

    public void menutoprespanisheramultiplechoicerandom001(){
        menutoprespanisheramultiplechoicebutton001= (Button) findViewById(R.id.redirecttoprespanisheramultiplechoicerandom001);
        menutoprespanisheramultiplechoicebutton001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent menutoprespanisheramultiplechoice001 = new Intent(getApplicationContext(),prespanisheramultiplechoicerandom001.class);
                startActivity(menutoprespanisheramultiplechoice001);
                finish();

                clickaudio001.start();

            }
        });
    }

    public void menutoscorelogs001(){
        menutoscorelogsbutton001= (Button) findViewById(R.id.redirecttoscorelogs001);
        menutoscorelogsbutton001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent menutoscorelogs001 = new Intent(getApplicationContext(),scorelogs001.class);
                startActivity(menutoscorelogs001);
                finish();

                clickaudio001.start();

            }
        });
    }


    public void menutoabout001(){
        menutoaboutbutton001= (Button) findViewById(R.id.redirecttoabout001);
        menutoaboutbutton001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent menutoabout001 = new Intent(getApplicationContext(),about001.class);
                startActivity(menutoabout001);
                finish();

                clickaudio001.start();

            }
        });
    }

    public void menutodevelopersoption001(){
        menutodevelopersoptionbutton001= (Button) findViewById(R.id.redirecttodevelopersoption001);
        menutodevelopersoptionbutton001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent menutodevelopersoption001 = new Intent(getApplicationContext(),developersoption001.class);
                startActivity(menutodevelopersoption001);
                finish();

                Toast.makeText(getApplicationContext(),"Developer's Option",Toast.LENGTH_LONG).show();

                clickaudio001.start();

            }
        });
    }

    public void hideoneclickawaytodevelopersoptionmethod001(View v){

        hideoneclickawaytodevelopersoptionbutton001 = (TextView) findViewById(R.id.oneclickawaytodevelopersoption001);

        handler001.post(new Runnable() {
            @Override
            public void run() {
                hideoneclickawaytodevelopersoptionbutton001.setVisibility(View.INVISIBLE);
            }
        });

        Toast.makeText(getApplicationContext(),"1 Click Away to Developer's Option",Toast.LENGTH_SHORT).show();
    }

    public void hidetwoclickawaytodevelopersoptionmethod001(View v){

        hidetwoclickawaytodevelopersoptionbutton001 = (TextView) findViewById(R.id.twoclickawaytodevelopersoption001);

        handler001.post(new Runnable() {
            @Override
            public void run() {
                hidetwoclickawaytodevelopersoptionbutton001.setVisibility(View.INVISIBLE);
            }
        });

        //Toast.makeText(getApplicationContext(),"2 Clicks Away to Developer's Option",Toast.LENGTH_SHORT).show();
    }

    public void hidethreeclickawaytodevelopersoptionmethod001(View v){

        hidethreeclickawaytodevelopersoptionbutton001 = (TextView) findViewById(R.id.threeclickawaytodevelopersoption001);

        handler001.post(new Runnable() {
            @Override
            public void run() {
                hidethreeclickawaytodevelopersoptionbutton001.setVisibility(View.INVISIBLE);
            }
        });

        //Toast.makeText(getApplicationContext(),"3 Clicks Away to Developer's Option",Toast.LENGTH_SHORT).show();
    }

    public void hidefourclickawaytodevelopersoptionmethod001(View v){

        hidefourclickawaytodevelopersoptionbutton001 = (TextView) findViewById(R.id.fourclickawaytodevelopersoption001);

        handler001.post(new Runnable() {
            @Override
            public void run() {
                hidefourclickawaytodevelopersoptionbutton001.setVisibility(View.INVISIBLE);
            }
        });

        //Toast.makeText(getApplicationContext(),"4 Clicks Away to Developer's Option",Toast.LENGTH_SHORT).show();
    }
    public void hidefiveclickawaytodevelopersoptionmethod001(View v){

        hidefiveclickawaytodevelopersoptionbutton001 = (TextView) findViewById(R.id.fiveclickawaytodevelopersoption001);

        handler001.post(new Runnable() {
            @Override
            public void run() {
                hidefiveclickawaytodevelopersoptionbutton001.setVisibility(View.INVISIBLE);
            }
        });

        //Toast.makeText(getApplicationContext(),"5 Clicks Away to Developer's Option",Toast.LENGTH_SHORT).show();
    }

    //exitalertdialog

    protected void createDialog() {
        mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.style_exitalertdialog001);

        mDialog.setCanceledOnTouchOutside(true);
        mDialog.setCancelable(true);
        mDialogyes = (Button) mDialog.findViewById(R.id.yes);
        mDialogno = (Button) mDialog.findViewById(R.id.No);
        mDialogyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                finish();
            }
        });

        mDialogno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });

    }

    @Override
    public void onBackPressed() {
        mDialog.show();
    }

//exitalertdialog

    @Override
    protected void onPause() {
        super.onPause();
        menubackgroundmusic001.pause();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
        menubackgroundmusic001.start();
    }

    public void buttonOnClick (View v){
        mDialog.show();
        clickaudio001.start();
    }

    public void onUserLeaveHint() {

        finish();

    }


}
