public class PhoneGenerator {

    public static void main(String args[])
    {
        int n1, n2, n3, middle, end;
        n1 = (int)(Math.random()*8);
        n2 = (int)(Math.random()*8);
        n3 = (int)(Math.random()*8);

        middle = (int)(Math.random()*743);

        end = (int)(Math.random()*10000);

        System.out.println("" + n1 + n2 + n3 + "-" + middle + "-" + end);
    }
}
