package section3.section3_10;
import java.util.*;

public class Main {
    public int solution(int num,int [][]numArray){
        /*int answer=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                int curr=numArray[i][j];
                if(curr>numArray[i][j-1]&&curr>numArray[i][j+1]&&curr>numArray[i-1][j]&&curr>numArray[i+1][j]){
                    answer++;
                }
            }
        }
        return answer;*/
        int dx[]={-1,0,1,0}, dy[]={0,1,0,-1}, answer=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                boolean check=true;
                for(int k=0;k<4;k++){
                    int x=i+dx[k], y=j+dy[k];
                    if(numArray[i][j]<=numArray[x][y]){
                        check=false;
                        break;
                    }
                }
                if(check) answer++;
            }
        }
        return answer;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int numArray[][]=new int[num+2][num+2];
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                numArray[i][j]=sc.nextInt();
            }
        }
        Main T=new Main();
        System.out.println(T.solution(num,numArray));
    }
}
