package cg.forum.askquestion.authentification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cg.forum.askquestion.MainActivity;
import cg.forum.askquestion.R;
import cg.forum.askquestion.appinterface.Response_Activity;
import cg.forum.askquestion.modele.CurrentUser;

public class Login_Activity extends AppCompatActivity {

    Button login, register;
    TextView reset;
    EditText email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.btn_login);

        register = findViewById(R.id.btn_sign_up);

        reset = findViewById(R.id.forget_txt);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                email = findViewById(R.id.input_email);
                password = findViewById(R.id.input_password);

                if (Authentification.login(email.getText().toString(), password.getText().toString())) {

                    startActivity(new Intent(Login_Activity.this, Response_Activity.class));
                    finish();
                }else
                    Toast.makeText(Login_Activity.this, "Email ou mot de passe incorrect", Toast.LENGTH_SHORT).show();

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_Activity.this, Register_Activity.class));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login_Activity.this, Reset_Password_Activity.class));
            }
        });
    }

}