package com.example.broadexplicit;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ExampleReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText( context, "ExampleReceiver triggered", Toast.LENGTH_SHORT ).show();
    }
}
