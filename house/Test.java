package jump2java.house;



public class Test {
    public void shouldBeRun(){
        System.out.println("ok thanks.");
    }
    public static void main(String[] args) {
        Test test = new Test();
        int c;
        try{
            c = 4 / 0;
            test.shouldBeRun();
        }catch(ArithmeticException e){
            c = -1;
        }finally{
            test.shouldBeRun();
        }
    }
}
