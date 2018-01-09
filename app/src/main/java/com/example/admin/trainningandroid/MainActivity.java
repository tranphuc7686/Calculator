package com.example.admin.trainningandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btnCong,btnTru,btnNhan,btnChia,btnAc,btnBang,btnCham,btnSo0;
    private TextView txtCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        addControl();
        addEvents();

    }


    private void addControl() {
        btn9 = findViewById(R.id.button28);
        btn8 = findViewById(R.id.button29);
        btn7 = findViewById(R.id.button30);
        btn6 = findViewById(R.id.button40);
        btn5 = findViewById(R.id.button39);
        btn4 = findViewById(R.id.button38);
        btn3 = findViewById(R.id.button32);
        btn2 = findViewById(R.id.button33);
        btn1 = findViewById(R.id.button34);
        btnCong = findViewById(R.id.button31);
        btnTru  = findViewById(R.id.button41);
        btnNhan = findViewById(R.id.button27);
        btnChia = findViewById(R.id.button26);
        btnAc = findViewById(R.id.button23);
        btnSo0 = findViewById(R.id.button37);
        btnCham = findViewById(R.id.button36);
        btnBang = findViewById(R.id.button35);
        txtCal = findViewById(R.id.textView2);
    }

    private void addEvents() {
        btn9.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnAc.setOnClickListener(this);
        btnSo0.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnCham.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button28 : {
                Toast.makeText(this, "Btn 9", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button29 : {
                Toast.makeText(this, "Btn 8", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button30 : {
                Toast.makeText(this, "Btn 7", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button40 : {
                Toast.makeText(this, "Btn 6", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button39 : {
                Toast.makeText(this, "Btn 5", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button38 : {
                Toast.makeText(this, "Btn 4", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button32 : {
                Toast.makeText(this, "Btn 3", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button33 : {
                Toast.makeText(this, "Btn 2", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button34 : {
                Toast.makeText(this, "Btn 1", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button31 : {
                Toast.makeText(this, "Btn Cộng", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button41 : {
                Toast.makeText(this, "Btn Trừ", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button27 : {
                Toast.makeText(this, "Btn Nhân ", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button26 : {
                Toast.makeText(this, "Btn Chia", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button23 : {
                Toast.makeText(this, "Btn AC", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button37 : {
                Toast.makeText(this, "Btn Số 0", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button36 : {
                Toast.makeText(this, "Btn Chấm", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button35 : {
                Toast.makeText(this, "Btn Bằng", Toast.LENGTH_SHORT).show();
                break;
            }




        }
    }
}
