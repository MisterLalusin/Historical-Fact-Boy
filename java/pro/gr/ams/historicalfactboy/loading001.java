package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class loading001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_loading001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        /*
        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1*300);
                    Intent i=new Intent(getApplicationContext(),loadquotes001.class);
                    //Intent i=new Intent(getApplicationContext(),prespanisheramultiplechoiceseta001.class);
                    //Intent i=new Intent(getApplicationContext(),spanisheramultiplechoiceseta001.class);
                    //Intent i=new Intent(getApplicationContext(),menu001.class);
                    //Intent i=new Intent(getApplicationContext(),alieninvasion001.class);
                    //Intent i=new Intent(getApplicationContext(),prespanisheramultiplechoicesetc001.class);
                    //Intent i=new Intent(getApplicationContext(),prespanisheramultiplechoicesetd001.class);
                    //Intent i=new Intent(getApplicationContext(),prespanisheramultiplechoicesete001.class);
                    //Intent i=new Intent(getApplicationContext(),spanisheramultiplechoicesetb001.class);
                    //Intent i=new Intent(getApplicationContext(),spanisheramultiplechoicesetc001.class);
                    //Intent i=new Intent(getApplicationContext(),spanisheramultiplechoicesetd001.class);
                    //Intent i=new Intent(getApplicationContext(),japaneseeramultiplechoiceseta001.class);
                    //Intent i=new Intent(getApplicationContext(),bereadyforthefinalround001.class);
                    //Intent i=new Intent(getApplicationContext(),americaneramultiplechoicesetb001.class);
                    //Intent i=new Intent(getApplicationContext(),japaneseeramultiplechoicesetb001.class);
                    //Intent i=new Intent(getApplicationContext(),americaneramultiplechoicesetc001.class);
                    //Intent i=new Intent(getApplicationContext(),entirehistorymultiplechoiceseta001.class);
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

    /*public void onUserLeaveHint() {

        finish();
        int pid = android.os.Process.myPid();
        android.os.Process.killProcess(pid);

        thread.interrupt();

    }
    */

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
                sleep(1*300);
                Intent i=new Intent(getApplicationContext(),loadquotes001.class);
                startActivity(i);
                finish();
            }
            catch (Exception ex)
            {}
        }
    };

}
