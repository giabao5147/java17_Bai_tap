package com.company;
//Quan ly sinh vien version 1 - 1 lop doi tuong
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

	    Student bao = new Student(14540246, "Tran Gia Bao", 9, 8, 10);
        Student tuan = new Student(16580286, "Nguyen Anh Tuan", 3, 7, 2);
        Student nam = new Student(18578352, "Nguyen Tien Nam", 8, 9, 5);
        Student newStudent = new Student();

        studentList.add(bao);
        studentList.add(tuan);
        studentList.add(nam);
        newStudent.nhapSV();    //Nhap vao thong tin sinh vien
        studentList.add(newStudent);
        for (Student student : studentList) {   //Xuat danh sach sinh vien
            System.out.println(student.xuatSV());
        }

    }
}
