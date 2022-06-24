package com.example.cameraintent;

import android.graphics.Bitmap;

public class datamodel {

    Bitmap id;

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    String t;

    public Bitmap getId() {
        return id;
    }

    public void setId(Bitmap id) {
        this.id = id;
    }



    public datamodel(Bitmap id,String t) {
        this.id = id;
        this.t=t;
    }
}
