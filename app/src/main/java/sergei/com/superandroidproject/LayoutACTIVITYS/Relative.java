package sergei.com.superandroidproject.LayoutACTIVITYS;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import sergei.com.superandroidproject.R;

public class Relative extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Relative");

    }

}
