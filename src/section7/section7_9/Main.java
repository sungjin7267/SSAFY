package section7.section7_9;
import java.util.*;

public class Main {
    public int count(int [] arry,int num){
        int count=1,sum=0;
        for(int x:arry){
            if(sum+x>num){
                count++;
                sum=x;
            }else sum+=x;
        }
        return count;
    }
    public int solution(int size,int section,int arry[]){
        int answer=0;
        int lt=Arrays.stream(arry).max().getAsInt();
        int rt=Arrays.stream(arry).sum();
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arry,mid)>section){
                lt=mid+1;
            }else{
                answer=mid;
                rt=mid-1;
            }
        }
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int section=sc.nextInt();
        int arry[]=new int[size];
        for(int i=0;i<size;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        System.out.println(T.solution(size,section,arry));
    }
}
