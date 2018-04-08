package sergei.com.superandroidproject.LayoutACTIVITYS;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import sergei.com.superandroidproject.R;

public class Constraint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle(getIntent().getExtras().getString("Title"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
