package pack.fade;

public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;

    }

    public String getName(){
        return name;

    }

    public Integer getAge(){
        return age;

    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name){
        this.name = name;

    }
    public void setAge(Integer age){
        this.age = age;

    }
    public void sayHelloTo(Person person){
        System.out.println("Hi " + person.getName() + "!");

    }
}
