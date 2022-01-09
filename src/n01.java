import java.util.*;

public class n01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //내림차순 정렬
        Arrays.sort(arr,Collections.reverseOrder());
        int cnt=0;// 그룹 수

        for(int i=0;i<n;i++){
            int max = arr[i];
            cnt++;
            i=i+max;
        }
        System.out.print(cnt);
    }
}
