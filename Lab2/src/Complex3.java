/**
 * Created by alayn on 9/20/2016.
 */
public class Complex3 {
    private double realPart = 0;
    private double imaginaryPart = 0;
    public Complex3(double a, double b){
        realPart = a;
        imaginaryPart = b;
    }
    public void setRealPart(double value){
        realPart = value;
    }
    public void setImaginaryPart(double value){
        imaginaryPart = value;
    }
    public double getRealPart(){
        return realPart;
    }
    public double getImaginaryPart(){
        return imaginaryPart;
    }
    public void addComplex(Complex3 c){
        realPart += c.getRealPart();
        imaginaryPart += c.getImaginaryPart();
    }
    public void subtractComplex(Complex3 c){
        realPart -= c.getRealPart();
        imaginaryPart -= c.getImaginaryPart();
    }
}
