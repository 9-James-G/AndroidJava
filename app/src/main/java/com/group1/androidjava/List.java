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
import android.widget.Toast;

public class List extends AppCompatActivity {

    ListView aclistView;

String[] title ={"HISTORY OF ANDROID OS","DIFFERENT WIDGETS" ,"DIFFERENT XML LAYOUT", "ANDROID RESOURCES","MATERIAL DESIGN","ADDING FUNCTION USING JAVA",
        "ANDROID ACTIVITY", "INTENT","TOAST","SNACKBAR","ALERTDIALOG", " LIGHTWEIGHT STORAGE", "SQLite DATABASE"};
int[] images = {R.drawable.headimg, R.drawable.widgetz,R.drawable.xmllay,R.drawable.androidrez,R.drawable.matdezign,R.drawable.addfunct,
        R.drawable.androidactz, R.drawable.intendoz, R.drawable.toaztz, R.drawable.znackz, R.drawable.alertdiaz,R.drawable.lightimg,R.drawable.sqimg};
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getSupportActionBar().hide();
        aclistView = findViewById(R.id.aclistView);


        CustomAdapter customAdapter = new CustomAdapter();
        aclistView.setAdapter(customAdapter);
        aclistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                Intent intent = new Intent(List.this, AndroidOS.class);
                startActivity(intent);

                }else if(position==1){
                    Intent intent1 = new Intent(List.this, Widgets.class);
                    startActivity(intent1);

                }else if(position==2){
                    Intent intent2 = new Intent(List.this, Layout.class);
                    startActivity(intent2);

                }else if(position==3){
                    Intent intent3 = new Intent(List.this, AndRezource.class);
                    startActivity(intent3);

                }else if(position==4){
                    Intent intent4 = new Intent(List.this, MatDezign.class);
                    startActivity(intent4);

                }else if(position==5){
                    Intent intent5 = new Intent(List.this, AddJava.class);
                    startActivity(intent5);

                }else if(position==6){
                    Intent intent6 = new Intent(List.this, AndroidActivityInfo.class);
                    startActivity(intent6);

                }else if(position==7){
                    Intent intent7 = new Intent(List.this, AnotherOne.class);
                    startActivity(intent7);

                }else if(position==8){
                    Intent intent8 = new Intent(List.this,  Toaztz.class);
                    startActivity(intent8);

                }else if(position==9){
                    Intent intent9 = new Intent(List.this,  Znackbar.class);
                    startActivity(intent9);

                }else if(position==10){
                    Intent intent10 = new Intent(List.this,  AlertDialz.class);
                    startActivity(intent10);
                }else if(position==11){
                    Intent intentli = new Intent(List.this,  LightWeight.class);
                    startActivity(intentli);
                }else{
                    Intent intent12 = new Intent(List.this,  NewDataz.class);
                    startActivity(intent12);
                }

            }
        });
    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.items, null);

            TextView name = view1.findViewById(R.id.textView);
            ImageView image = view1.findViewById(R.id.imageView);

            image.setImageResource(images[position]);
            name.setText(title[position]);


            return view1;
        }
    }
}