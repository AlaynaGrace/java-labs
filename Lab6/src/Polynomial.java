/**
 * Created by alayn on 10/18/2016.
 */
public class Polynomial {
    double a;
    double b;
    double c;
    public Polynomial(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    Polynomial add(Polynomial p){
        p.a += a;
        p.b += b;
        p.c += c;
        return p;
    }
    double evaluate(double x){
        double ans = a * (x*x) + b * x + c;
        return ans;
    }

    public static void main(String[] args) {
        Polynomial p1 = new Polynomial(2,3,4);
        System.out.println("p1 A: " + p1.getA());
        System.out.println("p1 B: " + p1.getB());
        System.out.println("p1 C: " + p1.getC());
        System.out.println("p1 evaluated @ 5: " + p1.evaluate(5));

        Polynomial p2 = new Polynomial(4,5,6);
        System.out.println("p2 A: " + p2.getA());
        System.out.println("p2 B: " + p2.getB());
        System.out.println("p2 C: " + p2.getC());
        System.out.println("p2 evaulated @ 1: " + p2.evaluate(1));

        p1.add(p2);
        System.out.println("New p2 A: " + p2.getA());
        System.out.println("New p2 B: " + p2.getB());
        System.out.println("New p2 C: " + p2.getC());
    }
}
