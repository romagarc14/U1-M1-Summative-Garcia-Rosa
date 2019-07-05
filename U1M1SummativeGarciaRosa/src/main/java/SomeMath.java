public class SomeMath {

    public static void main(String[] args) {
        System.out.println("The total is " + total5(1, 2, 3, 4, 5));
        System.out.println("The average is " + average5(1, 3, 5, 7, 9));
        System.out.println("The largest number is " + largest5(42.0, 35.1, 2.3, 40.2, 15.6));
    }

    // This method takes 5 int parameters and returns the total.
    public static int total5(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
    // This method takes 5 int parameters and returns the average of the numbers as a double.
    public static double average5(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5;
    }
    // This method takes 5 double parameters and returns the largest.
    public static double largest5(double a, double b, double c, double d, double e) {
        if (a > b && a > c && a > d && a > e) {
            return a;
        }else if (b > a && b > c && b > d && b > e) {
            return b;
        }else if (c > a && c > b && c > d && c > e) {
            return c;
        }else if (d > a && d > b && d > c && d > e) {
            return d;
        }else {
            return e;
        }
    }
}
