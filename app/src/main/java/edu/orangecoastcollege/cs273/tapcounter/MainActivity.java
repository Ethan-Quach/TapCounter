package edu.orangecoastcollege.cs273.tapcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // something something comment

    Counter counter = new Counter();
    TextView countTextView;
    Button tapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = (TextView) findViewById(R.id.countTextView);
        tapButton = (Button) findViewById(R.id.tapButton);
        tapButton.setOnClickListener(tapClickListener);
    }

    View.OnClickListener tapClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            counter.increment();
            countTextView.setText(Integer.toString(counter.getCount()));
        }
    };

}
