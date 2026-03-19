package section7.section7_8;
import java.util.*;

public class Main {
    public int solution(int num,int arry[],int pick){
        Arrays.sort(arry);
        int answer=0;
        int lt=0, rt=num-1;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(arry[mid]>pick) rt=mid-1;
            else if(arry[mid]<pick) lt=mid+1;
            else {
                answer=mid+1;
                break;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arry[]=new int[num];
        int pick=sc.nextInt();
        for(int i=0;i<num;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(num,arry,pick));
    }
}
