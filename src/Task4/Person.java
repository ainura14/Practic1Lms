package Task4;

public class Person {
    String name;
    int age;
    String work;
    int salary;
    int phone;
    public Person(){}

    public Person(String name, int age, String work, int salary, int phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }
    public void showInfo(){
        System.out.println(String.format("""
                Name: %s
                Age: %d
                Work: %s
                Salary: %d
                Price of phone: %d
                """, name, age, work, salary, phone)
        );
    }
    public int getSalary(){
        return salary;
    }
    public int getPhone(){
        return phone;
    }
}
