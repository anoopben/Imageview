package anoop.com.image;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView firstimage = (ImageView) findViewById(R.id.imageView);

        int imageResourse = getResources().getIdentifier("@drawable/and",null,this.getPackageName());
        firstimage.setImageResource(imageResourse);
    }
}
