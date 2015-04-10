package com.dealfaro.luca.lclicker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Code additions created by Mat Fukano - mfukano@ucsc.edu - 4/8/15
     */

    /*
        On button press, appends text from button to string from
        text field and returns the string
     */
    public void clickButton(View v) {
        Button b = (Button) v;
        String t = b.getText().toString();
        EditText tv = (EditText) findViewById(R.id.editText);
        String out = tv.getText().toString();
        out += t;
        tv.setText(out);
    }

    /*
        Outputs substring of size original_string - 1
     */
    public void delNumber(View v) {
        EditText tv = (EditText) findViewById(R.id.editText);
        if (tv.getText() != null){
            String out = tv.getText().toString();
            if(out.length() > 0)
                out = out.substring(0, out.length() - 1);
            tv.setText(out);
        }
    }

    /*
        Clears text field view
     */
    public void clrNumber(View v) {
        EditText tv = (EditText) findViewById(R.id.editText);
        tv.setText("");
    }


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

}
