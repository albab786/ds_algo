package com.practise.oops;

public class School {
    int totalNoStudent;
    String name;
    String classTecaher;
    School(){
//        this.totalNoStudent=0;
//        this.name="";
//        this.classTecaher="";
    }
    School(int noOfStudent,String naam,String teacher){
        totalNoStudent=noOfStudent;
        name=naam;
        classTecaher=teacher;
    }
    School(String name,String classTecaher){
        this.name=name;
        this.classTecaher=classTecaher;
    }


}
