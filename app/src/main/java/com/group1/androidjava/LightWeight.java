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

public class LightWeight extends AppCompatActivity {
    ListView lightlistView;

    String[] lightNames = {"SHARED PREFERENCES","BYTES"};
    String[] lightDesc = {"SHARED PREFERENCES\n\nShared Preferences allows activities and applications to keep preferences, in the form of key-value pairs similar to a Map that will persist even when the user closes the application.\n" +
            "\n" +
            "To get access to the preferences, we have three APIs to choose from:\n" +
            "• getPreferences() : used from within your Activity,to access activity-specific preferences.\n" +
            "• getSharedPreferences() : used from within your Activity (or other application Context), to access application-level preferences.\n" +
            "• getDefaultSharedPreferences() : used on the PreferenceManager, to get the shared preferences that work in concert with Android’s overall preference framework\n" +
            "\n" +
            "In this phase we’ll go getSharedPreferences(). The method is defined as follow:\n" +
            "getSharedPreferences(String Pref_name, int mode) \n" +
            "\n" +
            "Pref_name is the name of shared preferences file.\n" +
            "\n" +
            "Mode is the operating modes of the shared preferences.\n" +
            "\n" +
            "Following are the operating modes applicable:\n" +
            "• MODE_PRIVATE: the default mode, where the created file can only be accessed by the calling application.\n" +
            "• MODE_WORLD_READABLE: Creating world-readable files is very dangerous, and likely to cause security holes in applications.\n" +
            "• MODE_WORLD_WRITEABLE: Creating world-writable files is very dangerous, and likely to cause security holes in applications.\n" +
            "• MODE_MULTI_PROCESS: This method will check for modification of preferences even if the Shared Preference instance has already been loaded.\n" +
            "• MODE_APPEND: This will append the new preferences with the already existing preferences\n" +
            "• MODE_ENABLE_WRITE_AHEAD_LOGGING: Database open flag. When it is set, it would enable write ahead logging by default.\n" +
            "\n" +
            "Initialization\n" +
            "\n" +
            "We need an editor to edit and save the changes in shared preferences. The following codecan be used to get the shared preferences.\n" +
            "\n" +
            "SharedPreferences sharedPref = getApplicationContext().getSharedPreferences(\"MyPref\", MODE_PRIVATE);\n" +
            "Editor editor = sharedPref.edit();\n" +
            "\n" +
            "Storing Data\n" +
            "\n" +
            "editor.commit() is used in order to save changes to shared preferences.\n" +
            "editor.putBoolean(\"key_name\", true);\n" +
            "// Storing boolean - true/false\n" +
            "editor.putString(\"key_name\", \"string value\");\n" +
            "// Storing string\n" +
            "editor.putInt(\"key_name\", int value);\n" +
            "// Storing integer\n" +
            "editor.putFloat(\"key_name\", float value);\n" +
            "// Storing float\n" +
            "editor.putLong(\"key_name\", long value); //\n" +
            "Storing long\n" +
            "editor.commit(); // commit changes\n" +
            "\n" +
            "Retrieving Data\n" +
            "\n" +
            "Data can be retrieved from saved preferences by calling getString() as follows:\n" +
            "\n" +
            "pref.getString(\"key_name\", null);\n" +
            "// getting String\n" +
            "pref.getInt(\"key_name\", -1);\n" +
            "// getting Integer\n" +
            "pref.getFloat(\"key_name\", null);\n" +
            "// getting Float\n" +
            "pref.getLong(\"key_name\", null);\n" +
            "// getting Long\n" +
            "pref.getBoolean(\"key_name\", null);\n" +
            "// getting boolean\n" +
            "key_name is the field name of the shared preferences.\n" +
            "\n" +
            "Clearing and Deleting Data\n" +
            "\n" +
            "remove(“key_name”) is used to delete that particular value.\n" +
            "\n" +
            "editor.remove(\"name\"); // will delete key name\n" +
            "editor.remove(\"email\"); // will delete key email\n" +
            "\n" +
            "editor.commit(); // commit changes\n" +
            "\n" +
            "clear() is used to remove all data\n" +
            "\n" +
            "editor.clear();\n" +
            "editor.commit(); // commit changes\n",

            "BYTES\n" +
                    "\n" +
                    "Bytes is the storage of the private data on the device memory. By default, saving and loading files to the internal storage are private to the application and other applications will not have access to these files. When the user uninstalls the applications the internal stored files associated with the application are also removed. However, note that some users root their Android phones, gaining super user access. These users will be able to read and write whatever files they wish.\n" +
                    "\n" +
                    "Android offers openFileInput and openFileOutput from the Java I/O classes to modify reading and writing streams from and to local files.\n" +
                    "\n" +
                    "openFileOutput(): This method is used to create and save a file. Its syntax is given below:\n" +
                    "\n" +
                    "FileOutputStream variable_name = openFileOutput(\"filename\",Context.MODE_PRIVATE);\n" +
                    "\n" +
                    "filename is the name of the byte file in the internal storage. Example: StudentInfo.byte.\n" +
                    "\n" +
                    "The method openFileOutput() returns an instance of FileOutputStream. After that we can call write method to write data on the file. Its syntax is given below:\n" +
                    "\n" +
                    "String str = \"test data\";\n" +
                    "\n" +
                    "variable_name.write(str.getBytes());\n" +
                    "\n" +
                    "variable_name.close();\n" +
                    "\n" +
                    "You need to declare the close() method to end the writing process.\n" +
                    "\n" +
                    "openFileInput(): This method is used to open a file and read it. It returns an instance of FileInputStream. Its syntax is given below:\n" +
                    "\n" +
                    "FileInputStream fin = openFileInput(“filename”);\n" +
                    "\n" +
                    "After that, we call read method to read one character at a time from the file and then print it. Its syntax is given below:\n" +
                    "\n" +
                    "int c;\n" +
                    "\n" +
                    "String temp=\"\";\n" +
                    "\n" +
                    "while( (c = fin.read()) != -1){\n" +
                    "temp = temp + Character.toString((char)c);\n" +
                    "}\n" +
                    "fin.close();\n" +
                    "In the above code, string temp contains all the data of the file.\n" +
                    "Note that these methods do not accept file paths (e.g. path/to/file.txt), they just take simple file names.\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_weight);
        lightlistView = findViewById(R.id.lightlistView);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        lightlistView.setAdapter(customAdapter);
        lightlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentli = new Intent(LightWeight.this , LightInfo.class);
                intentli.putExtra("descli",lightDesc[position]);

                startActivity(intentli);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return lightDesc.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.light_list, null);

            TextView lightname = view1.findViewById(R.id.lightView);


            lightname.setText(lightNames[position]);

            return view1;
        }
    }
}