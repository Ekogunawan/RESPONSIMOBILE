package com.gmail.akakom16.eko.responsimobile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;
//TODO 1 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun
public class Camera extends AppCompatActivity {
    //TODO 2 java: Yaitu program di atas adalah class MainActivity dari class java yang di guanakan dengan extend ke class turunan dengan nama appCompatActivity

       ImageView imageView;
    // TODO 3 java : Yaitu program di atas adalah mendeklarasikan Variabel yang sifatnya pubic yang bisa di akases di bebagai class di dalam java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        Button btnCamera = (Button) findViewById(R.id.btnCamera);
        imageView = (ImageView) findViewById(R.id.imageView);
           btnCamera.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(takePictureIntent,0);
                //TODO 6 java : Yaitu program di atas adalah ketika button di klikk akan menghasilkan intent atau berpindah halaman ke CAMERA .

            }
        });


    }
    @Override

    protected void onActivityResult(int requestCode,int resultCode, Intent data)
    //TODO 7 java : Yaitu program di atas adalah method untuk menampilkan data ke  dalam activity
    {
          super.onActivityResult(requestCode,resultCode,data);
        Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
        imageView.setImageBitmap(imageBitmap);
        //TODO 8 java : Yaitu program di atas adalah memanggil variabel dari imageView yang di dalam Bitmap dan akan di tampilkan di main layar activity

    }
     private void SavaImage(Bitmap finalBitmap){
         //TODO 9 java : Yaitu program di atas adalah mendeklarasikan method untuk save Image ke dalam External hp

           String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root+"/save_images");
        myDir.mkdir();
        Random generator = new Random();
        int n = 10000;
        n = generator.nextInt();
        String fname = "Image-"+ n +".jpg";
        File file = new File(myDir, fname);
         //TODO 10 java : Yaitu program di atas adalah mendeklarasikan variabel dengan nilainya yaitu dari get External storage directory dan di simpan di File dengan nama save image dan untuk formatnya yaitu JPG

             if(file.exists()) file.delete();
         //TODO 11 java : Yaitu program di atas adalah membuat kondisi di mana yaitu ada exists dan menhapus gambar.

          try{
            FileOutputStream out = new FileOutputStream(file);
            finalBitmap.compress(Bitmap.CompressFormat.JPEG,90,out);
            out.flush();
            out.close();
              //TODO 12 java : Yaitu program di atas adalah untuk kondisi try jika di save makan akan menhasilkan output dan formatnya di compres dengan format JPEG


          }
         catch (Exception e){
            e.printStackTrace();
             //TODO 13 java : Yaitu program di atas jika kondisi catch atau salah makan akan menampilkan exception e dan di tampilan

         }
    }
}
