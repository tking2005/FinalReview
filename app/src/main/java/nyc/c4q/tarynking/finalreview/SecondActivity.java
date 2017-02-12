package nyc.c4q.tarynking.finalreview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        NavigationAdapter navigationAdapter = new NavigationAdapter();
        recyclerView.setAdapter(navigationAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
