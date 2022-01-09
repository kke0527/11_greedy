import java.util.*;
public class n05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] balls = new int[n];
        int[] ball_cnt = new int[m + 1];

        for (int i = 0; i < n; ++i) {
            balls[i] = sc.nextInt();

            ball_cnt[balls[i]]++;//해당 무게를 가진 볼링공으 ㅣ개수
        }
        int cnt = 0;
        
        //볼링공 무게 범위 1~m 별로 검사
        for (int i = 1; i <= m; ++i) {
            //A가 선택한 무게=i 인 볼링공은 모두 B의 선택지에서 제외
            n -= ball_cnt[i];
            //B가 선택할 수 있는 볼링공 종류만큼 곱하기
            cnt += n * ball_cnt[i];
        }

        System.out.print(cnt);
    }
}
