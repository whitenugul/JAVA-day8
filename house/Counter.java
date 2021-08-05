package jump2java.house;

public class Counter {
    static int count = 0;
    Counter() {
        this.count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(c1.count); // 1
        Counter c2 = new Counter();
        System.out.println(c2.count); // 2
        System.out.println(Counter.getCount()); // 2

    }
}
