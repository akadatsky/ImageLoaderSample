package net.mobindustry.testimageloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.list);
        adapter = new ImageAdapter(this);
        listView.setAdapter(adapter);
        setupButtons();
    }

    private void setupButtons() {

        final List<String> images = Arrays.asList(getResources().getStringArray(R.array.images));

        findViewById(R.id.addView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addAll(images);
            }
        });

        findViewById(R.id.clearView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageLoaderHelper.clearCache();
                adapter.clear();
            }
        });

    }

}
