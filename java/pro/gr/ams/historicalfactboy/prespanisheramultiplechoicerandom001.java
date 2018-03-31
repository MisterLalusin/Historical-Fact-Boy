package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class prespanisheramultiplechoicerandom001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_prespanisheramultiplechoicerandom001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        Intent newIntent = null;
        Random rand = new Random();

        int index = rand.nextInt(5);//setAtoE int index = rand.nextInt(5)
        switch (index) {
            case 0:
                newIntent = new Intent(this, prespanisheramultiplechoiceseta001.class);//setA
                break;
            case 1:
                newIntent = new Intent(this, prespanisheramultiplechoicesetb001.class);//setB
                break;
            case 2:
                newIntent = new Intent(this, prespanisheramultiplechoicesetc001.class);//setC
                break;
            case 3:
                newIntent = new Intent(this, prespanisheramultiplechoicesetd001.class);//setD
                break;
            case 4:
                newIntent = new Intent(this, prespanisheramultiplechoicesete001.class);//setE
                break;
        }

        startActivity(newIntent);
        finish();
        int pid = android.os.Process.myPid();
        android.os.Process.killProcess(pid);
    }
}