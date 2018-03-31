package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class japaneseeramultiplechoiceseta002 extends AppCompatActivity {

    private static final String TAG = "japaneseeramultiplechoiceseta002";//score database

    createdatabase001 mcreatedatabase001;//score database
    //private Button btnAdd, btnViewData;//score database
    private EditText editText;//score database

    MediaPlayer japaneseerabackgroundmusic002;
    MediaPlayer japaneseerabackgroundmusic003;
    MediaPlayer tryagainaudio001;
    MediaPlayer nextlevelaudio001;
    private TextView hidetryagain001;
    private TextView hidetryagain002;
    private TextView shownextlevel001;
    private TextView shownextlevel002;
    //private TextView hideaddscoretansparentbutton001;
    private Handler handler001 = new Handler();

    public String addscore;//score data base

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_japaneseeramultiplechoiceseta002);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        //editText = (EditText) findViewById(R.id.editText);//score database
        //btnAdd = (Button) findViewById(R.id.addscoretansparentbutton);//score database
        //btnViewData = (Button) findViewById(R.id.btnView);//score database
        mcreatedatabase001 = new createdatabase001(this);//score database

        japaneseerabackgroundmusic002 = MediaPlayer.create(this, R.raw.backgroundsfx002);
        japaneseerabackgroundmusic002.setAudioStreamType(AudioManager.STREAM_MUSIC);
        japaneseerabackgroundmusic002.setLooping(false);
        //japaneseerabackgroundmusic002.start();

        japaneseerabackgroundmusic003 = MediaPlayer.create(this, R.raw.backgroundsfx003);
        japaneseerabackgroundmusic003.setAudioStreamType(AudioManager.STREAM_MUSIC);
        japaneseerabackgroundmusic003.setLooping(false);

        tryagainaudio001=MediaPlayer.create(getApplicationContext(),R.raw.soundeffects003);
        nextlevelaudio001=MediaPlayer.create(getApplicationContext(),R.raw.soundeffects003);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);
        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("You Got " + score);

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);

        if(score>=20) { //be proud method ko to //paltan

            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();

            //gotonextlevel001();

            hidetryagain001 = (TextView) findViewById(R.id.tryagain);
            hidetryagain002 = (TextView) findViewById(R.id.textView4);
            shownextlevel001 = (TextView) findViewById(R.id.textView6);
            shownextlevel002 = (TextView) findViewById(R.id.nextlevel);

            handler001.post(new Runnable() {
                @Override
                public void run() {
                    hidetryagain001.setVisibility(View.INVISIBLE);
                    hidetryagain002.setVisibility(View.INVISIBLE);
                    shownextlevel001.setVisibility(View.VISIBLE);
                    shownextlevel002.setVisibility(View.VISIBLE);
                }
            });

            japaneseerabackgroundmusic003.start();

        }

        else {
            japaneseerabackgroundmusic002.start();
        }

        /**
         else if(highscore>= score)
         txtHighScore.setText("High score: "+highscore);
         else if (highscore< score)
         {
         txtHighScore.setText("New highscore: "+score);
         SharedPreferences.Editor editor = mypref.edit();
         editor.putInt("highscore", score);
         editor.commit();
         }
         */

        //score database


        addscore = "   " + "YOU GOT" + " " + score + "/25" + " " + "AT JAPANESE ERA";//paltan

        /*
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = addscore;
                AddData(newEntry);
            }
        });
        */

        String newEntry = addscore;
        AddData(newEntry);

        //score database
    }

    //score database

    public void AddData(String newEntry) {
        boolean insertData = mcreatedatabase001.addData(newEntry);

        if (insertData) {
            //toastMessage("Data Successfully Inserted!");

            //nextlevelaudio001.start();

            //toastMessage("Click Again.");

            //hideaddscoretansparentbutton001 = (TextView) findViewById(R.id.addscoretansparentbutton);

            /*
            handler001.post(new Runnable() {
                @Override
                public void run() {
                    hideaddscoretansparentbutton001.setVisibility(View.INVISIBLE);
                }
            });
            */

        }

        else {
            //toastMessage("Something went wrong");

            //nextlevelaudio001.start();

            //toastMessage("Click Again.");

            //hideaddscoretansparentbutton001 = (TextView) findViewById(R.id.addscoretansparentbutton);

            /*
            handler001.post(new Runnable() {
                             @Override
                public void run() {
                    hideaddscoretansparentbutton001.setVisibility(View.INVISIBLE);
                }
            });
            */

        }
    }

    //socre database


    public void gotonextlevel001(){

        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2*1000);
                    Intent i=new Intent(getApplicationContext(),bereadyforthefinalround001.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception ex)
                {}
            }
        };
        thread.start();

    }



    public void tryagain001(View view) {
        Intent intent = new Intent(getApplicationContext(), japaneseeramultiplechoicerandom001.class);
        startActivity(intent);
        finish();

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        tryagainaudio001.start();

    }

    public void nextlevel001(View view) {
        Intent intent = new Intent(getApplicationContext(), bereadyforthefinalround001.class);
        startActivity(intent);
        finish();

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        nextlevelaudio001.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        japaneseerabackgroundmusic002.stop();
        //japaneseerabackgroundmusic003.stop();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), loading002.class);
        startActivity(intent);
        finish();
    }

    //score database

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }

    //score database

}

