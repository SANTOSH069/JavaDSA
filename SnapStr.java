import java.util.Scanner;

public class SnapStr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

    int n = sc.nextInt();
    int[] arr1 = new int[n];
    int[] arr2 = new int[n];

    for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
        arr2[i] = sc.nextInt();
    }

    int l = 0;
    int currStr = 0;
    int maxStr = 0;

    while (l < n) {
        if (arr1[l] > 0 && arr2[l] > 0) {
            currStr++;
        } else {
            maxStr = Math.max(maxStr, currStr);
            currStr = 0;
        }
        l++;
    }
    maxStr = Math.max(maxStr, currStr);

    System.out.print(maxStr);

} catch (Exception e) {
    System.out.print(e);
}

    }
}
