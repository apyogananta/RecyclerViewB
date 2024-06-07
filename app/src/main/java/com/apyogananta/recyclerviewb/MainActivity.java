package com.apyogananta.recyclerviewb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton _addButton;

    private RecyclerView _recyclerView1;

    private TextView _txtMahasiswaCount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);
        _txtMahasiswaCount = findViewById(R.id.txtMahasiswaCount);

        //initAddButton();/
        loadRecyclerView();
    }

    private void loadRecyclerView() {
        AsyncHttpClient ahc = new AsyncHttpClient();
        String url = "https://stmikpontianak.net/011100862/tampilMahasiswa.php";

        ahc.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }

//    private void initAddButton() {
//        _addButton = findViewById(R.id.addButton);
//
//        _addButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), AddMahasiswaActivity.class);
//                startActivity(intent);
//
//                loadRecyclerView();
//            }
//        });
//    }
}