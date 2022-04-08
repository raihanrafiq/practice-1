/* inheritance */

class Mamalia{
 String nama;
 String jenis;
 int umur;

 public Mamalia(String nama, String jenis, int umur){
  this.nama = nama;
  this.jenis = jenis;
  this.umur = umur;
 }

 public String Bernafas(){
  return "Hewan ini Bernafas menggunakan paru-paru";
 }

 public String Menyusui(){
  return "Hewan ini Menyusui anaknya";
 }

 public String Info(){
  return "Nama :"+ this.nama + "\nJenis :" + this.jenis +"\numur :" + this.umur;
 }
}

class Kucing extends Mamalia{
 public Kucing(String nama, String jenis, int umur){
  super(nama,jenis,umur);
 }
}

public class Keturunan{
 public static void main(String[] args) {
  System.out.println("Tes Inheritance");
  System.out.println();
  Kucing meong = new Kucing("Meong","Persia",4);
  System.out.println(meong.Info());
  System.out.println(meong.Bernafas());
  System.out.println(meong.Menyusui());
 }
}

/* overriding */
//Superclass
class hewan{
   
    String jenis;
    int umur;
    
    //Konstruktor dengan Parameter pada Class Hewan
    public hewan(String jenis, int umur){
        //Variable jenis dan umur Mendapatkan Nilai dari Parameter
        this.jenis = jenis;
        this.umur = umur;
    }
    
    String getJenis(){
        return jenis;
    }
    int getUmur(){
        return umur;
    }
}

//Subclass/Kelas Anak
public class karnivora extends hewan{
    
    String jenis = "Anjing";
    int umur = 5;
    
    public karnivora(String jenis, int umur) {
        //Mengalihkan Nilai pada Konstruktor hewan
        super("Domba", 7);
    }
    
    public static void main(String[] args){
        karnivora data = new karnivora("",0); //Beri Nilai Default
        System.out.println("==== Mengambil Nilai Dari Class Hewan ========");
        data.getData();

        System.out.println("==== Mengambil Nilai Dari Class Karnivora ====");
        //Menjalankan 2 Buah Method yang Terdapat pada Subclass (Tanpa super)
        System.out.println("Jenis Hewan: "+data.getJenis());
        System.out.println("Usia Hewan: "+data.getUmur());
    }
    
    void getData(){
        //Menjalankan 2 Buah Method yang Terdapat pada Superclass (super)
        System.out.println("Jenis Hewan: "+super.getJenis());
        System.out.println("Usia Hewan: "+super.getUmur());
    }
    
    String getJenis(){
        return jenis;
    }
    int getUmur(){
        return umur;
    }
}

/* polymorphism */

/* File name : Employee.java */
public class Employee {
   private String name;
   private String address;
   private int number;

   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }

   public void mailCheck() {
      System.out.println("Mailing a check to " + this.name + " " + this.address);
   }

   public String toString() {
      return name + " " + address + " " + number;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String newAddress) {
      address = newAddress;
   }

   public int getNumber() {
      return number;
   }
}

/* File name : Salary.java */
public class Salary extends Employee {
   private double salary; // Annual salary
   
   public Salary(String name, String address, int number, double salary) {
      super(name, address, number);
      setSalary(salary);
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName()
      + " with salary " + salary);
   }
   
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double newSalary) {
      if(newSalary >= 0.0) {
         salary = newSalary;
      }
   }
   
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}

/* File name : VirtualDemo.java */
public class VirtualDemo {

   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      System.out.println("Call mailCheck using Salary reference --");   
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}
