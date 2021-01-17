import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input n");
        int n = input.nextInt();
        int data[][] = new int[n][2];//存储n个点坐标
        int max = 0;//确定上限
        int min = 0;//确定下限
        for (int i = 0; i < n; i++) {
            data[i][0] = input.nextInt();//输入
            data[i][1] = input.nextInt();
            if(data[i][1]<min)//确定下限
                min = data[i][1];
            if(data[i][1]>max)//确定上限
                max = data[i][1];
        }
        int y = 0;//主管道位置
        int temp = n*max;//暂存储最小总长度
        int minLength = 0;

        for (int i = min; i <=max ; i++) {
            int sum =0;
            for(int j = 0;j<n;j++) {
                sum+=Math.abs(data[j][1]-i);//对于每种i都要计算他的总花费长度
            }
            if(sum<temp) {
                y = i;
                temp = sum;
                minLength = sum;
            }
        }
        System.err.println("y="+y);
        System.err.println("最小长度为:"+minLength);
    }
}

