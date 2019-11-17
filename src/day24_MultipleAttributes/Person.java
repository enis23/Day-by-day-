package day24_MultipleAttributes;

public class Person {
    String firstname="Techno";
    String lastname="Study";
    int age=6;

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.firstname);
        System.out.println(person.lastname);
        System.out.println(person.age);
        System.out.println("Name: "+ person.firstname+person.lastname);
    }
}
