package cg.forum.askquestion.authentification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cg.forum.askquestion.R;
import cg.forum.askquestion.appinterface.Response_Activity;

public class Register_Activity extends AppCompatActivity {

    TextView login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        login = findViewById(R.id.text_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register_Activity.this, Login_Activity.class));
            }
        });

        register = findViewById(R.id.btn_sign_up_login);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Register_Activity.this, Response_Activity.class));
                finish();
            }
        });

    }

}