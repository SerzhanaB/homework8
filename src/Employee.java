public class Employee extends Person {
    public String name;
    Season season;

    public Employee(String name,Season season) {
        this.name = name;
        this.season =season;
    }
    @Override
    public void print(){
        System.out.println("Имя компании "+name);
    }

    @Override
    public void printSeason() {
        System.out.println("компания " + name+ " Сезон "+this.season +"; Цвет сезона " +this.season.getColor());

    }
}
