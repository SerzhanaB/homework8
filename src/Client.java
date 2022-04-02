public class Client extends Person{
    public String name;
    @Override
    public void print( ){
        System.out.println("Имя клиента "+name);
    }
    public Client(String name){
        this.name=name;

    }


}
