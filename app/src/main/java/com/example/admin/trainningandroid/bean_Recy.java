package com.example.admin.trainningandroid;

/**
 * Created by Admin on 09/01/2018.
 */

public class bean_Recy {
    private String tieuDe;
    private String urlHinhAnh;

    public bean_Recy(String tieuDe, String urlHinhAnh) {
        this.tieuDe = tieuDe;
        this.urlHinhAnh = urlHinhAnh;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getUrlHinhAnh() {
        return urlHinhAnh;
    }

    public void setUrlHinhAnh(String urlHinhAnh) {
        this.urlHinhAnh = urlHinhAnh;
    }
}
