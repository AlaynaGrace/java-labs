/**
 * Created by alayn on 9/20/2016.
 */
public class Av {
    public static void main(String[] args){
        int i;
        double sum = 0;
        double len = Double.valueOf(args.length);
        for(i=0; i<args.length; i++){
            sum += Double.valueOf(args[i]);
        }
        double avg = sum / len;
        if(len == 0){
            System.out.println("No arguments entered");
        }
        else{
            System.out.println("Average of " + len + " value(s) " +
                    "entered is: " + avg);
        }
    }
}
