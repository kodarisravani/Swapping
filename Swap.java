public class Swap {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            System.out.println("Before swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            // Swap 'a' and 'b' using a third variable 'temp'
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
    

