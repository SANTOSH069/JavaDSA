import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Queues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

Deque<Integer> dq = new ArrayDeque<>();
ArrayList<Integer> res = new ArrayList<>();
int max = dq.stream().max(Integer::compare).orElse(0);
res.add(max);      
    }
}