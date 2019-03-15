package com.example.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button click;
    private EditText username;
    private EditText password;
    private TextView show;
    int click_case;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.click);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        show = (TextView) findViewById(R.id.show);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText() != null) {
                    show.setText(username.getText()+"");
                    click.setText("Long Click");
                }
            }
        });

        click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (password.getText() != null) {
                    show.setText(password.getText()+"");
                }
                return false;
            }
        });
    }
}
