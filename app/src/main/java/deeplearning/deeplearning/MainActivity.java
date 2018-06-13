package deeplearning.deeplearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get value form string file/ get anything from resouce folder
        // change android to project get all files click to app ->build ->>source -> r ->debug -> select package -> r file there everything find r.layout/string/color everything
        String message = getString(R.string.hello_world);

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
