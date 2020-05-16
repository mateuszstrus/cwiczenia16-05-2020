class Employee {             // klasa bazowa pracownik
    private String name;
    private String lastname;
    private String pesel;
    private double salary;

    public Employee(String name, String lastname, String pesel, double salary) {     //konstruktor
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
        this.salary = salary;
    }

    String getName() {
        return (name);
    }

    String getLastname() {
        return (lastname);
    }

    String getPesel() {
        return (pesel);
    }

    double getSalary() {
        return (salary);
    }

    public void setName(String name, String lastname, String pesel, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
        this.salary = salary;
    }

    public String toString(){
        return "Klasa Employee";
    }
}

class Boss extends Employee {
    private double bonus;

    public Boss(String name, String lastname, String pesel, double salary) {
        super(name, lastname, pesel, salary);
        bonus = 0;

    }
        double getBonus()
        {
            return(bonus);
        }

        public void setBonus(double b)
        {
            this.bonus = b;

        }

    public String toString(){
        return "Klasa Boss";
    }

}

class Manager extends Employee{
    private int overtime;

    public Manager(String name, String lastname, String pesel, double salary){
        super(name, lastname, pesel, salary);
        overtime = 0;
    }

    double getOvertime()
    {
        return(overtime);
    }

    public void setOvertime(int o)
    {
        this.overtime = o;

    }
    public String toString(){
        return "Klasa Menager";
    }


}

class Intern extends Employee {
    public Intern(String name, String lastname, String pesel, double salary) {
        super(name, lastname, pesel, salary);
    }
}


public class Firma {
    public static void main(String args[]){



        //test gita


        Employee employee = new Employee("Adrian", "Kowalski", "12345678985", 3500.65);
        System.out.println(employee.toString());
        System.out.println(employee.getName()+" "+employee.getLastname()+" "+employee.getPesel()+" "+employee.getSalary()+" zł ");


        Boss boss = new Boss("Andrzej","Myć", "12345678996", 9000);
        boss.setBonus(498.63);
        System.out.println(boss.toString());
        System.out.println(boss.getName()+" "+boss.getLastname()+" "+boss.getPesel()+" "+boss.getSalary()+" zł "+" + " +boss.getBonus()+" zł ");

        Manager manager = new Manager("Tomasz","Lis", "12345678996", 6000);
        manager.setOvertime(5);
        System.out.println(manager.toString());
        System.out.println(manager.getName()+" "+manager.getLastname()+" "+manager.getPesel()+" "+manager.getSalary()+" zł "+manager.getOvertime()+"h ");


    }
}





