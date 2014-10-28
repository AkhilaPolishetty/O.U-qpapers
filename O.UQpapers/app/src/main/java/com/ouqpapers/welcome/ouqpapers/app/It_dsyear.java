package com.ouqpapers.welcome.ouqpapers.app;

 import android.graphics.Bitmap;
 import android.graphics.BitmapFactory;
 import android.os.Bundle;
 import android.app.Activity;
 import android.view.View;
 import android.widget.Button;
 import android.widget.ImageView;
 import java.io.IOException;
 import java.io.InputStream;

public class It_dsyear extends Activity implements View.OnClickListener{

    ImageView imageView1;
    Button button;
    int tophone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.it_ds1);
        imageView1=(ImageView)findViewById(R.id.imageView1);
        imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
        tophone=R.drawable.ic_launcher;
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView)findViewById(R.id.imageView3);
        ImageView imageView4=(ImageView)findViewById(R.id.imageView4);
        button=(Button)findViewById(R.id.button);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);

        button.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.imageView2:
                imageView1.setImageResource(R.drawable.itds1);
                tophone=R.drawable.itds2;
                break;

            case R.id.imageView3:
                imageView1.setImageResource(R.drawable.itds2);
                tophone=R.drawable.itds3;
                break;

            case R.id.imageView4:
                imageView1.setImageResource(R.drawable.itds3);
                tophone=R.drawable.ic_launcher;
                break;

            case R.id.button:
                InputStream a=getResources().openRawResource(tophone);
                Bitmap whatever= BitmapFactory.decodeStream(a);
                try{

                    getApplicationContext().setWallpaper(whatever);
                }
                catch(IOException e){

                    e.printStackTrace();
                }
                break;

        }
    }
}
