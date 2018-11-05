package com.ismailhakkiaydin.keyevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        switch (keyCode){
            case KeyEvent.KEYCODE_B:
                this.setTitle("Button B");
                break;
            case KeyEvent.KEYCODE_Z:
                this.setTitle("Button Z");
                break;
            case KeyEvent.KEYCODE_VOLUME_UP:
                this.setTitle("Volume Up");
                break;
            case KeyEvent.KEYCODE_TAB:
                this.setTitle("TAB ");
                Log.e("csd", "Click TAB");
                break;
        }
        return  super.onKeyDown(keyCode, event);
    }

}
