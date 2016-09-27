package m.me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Skills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        setTitle("Skills");

    }

    public void onExpTap(View v)
    {
        Intent intente = new Intent (this,Proj.class);
        startActivity(intente);
    }

}
