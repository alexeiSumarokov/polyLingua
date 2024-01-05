import java.util.*;
public class pr4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i = 0; i < n; i++){
            int a = s.nextInt();
            pq.add(a);
            sum+=a;
        }
        for(int i = 0; i < k; i++){
            int m = pq.poll();
            int b = (int) Math.sqrt(m);
            pq.add(b);
            sum-= m;
            sum+=b;
        }
        System.out.print(sum);

    }
}
