package com.dsm2018.undefined;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText input1;
    EditText input2;
    Button check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.id);
        input2 = (EditText) findViewById(R.id.password);
        check = (Button) findViewById(R.id.btn1);

        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (input1.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "아이디 또는 비밀번호가 입력되지 않았습니다.", Toast.LENGTH_SHORT).show();
                } else if (input2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "아이디 또는 비밀번호가 입력되지 않았습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                    startActivity(intent);
                }
            }

        });

    }
}
