package nyc.c4q.tarynking.finalreview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button LoginButton;
    Button LogoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton = (Button) findViewById(R.id.login_button);
        LogoutButton = (Button) findViewById(R.id.logout_button);



        // Capture button clicks
        LoginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Toast.makeText(view.getContext(),"login clicked",Toast.LENGTH_SHORT).show();
                // Start NewActivity.class
                Intent myIntent = new Intent(getApplicationContext(),
                        SecondActivity.class);
//                myIntent.putExtra("user","Taryn");
                startActivity(myIntent);
            }
        });

        LogoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        SplashScreen.class);
                startActivity(myIntent);
            }
        });
    }
}
