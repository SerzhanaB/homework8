public class Client extends Person{
    public String name;
    Season season;
    @Override
    public void print( ){
        System.out.println("Имя клиента "+name);
    }
    public Client(String name, Season season){
        this.name=name;
        this.season =season;
    }


    @Override
    public void printSeason() {
        System.out.println("Клиент " + name+ " Сезон "+this.season +"; Цвет сезона " +this.season.getColor());

    }
}
