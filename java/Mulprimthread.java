class MultiplicationTable extends Thread 
{
    public void run() 
    {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println("5 x " + i + " = " + (5 * i));
            try 
            {
                Thread.sleep(100); 
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}
class PrimeNumbers extends Thread {
    int n;
    PrimeNumbers(int n) 
    {
        this.n = n;
    }
    public void run() 
    {
        System.out.println("\nFirst " + n + " Prime Numbers:");
        int count = 0, num = 2;
       while (count < n) 
        {
            if (isPrime(num)) 
            {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
    boolean isPrime(int number) 
    {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) return false;
        }
        return true;
    }
}
public class Mulprimthread {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();
        PrimeNumbers pn = new PrimeNumbers(10);

        mt.start();
        try {
            mt.join();  
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        pn.start();
    }
}
