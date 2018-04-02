package sergei.com.superandroidproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;

import java.time.Instant;

import sergei.com.superandroidproject.Linear.Linear;

public class LayoutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        ActionBar abar = getSupportActionBar();
        if (abar != null) {
            abar.setHomeButtonEnabled(true);
            abar.setDisplayHomeAsUpEnabled(true);
        }
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String message = bundle.getString("Title");
        this.setTitle(message);
        Button btnActivityLinear = findViewById(R.id.btn_linear_layout);

        btnActivityLinear.setOnClickListener(v -> {
            Intent intents = new Intent(this, Linear.class);
            //TextView textView = findViewById(R.id.btn_linear_layout);
            String text = btnActivityLinear.getText().toString();
            bundle.putString("Title", text);
            intents.putExtras(bundle);
            startActivity(intents);
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
