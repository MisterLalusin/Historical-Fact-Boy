package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class americaneramultiplechoicerandom001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_americaneramultiplechoicerandom001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        Intent newIntent = null;
        Random rand = new Random();

        int index = rand.nextInt(3);//setAtoC int index = rand.nextInt(3)
        switch (index) {
            case 0:
                newIntent = new Intent(this, americaneramultiplechoiceseta001.class);//setA
                break;
            case 1:
                newIntent = new Intent(this, americaneramultiplechoicesetb001.class);//setB
                break;
            case 2:
                newIntent = new Intent(this, americaneramultiplechoicesetc001.class);//setC
                break;
        }

        startActivity(newIntent);
        finish();
        int pid = android.os.Process.myPid();
        android.os.Process.killProcess(pid);
    }
}