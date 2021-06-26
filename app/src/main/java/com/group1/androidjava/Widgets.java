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

public class Widgets extends AppCompatActivity {
    ListView listView1;
    String[] widgetNames = {"ATTRIBUTES & UNITS","TEXTVIEW","EDITTEXT","BUTTON","IMAGEVIEW", "IMAGEBUTTON","CHECKBOX","RADIOBUTTON & RADIO GROUP"};
    String[] widgetDesc = {"ATTRIBUTES & UNITS\n\nWidgets, also known as UI controls, are controls which users can use to interact with the mobile application. It can be buttons or text fields. As future IT professionals, " +
            "these controls will be your friend in building mobile applications that will be used by millions of people.\nAll the controls that will be mentioned in this app, have the fundamental attributes namely layout_width and layout_height. " +
            "\n\nThese attributes commonly have the values match_parent or wrap_content. The value match_parent gets the size of the parent container of the control while wrap_content depends its size on the element inside the control.\nIn some cases, " +
            "these sizes can be modified depending on the requirement. Other than the values mentioned above, you can use values with the following units: dp, in, mm, pt, px, and sp. (eg. 100dp, 175in)",

            "TEXTVIEW\n\nTextView is used to display text in the screen of the mobile device. In the picture above, the container that holds the string “CodeInsider” is a TextView. You can modify the size and color of the displayed text using the attribute textColor and textSize respectively.\n\nCode Snippet for TextView:\n\n" +
                    "<TextView\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:text=\"CodesInsider\"\n" +
                    "android:textColor=”#000”\n" +
                    "android:textSize=\"10sp\" />" +
                    "\n\nImage of the Sample Output:",

            "EDITTEXT\n\nEditText is used to get an input from the user. It can be a text, number, a combination of the two, password and more. In the example given, the Name and Address are both EditText. The labels that are placed inside the EditText are called hints.\n\nCode Snippet for EditText:\n\n" +
                    "<EditText\n" +
                    "android:layout_width=\"250dp\"\n" +
                    "android:layout_height=\"50dp\"\n" +
                    "android:hint=\"Name: (LN, FN MI)\" />\n\n" +
                    "<EditText\n" +
                    "android:layout_width=\"250dp\"\n" +
                    "android:layout_height=\"50dp\"\n" +
                    "android:hint=\"Address (NO. STREET, CITY MUN., PROVINCE)\" />" +
                    "\n\nImage of the Sample Output:",

            "BUTTON\n\nButton is used to perform an action or function upon clicking. In the example given, “REGISTER” is a button that can be clicked by the user after filling up the button, onClick attribute is used while the value is needed in our java files.\n\nCode Snippet for Button:\n\n" +
                    "<Button\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:onClick=\"btnRegister\"\n" +
                    "android:text=\"REGISTER\"/>" +
                    "\n\nImage of the Sample Output:",

            "IMAGEVIEW\n\nImageView is used to display an image resource. It can be a png, jpg, and other image resource files.\n\nCode Snippet for ImageView:\n\n" +
                    "<ImageView\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:src=\"@drawable/logo\"/>" +
                    "\n\nImage of the Sample Output:",

            "IMAGEBUTTON\n\nImageButton is simply a button with an image inside of the control instead of a text. The attribute src is used to reference an image file and onClick for its function.\n\nCode Snippet for ImageButton:\n\n" +
                    "<ImageButton\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:src=\"@drawable/logo\"\n" +
                    "android:onClick=”btnImage”/>" +
                    "\n\nImage of the Sample Output:",

            "CHECKBOX\n\nCheckbox can be used for selecting one or more in a given set of choices. It can be checked or unchecked depending on the user requirements. It can be pre-defined by using the attribute checked with a value of either true or false.\n\nCode Snippet for Checkbox:\n\n" +
                    "<CheckBox\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:text=\"Apple\"\n" +
                    "android:checked=\"true\"/>\n\n" +
                    "<CheckBox\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:text=\"Mango\"\n" +
                    "android:checked=\"false\"/>\n\n" +
                    "<CheckBox\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:text=\"Orange\"\n" +
                    "android:checked=\"false\"/>" +
                    "\n\nImage of the Sample Output:",

            "RADIOBUTTON & RADIOGROUP\n\nRadioButton is much like a checkbox. It can be selected or unselected upon clicking. On the other hand, if multiple RadioButtons are inside a single RadioGroup, it will only allow 1 RadioButton to be selected at a time.\n\nCode Snippet for RadioButton and Radio Group:\n\n" +
                    "<RadioGroup\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\">\n\n" +
                    "<RadioButton\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:text=\"JAVA\"/>\n\n" +
                    "<RadioButton\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:text=\"PHP\"/>\n\n" +
                    "<RadioButton\n" +
                    "android:layout_width=\"wrap_content\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:text=\"C++\"/>\n" +
                    "</RadioGroup>" +
                    "\n\nImage of the Sample Output:"};

        int[] widimages ={R.drawable.zample,R.drawable.tvimg,R.drawable.edtimg,R.drawable.btnwid,R.drawable.imvimg,R.drawable.imbtnimg,R.drawable.chkimg,R.drawable.rrgimg};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        listView1 = findViewById(R.id.listView1);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        listView1.setAdapter(customAdapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent1 = new Intent(getApplicationContext(), Extra.class);
                    intent1.putExtra("desc1", widgetDesc[position]);
                    startActivity(intent1);
                }else{
                    Intent intent1 = new Intent(getApplicationContext(), WidgetsInfo.class);
                    intent1.putExtra("wid", widimages[position]);
                    intent1.putExtra("desc1", widgetDesc[position]);
                    startActivity(intent1);
                }
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return widgetDesc.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.widget_list, null);

            TextView name1 = view1.findViewById(R.id.textView1);


            name1.setText(widgetNames[position]);

            return view1;
        }
    }
}