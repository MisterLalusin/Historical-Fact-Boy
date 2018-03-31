package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Toast;

public class about001 extends AppCompatActivity {

    private MediaPlayer aboutbackgroundmusic001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_about001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        aboutbackgroundmusic001 = MediaPlayer.create(this, R.raw.backgroundsfx008);
        aboutbackgroundmusic001.setAudioStreamType
                (AudioManager.STREAM_MUSIC);
        aboutbackgroundmusic001.setLooping(true);
        //aboutbackgroundmusic001.start();

        WebView view = (WebView) findViewById(R.id.webView1);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "&nbsp;&nbsp; Historical Fact Boy is one of the applications developed by the ICT-102 students of STI College Lipa at year 2018." +
                " Other applications developed by those students are the Science Hub, Mathrix, Mathinik, and English Time." +
                " It is part of their ILS for the subject Mobile App Programming, under their mentor Mr.Justine Louis Sacdalan." +
                "<br><br>&nbsp;&nbsp; The development team for this app named their group as the Yakis Game Developers." +
                " The name originated from an unfamiliar tagalog word \"Yakis\", which means to sharpen." +
                " The development team is composed of six members." +
                " These developers are Mr.Bello, Mr.Falceso, Mr.Genialope, Mr.Lalusin, Mr.Todavia and the leader Ms.Arnamie La&#241;as." +
                "<br><br>&nbsp;&nbsp; The Application requires a minimum screen resolution of 720 x 1280 pixels, Quad Core 1.2 ghz processor, and 4gb RAM for the best performance." +
                " It is originally developed for Lenovo A6000 but developers assures the compatibility with other smartphones with the same platform." +
                "<br><br>&nbsp;&nbsp; The Game is composed of five levels." +
                " Level one contains 10 question under the Pre-colonial category." +
                " It is also composed of 5 sets of question." +
                " The next level contains 4 sets of questions with 15 items each, under the category of the Spanish Colonization." +
                " This includes questions from the date where Magellan discovered the Philippines until late 19th century, where The first Philippine Republic rise." +
                " Level three contains 20 questions with 3 sets. The questions are all about the American Colonization in the Philippines." +
                " Questions for the Japanase Era fill the level four. It only includes 2 sets with 25 questions each." +
                " The level five and the final round contains 100 questions about the entire Philippine History." +
                " Unlike the previous levels, this part gives only one chance to be play so be wise enough with your answers." +
                "<br><br>&nbsp;&nbsp; We are hoping that you will enjoy the app." +
                " Goodluck and thank you.<br>"
        ;
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), loading002.class);
        startActivity(intent);
        finish();
    }

    public void onUserLeaveHint() {

        finish();

    }

    @Override
    protected void onPause() {
        super.onPause();
        aboutbackgroundmusic001.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        aboutbackgroundmusic001.start();
    }
}
