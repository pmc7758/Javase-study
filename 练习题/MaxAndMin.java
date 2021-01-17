public class MaxAndMin {
    public static void main(String[] args) {
        int[] a = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        for (int b = 0; b<8 ; b++){
            for(int c = b+1; c<9 ; c++){
                if (a[b]<a[c]) {
                    int h = a[b];
                    a[b] = a[c];
                    a[c] = h;
                }
            }
        }
        System.out.println("最大值" + a[0]);
        System.out.println("最小值" + a[8]);
    }
}
