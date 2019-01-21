package JavaBasics;

public class ExceptionHandling {
    int a = 10;
    //static ExceptionHandling obj; //Also gives: NullPointerException

    public static void main(String[] args) {


        //int i = 9 / 0;  //Uncaught exception because it is not showing the error

        //System.out.println(i);

        //Caught exception: It will show the error immediately
        //Thread.sleep(2000);     //(Thread is class and sleep is a method)


        //ExceptionHandling obj = null; //Just creating a reference of null, NOT creating an object
        //ExceptionHandling obj = new ExceptionHandling(); //Created an object, both give same print out in console = null
        //obj = null; //Line of code breaks the reference of object obj and the global value 10 and you'll: NullPointerException in console
        // System.out.println(obj);

        //System.out.println(obj.a); //Just obj in parenthesis will give = null, but calling value a with obj.a will give = NullPointerException

        //3 different types of excetpion handling:
        // 1. Try - catch block
        try{
            int i = 9/0; //This code will throw an exceptioon
        }
        catch(ArithmeticException e) {
            e.printStackTrace(); //Without printStackTrace it will not show the Exception although it will handle it and continue
            System.out.println(e.getMessage());           // to run the program so print what is in print line statement
            //getMessage method shows the reason: /by zero
            System.out.println("Hey this erro cuz of # / by zero or what ever I want to type in catch");
        }

        //try & catch block is ALSO used to report exception, pin pointing where is the excetion, what line of code

        System.out.println("ABC");  //Because we are "handling" the exception, it will NOT terminate the program, that's why
        System.out.println("ABC");  //we can the print out ABC 5x below, even though there is ArithmeticException showing line 28
        System.out.println("ABC");
        System.out.println("ABC");
        System.out.println("ABC");


    }
}
