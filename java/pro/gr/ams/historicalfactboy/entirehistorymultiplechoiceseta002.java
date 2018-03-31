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

public class entirehistorymultiplechoiceseta002 extends AppCompatActivity {

    private static final String TAG = "entirehistorymultiplechoiceseta002";//score database

    createdatabase001 mcreatedatabase001;//score database
    //private Button btnAdd, btnViewData;//score database
    private EditText editText;//score database

    MediaPlayer entirehistorybackgroundmusic002;
    MediaPlayer entirehistorybackgroundmusic003;
    MediaPlayer tryagainaudio001;
    MediaPlayer nextlevelaudio001;
    private TextView hidetryagain001;
    private TextView hidetryagain002;
    private TextView shownextlevel001;
    private TextView shownextlevel002;
    //private TextView hideaddscoretansparentbutton001;
    private Handler handler001 = new Handler();

    public String addscore;//score data base
    private MediaPlayer clickaudio001;
    private TextView feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_entirehistorymultiplechoiceseta002);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        feedback=(TextView) findViewById(R.id.textFeedback);


        //editText = (EditText) findViewById(R.id.editText);//score database
        //btnAdd = (Button) findViewById(R.id.addscoretansparentbutton);//score database
        //btnViewData = (Button) findViewById(R.id.btnView);//score database
        mcreatedatabase001 = new createdatabase001(this);//score database

        entirehistorybackgroundmusic002 = MediaPlayer.create(this, R.raw.backgroundsfx002);
        entirehistorybackgroundmusic002.setAudioStreamType(AudioManager.STREAM_MUSIC);
        entirehistorybackgroundmusic002.setLooping(false);
        //entirehistorybackgroundmusic002.start();

        entirehistorybackgroundmusic003 = MediaPlayer.create(this, R.raw.backgroundsfx003);
        entirehistorybackgroundmusic003.setAudioStreamType(AudioManager.STREAM_MUSIC);
        entirehistorybackgroundmusic003.setLooping(false);

        clickaudio001= MediaPlayer.create(getApplicationContext(),R.raw.soundeffects003);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);
        // receive the score from last activity by Intent
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        // display current score
        txtScore.setText("~~~~~~~~~~~~~~~~~~~\n" + "Score " + score + "/100" + "\n~~~~~~~~~~~~~~~~~~~");

        // use Shared preferences to save the best score
        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);

        if(score>=0&&score<=20) { //be proud method ko to //paltan

            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();

            feedback.setText("~~~~~~~~~~~~~~~~~~~\nThe Fact, are you Filipino?\n~~~~~~~~~~~~~~~~~~~");

            entirehistorybackgroundmusic002.start();

        }

        else if(score>=75&&score<=79) { //be proud method ko to //paltan

            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();

            feedback.setText("~~~~~~~~~~~~~~~~~~~\nYou know about history.\n~~~~~~~~~~~~~~~~~~~");

            entirehistorybackgroundmusic003.start();

        }

        else if(score>=80&&score<=89) { //be proud method ko to //paltan

            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();

            feedback.setText("~~~~~~~~~~~~~~~~~~~\nYou know history well.\n~~~~~~~~~~~~~~~~~~~");

            entirehistorybackgroundmusic003.start();

        }

        else if(score>=90&&score<=99) { //be proud method ko to //paltan

            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();

            feedback.setText("~~~~~~~~~~~~~~~~~~~\nIt's almost perfect, The Fact!.\n~~~~~~~~~~~~~~~~~~~");

            entirehistorybackgroundmusic003.start();

        }

        else if(score==100) { //be proud method ko to //paltan

            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();

            feedback.setText("~~~~~~~~~~~~~~~~~~~\nYou're a Historical Fact Boy!\n~~~~~~~~~~~~~~~~~~~");

            entirehistorybackgroundmusic003.start();

        }

        else {
            entirehistorybackgroundmusic002.start();
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


        addscore = "   " + "YOU GOT" + " " + score + "/100" + " " + "AT ENTIRE HISTORY";//paltan

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

    public void home001(View view) {
        Intent intent = new Intent(getApplicationContext(), loading002.class);
        startActivity(intent);
        finish();

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        clickaudio001.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        entirehistorybackgroundmusic002.stop();
        //entirehistorybackgroundmusic003.stop();
        Intent intent = new Intent(getApplicationContext(), loading002.class);
        startActivity(intent);
        finish();
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

