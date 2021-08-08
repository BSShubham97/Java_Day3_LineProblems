import java.util.Scanner;

public class Line_UC3 {
            public static void main (String[] args){
            Scanner sc= new Scanner(System.in);
//LINE NUMBER 1 WITH CO_ORDINATES x1 y1 x2 y2
            int x1,x2,y1,y2;
            double l1;
            System.out.println("Enter the four co-ordinates of a line x1,x2,y1,y2");
            System.out.println("Enter the value of x1: ");
            x1=sc.nextInt();
            System.out.println("Enter the value of x2: ");
            x2=sc.nextInt();
            System.out.println("Enter the value of y1: ");
            y1=sc.nextInt();
            System.out.println("Enter the value of y2: ");
            y2=sc.nextInt();

            int u=x2-x1;
            int v=y2-y1;

            l1=Math.sqrt((Math.pow(u,2)+Math.pow(v,2)));
            System.out.println("Length of first line is :"+l1);

            //LINE NUMBER 2 WITH CO_ORDINATES a1 b1 a2 b2
            int a1,a2,b1,b2;
            double l2;
            System.out.println("Enter the four co-ordinates of a line a1,a2,b1,b2");
            System.out.println("Enter the value of a1: ");
            a1=sc.nextInt();
            System.out.println("Enter the value of a2: ");
            a2=sc.nextInt();
            System.out.println("Enter the value of b1: ");
            b1=sc.nextInt();
            System.out.println("Enter the value of b2: ");
            b2=sc.nextInt();

            int m=a2-a1;
            int n=b2-b1;

            l2=Math.sqrt((Math.pow(m,2)+Math.pow(n,2)));
            System.out.println("Length of second line is :"+l2);

                if (Double.compare(l1, l2) == 0) {

                    System.out.println("[l1=l2] The Lines are EQUAL");
                }
                else if (Double.compare(l1, l2) < 0) {

                    System.out.println("[l1<l2] Line 2 is GREATER than Line 1");
                }
                else {

                    System.out.println("[l1>l2] Line 1 is GREATER than Line 2");
                }
        }
    }
