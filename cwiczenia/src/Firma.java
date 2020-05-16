import java.lang.reflect.Member;
import java.util.Arrays;



class Employee {             // klasa bazowa pracownik
    private String name;
    private String lastname;
    private String pesel;
    private double salary;

    public Employee(String name, String lastname, String pesel, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.pesel = pesel;
        this.salary = salary;
    }

    String getName()
    {
        return (name);
    }

    String getLastname()
    {
        return (lastname);
    }

    String getPesel()
    {
        return (pesel);
    }

    double getSalary()
    {
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

    //Tworzymy nową klasę Boss, gdzie odwołuje się do klasy bazowej Employee i otrzymuje swoja prywatną zmienną.
    //Konstruktor odwołuje się do klasy bazowej i pobiera zmienne stałe : name, lastname, pesel, salary.
    //Funkcja super() służy do wywoływania konstruktorów klasy nadrzędnej (tej, z której dziedziczymy) o podanych parametrach,

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

    public String toString()
    {
        return "Klasa Boss";
    }

}

class Manager extends Employee{
    private int overtime;

    public Manager(String name, String lastname, String pesel, double salary) {
        super(name, lastname, pesel, salary);
        overtime = 0;

    }
        double getOvertime ()

        {
            return (overtime);
        }

        public void setOvertime ( int o)
        {
            this.overtime = o;

        }

    public String toString()
    {
        return "Klasa Menager";
    }


}


class Intern implements Comparable<Intern> {   //na potrzeby zadania 2

    private String imie;

    private String nazwisko;

    private int iloscgodzin;

    public Intern(String imie, String nazwisko, int iloscgodzin) {

        this.imie = imie;

        this.nazwisko = nazwisko;

        this.iloscgodzin = iloscgodzin;

    }



    public int compareTo(Intern obiekt) {

        if(nazwisko.compareTo(obiekt.nazwisko) == 0)
            if(imie.compareTo(obiekt.imie) == 0)
                return iloscgodzin - obiekt.iloscgodzin;
            else
                return imie.compareTo(obiekt.imie);
            else
                return nazwisko.compareTo(obiekt.nazwisko);

    }


    public String toString() {

        return (nazwisko + " " + imie + " " + iloscgodzin);

    }

}


public class Firma {
    public static void main(String args[]){


        Intern[] interns = new Intern[6];

        interns[0] = new Intern("Marek", "Kowalski", 4);

        interns[1] = new Intern("Jacek", "Kowalski", 3);

        interns[2] = new Intern("Iwona", "Nowak", 8);

        interns[3] = new Intern("Marta", "Nowak", 1);

        interns[4] = new Intern("Adam", "Dynks", 2);

        interns[5] = new Intern("Marek", "Kowal", 9);

        Arrays.sort(interns);

         for (Intern st: interns){

            System.out.println(st);

        }

        Employee o1 = new Employee("Adrian", "Kowalski", "12345678985", 3500.65);
        Employee o2 = new Boss("Andrzej", "Myć", "12345678996", 9000);
        Employee o3 = new Manager("Tomasz", "Lis", "12345678996", 6000);

        System.out.println(o1.toString());
        System.out.println(o1.getName()+" "+o1.getLastname()+" "+o1.getPesel()+" "+o1.getSalary()+" zł ");

        ((Boss) o2).setBonus(498.63);
        System.out.println(o2.toString());
        System.out.println(o2.getName()+" "+o2.getLastname()+" "+o2.getPesel()+" "+o2.getSalary()+" zł "+" + " + ((Boss) o2).getBonus()+" zł ");


        ((Manager) o3).setOvertime(5);
        System.out.println(o3.toString());
        System.out.println(o3.getName()+" "+o3.getLastname()+" "+o3.getPesel()+" "+o3.getSalary()+" zł "+ ((Manager) o3).getOvertime()+"h ");

    }

 
}





