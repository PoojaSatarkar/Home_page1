package com.example.homepage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnsubmit;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView lefticon = findViewById(R.id.left_icon);
        ImageView righticon = findViewById(R.id.right_icon);
        TextView title = findViewById(R.id.toolbar_title);

        lefticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked in left icon", Toast.LENGTH_SHORT).show();
            }
        });
        righticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenu(view);
            }
        });


    }
    private void showMenu(View v){
        PopupMenu popupMenu=new PopupMenu(MainActivity.this,v);
        popupMenu.getMenuInflater().inflate(R.menu.pop_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if(menuItem.getItemId() ==R.id.setting)
                    Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                if(menuItem.getItemId() ==R.id.share)
                    Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();
                if(menuItem.getItemId() ==R.id.logout)
                    Toast.makeText(MainActivity.this, "logout", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        popupMenu.show();



    }
    }
