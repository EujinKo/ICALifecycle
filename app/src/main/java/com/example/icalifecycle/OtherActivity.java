package com.example.icalifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OtherActivity extends AppCompatActivity {

//    static List<String> shoppingList = new ArrayList<String>(Arrays.asList(
//            "one","two","three","Four","five","six","seven","eight","nine","ten"
//    ));


    static String[] shoppingList = new String[]{"strawberry","banana","cat","grape"};

    static int[] shoppingListImages = new int[]{
            R.drawable.banana,R.drawable.strawberry,R.drawable.cat,R.drawable.grape
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

    /*
        //TODO: ArrayAdapter
        ListView shoppingListView = findViewById(R.id.shopping_list_view);



        //Set up ArrrayAdpater filled with strings in ArrayList
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.shopping_list_row,R.id.shopping_list_row_item, shoppingList);

        shoppingListView.setAdapter(arrayAdapter);

     */

    /*
        //TODO: SimpleAdapter
        //Set up SimpleAdapter filled with image, strings
        List<HashMap<String, String>> aList =
                new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < shoppingListImages.length; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("image", Integer.toString(shoppingListImages[i])+"");
            hm.put("shopping_list_row_text", shoppingList[i]);
            aList.add(hm);
        }

        String[] from = {"image", "text"};
        int[] to = {R.id.shopping_list_row_image, R.id.shopping_list_row_text};

        SimpleAdapter simpleAdapter =
                new SimpleAdapter(getBaseContext(), aList,
                        R.layout.shopping_list_row, from, to);

        ListView shoppingListView = (ListView) findViewById(R.id.shopping_list_view);
        shoppingListView.setAdapter(simpleAdapter);


     */
    }
}
