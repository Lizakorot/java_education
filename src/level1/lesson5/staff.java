package level1.lesson5;


public class staff {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public staff (String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //public void setAge(int age) {
      //  this.age = age;
    //}

    @Override
    public String toString() {
        return "staff{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
