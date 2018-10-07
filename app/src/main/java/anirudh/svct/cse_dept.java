package anirudh.svct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cse_dept extends AppCompatActivity {
       Button b,b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_dept);
        b=(Button)findViewById(R.id.profile_cse);
        b1=(Button)findViewById(R.id.laboratories_cse);
        b2=(Button)findViewById(R.id.faculty_cse);
        b3=(Button)findViewById(R.id.syllabus_cse);
        b4=(Button)findViewById(R.id.circulars_cse);
        b5=(Button)findViewById(R.id.contact_cse);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(cse_dept.this,cse_profile.class);
                startActivity(i1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(cse_dept.this,cse_laboratories.class);
                 startActivity(i2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(cse_dept.this,cse_faculty.class);
                startActivity(i3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(cse_dept.this,cse_syllabus.class);
                startActivity(i4);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(cse_dept.this,cse_circulars.class);
                startActivity(i5);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(cse_dept.this,cse_contact.class);
                startActivity(i6);
            }
        });

    }
}
