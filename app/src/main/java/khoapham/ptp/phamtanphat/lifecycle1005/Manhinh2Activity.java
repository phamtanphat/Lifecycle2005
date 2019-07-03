package khoapham.ptp.phamtanphat.lifecycle1005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manhinh2Activity extends AppCompatActivity {

    Button btnManhinh2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh2);
        btnManhinh2 = findViewById(R.id.buttonIntentManhinh2Activity);
        btnManhinh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manhinh2Activity.this,Manhinh3Activity.class);
                startActivity(intent);
            }
        });
    }
}
