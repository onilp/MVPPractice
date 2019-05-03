package com.example.mvppractice;

public interface Contract {

    interface View{
        void showAToast(String message);
    }

    interface Presenter{

        void buttonClicked();
    }
}
