package cg.forum.askquestion.modele;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class forumDBHelper extends SQLiteOpenHelper {


    public forumDBHelper(Context context) {
        super(context, "forumDBHelper.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE Category (CategoryId INT PRIMARY KEY AUTOINCREMENT, CategoryName TEXT NOT NULL)");

        sqLiteDatabase.execSQL("CREATE TABLE Users (UserId INT PRIMARY KEY AUTOINCREMENT, LastName TEXT NOT NULL, " +
                "FirstName TEXT NOT NULL, Email TEXT NOT NULL, Password TEXT NOT NULL, CurrentProfile TEXT NOT NULL, " +
                "CurrentSession BOOLEAN NOT NULL)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
