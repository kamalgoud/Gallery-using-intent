package com.example.cameraintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    GridView gridView;

    private static final int c=9999;
    int i=1;
    ArrayList<datamodel> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.im);
        button=findViewById(R.id.btnc);
        gridView=findViewById(R.id.gd);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,c);
            }
        });
        
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==c){
            Bitmap photo = (Bitmap)data.getExtras().get("data");

            arrayList.add(new datamodel(photo,"photo"+i));
            i++;

            // Set the image in imageview for display
            imageView.setImageBitmap(photo);
        }
        adapter adapter=new adapter(getApplicationContext(),arrayList);
        gridView.setAdapter(adapter);
    }

}