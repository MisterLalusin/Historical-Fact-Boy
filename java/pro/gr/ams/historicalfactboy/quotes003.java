package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class quotes003 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_quotes003);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        /*
        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep(9*1000);
                    Intent i=new Intent(getApplicationContext(),loading002.class);
                    startActivity(i);
                    finish();
                }
                catch (Exception ex)
                {}
            }
        };
        thread.start();
        */

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
                sleep(9*1000);
                Intent i=new Intent(getApplicationContext(),loading002.class);
                startActivity(i);
                finish();
            }
            catch (Exception ex)
            {}
        }
    };
}
