package bean;

/**
 * @author chenyam
 * @title: Grade
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/10 下午 9:19
 */
public class Grade {
    private int id;
    private String course;
    private int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
