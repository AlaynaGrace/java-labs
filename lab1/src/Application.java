/**
 * Created by alayn on 9/13/2016.
 */
public class Application {
    static int numerator = 1;
    static int denominator = 2;
    static float num = 1;
    static float den = 2;
    static int currentYear = 2016;
    static int birthYear = 1995;
    static String firstName = "Alayna";
    static String lastName = "Buysse";
    public static void main(String[] args){
        System.out.println("Hello world!");
        int year = currentYear - birthYear;
        System.out.println(year);
        int days = year * 365;


        int q = numerator/denominator;
        System.out.println(q); //Gives 0 because no part of it is a float
        float quo = num / den;
        System.out.println(quo); //Gives 0.5

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("My first name is - " + firstName);
        System.out.println("My last name is - " + lastName);
        System.out.println("My full name is - " + fullName);
        System.out.println("My name is - " + fullName + ". The number of days between " +
                currentYear + " and "  + birthYear + " is " + days);


    }
}
