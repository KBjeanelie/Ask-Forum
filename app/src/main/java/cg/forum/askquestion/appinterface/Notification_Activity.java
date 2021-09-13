package cg.forum.askquestion.appinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import cg.forum.askquestion.MainActivity;
import cg.forum.askquestion.R;

public class Notification_Activity extends AppCompatActivity {

    ImageView ic_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        ic_back = findViewById(R.id.ic_back);

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Notification_Activity.this, MainActivity.class));
                finish();
            }
        });
    }
}