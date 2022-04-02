public class Main {
    public static void main(String[] args) {
Client Client1= new Client("Robert",Season.Spring );
Client Client2= new Client("Victoria",Season.Autumn );
Client1.print();
Employee Emp1= new Employee("Яблоко", Season.Winter);
Employee Emp2= new Employee("Летуаль", Season.Summer);
Emp1.print();

Emp1.printSeason();
Emp2.printSeason();
Client1.printSeason();
Client2.printSeason();


    }
}
