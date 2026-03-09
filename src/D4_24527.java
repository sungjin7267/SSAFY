
import java.util.Scanner;
import java.io.FileInputStream;

class D4_24527
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            long answer=0;
            long x1=sc.nextInt();
            long x2=sc.nextInt();
            long y1=sc.nextInt();
            long y2=sc.nextInt();
            long k=sc.nextInt();

            if(k<y1){
                answer+=2*(k+1)*(k+1)-(2*k+1);
            }else{
                answer+= ((k+1)*(k+1))+((y1-1)*(2*k-y1+1));
                if(k>y1-x1){
                    answer+=(sigma(k+x1-y1));
                }
                if(k>x2+y1){
                    answer+=(sigma(k-x2-y1));
                }
                if(k>y2-x1+2){
                    answer+=(sigma(k+x1-y2-2));
                }
                if(k>x2+y2+2){
                    answer+=(sigma(k-x2-y2-2));
                }
                if((k+x1-x2-y2-2)>0){
                    answer-=(k+x1-x2-y2-2)*(k+x1-x2-y2-2);
                }
            }
            System.out.println(answer);
        }

    }

    public static long sigma(long a){
        return a*(a+1)/2;
    }
}