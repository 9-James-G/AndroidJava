package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class AndRezource extends AppCompatActivity {
    ListView rezourcelistView;
    int[] rezourceImages={R.drawable.layoutzzz,R.drawable.drawablezzz,R.drawable.zample};
    String[] rezourceNames = {"LAYOUT","DRAWABLES","VALUES"};
    String[] rezourceDesc = {"LAYOUT\n\nThis resource defines a user interface layout and is saved inside the layout folder under res. The XML layouts that you have done in the past lesson are saved here. In addition, you can also create layouts that are not connected in any java file but is referenced in other layouts such as layout for a cardview." ,
    "DRAWABLES\n\nDisplaying static images in your application will require you to use the drawable class. It can be an image saved in your project such as png and jpg files or an xml resource that defines drawable properties such as icons generated in Android Studio. It addition, you can also draw or generate or shaped under this type of resource."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and_rezource);
        rezourcelistView = findViewById(R.id.rezourcelistView);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        rezourcelistView.setAdapter(customAdapter);
        rezourcelistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent3;
                if(position==2){
                    intent3 = new Intent(AndRezource.this , Valz.class);
                    startActivity(intent3);
                }else{
                intent3 = new Intent(AndRezource.this , RezourceInfo.class);
                intent3.putExtra("desc3",rezourceDesc[position]);
                    intent3.putExtra("image3", rezourceImages[position]);

                startActivity(intent3);
                }
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return rezourceNames.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.rezource_list, null);

            TextView rezourcename = view1.findViewById(R.id.rezourceView);


            rezourcename.setText(rezourceNames[position]);

            return view1;
        }
    }
}