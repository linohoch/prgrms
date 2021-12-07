package prgrms;

public class 실패율 {

	public static void main(String[] args) {
	 int[] arr= {2, 1, 2, 6, 2, 4, 3, 3};
	 int[] arrr= new int[5];
	 
	 for(Integer i:solution(5,arr)) {
		 System.out.print(i + ",");
	 }
			
	}
	public static Integer[] solution(int N, int[] stages) {
        Integer[] answer = new Integer[N];
        double[] ddd = new double[N+1];
        										//인덱스0은 안쓸꺼야
        for(int i=1;i<=N;i++) {
        	double d=0; double dd=0;
        	for(int p : stages) {
        		if(p==i)d++;
        		if(p>=i)dd++; 
        	}
        	ddd[i]=d/dd;
       }

        for(int i=1;i<ddd.length;i++) {			
        	int t=0;
        	for(int j=1;j<ddd.length;j++) {
        		if(ddd[i]<ddd[j]) t++;	
        	}   	
        	while (true) {
        		if(answer[t]!=null)t++;
        		else break;
        	}
        	answer[t] = i;
        }
        return answer;
    }
}
