package embedded.kookmin.ac.kr.lab3_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button btweb;
    Button btdail;
    Button btpic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btweb = (Button) findViewById(R.id.bt_1);
        btdail = (Button) findViewById(R.id.bt_2);
        btpic = (Button) findViewById(R.id.bt_3);

        btweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                Uri u = Uri.parse("http://google.com");
                i.setData(u);
                startActivity(i);
            }
        });

        btdail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-6275-3445"));
                startActivity(d);
            }
        });
        btpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.fromFile(new File("/sdcard/test.jpg"));
                p.setDataAndType(uri, "image/jpeg");
                startActivity(p);
            }
        });

    }
}

