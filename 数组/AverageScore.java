public class AverageScore {
    public static void main(String[] args) {
        int[] a = {61,57,95,85,75,65,44,66,90,32};
        int count = 0;
        for(int b=0; b<10 ;b++){
            count = a[b]+count;
        }
        System.out.println(count / 10);
    }
}
