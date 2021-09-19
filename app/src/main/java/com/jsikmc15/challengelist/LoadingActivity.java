package com.jsikmc15.challengelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoadingActivity extends AppCompatActivity {

    private TextView tv_title ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = getLayoutInflater().inflate(R.layout.activity_loading,null);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
                );
        params.topMargin = getStatusBarHeight();

        view.setLayoutParams(params);

        setContentView(view);



//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE|View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//            getWindow().setStatusBarColor(Color.TRANSPARENT);
//        }

        /*
        id 를 통해 xml 과 java 클래스 파일을 연결

         */
        tv_title = findViewById(R.id.tv_title);
        tv_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



    }


    public int getStatusBarHeight(){
        int result = 0;
        int resourceIdTop = getResources().getIdentifier(
                "status_bar_height",
                "dimen",
                "android"
        );
        if (resourceIdTop > 0) {
            result = getResources().getDimensionPixelSize(resourceIdTop);
        }
        return result;
    }

    public int getNavigationBarHeight(){
        int result = 0;
        int resourceIdBottom = getResources().getIdentifier(
                "navigation_bar_height",
                "dimen",
                "android"
        );
        if (resourceIdBottom > 0) {
            result = getResources().getDimensionPixelSize(resourceIdBottom);
        }
        return result;
    }

}