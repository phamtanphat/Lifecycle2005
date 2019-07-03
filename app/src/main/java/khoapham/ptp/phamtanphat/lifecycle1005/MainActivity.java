package khoapham.ptp.phamtanphat.lifecycle1005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate");

        btnIntent = findViewById(R.id.buttonIntentActivity);
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
                startActivity(intent);

            }
        });
    }
    //But back trong android
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//    }

    @Override
    protected void onStart() {
        Log.d("BBB","onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("BBB","onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("BBB","onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("BBB","onStop");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("BBB","onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("BBB","onDestroy");
        super.onDestroy();
    }
    // Khi thoat ung dung
    //    + onStop -> khi mo lai ung dung -> onrestart -> onstart -> onresume
    //    + onstop -> ondestroy ->(Bộ nhớ máy hoặc máy không có cache)
}
