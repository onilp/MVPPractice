package com.example.mvppractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Contract.View{

    Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);
    }

    public void clickHandler(View view) {
        presenter.buttonClicked(); //1

    }

    @Override
    public void showAToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
