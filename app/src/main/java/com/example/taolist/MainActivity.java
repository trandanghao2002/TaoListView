package com.example.taolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<MonAN> arrayList;
        AdapterMonAn adapter;

        listView=findViewById(R.id.listviewmonan);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAN("Trần Đăng Hào","BÒ NƯỚNG",R.drawable.donuong,"200.000 vnđ"));
        arrayList.add(new MonAN("205141100106","BÁNH PIZZA", R.drawable.pizza,"50.000 vnđ"));
        arrayList.add(new MonAN("BÁNH MÌ ","BÁNH MÌ THỊT ",R.drawable.banhmi,"15.000 vnđ"));
        arrayList.add(new MonAN("ĐỒ NƯỚNG ","CƠM CHIÊN",R.drawable.comchien,"30.000 vnđ"));
        arrayList.add(new MonAN("BÚN ","BÚN BÒ",R.drawable.bun,"25.000 vnđ"));
        arrayList.add(new MonAN("HABURGER ","BÁNH HAMBURGER",R.drawable.hamburger,"50.000 vnđ"));

        adapter = new AdapterMonAn(MainActivity.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,comchien.class);
                    startActivity(intent);
                }

            }
        });


    }
}