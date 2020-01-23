package ir.ohmysaeed.mylib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.ohmysaeed.toasting.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.s(this, "Hello");
        Toaster.l(this, "Hello 2");
    }
}
