public class Person {
public String name;
public String surname;
public int age;

public Person(String name, String surname, int age)
 {
    this.name = name;
    this.surname = surname;
    this.age = age;
 }

 public void printPerson() {
    System.out.println("Name: " + name + "\n" + "Surname: " + surname + "\n" + "Age: " + age + "\n" + "-------------------");
 }
}
