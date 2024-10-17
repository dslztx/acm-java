import java.util.Scanner;

public class Main {
    int[] nums;
    int[] dp;

    public Main(int[] nums){
        this.nums=nums;
    }

    public void build(){
        int n=nums.length;

        dp=new int[n+1];
        int maxv=0;
        for(int i=1;i<=n;i++){

            maxv=0;
            for(int j=1;j<i;j++){
                if(nums[j-1]<nums[i-1]){
                    if(dp[j] > maxv){
                        maxv=dp[j];
                    }
                }
            }
            dp[i]=maxv+1;
        }
    }

    public int obtain(){
        int maxv=-1;

        int n=nums.length;

        for(int i=1;i<=n;i++){
            if(dp[i]>maxv){
                maxv=dp[i];
            }
        }

        return maxv;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s=in.nextLine();
        String[] ss=s.split(" ");
        int[] nums=new int[ss.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.valueOf(ss[i]);
        }

        Main main=new Main(nums);

        main.build();
        System.out.println(main.obtain());


    }
}