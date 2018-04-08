package sergei.com.superandroidproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import java.time.Instant;

import sergei.com.superandroidproject.LayoutACTIVITYS.Constraint;
import sergei.com.superandroidproject.LayoutACTIVITYS.Frame;
import sergei.com.superandroidproject.LayoutACTIVITYS.Linear;
import sergei.com.superandroidproject.LayoutACTIVITYS.Relative;
import sergei.com.superandroidproject.LayoutACTIVITYS.Table;

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

        findViewById(R.id.btn_relative_layout).setOnClickListener(v->{
           // bundle.putString("Title", "Relative");
           //Intent intentR = ;
           startActivity(
                   new Intent(this, Relative.class).putExtra("Title", "Relative")
           );
        });

        findViewById(R.id.btn_frame_layout).setOnClickListener(v->{
            startActivity(
                    new Intent(this, Frame.class).putExtra("Title", "Frame")
            );
        });

        findViewById(R.id.btn_table_layout).setOnClickListener(v->{
            startActivity(new Intent(this, Table.class).putExtra("Title","Table"));
        });

        findViewById(R.id.btn_constraint_layout).setOnClickListener(v->{
            startActivity(new Intent(this, Constraint.class).putExtra("Title", "ConstraintLogin"));
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
