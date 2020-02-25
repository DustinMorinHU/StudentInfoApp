package com.example.student;

import java.io.Serializable;

public class Student implements Serializable {
    private String mStudentName;
    private int mStudentId;

    public String getStudentName(){
        return mStudentName;
    }
    public void setStudentName(String mStudentName){
        this.mStudentName = mStudentName;
    }
    public int getStudentId(){
        return mStudentId;
    }
    private void setStudentId(int mStudentId){
        this.mStudentId = mStudentId;
    }
    public Student(String studentName, int studentId){
        mStudentName = studentName;
        mStudentId = studentId;
    }
}
