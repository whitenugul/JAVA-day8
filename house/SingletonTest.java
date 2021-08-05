package jump2java.house;

class Singleton{
    private static Singleton one;
    private Singleton(){

    }

    public static Singleton getInstance() {
        if(one == null){
            one = new Singleton();
        }
        return one;
    }
}


public class SingletonTest{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}