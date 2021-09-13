package cg.forum.askquestion.authentification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cg.forum.askquestion.R;

public class Reset_Password_Activity extends AppCompatActivity {

    Button reset, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        reset = findViewById(R.id.btn_send);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Reset_Password_Activity.this, Login_Activity.class));
                finish();
            }
        });

        exit = findViewById(R.id.btn_exit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Reset_Password_Activity.this, Login_Activity.class));
                finish();
            }
        });
    }
}