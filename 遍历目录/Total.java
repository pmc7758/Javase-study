public class Total {

    public static void main(String[] args) {
        System.out.println(num(6));
        System.out.println(num1(6));
    }


    public static int num(int n){
        if(n==1){
            return 1;
        }else {
            return n * num(n-1);
        }
    }


    public static int num1(int n){
        int j=n;
        int result = 1;
        for(int i=0;i<j;i++){
            result = result*n;
             n=n-1;
        }
        return result;
    }


}
