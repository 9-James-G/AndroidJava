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

public class AnotherOne extends AppCompatActivity {
    ListView intentlistView;

    String[] intentNames = {"INTENT STRUCTURE","EXPLICIT INTENT","IMPLICIT INTENT"};
    String[] intentDesc = {"INTENT STRUCTURE\n\nPrimary:\n\n" +
            "1. Action- the general action to be performed such as ACTION_VIEW, ACTION_EDIT, ACTION_MAIN.\n" +
            "2. Data- the data to operate on such as person record in the contact database expressed as Uri.\n\n" +
            "Secondary:\n\n" +
            "1. Category- gives additional information about the action to execute.\n" +
            "2. Type- specifies an explicit type of the intent data.\n" +
            "3. Component- specifies an explicit name of a component class to use for the intent.\n" +
            "4. Extras- this is a bundle of any additional information that can be used or passed to other components or activity.\n\n" +
            "Methods that are used:\n" +
            "putExtra(KEY, VALUE)-used for adding data to the intent\n" +
            "getIntent()- used for getting the data from the previous intent\n" +
            "getExtra()- used to extract value of the keys like\n" +
            "getStringExtra(), getIntExtra(), etc.",

            "EXPLICIT INTENT\n\nExplicit intent is used when a target component is defined directly by using the Java class within the application. An example is shown below.\n\n" +
                    "Intent intent= new Intent(getApplicationContext(),activityTwo.class);\n" +
                    "startActivity(intent)",

            "IMPLICIT INTENT\n\nImplicit intent, on the other hand, is used when it defines an action that you wanted to perform that your application cannot but others can specifically those that are in the android system already. It specifies the action you wanted to perform and the system will find the component that can do it. An example is shown below.\n\n" +
                    "String url= “https://www.ucu.edu.ph”;\n" +
                    "Intent intent= new Intent(Intent.ACTION_VIEW);\n" +
                    "Intent.setData(Uri.parse(url));\n" +
                    "startActivity(intent)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_one);
        intentlistView = findViewById(R.id.intentlistView);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        intentlistView.setAdapter(customAdapter);
        intentlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent7 = new Intent(AnotherOne.this , IntentInfo.class);
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