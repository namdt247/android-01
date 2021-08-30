package com.example.android02.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private List<ContactModel> listContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initData();

        lvContact = (ListView)findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContact, this);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ContactModel contactModel = listContact.get(position);
                Toast.makeText(MainActivity.this, contactModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        ContactModel contact = new ContactModel("Nguyen Van A", "0987654321", R.drawable.ic_avatar1);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van B", "0987654322", R.drawable.ic_avatar2);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van C", "0987654323", R.drawable.ic_avatar3);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van D", "0987654324", R.drawable.ic_avatar4);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van E", "0987654325", R.drawable.ic_avatar1);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van F", "0987654326", R.drawable.ic_avatar2);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van G", "0987654327", R.drawable.ic_avatar3);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van H", "0987654328", R.drawable.ic_avatar4);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van I", "0987654329", R.drawable.ic_avatar1);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van K", "0987654330", R.drawable.ic_avatar2);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van L", "0987654331", R.drawable.ic_avatar3);
        listContact.add(contact);
        contact = new ContactModel("Nguyen Van M", "0987654332", R.drawable.ic_avatar4);
        listContact.add(contact);
    }
}