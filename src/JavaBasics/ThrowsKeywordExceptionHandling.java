package JavaBasics;

public class ThrowsKeywordExceptionHandling{
                                  //if we comment out ArithmeticException and use try catch block in line 13 - 14
    public static void main(String[] args) { //throws ArithmeticException{     //Main method will catch from sum method because Main is also calling sum method
                                                                        //then Main method is also throwing it away. So who will catch it? Ans: Now JVM will catch & handle it
        ThrowsKeywordExceptionHandling obj = new ThrowsKeywordExceptionHandling();                       //Now if you run it will show all exceptions in console with EXCEPTION HIERARCHY
        obj.sum();
        System.out.println("ABC"); //You can have 1,000 line of code but it won't print cuz throws keyword will terminate the program
    }

    public void sum() { //throws ArithmeticException{   //if we comment out ArithmeticException and use try catch block below
        try {  //Now w/ try & catch block it will not be kept throwing till JVM & will get a print of the above statement from line 9 "ABC"
            division();   //Sum method will catch Exception from line 18 of divison method then will throw it to Main method
        } catch (ArithmeticException e) {

        }
    }

    public void division() throws ArithmeticException{  //throws prevents from writing try catch block again & again if you have multiple exception say with 1,000 line of code
        int i = 9/0;      //Exception line from division method will be thrown to sum method because sum method internally calling division method
    }

}
