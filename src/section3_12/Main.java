package section3_12;
import java.util.*;

public class Main {
    public int solution(int stuNum,int testNum,int[][]numArray) {
        int answer=0;
        for(int i=1;i<=stuNum;i++){
            for(int j=1;j<=stuNum;j++){
                int cnt=0;
                for(int k=0;k<testNum;k++){
                    int p1=0,p2=0;
                    for(int l=0;l<stuNum;l++){
                        if(numArray[k][l]==i) p1=l;
                        if(numArray[k][l]==j) p2=l;
                    }
                    if(p1<p2){
                        cnt++;
                    }
                }
                if(cnt==testNum){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int stuNum=sc.nextInt();
        int testNum=sc.nextInt();
        int numArray[][]=new int[testNum][stuNum];
        for(int i=0;i<testNum;i++){
            for(int j=0;j<stuNum;j++){
                numArray[i][j]=sc.nextInt();
            }
        }
        Main T=new Main();
        System.out.println(T.solution(stuNum,testNum,numArray));
    }
}