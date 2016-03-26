package com.ecnu.leondu.readingschedule.datamodal;

import java.io.Serializable;

/**
 * Created by LeonDu on 3/20/16.
 */
public class BookBaseClass implements Serializable {

    // serial ID
    private static final long serialVersionUID = -8308495951608334221L;
    private long taskID;

    public BookBaseClass(long taskID) {
        this.taskID = taskID;
    }

    public long getTaskID() {
        return taskID;
    }

    public void setTaskID(long taskID) {
        this.taskID = taskID;
    }
}
