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

public class AddJava extends AppCompatActivity {
    ListView javaView;
    int[] javaImages={R.drawable.zample,R.drawable.zample,R.drawable.zample};
    String[] javaNames = {"REFERENCING XML LAYOUT","BUTTON FUNCTIONS","IPO MODEL"};
    String[] javaDesc = {"REFERENCING XML LAYOUT\n\nIn order for you to use the controls in your java files ou need to reference them first. First thing to do is to make sure that you have assigned an id for that control. Let’s look at the example above.\n\n" +
            "The layout above was created inside a LinearLayout with a vertical orientation. The TextView is not visible for it does not contain any text to be displayed before running the application.\n\n" +
            "<EditText\n" +
            "android:layout_width=\"200dp\"\n" +
            "android:layout_height=\"wrap_content\"\n" +
            "android:id=\"@+id/editName\"\n" +
            "android:hint=\"@string/edit_hint\"/>\n\n" +
            "<Button\n" +
            "android:layout_width=\"100dp\"\n" +
            "android:layout_height=\"wrap_content\"\n" +
            "android:id=\"@+id/btnGo\"\n" +
            "android:text=\"@string/btnText\"/>\n\n" +
            "<TextView\n" +
            "android:layout_width=\"wrap_content\"\n" +
            "android:layout_height=\"wrap_content\"\n" +
            "android:id=\"@+id/txtDisplay\"/>\n\n" +
            "As you a see from the given code, every control has its own unique identifier denoted by the attribute android:id. The value of this attribute always starts with “@+id/” followed by the unique identifier that you wanted to use for that control.\n\n" +
            "After the layout, you may now proceed to referencing the controls in your java file. Check the code below on how it is done.\n\n" +
            "public class MainActivity extends AppCompatActivity {\n\n" +
            "EditText name;\n" +
            "Button go;\n" +
            "TextView display;\n\n" +
            "@Override\n" +
            "protected void onCreate(Bundle savedInstanceState)\n" +
            "{\n" +
            "super.onCreate(savedInstanceState);\n" +
            "setContentView(R.layout.activity_main);\n\n" +
            "name= findViewById(R.id.editName);\n" +
            "go= findViewById(R.id.btnGo);\n" +
            "display= findViewById(R.id.txtDisplay);\n\n" +
            "}\n" +
            "}",

            "BUTTON FUNCTIONS\n\nThere are two ways in adding functions to a button in Android. First is using the onClickListener() method.\n\n" +
                    "go.setOnClickListener(new View.OnClickListener() {\n" +
                    "@Override\n" +
                    "public void onClick(View view) {\n" +
                    "//add your code here\n" +
                    "}\n" +
                    "});\n\n" +
                    "Get the variable you declared and initialized then add the method mentioned above. When using Android Studio, you need not to know all the lines because of its Intellisense. You just need to select it from the suggestions that will show upon typing the sequence of letter for setOnClickListener. All the processes that you want to execute upon clicking the button will be dded inside it.\n\n" +
                    "The second way is to add the attribute android:onClick on the XML layout. The value that will be inserted here will be used as the method name inside your java code. Check the following codes below\n\n" +
                    "<Button\n" +
                    "android:layout_width=\"100dp\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:id=\"@+id/btnGo\"\n" +
                    "android:onClick=\"clickBtn\"\n" +
                    "android:text=\"@string/btnText\"/>\n\n" +
                    "public class MainActivity extends AppCompatActivity {\n" +
                    "…..\n" +
                    "@Override\n" +
                    "protected void onCreate(Bundle savedInstanceState)\n" +
                    "{….. }\n" +
                    "public void clickBtn(View view) {\n" +
                    "//add your code here\n" +
                    "}\n" +
                    "}",

            "IPO MODEL\n\nFor the Input-Process-Output Model, let us use the example used above.\n" +
                    "In here, we will be entering a name and then process it by adding some string before displaying it inside a TextView. The following steps should be used:\n\n" +
                    "1. Declare a variable where you will be saving the name.\n" +
                    "2. Use the method getText() to get the name entered by the user in our EditText.\n" +
                    "3. Convert it to a string by using the method toString() and save it to the variable.\n" +
                    "4. Concatenate it to the set of string you wanted to add. For example, “Welcome _____ to the university.”\n" +
                    "5. Lastly, display it on the TextView by using the setText() method.\n\n" +
                    "go.setOnClickListener(new View.OnClickListener() {\n" +
                    "@Override\n" +
                    "public void onClick(View view) {\n\n" +
                    "String txtName;\n\n" +
                    "txtName= name.getText().toString();\n\n" +
                    "display.setText(\"Welcome \"+txtName+\" to the\n" +
                    "university!\");\n" +
                    "}\n" +
                    "});"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_java);
        javaView = findViewById(R.id.javaView);
        getSupportActionBar().hide();

        AddJava.CustomAdapter customAdapter = new AddJava.CustomAdapter();
        javaView.setAdapter(customAdapter);
        javaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    Intent intent5 = new Intent(AddJava.this, AddJavaInfo.class);
                    intent5.putExtra("desc5",javaDesc[position]);
                    startActivity(intent5);
                }else {
                    Intent intent5 = new Intent(AddJava.this, AddJavaInfo.class);
                    intent5.putExtra("desc5", javaDesc[position]);
                    intent5.putExtra("image5", javaImages[position]);
                    startActivity(intent5);
                }
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {return javaDesc.length;}

        @Override
        public Object getItem(int position) {return null;}

        @Override
        public long getItemId(int position) {return 0;}

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view2 = getLayoutInflater().inflate(R.layout.java_list, null);

            TextView jname = view2.findViewById(R.id.javaView1);

            jname.setText(javaNames[position]);
            return view2;
        }
    }
}