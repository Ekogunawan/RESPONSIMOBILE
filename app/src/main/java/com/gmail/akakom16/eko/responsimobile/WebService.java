
package com.gmail.akakom16.eko.responsimobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
//TODO 1 java : yaitu program di atas adalah package dari class java sendiri yang bisas di panggil kapanpun
public class WebService extends AppCompatActivity {
    private static final String JSON_URL = "https://azharsaepudin.github.io/FootBallPlayer/AllPlayer.json";

//TODO 2 java: Yaitu program di atas adalah class web service dan mendeklarasikan alamat service yang akan di akases

    ListView listView;
    private List<PlayerItem> playerItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_service);

        listView =  findViewById(R.id.listView);
        playerItemList = new ArrayList<>();


        loadPlayer();
    }
    //TODO 3 : Mendeklarasikan class untuk pertama kali android studio di jalankan atau aplikasi di jalankan dan kemudain menampilkan di xml web service
    private void loadPlayer() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, JSON_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject obj = new JSONObject(response);
                            JSONArray playerArray = obj.getJSONArray("result");

                            for (int i = 0; i < playerArray.length(); i++) {

                                JSONObject playerObject = playerArray.getJSONObject(i);


                                PlayerItem playerItem = new PlayerItem(playerObject.getString("no"),
                                        playerObject.getString("name"),
                                        playerObject.getString("Position"),
                                        playerObject.getString("birth_date"),
                                        playerObject.getString("Poster"));

                                playerItemList.add(playerItem);
                            }

                            ListViewAdapter adapter = new ListViewAdapter(playerItemList, getApplicationContext());

                            listView.setAdapter(adapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
        //TODO 4 : program diatas yaitu membuat method memanggil data dari service yang di deklarasikan di atas dan  yang akan ditampilkan di layout di xml dengan menggunakan JSON
    }
}
