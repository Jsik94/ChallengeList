package com.jsikmc15.challengelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_add ;
    ImageButton ibtn_search ;
    EditText et_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = findViewById(R.id.btn_add); // 뷰를 id를 통해 연결
        et_search = findViewById(R.id.et_search);
        ibtn_search = findViewById(R.id.ibtn_search);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"To do list가 떠야함 !",Toast.LENGTH_SHORT).show();
                btn_add.setVisibility(Button.INVISIBLE);

            }
        });

        ibtn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),et_search.getText()+"으로 검색 !",Toast.LENGTH_SHORT).show();
            }
        });




    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"다시 살려냄 !",Toast.LENGTH_SHORT).show();
        btn_add.setVisibility(Button.VISIBLE);
    }
}