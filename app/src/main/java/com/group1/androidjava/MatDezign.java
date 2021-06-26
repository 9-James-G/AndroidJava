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

public class MatDezign extends AppCompatActivity {
    ListView matlistView;

    String[] matNames = {"DEFINITION","HOW TO SET UP MATERIAL DESIGN IN ANDROID STUDIO(IMPLEMENTATION)","COMPONENTS"};
    String[] matDesc = {"MATERIAL DESIGN\n\nMaterial Design is a design language developed by Google in 2014. \n" +
            "Expanding on the \"cards\" that debuted in Google Now, Material Design uses more grid-based layouts, responsive animations and transitions, padding, and depth effects such as lighting and shadows.\n\n" +
            "To learn more about Material Design just visit https://material.io/components",
            "Material Components for Android is available through Google's Maven Repository. To use it:\n\n" +
                    "1. Open the build.gradle file for your application.\n", " "};
    String too = "2. Make sure that the repositories section includes Google's Maven Repository google(). For\n" +
            "Example:\n" +
            "allprojects {\n" +
            "repositories {\n" +
            "google()\n" +
            "jcenter()\n" +
            "}\n" +
            "}\n\n" +
            "3. Add the library to the dependencies section:\n" +
            "dependencies {\n" +
            "// ...\n" +
            "implementation 'com.google.android.material:material:<version>'\n" +
            "// ...\n" +
            "}\n\n" +
            "For the latest version just visit\n https://maven.google.com/web/index.html#com.google.android.material:material\n\n" +
            "Example of adding library using implementation \n'com.google.android.material:material:1.4.0-alpha02' and after adding the implementation make sure to click the Sync now above.\n";
    String lazt= "4. GO TO res ----- values and expand/open ---- themes and double click ---\n" +
            "\n" +
            "Copy and paste the code below to the parent=” “ in themes\n" +
            "\n" +
            "Theme.MaterialComponents.Light.NoActionBar\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_dezign);
        matlistView = findViewById(R.id.matlistView);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        matlistView.setAdapter(customAdapter);
        matlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent  intent4 = new Intent(MatDezign.this, MatInfo.class);
                    intent4.putExtra("desc4", matDesc[position]);
                    startActivity(intent4);
                }else if(position==1) {
                    Intent  intent4 = new Intent(MatDezign.this, MatEX.class);
                    intent4.putExtra("desc4", matDesc[1]);
                    intent4.putExtra("descx1", too);
                    intent4.putExtra("descx2", lazt);
                    startActivity(intent4);
                }else{
                    Intent  intent4 = new Intent(MatDezign.this, CompoList.class);
                    startActivity(intent4);
                }

            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return matDesc.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.mat_list, null);

            TextView matname = view1.findViewById(R.id.matView);


            matname.setText(matNames[position]);

            return view1;
        }
    }
}