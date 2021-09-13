package cg.forum.askquestion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import cg.forum.askquestion.adapters.CategoriesAdapter;
import cg.forum.askquestion.adapters.Category;
import cg.forum.askquestion.appinterface.Notification_Activity;
import cg.forum.askquestion.appinterface.Post_Activity;
import cg.forum.askquestion.appinterface.Profile_Activity;
import cg.forum.askquestion.modele.CurrentUser;
import cg.forum.askquestion.modele.UsersManager;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btn_post;

    RecyclerView recyclerView;

    ArrayList<Category> Categories_forum = new ArrayList<Category>();

    CategoriesAdapter categoriesAdapter;

    NavigationView navigationView;

    DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsersManager.initialiazeDefaultUsers();

        navigationView = findViewById(R.id.navigationMenu);

        navigationView.setItemIconTintList(null);

        drawerLayout = findViewById(R.id.drawer_main);


        findViewById(R.id.menu_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {


                switch (item.getItemId())
                {
                    case R.id.menuProfile:
                        startActivity(new Intent(MainActivity.this, Profile_Activity.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;

                    case R.id.menuNotification:
                        startActivity(new Intent(MainActivity.this, Notification_Activity.class));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        return true;

                    default:
                        return true;
                }
            }
        });


        btn_post = findViewById(R.id.float_btn);

        btn_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Post_Activity.class));
            }
        });

        recyclerView = findViewById(R.id.recycle_main);

        add_categories();

        categoriesAdapter = new CategoriesAdapter(MainActivity.this, Categories_forum);

        recyclerView.setAdapter(categoriesAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    public void add_categories()
    {
        Categories_forum.add(new Category("C++", "Derniere question posé il ya 14 min", 1));

        Categories_forum.add(new Category("C", "Derniere question posé il ya 15 min", 2));

        Categories_forum.add(new Category("Java", "Derniere question posé il ya 1h", 3));

        Categories_forum.add(new Category("Python", "Derniere question posé il ya 14 min", 4));

        Categories_forum.add(new Category("C#", "Derniere question posé il ya 1 min", 5));

        Categories_forum.add(new Category("HTML & CSS", "Derniere question posé il ya 1 min", 6));

        Categories_forum.add(new Category("PHP", "Derniere question posé il ya 1 min", 7));

    }

}