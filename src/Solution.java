/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num=Integer.parseInt(br.readLine());
            int total_num=0;
            String answer="";
            for(int i=0;i<num;i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                String eng=st.nextToken();
                int eng_num=Integer.parseInt(st.nextToken());
                answer +=eng*eng_num;
                total_num+=eng_num;
            }
            for(int j=0;j<(total_num%10)+1;j++){
                if(10*(j+1)>answer.length()){
                    System.out.println(answer.substring(j*10,answer.length()));
                }else {
                    System.out.println(answer.substring(j * 10, 10 * (j + 1)));
                }
            }
        }
    }
}*/
