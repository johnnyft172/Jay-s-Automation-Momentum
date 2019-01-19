package JavaBasics;

public class IncrementAndDecerementOperator {

    public static void main(String[] args) {

        //++
        //--

        int i = 1;
        int j = i++;  //Post increment -- Give the value I to J now as is, since it is 1 so j does not go up. Then increase the value of i by 1 so now i = 2

        System.out.println(i);
        System.out.println(j);     //So when the letter is first followed by ++ is Post and letter is behind ++ then it's pre increment

        int a = 1;
        int b = ++a;  //Pre increment - Increase the value A by 1 first then give it to b

        System.out.println(a);
        System.out.println(b);


        int m = 2;      //Give the value of M to N then decrease it by 1
        int n = m--;  //Post decrement, when the decrement is after the letter.
        System.out.println(m);
        System.out.println(n);

        int p = 2;
        int q = --p;   //Pre decrement
        System.out.println(p);   //1 = After first action in Q, now P is also 1
        System.out.println(q);  // 1 = Since we first decrease the value of P by 1 from 2 then give to to Q







    }
}
