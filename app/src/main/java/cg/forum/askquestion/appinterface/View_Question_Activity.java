package cg.forum.askquestion.appinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import cg.forum.askquestion.MainActivity;
import cg.forum.askquestion.R;
import cg.forum.askquestion.adapters.Question;
import cg.forum.askquestion.adapters.QuestionAdapter;

public class View_Question_Activity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<Question> ListOfQuestion = new ArrayList<Question>();

    QuestionAdapter questionAdapter;

    ImageView ic_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_question);

        recyclerView = findViewById(R.id.recycle_question_view);

        this.fillListOfQuestion();

        questionAdapter = new QuestionAdapter(View_Question_Activity.this, ListOfQuestion);

        recyclerView.setAdapter(questionAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(View_Question_Activity.this));

        ic_back = findViewById(R.id.ic_back);

        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(View_Question_Activity.this, MainActivity.class));
                finish();
            }
        });

    }

    public void fillListOfQuestion()
    {
        String det = "Le lorem ipsum est, en imprimerie, une suite de mots sans signification utilisée à titre provisoire pour calibrer une mise en page, le texte définitif venant remplacer le faux-texte dès.";
        ListOfQuestion.add(new Question( "C++","Probleme avec le compilateur gcc", det));
        ListOfQuestion.add(new Question("Java", "Error undefined in JAVA", det));
        ListOfQuestion.add(new Question("PHP", "Page not found in server apache2", det));
        ListOfQuestion.add(new Question("Linux","Initrams in kali linux", det));
        ListOfQuestion.add(new Question("Android studio","Probleme du lancement de l'emulateur sur android studio 3.1.2", det));
    }

}