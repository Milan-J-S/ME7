package m.me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMe extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        setTitle("About Me");

    }

    public void onskillTap(View v) {
        Intent intents = new Intent(this, Skills.class);
        startActivity(intents);
    }
}
