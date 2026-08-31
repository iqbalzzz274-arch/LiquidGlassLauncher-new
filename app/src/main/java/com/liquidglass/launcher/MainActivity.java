package com.liquidglass.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Liquid Glass Launcher");
        textView.setTextSize(24);
        textView.setGravity(17);

        setContentView(textView);
    }
}
