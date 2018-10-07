package anirudh.svct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Campus_life extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_life);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button hostel=(Button)findViewById(R.id.hostels);
        Button sport=(Button)findViewById(R.id.sports);
        Button transport=(Button)findViewById(R.id.transport);
        Button gym=(Button)findViewById(R.id.gym);

        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Campus_life.this,hostel_life.class);
                startActivity(i1);
            }
        });
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Campus_life.this,sports_life.class);
                startActivity(i2);
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Campus_life.this,transport_life.class);
                startActivity(i3);
            }
        });
        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Campus_life.this,gym_life.class);
                startActivity(i4);
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
