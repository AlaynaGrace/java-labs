// FactRecord.java

public class HanoiRecord extends ActivationRecord {

    private char from;
    private char to;
    private char tmp;
    private int count;
    private int line;
    private int c;

    public HanoiRecord(int n, char source, char dest, char temp){
        from = source;
        to = dest;
        tmp = temp;
        count = n;
        c = 0;
        line = 0;
    }
    @Override
    public void run() {
        switch (line) {
            case 0:
                if (count == 0) {
                    HanoiR.s.pop();
                    return;
                }
                HanoiR.s.push(new HanoiRecord(count - 1,from, tmp, to));
                line = 1;


                return;
            case 1:
                HanoiR.s.pop();
                System.out.println(" Move disk " + count + " from " + from +
                        " to " + to);
                HanoiR.s.push(new HanoiRecord(count - 1, tmp, to, from));
                HanoiR.loops++;


                return;
            default:
                System.out.println("\nWe should not get here.");
        }

    }
}