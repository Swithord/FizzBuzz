import static java.lang.Math.floor;

public class Multiples {
    public static void main(String[] args) {
        int three_multiples = numMultiples(3);
        int five_multiples = numMultiples(5);
        int fifteen_multiples = numMultiples(15);
        System.out.println(three_multiples + five_multiples - fifteen_multiples);
    }

    public static int numMultiples(int num) {
        double lower = floor(999f/num);
        int x = 999 % num;
        for (int i = 1; i < x; i++) {
            if (i % num == 0) {
                lower++;
            }
        }
        return (int)lower;
    }
}
