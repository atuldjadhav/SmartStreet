package sjsu.smarty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnMapClick(View v)
    {
        if (v.getId()==R.id.MapButton)
        {
            Intent i=new Intent(MainActivity.this,MapsActivity.class);
            startActivity(i);
        }


    }
    public void OnAboutClick(View v)
    {
        if (v.getId()==R.id.AboutButton)
        {
            Intent i=new Intent(MainActivity.this,Barcode.class);
            startActivity(i);
        }

    }



}
