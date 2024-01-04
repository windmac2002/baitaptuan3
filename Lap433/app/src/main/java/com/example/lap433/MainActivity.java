package com.example.lap433;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact=findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1=new Contact("mac quang phong", "0346896698", "RED");
        Contact contact2=new Contact("phong dep trai", "0346895698", "RED");
        Contact contact3=new Contact("phong xau trai", "0123456789", "GREEN");
        Contact contact4=new Contact("mac phong", "0547846845","gdghd");
        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);
        arrContact.add(contact4);

        CustomAdapter adapter=new CustomAdapter(this, R.layout.item_listview, arrContact);
        lvContact.setAdapter(adapter);

    }
}