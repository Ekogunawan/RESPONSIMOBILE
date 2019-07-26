package com.gmail.akakom16.eko.responsimobile;
//TODO 1 java : yaitu program di atas  adalah package dari nama projec
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
//TODO 2 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
//TODO 3 java: Yaitu program di atas adalah class Mahasiswaadapter dan mengextend ke reclerView dan mahasiswa holder


    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }
    //TODO 4 java: Yaitu program di atas yaitu pendeklarasina mahasiswaadapter dengan variablenya array
    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.mylist, parent, false);
        return new MahasiswaViewHolder(view);
        //TODO 5 java: Yaitu program di atas adalah pendeklaraisna  class mahasiswaViewHolder dengan membuat obyek dan akan menampilkan ke layout mylist
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNpm());
        holder.txtNoHp.setText(dataList.get(position).getNohp());
        //TODO 6 java: Yaitu program di atas yaitu membuat method degnan ketika viewHolder ketika dijalankan maka akan menampilkan nilai dari data list yang nialinaya nama,npm,no hp
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
            //TODO 7 java: Yaitu program di atas adalah membuat class mahasiswaViewHolder dengan menampilkan di itemView dan yang di tampilkan ke layout utama
        }
    }
}
