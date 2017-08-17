/**
 * Created by alayn on 9/20/2016.
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
}
