package sergei.com.superandroidproject.LayoutACTIVITYS;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageSwitcher;

import sergei.com.superandroidproject.R;

public class Frame extends AppCompatActivity {
    private ImageSwitcher mImageSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mImageSwitcher = findViewById(R.id.frame_image_swither);

        mImageSwitcher.setOnClickListener( v -> {
            mImageSwitcher.showNext();
        });
    }



}
