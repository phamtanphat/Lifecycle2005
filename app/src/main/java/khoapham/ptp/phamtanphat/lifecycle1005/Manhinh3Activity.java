package khoapham.ptp.phamtanphat.lifecycle1005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manhinh3Activity extends AppCompatActivity {

    Button btnManhinh3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh3);
        btnManhinh3 = findViewById(R.id.buttonIntentManhinh3Activity);
        btnManhinh3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Manhinh3Activity.this,MainActivity.class);
            startActivity(intent);
        }
    });
}
}
