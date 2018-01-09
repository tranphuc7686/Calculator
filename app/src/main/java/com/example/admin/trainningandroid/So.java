package com.example.admin.trainningandroid;

/**
 * Created by Admin on 09/01/2018.
 */

public class So {
    double soHang;

    public So() {
    }

    public So(double soHang) {
        this.soHang = soHang;
    }

    public double Cong(double anotherNumber){
        return this.soHang + anotherNumber;
    }
    public double Tru(double anotherNumber){
        return this.soHang - anotherNumber;
    }
    public double Nhan(double anotherNumber){
        return this.soHang*anotherNumber;
    }
    public double Chia(double anotherNumber){
        return this.soHang/anotherNumber;
    }
}
