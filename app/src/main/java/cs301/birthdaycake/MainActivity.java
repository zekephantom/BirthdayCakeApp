package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity{
//implements View.OnClickListener,SeekBar.OnSeekBarChangeListener{

        private Button GOODBYE;
        private Button BLOWOUT;
        private SeekBar SEEKBAR;

        @Override
        protected void onCreate (Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        GOODBYE = (Button) findViewById(R.id.goodbye);
        BLOWOUT = (Button) findViewById(R.id.blowout);
        SEEKBAR = (SeekBar) findViewById(R.id.numCandles);
        }

        public void goodbye (View button){
            Log.i("button", "Goodbye");

        }
}
