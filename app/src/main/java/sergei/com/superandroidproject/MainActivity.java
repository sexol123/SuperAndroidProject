package sergei.com.superandroidproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;


public class MainActivity extends AppCompatActivity {



    public static final String EXTRA_MESSAGE = "Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnActivityLayouts = findViewById(R.id.btn_layouts);
        Button btnActivityButtons = findViewById(R.id.btn_buttons);
        Button btnActivityTexts = findViewById(R.id.btn_text);


        btnActivityButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                Bundle bundle = new Bundle();
                TextView textview = findViewById(R.id.btn_buttons);
                String message = textview.getText().toString();
                bundle.putString("Title",message);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btnActivityLayouts.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, LayoutActivity.class);
            Bundle bundle = new Bundle();
            TextView textview = findViewById(R.id.btn_layouts);
            String message = textview.getText().toString();
            bundle.putString("Title",message);
            intent.putExtras(bundle);
            startActivity(intent);
        });

        btnActivityTexts.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            Bundle bundle = new Bundle();
            TextView textView = findViewById(R.id.btn_text);
            String text = textView.getText().toString();
            bundle.putString("Title", text);
            intent.putExtras(bundle);


            startActivity(intent);
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }





}
