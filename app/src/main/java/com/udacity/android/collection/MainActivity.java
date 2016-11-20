package com.udacity.android.collection;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);

        btn1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this, "启动应用：热门电影", Toast.LENGTH_SHORT);
                tst.show();

            }
        });

        btn2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this, "启动应用：股票雄鹰", Toast.LENGTH_SHORT);
                tst.show();

            }
        });

        btn3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this, "启动应用：XYZ阅读器", Toast.LENGTH_SHORT);
                tst.show();

            }
        });

        btn4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this, "启动应用：最新闻", Toast.LENGTH_SHORT);
                tst.show();

            }
        });

        btn5.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast tst = Toast.makeText(MainActivity.this, "启动应用：毕业设计", Toast.LENGTH_SHORT);
                tst.show();

            }
        });
    }



}
