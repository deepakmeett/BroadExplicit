package com.example.broadexplicit;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        textView = findViewById( R.id.text );
        button = findViewById( R.id.buttonPanel );
        
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(  );
                ComponentName componentName = new ComponentName( "com.example.broadcastexplicit2", "com.example.broadcastexplicit2.ExplicitBroadcast2");
                intent.setComponent( componentName );
                sendBroadcast( intent );
            }
        } );
    }
}
