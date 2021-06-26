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

public class AndroidOS extends AppCompatActivity {

    ListView verslistView;
    String[] versNames = {"Android 1.0","Android 1.1","Android 1.5","Android 1.6","Android 2.0-2.1","Android 2.2","Android 2.3",
            "Android 3.0", "Android 4.0","Android 4.1-4.3","Android 4.4","Android 5.0","Android 6.0","Android 7.0",
            "Android 8.0","Android 9.0","Android 10","Android 11"};
    String[] versDesc = {"  Android 1.0 - released to the public in September 2008 without a codename.",
            "      Android 1.1 - released in February 2009 which also does not have a codename publicly but was named after a French dessert “Petit four“ during its development at Google.",
            "      Android 1.5 – released in April 2009 and had the first public codename of Cupcake. In this version, auto-rotate and support for third-party keyboards was added in addition to the uploading of videos to Youtube which was not present on the first two versions.",
            "      Android 1.6 – released in September 2009 with the codename Donut. This version supported Code Division Multiple Access (CDMA) based networks and introduced the quick search box and toggling.",
            "      Android 2.0-2.1 – released in October 2009 with the codename Éclair. The key features added to this version includes the text-to-speech support, usage of multiple accounts, live wallpapers, and Google Maps navigation.",
            "      Android 2.2 – released in May 2010 with the codename Froyo, or Frozen Yogurt. Mobile hotspot, flash support and more were included in this version.",
            "      Android 2.3 – released in September 2010 with the codename Gingerbread. This version supported the use of near field communication and multiple cameras.",
            "      Android 3.0 – first introduced in February 2011 with the codename Honeycomb which was released and can be used only on devices with larger screens such as tablets.",
            "      Android 4.0 – released in October 2011 with the codename Ice Cream Sandwich. The combination of Gingerbread and Honeycomb features was seen in this version. There were key features added such as notification dismissal using swipe gestures and data usage monitoring.",
            "      Android 4.1-4.3 – started the release in June 2012 for the 4.1 with the codename Jelly Bean. It displayed more content in addition to the action buttons included in the notification. It was then followed by 4.2 and 4.3 which was released in October 2012 and July 2013 respectively.",
            "      Android 4.4 – officially released in September 2013 with a codename trademarked by Nestle, KitKat. The key feature of this version is the optimization of the operating system that allowed it to run on devices with a random access memory of 512 MB.",
            "      Android 5.0 – released in November 2014 with the codename Lollipop. The first version that used material design language of Google. It also included the support for dual sim, high definition voice calls and more.",
            "      Android 6.0- released in October 2015 with the codename Marshmallow. The in-app permissions were included in this version allowing the permissions to be enabled only when it is needed. Another feature added is the support for Android Pay and Do Not Disturb functionality.",
            "      Android 7.0- released in August 2016 with the codename Nougat. Multi-tasking through the use of split-screen is added, as well as, displaying information on the lock screen.",
            "      Android 8.0- released in August 2017 with a codename Oreo. It has a lot of changes in its appearance such as the dimming of navigation buttons when it is not in use and light and dark themes.",
                    "      Android 9.0- released in August 2018 with the codename Pie. It used machine learning for battery management in connection to frequently used mobile applications." ,
                    "      Android 10- released in September 2019 and the first version to not use a dessert as its codename. It supported foldable phones and added Live Caption, tool for adding captions upon detecting speech.",
                    "      Android 11- released on September 2020 with an improved notifications for the messaging or chat applications as well as tighter permissions."};
    int[] versImages = {R.drawable.android, R.drawable.android1, R.drawable.android2, R.drawable.android3, R.drawable.android4,R.drawable.android5,
            R.drawable.android6, R.drawable.and7, R.drawable.and8, R.drawable.android9, R.drawable.android10,
            R.drawable.android11, R.drawable.android12, R.drawable.android13, R.drawable.oreooo,R.drawable.android15,R.drawable.android16,R.drawable.android17};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_o_s);

        verslistView = findViewById(R.id.verslistView);

        getSupportActionBar().hide();

        CustomAdapter customAdapter = new CustomAdapter();
        verslistView.setAdapter(customAdapter);
        verslistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intentv = new Intent(AndroidOS.this, ListdataActivity.class);
                intentv.putExtra("descv",versDesc[position]);
                intentv.putExtra("imagev1",versImages[position]);
                startActivity(intentv);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return versImages.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.items1, null);

            TextView abname = view1.findViewById(R.id.versView);
            ImageView imagex = view1.findViewById(R.id.versImage);

            abname.setText(versNames[position]);
            imagex.setImageResource(versImages[position]);
            return view1;
        }
    }
}