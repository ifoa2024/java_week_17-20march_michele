public class Teacher extends Person {
    public String subject;

    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age);
        this.subject = subject;
    }

    public void sayHello() {
        System.out.println("Ciao, sono " + name + " " + surname + " e insegno " + subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //i metodi getOggetto e setOggetto sono stati aggiunti per poter utilizzare la variabile subject anche se la rendiamo privata.

    
}
