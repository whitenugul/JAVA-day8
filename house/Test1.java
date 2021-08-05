package jump2java.house;


public class Test1 {
    public void sayNick(String nick){
        if("fool".equals(nick)){
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+"입니다.");
    }
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.sayNick("fool");
        test.sayNick("genious");
    }
}
