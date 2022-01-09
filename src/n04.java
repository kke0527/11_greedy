import java.util.*;
public class n04 {
    static int n;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);

        boolean[] visited = new boolean[n];
        set(nums,visited,0);
        //정렬(오름차순
        Collections.sort(list);
        //중복 제거
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                }
                else if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }
        }

        int min = 1;
        for(int data : list){
            if(min<data){//리스트의 원소값보다 작을 때
                break;
            }
            else{
                min=data+1;
            }
        }
        System.out.println(min);
    }

    //n개의 동전으로 만들 수 있는 조합 구하기
    public static void set(int[] nums,boolean[] visited,int idx) {

        if(idx==n){
            int sum=0;
            for (int i = 0; i < n; i++) {
                if (visited[i] == true)
                    sum+=nums[i];
            }
            list.add(sum);
            return;
        }
        visited[idx] = false;
        set(nums, visited, idx + 1);

        visited[idx] = true;
        set(nums, visited, idx + 1);
    }
}
