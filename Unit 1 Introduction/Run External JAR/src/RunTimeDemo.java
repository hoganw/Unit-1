public class RunTimeDemo {
    public static void main(String[] args)
    {
        try {
            System.out.println("Executing GreenTime.jar");
            Process process = Runtime.getRuntime().exec("java -jar GreenTime.jar");
            //process.waitFor();
            System.out.println("GreenTime should now open.");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
