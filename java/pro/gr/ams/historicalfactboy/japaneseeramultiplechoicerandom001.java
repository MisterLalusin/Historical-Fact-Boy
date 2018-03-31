package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

public class japaneseeramultiplechoicerandom001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_japaneseeramultiplechoicerandom001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        Intent newIntent = null;
        Random rand = new Random();

        int index = rand.nextInt(2);//setAtoB int index = rand.nextInt(2)
        switch (index) {
            case 0:
                newIntent = new Intent(this, japaneseeramultiplechoiceseta001.class);//setA
                break;
            case 1:
                newIntent = new Intent(this, japaneseeramultiplechoicesetb001.class);//setB
                break;
        }

        startActivity(newIntent);
        finish();
        int pid = android.os.Process.myPid();
        android.os.Process.killProcess(pid);
    }
}