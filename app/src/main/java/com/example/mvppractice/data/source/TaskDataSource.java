package com.example.mvppractice.data.source;

import com.example.mvppractice.data.Task;

public interface TaskDataSource {

    interface GetTaskCallBack{

        void onTaskLoad(Task task);
    }

    void getTask(GetTaskCallBack callBack);//3
}
