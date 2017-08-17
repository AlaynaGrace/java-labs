
// Hanoi.java
// Tower of Hanoi Example using recursion and system stack
// How could this be rewritten iteratively using your own Stack?

public class Hanoi {

    static int count;

    public static void hanoi (int n, char source, char dest, char temp) {

        count++;
        if (n == 1) {
            System.out.println(" Move disk 1 from " + source + " to " + dest);
        }
        else {
            hanoi(n - 1, source, temp, dest);
            System.out.println(" Move disk " + n + " from " + source +
                    " to " + dest);
            hanoi(n - 1, temp, dest, source);
        }
    }

    public static void main (String[] args) {

        int n = 3;
        System.out.println("\nTower of Hanoi Solution for " + n + " disks:");
        hanoi(n, 'a', 'b', 'c');
        System.out.println("\nSolution complete in " + count + " moves");
    }

}  // Hanoi class
//First: Last call (the base)
//Second: Second to last call (second base)
//Last: First call
//Big-O:(2^n) - 1?