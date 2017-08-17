/**
 * Created by alayn on 9/22/2016.
 */
public class ShortToLong {
    private String dol;
    private int count;
    private String before;
    private String after;

    public ShortToLong(String number) {
        dol = number;

    }

    public void separate() {
        before = "";
        after = "";
        for (int i = 0; i < dol.length(); i++) {
            if (dol.charAt(i) == '.') {
                count = i;
            }
        }
        for (int x = 1; x < count; x++) {
            before += dol.charAt(x);
        }
        for (int y = count + 1; y < dol.length(); y++) {
            after += dol.charAt(y);
        }


    }
    public String secondPart(){
        String newAfter = "";
        if(after != "") {
            newAfter = after + "/100 dollar(s)";
        }
        return newAfter;

    }
    public String firstPart() {
        String newB = "";
        String finB = "";
        for (int i = 0; i < 8 - count; i++) {
            newB += "0";
        }
        newB += before;
        switch (newB.charAt(0)) {
            case '1':
                finB += "one million ";
                break;
            case '0':
                finB += "";

        }
        switch (newB.charAt(1)) {
            case '1':
                finB += "one hundred  ";
                break;
            case '2':
                finB += "two hundred  ";
                break;
            case '3':
                finB += "three hundred  ";
                break;
            case '4':
                finB += "four hundred  ";
                break;
            case '5':
                finB += "five hundred  ";
                break;
            case '6':
                finB += "six hundred  ";
                break;
            case '7':
                finB += "seven hundred  ";
                break;
            case '8':
                finB += "eight hundred  ";
                break;
            case '9':
                finB += "nine hundred  ";
                break;
            case '0':
                finB += "";

        }
        if (newB.charAt(2) != '1') {
            switch (newB.charAt(2)) {
                case '2':
                    finB += "twenty ";
                    break;
                case '3':
                    finB += "thirty ";
                    break;
                case '4':
                    finB += "forty ";
                    break;
                case '5':
                    finB += "fifty ";
                    break;
                case '6':
                    finB += "sixty ";
                    break;
                case '7':
                    finB += "seventy ";
                    break;
                case '8':
                    finB += "eighty ";
                    break;
                case '9':
                    finB += "ninety ";
                    break;
                case '0':
                    finB += "";


            }
        }
        if (newB.charAt(2) == '1') {
            switch (newB.charAt(3)) {
                case '1':
                    finB += "eleven ";
                    break;
                case '2':
                    finB += "twelve ";
                    break;
                case '3':
                    finB += "thirteen ";
                    break;
                case '4':
                    finB += "fourteen ";
                    break;
                case '5':
                    finB += "fifteen ";
                    break;
                case '6':
                    finB += "sixteen ";
                    break;
                case '7':
                    finB += "seventeen ";
                    break;
                case '8':
                    finB += "eighteen ";
                    break;
                case '9':
                    finB += "nineteen ";
                    break;
                case '0':
                    finB += "ten ";


            }
        }
        switch (newB.charAt(3)) {
            case '1':
                finB += "one ";
                break;
            case '2':
                finB += "two ";
                break;
            case '3':
                finB += "three ";
                break;
            case '4':
                finB += "four ";
                break;
            case '5':
                finB += "five ";
                break;
            case '6':
                finB += "six ";
                break;
            case '7':
                finB += "seven ";
                break;
            case '8':
                finB += "eight ";
                break;
            case '9':
                finB += "nine ";
                break;
            case '0':
                finB += "";

        }
        if (newB.charAt(1) != '0' || newB.charAt(2) != '0' || newB.charAt(3) != '0') {
            finB += "thousand ";
        }
        switch (newB.charAt(4)) {
            case '1':
                finB += "one hundred ";
                break;
            case '2':
                finB += "two hundred ";
                break;
            case '3':
                finB += "three hundred ";
                break;
            case '4':
                finB += "four hundred ";
                break;
            case '5':
                finB += "five hundred ";
                break;
            case '6':
                finB += "six hundred ";
                break;
            case '7':
                finB += "seven hundred ";
                break;
            case '8':
                finB += "eight hundred ";
                break;
            case '9':
                finB += "nine hundred ";
                break;
            case '0':
                finB += "";

        }

        if (newB.charAt(5) == '1') {
            switch (newB.charAt(5)) {
                case '1':
                    finB += "eleven ";
                    break;
                case '2':
                    finB += "twelve ";
                    break;
                case '3':
                    finB += "thirteen ";
                    break;
                case '4':
                    finB += "fourteen ";
                    break;
                case '5':
                    finB += "fifteen ";
                    break;
                case '6':
                    finB += "sixteen ";
                    break;
                case '7':
                    finB += "seventeen ";
                    break;
                case '8':
                    finB += "eighteen ";
                    break;
                case '9':
                    finB += "nineteen ";
                    break;
                case '0':
                    finB += "ten";
            }
        }
        else{
            switch (newB.charAt(5)) {
                case '2':
                    finB += "twenty ";
                    break;
                case '3':
                    finB += "thirty ";
                    break;
                case '4':
                    finB += "forty ";
                    break;
                case '5':
                    finB += "fifty ";
                    break;
                case '6':
                    finB += "sixty ";
                    break;
                case '7':
                    finB += "seventy ";
                    break;
                case '8':
                    finB += "eighty ";
                    break;
                case '9':
                    finB += "ninety ";
                    break;
                case '0':
                    finB += "";
            }
        }

        switch (newB.charAt(6)) {
            case '1':
                finB += "one ";
                break;
            case '2':
                finB += "two ";
                break;
            case '3':
                finB += "three ";
                break;
            case '4':
                finB += "four ";
                break;
            case '5':
                finB += "five ";
                break;
            case '6':
                finB += "six ";
                break;
            case '7':
                finB += "seven ";
                break;
            case '8':
                finB += "eight ";
                break;
            case '9':
                finB += "nine ";
                break;
            case '0':
                finB += "";

        }
        return finB;
    }
    public String full(ShortToLong s){

        return s.firstPart() + s.secondPart();
    }
}

