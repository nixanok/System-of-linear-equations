import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, d, e, f;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    if (d == 0) {
                        if (e == 0) {
                            if (f == 0) {
                                System.out.println(5);
                            }
                            else {
                                System.out.println(0);
                            }
                        }
                        else {
                            System.out.println(0);
                        }
                    }
                    else {
                        if(e == 0) {
                            System.out.println(4 + " " + (f / d));
                        }
                        else {
                            System.out.println(0);
                        }
                    }
                }
                else {
                    if (e == 0) {
                        if (d == 0) {
                            System.out.println(3 + " " + (f / c));
                        }
                        else {
                            System.out.println(1 + " " + (-c / d) + " " + (f / d));
                        }
                    }
                    else {
                        System.out.println(0);
                    }
                }

            }
            else {
                if (c == 0) {
                    if ((d * e / b) == f) {
                        System.out.println(4 + " " + e / b);
                    }
                    else {
                        System.out.println(0);
                    }
                }
                else {
                    System.out.println(2 + " " + ((f - (d * e / b) ) / c) + " " + (e / b));
                }

            }
        }
        else {
            if(a * d - b * c == 0) {
                if(a * f - c * e == 0) {
                    if (b  == 0 && d == 0) {
                        System.out.println(3 + " " + e / a);
                    }
                    else {
                        System.out.println(1 + " " + (-a / b) + " " + (e / b));
                    }

                }
                else {
                    System.out.println(0);
                }
            }
            else {
                double y0 = (a * f - c * e) / (a * d - b * c);
                double x0 = (e - b * y0) / a;
                System.out.println(2 + " " + x0 + " " + y0);
            }
        }
    }
}
