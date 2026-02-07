 import java.util.*;

class proj1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        
        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter nos");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        // filter valid
        System.out.println("Valid members:");
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] >= 0 && a[i] <= 500)
            {
                arr.add(a[i]);
                System.out.println(a[i]);
            }
        }

        // avoid divide by zero
        if (arr.size() == 0) {
            System.out.println("No valid readings");
            return;
        }

        // average
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        double avg = (double) sum / arr.size();
        System.out.println("Average is: " + avg);

        // outliers
        System.out.println("Outlier values:");
        for (int o : arr)
        {
            if ((o - avg) > 0.1 * avg)
            {
                System.out.println(o);
            }
        }
    }
}

