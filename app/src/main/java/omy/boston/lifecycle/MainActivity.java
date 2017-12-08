package omy.boston.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qLog("CREATE");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        qLog("START");
    }

    /**Metoda za povratak podataka**/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        qLog("Zabilježena je metoda - onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        qLog("RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        qLog("PAUSE");
    }

    /**Spremanje podataka**/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        qLog("Zabilježena je metoda - onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        qLog("STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        qLog("DESTROY");
    }

    //Pračenje loga
    private void qLog(String logTekst){
        Log.d("napravi Log", logTekst);
    }
}
