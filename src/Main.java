import Task4.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Abdukadir", 20, "Manager", 23000, 1000);
        Person person2 = new Person("Samara", 21, "Teacher", 25000, 800);
        Person person3 = new Person("Sydyk", 24, "Manager", 30000, 900);
        Person person4 = new Person("Mahabat", 19, "Stylist", 20000, 600);
        Person person5 = new Person("Aman", 25, "Consultant", 28000, 590);
        Person[] people = {person1, person2, person3, person4, person5};

        Person hightestSalary = people[0];
        Person lowestSalary = people[0];
        Person expensivePhone = people[0];

        for(Person person : people){
            person.showInfo();
            System.out.println("**********");

            if(person.getSalary() > hightestSalary.getSalary()){
                hightestSalary = person;
            }else if(person.getSalary() < lowestSalary.getSalary()){
                lowestSalary = person;
            }else if(person.getPhone() > expensivePhone.getPhone()){
                expensivePhone = person;
            }
        }
        System.out.println("The hightest salary have: " );
        hightestSalary.showInfo();
        System.out.println("The lowest salary have: " );
        lowestSalary.showInfo();
        System.out.println("The expensive phone have: " );
        expensivePhone.showInfo();


    }
}