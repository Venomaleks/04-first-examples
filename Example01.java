import java.util.Scanner; // Import the Scanner class
import java.util.Random; //Import random generator


// ALL THIS IS ALL THE PROGRAMING QUESTIONS 004


public class Example01{

    public static void main(String[] args){


    /**  // test 1 Example 06
    
    
    System.out.println("XXXXX\nX   X\nX   X\nXXXXX");

    */

///////////////////////////////////////////////////////////

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
  
///////////////////////////////////////////////////////////

/** // test 1 example 07
    
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
    
*/

///////////////////////////////////////////////////////////

    /**  // test 1 example 08 a)

    int a = 10;
    int b = 20;

    System.out.println("A Is " + a);
    System.out.println("B Is " + b);

    System.out.println(" and here is a trick");

    if ((a == 10) && (b == 20)){

        a = 20;
        b = 10;
       
        System.out.println("naw A is " + a + " and B is " + b);
        System.out.println("TADA!!");
    
    } else{

        System.out.println("PSYCKE THATS THE WRONG NUMMBER");
    }
    
*/

///////////////////////////////////////////////////////////

    /**   // test 1 example 08 b)

    double brl = 2.64;
    double sek = 1;

    int upperbound = 99;

    Random rand = new Random();
    
    int intRandom = rand.nextInt(upperbound);

    System.out.println("random nummber is: " + intRandom);


    System.out.println("random number times 1 Brl");

    sek = brl * intRandom;

    System.out.println(sek);
    
    */

///////////////////////////////////////////////////////////
        
/** // test 1 example 08 c)

    int upperbound = 99;

    int sum = 0;

    Random rand = new Random();
    
    int intRandomA = rand.nextInt(upperbound);

    int intRandomB = rand.nextInt(upperbound);

    System.out.println("first random nummber is: " + intRandomA);

    System.out.println("Secend random nummber is: " + intRandomB);

    sum = intRandomA + intRandomB;
    System.out.println("A + B = " + sum);

    sum = 0;

    sum = intRandomA - intRandomB;
    System.out.println("A - B = " + sum);

    sum = 0;

    sum = intRandomA / intRandomB;
    System.out.println("A / B = " + sum);

    sum = 0;

    sum = intRandomA * intRandomB;
    System.out.println("A * B = " + sum);

    sum = sum / 0;
    
    System.out.println("sum / 0 = " + sum);

*/

///////////////////////////////////////////////////////////

/**  // test 1 example 08 d)
    
    double faren;
    
    int upperbound = 40;

    Random rand = new Random();
    
    int intRandom = rand.nextInt(upperbound);

    System.out.println("the degrees in Celsius are: " + intRandom);

    faren = intRandom * 1.8 + 32;

    System.out.println("the degrees in Farenheit are: " + faren);
    
    */

    ///////////////////////////////////////////////////////////

    /**  // test 1 example 08 d) extra thing XD

    double faren;

    System.out.println("what is the Celsius, :3!");

    Scanner Obj = new Scanner(System.in); // Create a Scanner object    

    double degre = Obj.nextDouble();

    System.out.println(degre);

    System.out.println("the degrees in Celsius are: " + degre);

    faren = degre * 1.8 + 32;

    System.out.println("the degrees in Farenheit are: " + faren);
*/

///////////////////////////////////////////////////////////

    /** // test 1 example 08 e)

    double discount;

    System.out.println("haw mutch is the product price, :3!");

    Scanner Obj = new Scanner(System.in); // Create a Scanner object    

    double price = Obj.nextDouble();

    System.out.println(price);

    System.out.println("origenal price is: " + price);

    discount = price / 1.13;

    System.out.println("whit the discount it is: " + discount);

*/

///////////////////////////////////////////////////////////

    }
}

