package com.example.electronica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.electronica.Microcontrollers;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Microcontrollers> data = new ArrayList<>();
        data.add(new Microcontrollers("AVR", "Microprocessor", R.drawable.images,"ATmel"));
        data.add(new Microcontrollers("Pic", "IC", R.drawable.pic,"Infineon"));
        data.add(new Microcontrollers("Arduino", "Microcontroller", R.drawable.download,"ATmega"));
        data.add(new Microcontrollers("Atmega 16", "Microprocessor", R.drawable.Untitled,"ATmel"));
        data.add(new Microcontrollers("TriCore", "Microprocessor", R.drawable.infineon,"Microchip"));
        

        ListView listView = findViewById(R.id.list_View);
        listView.setAdapter(new MyAdapter(this, data));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, data.get(position).getName() + "\n" + data.get(position).getVendor(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}


