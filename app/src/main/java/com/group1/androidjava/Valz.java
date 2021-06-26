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

public class Valz extends AppCompatActivity {
    ListView valzlistView;
    int[] valzImage={R.drawable.colorzzz,R.drawable.zample,R.drawable.stringzzz,R.drawable.ztylezzz};
    String[] valzNames = {"COLORS","DIMENSIONS","STRINGS","STYLES"};
    String[] valzDesc = {"COLORS\n\nIf you want to reuse colors in your application, adding it in the values/colors.xml is a must. You only need the hexadecimal value of the color you wanted to use and set a name for it that you will be referencing inside the application. The image below shows the code inside the colors.xml file as well as the color itself in the left most part beside the number." +
            "\n\nBelow is an example on how we use the colors when applying it in our controls\n\n" +
            "<Button\n" +
            "android: layout_width= “match_parent”\n" +
            "android: layout_height= “wrap_content”\n" +
            "android: text= “REGISTER”\n" +
            "android: background= “@color/colorPrimary”\n" +
            "/>" ,

            "DIMENSIONS\n\nThis is where we save the dimensions we need such as padding and margin. For example, throughout the application, you are using 10dp as the margin of your application. Every time that you create an activity, you are declaring your margin with 10dp. In case you have 10 activities inside your application, you will be changing all of that one by one. On the other hand, if you referenced the values inside the dimensions file, you will only change it ones and it will be applied to all your activities.",

            "STRINGS\n\nLike our colors, we can define strings that can be referenced as well. It can be used by different controls such as label of Buttons or value of the TextViews. It is also recommended to use it in developing your application because Android Studio gives warning for the strings that are hardcoded.",

            "STYLES\n\nStyle in android development is the collection of attributes that identifies the appearance of the views and/or controls inside the application. We can also reference themes in our styles to fit user preferences."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valz);
        valzlistView = findViewById(R.id.valzlistView);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        valzlistView.setAdapter(customAdapter);
        valzlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==1) {
                    Intent  intent3 = new Intent(Valz.this, RezourceInfo.class);
                    intent3.putExtra("desc3", valzDesc[position]);
                    startActivity(intent3);
                }else {
                    Intent  intent3 = new Intent(Valz.this, RezourceInfo.class);
                    intent3.putExtra("desc3", valzDesc[position]);
                    intent3.putExtra("image3", valzImage[position]);
                    startActivity(intent3);
                }
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return valzDesc.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.valz_list, null);

            TextView valzname = view1.findViewById(R.id.rezourceView);

            valzname.setText(valzNames[position]);

            return view1;
        }
    }
}