package POMExperis;

public class Utils
{
    public static void waitForSomeTime()
    {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
