import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);
        System.out.println(("Enter the number"));
        int n=sc.nextInt();
        int sp=0;
        for(int i=1;i<=n;i++)
        {
             sp=2*(n-i);
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        
        for(int i=0;i<=n;i++)
        {
            sp=2*(i);
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
              
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
