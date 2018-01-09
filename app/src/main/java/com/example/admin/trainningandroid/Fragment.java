package com.example.admin.trainningandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Admin on 09/01/2018.
 */

public class Fragment extends android.support.v4.app.Fragment implements View.OnClickListener{
    private Button btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btnCong,btnTru,btnNhan,btnChia,btnAc,btnBang,btnCham,btnSo0;
    private TextView txtCal;
    String textPhepTinh = "";
    So ketquaTemp = new So();




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment1, container, false);
        // Ánh xạ view
        addControl(view);
        // Bắt Sự Kiện View
        addEvents();

        return view;
    }
    private void addControl(View view) {
        btn9 = view.findViewById(R.id.button28);
        btn8 = view.findViewById(R.id.button29);
        btn7 = view.findViewById(R.id.button30);
        btn6 = view.findViewById(R.id.button40);
        btn5 = view.findViewById(R.id.button39);
        btn4 = view.findViewById(R.id.button38);
        btn3 = view.findViewById(R.id.button32);
        btn2 = view.findViewById(R.id.button33);
        btn1 = view.findViewById(R.id.button34);
        btnCong = view.findViewById(R.id.button31);
        btnTru  = view.findViewById(R.id.button41);
        btnNhan = view.findViewById(R.id.button27);
        btnChia = view.findViewById(R.id.button26);
        btnAc = view.findViewById(R.id.button23);
        btnSo0 = view.findViewById(R.id.button37);
        btnCham = view.findViewById(R.id.button36);
        btnBang = view.findViewById(R.id.button35);
        txtCal = view.findViewById(R.id.textView2);


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
                textPhepTinh = textPhepTinh+"9";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button29 : {
                textPhepTinh = textPhepTinh+"8";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button30 : {
                textPhepTinh = textPhepTinh+"7";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button40 : {
                textPhepTinh = textPhepTinh+"6";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button39 : {
                textPhepTinh = textPhepTinh+"5";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button38 : {
                textPhepTinh = textPhepTinh+"4";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button32 : {
                textPhepTinh = textPhepTinh+"3";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button33 : {
                textPhepTinh = textPhepTinh+"2";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button34 : {
                textPhepTinh = textPhepTinh+"1";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button31 : {
                So temp = new So(Double.parseDouble(textPhepTinh));
                textPhepTinh = "+";

                txtCal.setText(textPhepTinh);
                textPhepTinh="";
                break;
            }
            case R.id.button41 : {
                textPhepTinh = "-";
                txtCal.setText(textPhepTinh);
                textPhepTinh="";
                break;
            }
            case R.id.button27 : {
                textPhepTinh = "*";
                txtCal.setText(textPhepTinh);
                textPhepTinh="";
                break;
            }
            case R.id.button26 : {
                textPhepTinh = "/";
                txtCal.setText(textPhepTinh);
                textPhepTinh="";
                break;
            }
            case R.id.button23 : {
                textPhepTinh="";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button37 : {
                textPhepTinh = textPhepTinh+"0";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button36 : {
                textPhepTinh = textPhepTinh+".";
                txtCal.setText(textPhepTinh);
                break;
            }
            case R.id.button35 : {
                txtCal.setText(ketquaTemp+"");
                textPhepTinh="";
                break;
            }




        }
    }

}

