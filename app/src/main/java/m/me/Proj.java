package m.me;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Proj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proj);
        setTitle("Projects");

    }

    public void onWATap(View v)
    {
        Intent intentw = new Intent (this,WhyAnd.class);
        startActivity(intentw);
    }


}
