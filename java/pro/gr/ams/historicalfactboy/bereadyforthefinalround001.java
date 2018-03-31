package pro.gr.ams.historicalfactboy;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class bereadyforthefinalround001 extends AppCompatActivity {

    private Dialog mDialog;
    public Button mDialogyes,mDialogno;
    private MediaPlayer clickaudio001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_bereadyforthefinalround001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        createDialog();

        clickaudio001= MediaPlayer.create(getApplicationContext(),R.raw.soundeffects003);

        Button buttonPlayVideo2 = (Button) findViewById(R.id.button1);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView1);
        String uriPath2 = "android.resource://pro.gr.ams.historicalfactboy/" + R.raw.bereadyforthefinalround_video001;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();
        buttonPlayVideo2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoView mVideoView2 = (VideoView) findViewById(R.id.videoView1);
                String uriPath = "android.resource://pro.gr.ams.historicalfactboy/" +
                        R.raw.bereadyforthefinalround_video001;
                Uri uri2 = Uri.parse(uriPath);
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });
    }

    protected void createDialog() {
        mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.style_gobacktohomealertdialog001);

        mDialog.setCanceledOnTouchOutside(true);
        mDialog.setCancelable(true);
        mDialogyes = (Button) mDialog.findViewById(R.id.yes);
        mDialogno = (Button) mDialog.findViewById(R.id.No);
        mDialogyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), loading002.class);
                startActivity(intent);
                finish();
                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
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
        Toast.makeText(getApplicationContext(), "You're already on the final round.", Toast.LENGTH_SHORT).show();
    }

    public void no(View v) {
        mDialog.show();
        clickaudio001.start();
    }

    public void yes(View v) {
        clickaudio001.start();
        Intent i = new Intent(getApplicationContext(),entirehistorymultiplechoicerandom001.class);
        startActivity(i);
        finish();
    }
}
