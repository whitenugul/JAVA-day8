package jump2java.house;

import java.text.SimpleDateFormat;
import java.util.Date;

public class util {
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(util.getCurrentDate("yyyyMMdd"));
        // 소문자 mm으로 할 경우 월이 아닌 시간이 나오게 된다.
    }
}
