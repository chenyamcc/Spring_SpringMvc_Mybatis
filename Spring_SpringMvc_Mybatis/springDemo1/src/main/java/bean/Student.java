package bean;

import java.util.List;
import java.util.Map;

/**
 * @author chenyam
 * @title: Student
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/10 下午 9:18
 */
public class Student {
    private int id;
    private String name;
    private List<String> nums;
    private List<Grade> grades;
    private Map<String,String> address;
    private Map<String,Grade> gradeMap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNums() {
        return nums;
    }

    public void setNums(List<String> nums) {
        this.nums = nums;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }

    public Map<String, Grade> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<String, Grade> gradeMap) {
        this.gradeMap = gradeMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nums=" + nums +
                ", grades=" + grades +
                ", address=" + address +
                ", gradeMap=" + gradeMap +
                '}';
    }
}
