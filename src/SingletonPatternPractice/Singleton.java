package SingletonPatternPractice;

public class Singleton {



    //In OOP, a singleton class is a special class that can have only one object or instance of the class at a time.
    //How to design Singleton class:
    //1st: Make constructor of the class as private
    //2nd: Write a public static method(getInstance)that has return type of object of this Singleton class (lazy Initialization)


    private static Singleton singleton_instance = null;
    public String str;


    private Singleton(){
        str = "Hey, I am using singleton class pattern";

    }

    public static Singleton getInstance(){  //During interview you have to write this method and write this condition (this called lazy initialization)
        if(singleton_instance == null)
            singleton_instance = new Singleton();
            return singleton_instance;
        }

        public static void main(String[] args) {
            Singleton x = Singleton.getInstance();
            Singleton y = Singleton.getInstance();
            Singleton z = Singleton.getInstance();

            x.str = (x.str).toUpperCase();

            System.out.println(x.str);
            System.out.println(y.str);
            System.out.println(z.str);

            z.str = (z.str).toLowerCase();
            System.out.println(x.str);
            System.out.println(y.str);
            System.out.println(z.str);

        }

    }

