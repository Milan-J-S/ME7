package m.me;

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

    public void onaboutTap(View v)
    {
        Intent intent = new Intent(this,AboutMe.class);
        startActivity(intent);
    }

    public void onskillTap(View v)
    {
        Intent intents = new Intent(this,Skills.class);
        startActivity(intents);
    }

    public void onExpTap(View v)
    {
        Intent intente = new Intent (this,Proj.class);
        startActivity(intente);
    }

    public void onAchTap(View v)
    {
        Intent intenta = new Intent (this,Achieve.class);
        startActivity(intenta);
    }

    public void onWATap(View v)
    {
        Intent intentw = new Intent (this,WhyAnd.class);
        startActivity(intentw);
    }

    public void onDreamTap(View v)
    {
        Intent intentd = new Intent (this,Dream.class);
        startActivity(intentd);
    }


}
