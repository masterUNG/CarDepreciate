package appewtc.masterung.cardepreciate;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;


public class MainActivity extends ActionBarActivity {

    //Explicit
    private EditText edtPrice, edtDep;
    private SeekBar yearSeekBar;
    private ListView myListView;

    private int intSeekBar = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //SeekBar Controller
        yearSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                intSeekBar = progress/5;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Log.d("poy", "endSeekBar = " + Integer.toString(intSeekBar));

            }
        });

    }   // onCreate

    private void bindWidget() {
        edtPrice = (EditText) findViewById(R.id.edtPrice);
        edtDep = (EditText) findViewById(R.id.edtDep);
        yearSeekBar = (SeekBar) findViewById(R.id.seekBarYear);
        myListView = (ListView) findViewById(R.id.mylistView);
    }   //bindWidget


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}   // Main Class
