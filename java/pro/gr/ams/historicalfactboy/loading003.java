package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class loading003 extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private TextView mLoadingText;
    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();
    MediaPlayer loadingbackgroundmusic001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_loading003);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);


        loadingbackgroundmusic001 = MediaPlayer.create(this, R.raw.backgroundsfx004);
        loadingbackgroundmusic001.setAudioStreamType(AudioManager.STREAM_MUSIC);
        loadingbackgroundmusic001.setLooping(true);
        loadingbackgroundmusic001.start();

        //thread.start();

        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
        mLoadingText = (TextView) findViewById(R.id.LoadingCompleteTextView);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mProgressStatus < 100){
                    mProgressStatus++;
                    android.os.SystemClock.sleep(60);
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mProgressBar.setProgress(mProgressStatus);
                        }
                    });
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                            mLoadingText.setVisibility(View.INVISIBLE);
                    }
                });
            }
        }).start();

    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        loadingbackgroundmusic001.stop();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();

        //thread.start();

    }

    public void onUserLeaveHint() {

        finish();
        thread.interrupt();

    }

    @Override
    protected void onResume() {
        super.onResume();

        thread.start();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        finish();
        thread.interrupt();

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        Intent i = new Intent(getApplicationContext(),menu001.class);
        startActivity(i);

    }


        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1*6000);
                    Intent i=new Intent(getApplicationContext(),menu001.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception ex)
                {}
            }
        };

}
