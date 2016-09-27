package m.me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WhyAnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_and);
        setTitle("Why Android?");
    }

    public void onDreamTap(View v)
    {
        Intent intentd = new Intent (this,Dream.class);
        startActivity(intentd);
    }
}
