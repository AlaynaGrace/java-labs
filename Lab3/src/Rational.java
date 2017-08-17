import java.util.Scanner;

/**
 * Created by alayn on 9/27/2016.
 */

public class Rational {
    private int numerator;
    private int denominator;
    public Rational(int num, int den){
        numerator = num;
        denominator = den;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int num){
        numerator = num;
    }
    public void setDenominator(int den){
        denominator = den;
    }
    public void addRational(Rational r){
        numerator = (r.getDenominator() * numerator)+(denominator * r.getNumerator());
        denominator = denominator * r.getDenominator();
    }
    public void subRational(Rational r){
        numerator = (r.getDenominator() * numerator)-(denominator * r.getNumerator());
        denominator = denominator * r.getDenominator();
    }
    public void mulRational(Rational r){
        numerator = numerator * r.getNumerator();
        denominator = denominator * r.getDenominator();
    }
    public void divRational(Rational r){
        numerator *= r.getDenominator();
        denominator *= r.getNumerator();
    }
    public void setRational(){
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter a numerator and denominator: ");
        String input = scanner.nextLine();
        Scanner s = new Scanner(input);
        numerator = s.nextInt();
        denominator = s.nextInt();
    }
    public String toString(){
        String numDen;
        String num = String.valueOf(numerator);
        String den = String.valueOf(denominator);
        numDen = num + "/" + den;
        return numDen;
    }
    public static void main(String[] args){
        Rational r1 = new Rational(1,2);
        r1.setRational();
        System.out.println(r1);
    }
}