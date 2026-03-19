package section7.section7_4;
import java.util.*;

public class Main {
    public int[] solution(int size,int n,int []arry){
        /*ArrayList<Integer>list=new ArrayList<>();
        int []answer=new int[size];
        for(int i=0;i<n;i++){
            if(list.contains(arry[i])){
                int index=list.indexOf(arry[i]);
                list.remove(index);
                list.add(arry[i]);
            }else{
                list.add(arry[i]);
            }
        }
        for(int i=0;i<size;i++){
            answer[i]=list.get(list.size()-i-1);
        }
        return answer;*/


        /*int cache[]=new int[size];
        int count=0;
        Arrays.fill(cache,0); //0으로 전부 채우기
        for(int x:arry){
            count=0;
            for(int i=0;i<size;i++){
                if(x==cache[i]){ //해당 값 존재
                    if(i!=0){
                        for(int j=i;j>0;j--){
                            cache[j]=cache[j-1];
                        }
                    }
                    cache[0]=x;
                    break;
                }else count++;
            }
            if(count==size){ //전부 다른 수라면
                for(int j=size-1;j>0;j--){
                    cache[j]=cache[j-1];
                }
                cache[0]=x;
            }
        }*/
        int cache[]=new int[size];
        for(int x:arry){
            int pos=-1;
            for(int i=0;i<size;i++) if(cache[i]==x) pos=i;
            if(pos==-1){ //겹치는 값이 없을때
                for(int j=size-1;j>0;j--){
                    cache[j]=cache[j-1];
                }
            }else{
                for(int j=pos;j>0;j--){
                    cache[j]=cache[j-1];
                }
            }
            cache[0]=x;
        }
        return cache;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int n=sc.nextInt();
        int arry[]=new int[n];
        for(int i=0;i<n;i++){
            arry[i]=sc.nextInt();
        }
        Main T=new Main();
        for(int x:T.solution(size,n,arry)){
            System.out.print(x+" ");
        }
    }
}
