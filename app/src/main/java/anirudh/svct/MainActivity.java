package anirudh.svct;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1,b2,b3,b4,b5,b6,b7,b8;

        b1=(Button)findViewById(R.id.ece_dept);
        b2=(Button)findViewById(R.id.eee_dept);
        b3=(Button)findViewById(R.id.it_dept);
        b4=(Button)findViewById(R.id.mec_dept);
        b5=(Button)findViewById(R.id.auto_dept);
        b6=(Button)findViewById(R.id.acaademics_id);
        b7=(Button)findViewById(R.id.international_id);
        b8=(Button)findViewById(R.id.contact_us_id);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,About_us.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(MainActivity.this,Departments.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(MainActivity.this,Campus_life.class);
                startActivity(i3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(MainActivity.this,Student_Login.class);
                startActivity(i4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(MainActivity.this,Placement_and_Training.class);
                startActivity(i5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(MainActivity.this,Academics.class);
                startActivity(i6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(MainActivity.this,International_Relationships.class);
                startActivity(i7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8=new Intent(MainActivity.this,Contact_us.class);
                startActivity(i8);
            }
        });


    }

}
