public class Employee extends Person {
    public String name;

    public Employee(String name) {
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println("Имя компании "+name);
    }

}
