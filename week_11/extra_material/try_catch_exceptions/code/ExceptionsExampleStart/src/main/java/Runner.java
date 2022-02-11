import java.io.FileNotFoundException;
import java.io.FileReader;

public class Runner{
    public static void main(String[] args){
//        ExampleTryCatch myProgram = new ExampleTryCatch(); // to run a program, you have to declare what class you want to start running
//        myProgram.run();
        Runner mainMethod = new Runner();
        mainMethod.testStuff();
    }

    private void testStuff() {
        try {
            int one = 1;
            int zero = 0;
          //  System.out.println(one / zero);
            FileReader fileReader = new FileReader("");
        }
        catch(FileNotFoundException fnfe){
          //  fnfe.printStackTrace();
            System.out.println("File not found" + fnfe.getMessage());
        }
        catch(ArithmeticException ae){
            System.out.println("No stop it!");
        }
        catch(Exception exception){
            System.out.println("Sorry cant divide by zero");
        }
    }

}