package anirudh.svct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eee_dept extends AppCompatActivity {
    Button b,b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_dept);
        b=(Button)findViewById(R.id.profile_eee);
        b1=(Button)findViewById(R.id.laboratories_eee);
        b2=(Button)findViewById(R.id.faculty_eee);
        b3=(Button)findViewById(R.id.syllabus_eee);
        b4=(Button)findViewById(R.id.circulars_eee);
        b5=(Button)findViewById(R.id.contact_eee);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(eee_dept.this,eee_profile.class);
                startActivity(i1);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(eee_dept.this,eee_laboratories.class);
                startActivity(i2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(eee_dept.this,eee_faculty.class);
                startActivity(i3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(eee_dept.this,eee_syllabus.class);
                startActivity(i4);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(eee_dept.this,eee_circulars.class);
                startActivity(i5);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(eee_dept.this,eee_contact.class);
                startActivity(i6);
            }
        });

    }
}
