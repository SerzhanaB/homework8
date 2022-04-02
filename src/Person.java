public abstract class Person implements Printable{
    public String name;
    @Override
    public void print(){
        System.out.println("Имя человека "+name);
    }
}
