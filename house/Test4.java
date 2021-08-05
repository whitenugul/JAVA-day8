package jump2java.house;

public class Test4 {
    public void sayNick(String nick) throws FoolException{
        if("fool".equals(nick)){
            throw new FoolException();
        }
        System.out.println("Your nickname is "+nick);
    }
    public static void main(String[] args) {
        Test4 test = new Test4();
        try{
            test.sayNick("fool");
            test.sayNick("genious");
        }catch(FoolException e){
            System.err.println("FoolException occured");
        }
    }
}
