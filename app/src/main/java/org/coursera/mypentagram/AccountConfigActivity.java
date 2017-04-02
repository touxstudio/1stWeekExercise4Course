package org.coursera.mypentagram;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.coursera.pojo.Pets;
import org.coursera.pojo.SharedPrefsUsers;
import org.coursera.pojo.Users;

import java.util.ArrayList;

public class AccountConfigActivity extends AppCompatActivity {

    private Button button;
    private Context context;
    private EditText instagram;
    private SharedPreferences sharedPreferences;
    private ArrayList<Users> users;
    private ArrayList<Pets> pets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_config);

        //ArrayList<Users> users = new ArrayList<>();
        //users.add(new Users("6465453653", "ksdkljasjkd", "asdkjhasd"));
        //users.add(new Users("6465453659", "ksdkljasjk9", "asdkjhasd9"));

  // Log.v("CAOS444", pets.get(0).getName().toString());

        button = (Button) findViewById(R.id.BAccount);
        instagram = (EditText) findViewById(R.id.account);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPrefsUsers sharedPrefsUsers = new SharedPrefsUsers();
                //instagram.getText().toString()
                sharedPrefsUsers.saveKEY_USERID_USERNAME("disenosdeunasaura");

                /*SharedPreferences prefs = getApplicationContext().getSharedPreferences("user", getApplicationContext().MODE_PRIVATE);

                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("instagram_acc", instagram.getText().toString());

                editor.apply(); */

                Toast.makeText(getApplicationContext(), "Saved ...", Toast.LENGTH_SHORT);


            }
        });
    }



}
