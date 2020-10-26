package Serialize;

import java.io.Serializable;

public class Student implements Serializable {

    private String stuName;
    private String stuNum;

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuNum='" + stuNum + '\'' +
                '}';
    }

    public Student(String stuName, String stuNum) {
        this.stuName = stuName;
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }
}
