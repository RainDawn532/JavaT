package jiepu.Java.homework.Day15.test01;

/**
 * @author lnh
 * @date 2021年06月20日 14:00
 */
public class Teacher {
    private String  name;
    private  double salary;


    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Teacher() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
