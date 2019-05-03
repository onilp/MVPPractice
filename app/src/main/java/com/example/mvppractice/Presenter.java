package com.example.mvppractice;

import com.example.mvppractice.data.Task;
import com.example.mvppractice.data.source.TaskDataSource;
import com.example.mvppractice.data.source.local.LocalDataSource;

public class Presenter implements Contract.Presenter, TaskDataSource.GetTaskCallBack {
    Contract.View view;
    TaskDataSource dataSource;

    public Presenter(MainActivity mainActivity) {
        view = mainActivity;
        dataSource = new LocalDataSource();

    }

    @Override
    public void buttonClicked() { //2
        dataSource.getTask(this);

        //view.showAToast("Trying...");

    }

    @Override
    public void onTaskLoad(Task task) {
        view.showAToast(task.getTaskTitle() + task.getTaskDetails()); //6

    }
}
