import java.util.*;
public class n02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] str_arr = str.split("");
        int[] arr = new int[str_arr.length];
        //정수 한개씩 나누어 저장
        for(int i=0;i<str.length();i++){
            arr[i]=Integer.parseInt(str_arr[i]);
        }

        int result=arr[0];
        for(int i=1;i<str.length();i++){
            int num = arr[i];
            result = Math.max(result+num, result*num);
        }
        System.out.println(result);

    }
}
