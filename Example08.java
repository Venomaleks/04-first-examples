import java.util.Scanner; // Import the Scanner class
import java.util.Random; //Import random generator

public class Example08{

    public static void main(String[] args){

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

// test 1 example 08 a)

    int a = 10;
    int b = 20;
    int x = 0;

    System.out.println("A Is " + a);
    System.out.println("B Is " + b);

    System.out.println(" and here is a trick");

    if (x == 0){

        x = a;
        a = b;
        b = x;
       
    System.out.println("naw A is " + a + " and B is " + b);
    System.out.println("TADA!!");
    
    } else{

        System.out.println("PSYCKE THATS THE WRONG NUMMBER");
    }

///////////////////////////////////////////////////////////

    /**   // test 1 example 08 b)

    double brl = 2.64;
    double sek;

    int upperbound = 99;

    Random rand = new Random();

    int intRandom; 
    
    intRandom = rand.nextInt(upperbound);

    System.out.println("random nummber is: " + intRandom);

    System.out.println("random number times Brl");

    sek = brl * intRandom;

    System.out.println(sek);
    
    */

///////////////////////////////////////////////////////////

    /**  // test 1 example 08 c)

    int upperbound = 99;

    doubel sum = 0;

    Random rand = new Random();
    
    int intRandomA = rand.nextInt(upperbound);

    int intRandomB = rand.nextInt(upperbound);

    System.out.println("First (A) random nummber is: " + intRandomA);

    System.out.println("Secend (B) random nummber is: " + intRandomB);

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

    System.out.println(sum);
    */

///////////////////////////////////////////////////////////

    /**  // test 1 example 08 c) experement

    Random rand = new Random();
    double sum;
    int upperbound = 99;

    int A = rand.nextInt(upperbound);

    System.out.println("A is " + A);

    sum = A / 0;
    System.out.println(sum);
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

    /**   // test 1 example 08 e)

    double discount;

    System.out.println("haw mutch is the product price, :3!");

    Scanner Obj = new Scanner(System.in); // Create a Scanner object    

    double price = Obj.nextDouble();

    System.out.println(price);

    System.out.println("origenal price is: " + price);

    discount = price / ( 100 * 0.13);

    System.out.println("whit the discount it is: " + discount);

    */

    }
}