package sergei.com.superandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String message = bundle.getString("Title");
        this.setTitle(message);

    }
}
