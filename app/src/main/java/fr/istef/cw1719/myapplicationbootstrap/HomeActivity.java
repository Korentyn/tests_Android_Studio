package fr.istef.cw1719.myapplicationbootstrap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "fr.istef.cw1719.myapplicationbootstrap";
    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void afficheToast(View v){
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();
    }

    /** Called when the user taps the Send button */
    public void goHelloActivity(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
        //String message = "Que trépa si je faiblie";
        //intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);

    }

    public boolean onCreateOptionsMenu(Menu menu){
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    public void onComposeAction(MenuItem mi) {
        // handle click here
        finish();
    }

}
