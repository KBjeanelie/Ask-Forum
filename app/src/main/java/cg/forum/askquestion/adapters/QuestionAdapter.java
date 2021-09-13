package cg.forum.askquestion.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import cg.forum.askquestion.R;
import cg.forum.askquestion.appinterface.View_Response_Activity;


public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.MyViewHolder> {

    Context context;

    ArrayList<Question>Questions_List;

    public QuestionAdapter(Context context, ArrayList<Question> questions_List) {
        this.context = context;
        Questions_List = questions_List;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.card_questions, parent, false);

        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {

        holder.question_title.setText(String.valueOf(Questions_List.get(position).getTitle()));

        holder.question_details.setText(String.valueOf((Questions_List.get(position).getDetails())));

        holder.question_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, View_Response_Activity.class));
            }
        });

        holder.question_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, View_Response_Activity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return Questions_List.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder {

        TextView question_title, question_details;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            question_title = itemView.findViewById(R.id.title_question);

            question_details = itemView.findViewById(R.id.details_question);

        }
    }
}
