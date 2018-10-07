package anirudh.svct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Departments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button b1=(Button)findViewById(R.id.cse_dept);
        Button b2=(Button)findViewById(R.id.civil_dept);
        Button b3=(Button)findViewById(R.id.ece_dept);
        Button b4=(Button)findViewById(R.id.eee_dept);
        Button b5=(Button)findViewById(R.id.it_dept);
        Button b6=(Button)findViewById(R.id.mec_dept);
        Button b7=(Button)findViewById(R.id.auto_dept);
        Button b8=(Button)findViewById(R.id.has_dept);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Departments.this,cse_dept.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Departments.this,civil_dept.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Departments.this,ece_dept.class);
                startActivity(i3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Departments.this,eee_dept.class);
                startActivity(i4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(Departments.this,it_dept.class);
                startActivity(i5);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(Departments.this,mec_dept.class);
                startActivity(i6);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(Departments.this,auto_dept.class);
                startActivity(i7);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8=new Intent(Departments.this,has_dept.class);
                startActivity(i8);
            }
        });


    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
