import java.util.Scanner; // Import the Scanner class

public class Example07{

    public static void main(String[] args){

/** // Extra testing XD
  
    try {

        System.out.println("what your age HEHE!");

        Scanner Obj = new Scanner(System.in); // Create a Scanner object    

        int age = Obj.nextInt();

        System.out.println(age);
                
        if(age >= 18){

            System.out.println("Age is greater or equal to 18, Welcome big boy HAHA!");

        } else{

            System.out.println("Age is lesser then 18, hello minor HAHA!");
        } 

    } catch (Exception e) {
        //TODO: handle exception

        System.out.println("THAT IS THE WRONG NUMBER");

    }          
*/
  
/** */// test 1 example 07
    
    System.out.println("what your age HEHE!");

    Scanner Obj = new Scanner(System.in); // Create a Scanner object    

    int age = Obj.nextInt();

    System.out.println(age);

        if(age > 18){

            System.out.println("Age is greater or equal to 18, Welcome big boy HAHA!");

        } else if ( age < 18) {

            System.out.println("Age is lesser then 18, hello minor HAHA!");
        } else{

            System.out.println("equal");
        }
    
    }
}
