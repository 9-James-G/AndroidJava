package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ActIntent extends AppCompatActivity {
    ListView intentlistView;

    String[] intentNames = {"SUCCESS","SUCCESS2","SUCCESST"};
    String[] intentDesc = {"wefwfqwQWQWCqwf",
            "weweQWEQWDQwewewewew",

            "232323232QWFQWFQ32323"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentz);

        getSupportActionBar().hide();

        ActIntent.CustomAdapter customAdapter = new ActIntent.CustomAdapter();
        intentlistView.setAdapter(customAdapter);
        intentlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent7 = new Intent(ActIntent.this , IntentInfo.class);
                intent7.putExtra("desc7",intentDesc[position]);

                startActivity(intent7);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return intentDesc.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1 = getLayoutInflater().inflate(R.layout.intent_list, null);

            TextView intentname = view1.findViewById(R.id.intentView);


            intentname.setText(intentNames[position]);

            return view1;
        }
    }
}