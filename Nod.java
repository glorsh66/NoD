public class Nod {

    public static void main(String[] args) {
     int a = 5;
     int b = 25;


        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
