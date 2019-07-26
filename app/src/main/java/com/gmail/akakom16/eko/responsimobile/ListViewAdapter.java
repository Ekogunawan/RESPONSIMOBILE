package com.gmail.akakom16.eko.responsimobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
//TODO 1 java: Yaitu program di atas yaitu packet yang di guanakan dan pemanggilan fungsi yang sudah ada di dalam java

public class ListViewAdapter extends ArrayAdapter<PlayerItem> {
    //TODO 2 java: Yaitu program di atas adalah membuat class adapter untuk activity web service dengan mengextend ke array adapter

    private List<PlayerItem> playerItemList;

    private Context context;

    public ListViewAdapter(List<PlayerItem> playerItemList, Context context) {
        super(context, R.layout.list_item, playerItemList);
        this.playerItemList = playerItemList;
        this.context = context;
    }
    //TODO 3 java: Yaitu program di atas adalah membuat method listadapeter dengan menmapilkan di clsas list item dan mengambil niai dari class java playeritem  json yang di buat


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView textViewNo = listViewItem.findViewById(R.id.textViewNo);
        TextView textViewName = listViewItem.findViewById(R.id.textViewName);
        TextView textViewPosition = listViewItem.findViewById(R.id.textViewPosition);
        TextView textViewBirth_date = listViewItem.findViewById(R.id.textViewBirthDate);
        ImageView imgVIew = listViewItem.findViewById(R.id.Poster);

        //TODO 4 java: Yaitu program di atas adalah membuat class view dengan mengisikan nilai variabel yang ada di item list
        PlayerItem playerItem = playerItemList.get(position);

        textViewNo.setText(playerItem.getNo());
        textViewName.setText(playerItem.getName());
        textViewBirth_date.setText(playerItem.getBirth_date());
        textViewPosition.setText(playerItem.getPosition());
          Glide.with(context).load(playerItem.getPoster()).into(imgVIew);
        //TODO 5 java: Yaitu program di atas adalah membuat obyek baru dengan mengambil dari nilai play itemlist dan membuat fungsi baru

        return listViewItem;
    }
}
