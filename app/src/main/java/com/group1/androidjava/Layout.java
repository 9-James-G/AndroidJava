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

public class Layout extends AppCompatActivity {
    ListView layoutView;
    String[] layoutNames = {"LINEAR LAYOUT & SCROLLVIEW","RELATIVE LAYOUT","CONSTRAINT LAYOUT"};
    String[] layoutDesc = {"LINEAR LAYOUT & SCROLLVIEW\n\nLinearLayout is a subclass of ViewGroup that arranges the child View elements in one direction. It can be vertical or horizontal. This direction is initialized in the View attribute called android:orientation.\n\nAll the controls inside this layout are called child elements. There are instances that all the child elements cannot fit on our LinearLayout. This is the time we use the ScrollView. It lets the user scroll up, down, left or right in order for them to see other elements that is not initially visible.",

            "RELATIVE LAYOUT\n\nRelativeLayout is a subclass of ViewGroup where the position of the child elements are specified in relation to its parent or to the other child elements. The following are the positioning views available when using RelativeLayout.\n\nAttributes:\n\n" +
                    "layout_alignParentTop - If it specified “true”, the top edge of view will match the top edge of the parent.\n\n" +
                    "layout_alignParentBottom - If it specified “true”, the bottom edge of view will match the bottom edge of parent. \n\nlayout_alignParentLeft - If it specified “true”, the left edge of view will match the left edge of parent.\n\n" +
                    "layout_alignParentRight - If it specified “true”, the right edge of view will match the right edge of the parent. \n\nlayout_centerInParent - If it specified “true”, the view will be aligned to the centre of parent.\n\n" +
                    "layout_centerHorizontal - If it specified “true”, the view will be horizontally centre aligned within its parent. \n\nlayout_centerVertical - If it specified “true”, the view will be vertically centre aligned within its parent. \n\nlayout_above -  It accepts another sibling view id and places the view above the specified view id." +
                    "\n\nlayout_below - It accepts another sibling view id and places the view below the specified view id.\n\n" +
                    "layout_toLeftOf - It accepts another sibling view id and places the view left of the specified view id. " +
                    "\n\nlayout_toRightOf - It accepts another sibling view id and places the view right of the specified view id. \n\nlayout_toStartOf - It accepts another sibling view id and places the view to start of the specified view id. \n\nlayout_toEndOf - It accepts another sibling view id and places the view to the end of the specified view id. ",

            "CONSTRAINT LAYOUT\n\nConstraintLayout is a layout with similarities with the previously discussed RelativeLayout. This is because the positioning of the controls are in relation to its Parent layout or sibling view. In the contrary, it is more flexible than RelativeLayout and easier to use when using the layout editor of Android Studio.\n\n" +
                    "Defining the position of a view or control in ConstraintLayout needs at least 2 constraints- one vertical and one horizontal. If the controls do not have any constraints, they will all be displayed at the top left corner of the display screen also known as position [0,0]. Guidelines and barrier can be utilized in this layout. It will act as your guide in positioning your controls inside the ConstraintLayout."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        layoutView = findViewById(R.id.layoutView);

        getSupportActionBar().hide();

        Layout.CustomAdapter customAdapter = new Layout.CustomAdapter();
        layoutView.setAdapter(customAdapter);
        layoutView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(getApplicationContext(), LayoutInfo.class);
                intent2.putExtra("desc2",layoutDesc[position]);
                startActivity(intent2);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return layoutDesc.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.layout_list, null);

            TextView layname = view1.findViewById(R.id.layoutView1);

            layname.setText(layoutNames[position]);
            return view1;
        }
    }
}