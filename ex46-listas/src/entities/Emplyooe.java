package entities;

public class Emplyooe {
    private Integer id;
    private String name;
    private Double salary;

    public Emplyooe(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increasySalary(double porcent) {
        salary  +=  salary * porcent / 100;
    }

    public String toString(){
        return id+ ", " + name + ", " + String.format(String.valueOf(salary));
    }
}
