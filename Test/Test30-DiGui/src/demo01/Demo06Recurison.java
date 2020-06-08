package demo01;

public class Demo06Recurison {
    /*计算   n!+(n-1)!+...+1!     */
    public static void main(String[] args) {
         int s = sum(4);
        System.out.println(s);
        // 4*3*2*1 + 3*2*1 + 2*1 + 1 =  24+6+2+1=33
    }

    public static int sum(int n) {
        if (n==1){
            return 1;
        }
        return Jsum(n)+sum(n-1);
    }
    public static int Jsum(int n) {
        if (n==1){
            return 1;
        }
        return n * Jsum(n-1) ;
    }
}
