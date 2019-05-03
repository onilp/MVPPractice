package com.example.mvppractice.data.source.local;

import com.example.mvppractice.data.Task;
import com.example.mvppractice.data.source.TaskDataSource;

public class LocalDataSource implements TaskDataSource {
    @Override
    public void getTask(GetTaskCallBack callBack) { //3a

        Task task = new Task("rjt","apolis");
        callBack.onTaskLoad(task); //4
    }
}
