public abstract class Person {
    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    public void sayHello(){
        System.out.println("Ciao, sono "+name+" "+surname+" e ho "+age+" anni");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}


