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

public class CompoList extends AppCompatActivity {
    ListView compolistView;

    String[] compoNames = {"BUTTONS","TEXTFIELD","DIALOGS"};
    String[] compoDesc = {"BUTTONS\nTYPES\n\n" +
            "1. Text buttons are typically used for less-pronounced actions, including those located:\n\n" +
            "Sample Code:\n" +
            "<Button\n" +
            "android:id=\"@+id/textButton\"\n" +
            "android:layout_width=\"wrap_content\"\n" +
            "android:layout_height=\"wrap_content\"\n" +
            "android:text=\"TEXT BUTTON\"\n" +
            "style=\"@style/Widget.MaterialComponents.Button.TextButton\"/>\n\n" +
            "Image of the Sample Design:",
            "TEXTFIELD\n" +
                    "TYPES\n\n" +
                    "1. Filled text fields have more visual emphasis than outlined text fields, making them stand out when surrounded by other content and components.\n" +
                    "\nSample Code:\n" +
                    "<com.google.android.material.textfield.TextInputLayout\n" +
                    "android:id=\"@+id/filledTextField\"\n" +
                    "android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:hint=\"@string/label\">\n" +
                    "\n" +
                    "<com.google.android.material.textfield.TextInputEditText\n" +
                    "android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"wrap_content\" />\n" +
                    "</com.google.android.material.textfield.TextInputLayout>\n" +
                    "\nImage of the Sample Design:",
            "DIALOGS\n" +
                    "TYPES\n\n" +
                    "1. Alert dialogs interrupt users with urgent information, details, or actions.\n" +
                    "\nSample Code:\n" +
                    "MaterialAlertDialogBuilder(context)\n" +
                    ".setTitle(resources.getString(R.string.title)) \n" +
                    ".setMessage(resources.getString(R.string.supporting_text)) \n" +
                    ".setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->\n" +
                    "// Respond to neutral button press\n" +
                    "}\n" +
                    ".setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->\n" +
                    "// Respond to negative button press\n" +
                    "}\n" +
                    ".setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->\n" +
                    "// Respond to positive button press\n" +
                    "}\n" +
                    ".show()\n" +
                    "\nImage of the Sample Design:"};
    String[] compoDesc1 = {"2. Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.\n" +
            "\nSample Code:\n" +
            "<Button\n" +
            "android:id=\"@+id/outlinedButton\"\n" +
            "android:layout_width=\"wrap_content\"\n" +
            "android:layout_height=\"wrap_content\"\n" +
            "android:text=\"OUTLINED BUTTON\"\n" +
            "style=\"?attr/materialButtonOutlinedStyle\"/>\n\n" +
            "Image of the Sample Design:",
            "2. Outlined text fields have less visual emphasis than filled text fields. When they appear in places like forms, where many text fields are placed together, their reduced emphasis helps simplify the layout.\n" +
                    "\nSample Code:\n" +
                    "<com.google.android.material.textfield.TextInputLayout\n" +
                    "android:id=\"@+id/outlinedTextField\"\n" +
                    "android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"wrap_content\"\n" +
                    "android:hint=\"@string/label\"\\n\n" +
                    "style=\"@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox\">\n" +
                    "\n" +
                    "<com.google.android.material.textfield.TextInputEditText\n" +
                    "android:layout_width=\"match_parent\"\n" +
                    "android:layout_height=\"wrap_content\"/>\n" +
                    "\n" +
                    "</com.google.android.material.textfield.TextInputLayout>\n\n" +
                    "Image of the Sample Design:",
            "2. Simple dialogs can display items that are immediately actionable when selected. They don’t have text buttons.\n" +
                    "As simple dialogs are interruptive, they should be used sparingly. Alternatively, dropdown menus provide options in a non-modal, less disruptive way.\n" +
                    "\nSample Code:\n" +
                    "val items = arrayOf(\"Item 1\", \"Item 2\", \"Item 3\")\n" +
                    "\n" +
                    "MaterialAlertDialogBuilder(context)\n" +
                    ".setTitle(resources.getString(R.string.title))\n" +
                    ".setItems(items) { dialog, which ->\n" +
                    "// Respond to item chosen\n" +
                    "}\n" +
                    ".show()\n\n" +
                    "Image of the Sample Design:"};
    String[] compoDesc2 = {"3. Contained Buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.\n" +
            "\nSample Code:\n" +
            "<Button\n" +
            "android:id=\"@+id/containedButton\"\n" +
            "android:layout_width=\"wrap_content\"\n" +
            "android:layout_height=\"wrap_content\"\n" +
            "android:text=\"BUTTON\"/>\n\n" +
            "Image of the Sample Design:",

            "",

            "3. Confirmation dialogs give users the ability to provide final confirmation of a choice before committing to it, so they have a chance to change their minds if necessary. \n" +
                    "If the user confirms a choice, it’s carried out. Otherwise, the user can dismiss the dialog. For example, users can listen to multiple ringtones but only make a final selection upon tapping “OK.”\n" +
                    "\nSample Code:\n" +
                    "val singleItems = arrayOf(\"Item 1\", \"Item 2\", \"Item 3\")\n" +
                    "val checkedItem = 1\n" +
                    "\n" +
                    "MaterialAlertDialogBuilder(context) \n" +
                    ".setTitle(resources.getString(R.string.title)) \n" +
                    ".setNeutralButton(resources.getString(R.string.cancel)) { dialog, which -\n" +
                    "// Respond to neutral button press\n" +
                    "}\n" +
                    ".setPositiveButton(resources.getString(R.string.ok)) { dialog, which ->\n" +
                    "// Respond to positive button press\n" +
                    "}\n" +
                    "// Single-choice items (initialized with checked item) \n" +
                    ".setSingleChoiceItems(singleItems, checkedItem) { dialog, which ->\n" +
                    "// Respond to item chosen\n" +
                    "}\n" +
                    ".show()\n" +
                    "For multiple choice items you can do as follows: \n" +
                    "val multiItems = arrayOf(\"Item 1\", \"Item 2\", \"Item 3\")\n" +
                    "val checkedItems = booleanArrayOf(true, false, false, false)\n" +
                    "\n" +
                    "MaterialAlertDialogBuilder(context) \n" +
                    "... \n" +
                    "//Multi-choice items (initialized with checked items) \n" +
                    ".setMultiChoiceItems(multiItems, checkedItems) { dialog, which, checked ->\n" +
                    "// Respond to item chosen\n" +
                    "}\n" +
                    ".show()\n\n" +
                    "Image of the Sample Design:"};
    String[] compoDesc3 = {"",

            "",

            "4. Full-screen dialogs group a series of tasks, such as creating a calendar entry with the event title, date, location, and time. Because they take up the entire screen, full-screen dialogs are the only dialogs over which other dialogs can appear. \n\n" +
            "There is no specific Material implementation of a full-screen dialog. You can implement it by using a DialogFragment."};
    int[] compoImages = {R.drawable.txtbtn,R.drawable.ftxtfield,R.drawable.alimg};
    int[] compoImages1 = {R.drawable.otlbtn,R.drawable.otltxtfield,R.drawable.simimg};
    int[] compoImages2 = {R.drawable.fbtn,R.drawable.zample,R.drawable.conimg};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compo_list);
        compolistView = findViewById(R.id.compolistView);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        compolistView.setAdapter(customAdapter);
        compolistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent4 = new Intent(CompoList.this, MatInfo.class);
                    intent4.putExtra("desc4", compoDesc[0]);
                    intent4.putExtra("descx1", compoDesc1[0]);
                    intent4.putExtra("descx2", compoDesc2[0]);
                    intent4.putExtra("imagex", compoImages[0]);
                    intent4.putExtra("imagex1", compoImages1[0]);
                    intent4.putExtra("imagex2", compoImages2[0]);
                    startActivity(intent4);
                }else if(position == 1) {
                    Intent intent4 = new Intent(CompoList.this, MatInfo.class);
                    intent4.putExtra("desc4", compoDesc[1]);
                    intent4.putExtra("descx1", compoDesc1[1]);
                    intent4.putExtra("imagex", compoImages[1]);
                    intent4.putExtra("imagex1", compoImages1[1]);

                    startActivity(intent4);
                }else{
                    Intent intent4 = new Intent(CompoList.this, MatInfo.class);
                    intent4.putExtra("desc4", compoDesc[2]);
                    intent4.putExtra("descx1", compoDesc1[2]);
                    intent4.putExtra("descx2", compoDesc2[2]);
                    intent4.putExtra("descx3", compoDesc3[2]);
                    intent4.putExtra("imagex", compoImages[2]);
                    intent4.putExtra("imagex1", compoImages1[2]);
                    intent4.putExtra("imagex2", compoImages2[2]);
                    startActivity(intent4);
                }
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return compoNames.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.compo1_list, null);

            TextView componame = view1.findViewById(R.id.compoView);
            componame.setText(compoNames[position]);

            return view1;
        }
    }
}