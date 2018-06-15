package deeplearning.deeplearning;

import android.app.DialogFragment;
import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btndialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btndialog = findViewById(R.id.btndialog);

        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAdd();
            }
        });

    }

 private void showDialogAdd() {

        FragmentDialog dialog = new FragmentDialog();
        dialog.show(getSupportFragmentManager(), "Add");
    }
}
