package freddy.parkingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import freddy.parkingapp.welcome.WelcomeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class);
        startActivity(welcomeIntent);
    }
}
