package lab1;

public class Multiples{

    public static void main(String[] args) {
        System.out.println(multiples(16, 3, 5));
    }

    static int multiples(int n, int a, int b) {
        int counter = 0;
        for(int i = n - 1; i > 0; i--) {
            if (i % a == 0 || i % b == 0) {
                counter++;


            }
        }
        return counter ;

    }
}