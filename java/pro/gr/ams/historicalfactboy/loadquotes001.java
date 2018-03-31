package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class loadquotes001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_loadquotes001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        Intent newIntent = null;
        Random rand = new Random();

        int index = rand.nextInt(5);
        switch (index) {
            case 0:
                newIntent = new Intent(this, quotes001.class);
                break;
            case 1:
                newIntent = new Intent(this, quotes002.class);
                break;
            case 2:
                newIntent = new Intent(this, quotes003.class);
                break;
            case 3:
                newIntent = new Intent(this, quotes004.class);
                break;
            case 4:
                newIntent = new Intent(this, quotes005.class);
                break;
        }

        startActivity(newIntent);
        finish();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
        finish();
    }

    public void onUserLeaveHint() {

        finish();

    }
}
