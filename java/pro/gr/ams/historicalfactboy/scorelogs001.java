package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class scorelogs001 extends AppCompatActivity {

    private static final String TAG = "scorelogs001";

    createdatabase001 mcreatedatabase001;

    private ListView mListView;
    private MediaPlayer backgroundto;
    private MediaPlayer palakpakan;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_scorelogs001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        mListView = (ListView) findViewById(R.id.listView);
        mcreatedatabase001 = new createdatabase001(this);

        populateListView();

        backgroundto = MediaPlayer.create(this, R.raw.backgroundsfx001);
        backgroundto.setAudioStreamType
                (AudioManager.STREAM_MUSIC);
        backgroundto.setLooping(true);
        //backgroundto.start();

        palakpakan = MediaPlayer.create(this, R.raw.backgroundsfx003);
        palakpakan.setAudioStreamType
                (AudioManager.STREAM_MUSIC);
        palakpakan.setLooping(false);
        palakpakan.start();

    }
    private void populateListView() {
        Log.d(TAG, "populateListView: Displaying data in the ListView.");

        Cursor data = mcreatedatabase001.getData();
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext()){
            listData.add(data.getString(1));
        }


        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listData);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = adapterView.getItemAtPosition(i).toString();
                Log.d(TAG, "onItemClick: You Clicked on " + name);

                Cursor data = mcreatedatabase001.getItemID(name);
                int itemID = -1;
                while(data.moveToNext()){
                    itemID = data.getInt(0);
                }
                /*
                if(itemID > -1){
                    Log.d(TAG, "onItemClick: The ID is: " + itemID);
                    Intent editScreenIntent = new Intent(scorelogs001.this, scorelogs002.class);
                    editScreenIntent.putExtra("id",itemID);
                    editScreenIntent.putExtra("name",name);
                    startActivity(editScreenIntent);
                    finish();
                }
                else{
                    toastMessage("No ID associated with that name");
                }
                */
            }
        });

    }

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), loading002.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        backgroundto.pause();
        palakpakan.pause();
    }

    public void onUserLeaveHint() {

        finish();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Score Logs", Toast.LENGTH_SHORT).show();
        backgroundto.start();;
    }


}

