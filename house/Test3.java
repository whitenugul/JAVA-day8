package jump2java.house;

public class Test3 {
    public void sayNick(String nick){
        try{
            if("fool".equals(nick)){
                throw new FoolException();
            }
            System.out.println("Your nickname is "+nick);
        }catch(FoolException e){
            System.err.println("FoolException이 발생했습니다.");
        }
    }
    public static void main(String[] args) {
        Test3 test = new Test3();
        test.sayNick("fool");
        test.sayNick("genious");
    }
}
