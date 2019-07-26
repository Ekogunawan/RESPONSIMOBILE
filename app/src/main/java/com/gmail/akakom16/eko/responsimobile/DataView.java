package com.gmail.akakom16.eko.responsimobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
//TODO 1 java: Yaitu program di atas yaitu packet yang di guanakan dan pemanggilan fungsi yang sudah ada di dalam java

public class DataView extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_view);
        addData();
        //TODO 2 java: Yaitu program di atas yaitu untuk fungsi ketika android akan di jalankan dan akan terhubung ke activity xml

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DataView.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        //TODO 3 java: Yaitu program di atas untuk mendeklarasikan obyek baru dengan nama recyclerview dan obyek adapter

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Eko Gunawan Saputra", "165410076", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Edo zakiul", "1654110066", "082373673976"));
        mahasiswaArrayList.add(new Mahasiswa("Khoirul azzam", "165410078", "087797595788"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "165410098", "0813255547855"));
        //TODO 4 java: Yaitu program di atas adalah membuat sebuah method data dan mendeklarasikan isi dari method tersebut

    }
}
