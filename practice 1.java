public class Puppy {
    int puppyAge;
 
    public Puppy(String name) {
       // This constructor has one parameter, name.
       System.out.println("Name :" + name );
    }
 
    public void setAge( int age ) {
       puppyAge = age;
    }
 
    public int getAge( ) {
       System.out.println("age  :" + puppyAge );
       return puppyAge;
    }
 
    public static void main(String []args) {
       /* Object creation */
       Puppy myPuppy = new Puppy( "Raihan Rafiq" );
 
       /* Call class method to set puppy's age */
       myPuppy.setAge( 18 );
 
       /* Call another class method to get puppy's age */
       myPuppy.getAge();
 
       /* You can access instance variable as follows as well */
       System.out.println("Variable Value :" + myPuppy.puppyAge );
    }
 }

/* looping WHILE */

 public class Perulangan_While {
    
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Masukkan Kata yang ingin di Ulang/Loop : ");
       String kata = sc.next();
       int i = 0; //Inisialisasi batas dasar
       while(i < 10){
           System.out.println(kata);
           i+=2;//Faktor pengulang Increment
       }
   }
   
}

/* looping FOR */
public class Perulangan_For {
    
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      
       System.out.print("Masukkan berapa banyak kata ingin di Ulang/Loop : ");
       int banyak =  sc.nextInt();
       
       System.out.print("Masukkan Kata yang ingin di Ulang/Loop : ");
       String kata = sc.next();
       
       for (int i = 0; i <= banyak; i++) {
           System.out.println(kata);
       }
   }
   
}

/* looping if-else */
package percabangan;
public class Percabangan {
    public static void main(String[] args) {
        int x=3;
        if(x==1){
            System.out.println("nilai x = 1");
        }
        else if(x==2){
            System.out.println("nilai x = 2");
        }else if(x==3){
            System.out.println("nilai x = 3");
        }else{
            System.out.println("nilai x tidak diketahui");
        }
    }
}