import java.util.*;
public class n03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int zero=0; // 연속된 0묶음
        int one=0;// 연속된 1 묶음

        for(int i=0;i<str.length();){
            char num = str.charAt(i);
            if(num=='0'){
                zero++;
            }
            else{
                one++;
            }
            i++;//바로 다음 char 검사
            //num 과 그 다음 char 이 동일할 경우
            //i값을 1 만큼 증가
            while((i<str.length())&&(num==str.charAt(i))){
                i++;
            }
        }
        //다솜이가 해야 하는 행동의 최소 횟수는
        //0 묶음과 1 묶음 중 더 작은 것
        System.out.println(Math.min(zero,one));
    }
}
