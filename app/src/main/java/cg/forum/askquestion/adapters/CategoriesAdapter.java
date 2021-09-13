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
import cg.forum.askquestion.appinterface.View_Question_Activity;

public class CategoriesAdapter  extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder>{

    Context context;
    ArrayList<Category>Categories;

    public CategoriesAdapter(Context context, ArrayList<Category> categories) {

        this.context = context;

        Categories = categories;

    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.card_categories,parent, false);

        return new MyViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {

        holder.category_name.setText(String.valueOf(Categories.get(position).toString()));

        holder.last_posted.setText(String.valueOf(Categories.get(position).getShort_message()));

        holder.category_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, View_Question_Activity.class));
            }
        });

    }

    @Override
    public int getItemCount() {

        return Categories.size();

    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView category_name, last_posted;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            category_name = itemView.findViewById(R.id.categorie_name);

            last_posted = itemView.findViewById(R.id.last_posted);

        }

    }

}
