public class SumArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int j : arr) {
            j += j;
            System.out.println(j);
        }
    }
}
