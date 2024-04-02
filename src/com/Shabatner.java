import java.util.Scanner;

public class Shabatner {

        public static void main(String[] args) {

            int shabatner;
            System.out.println("Mutqagreq shabatva orery: 1-2-3-4-5-6-7: ");
            Scanner in = new Scanner(System.in);
            shabatner = in.nextInt();

            switch (shabatner) {

                case 1:
                    System.out.println("Erkushabti, dasi chenq");
                    break;
                case 2:
                    System.out.println("Erekshabti, dasi enq");
                    break;
                case 3:
                    System.out.println("chorekshabti, dasi chenq");
                    break;
                case 4:
                    System.out.println("hingshabti, dasi enq");
                    break;
                case 5:
                    System.out.println("urbat, dasi chenq");
                    break;
                case 6:
                    System.out.println("shabat, dasi chenq");
                    break;
                case 7:
                    System.out.println("kiraki, dasi chenq");
                    break;
                default:
                    System.out.println("Duq mutqagrel eq sxal tiv");
            }
        }
    }
