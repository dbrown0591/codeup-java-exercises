public class Person {
    private String name;
//
//    public Person(String name){
//        this.name = name;
//    }
    // returns the person's name
    public String getName() {

        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){

        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + this.name + " how are you?");
    }


    public static void main(String[] args){
        Person person1 = new Person();
        person1.getName();
        person1.setName("Damion");
        System.out.println(person1.getName());
        person1.sayHello();
        Person person2 = new Person();
        person2.setName("Joe");
        person2.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

    }
}
