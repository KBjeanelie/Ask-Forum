package cg.forum.askquestion.appinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cg.forum.askquestion.MainActivity;
import cg.forum.askquestion.R;
import cg.forum.askquestion.authentification.Login_Activity;

public class View_Response_Activity extends AppCompatActivity {

    Button response;
    ImageView ic_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_response);

        response = findViewById(R.id.btn_response);

        ic_back = findViewById(R.id.ic_back);

        response.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Response_Activity.this, Login_Activity.class));
            }
        });

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Response_Activity.this, View_Question_Activity.class));
                finish();
            }
        });
    }
}