package fr.istef.cw1719.myapplicationbootstrap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HelloActivity extends AppCompatActivity {
    EditText inputNom;
    private static final String TAG = "HelloActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inputNom = findViewById(R.id.textName);

    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG,"HelloWorld");

    }


    // Get the Intent that started this activity and extract the string
    //Intent intent = getIntent();
    //String message = "Jackard le gueu !";

    // Capture the layout's TextView and set the string as its text
    // textView = findViewById(R.id.textView3);
    //textView.setText("Jackard le gueu !");
    public boolean onCreateOptionsMenu(Menu menu){
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    public void onComposeAction(MenuItem mi) {
        // handle click here
        finish();
    }

    public void afficherNom(View view) {
        String text = this.inputNom.getText().toString();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(getApplicationContext(), text, duration);
        toast.show();

    }
}
