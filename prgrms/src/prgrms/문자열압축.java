package prgrms;

import java.util.ArrayList;

public class 문자열압축 {

	public static void main(String[] args) {
		String s="abcabcabcabcdededededede";
		System.out.println(solution(s));
		
	}
	public static int solution(String s) {
		int prel=s.length();		//원문길이
		int newl=s.length();		//뉴길이 찾을 값
		String[] ss = s.split(""); 	
		ArrayList<String> sss = new ArrayList<String>();

	for(int i=1;i<=prel/2;i++) {
		int cnt=0;
		String w="";
		sss.clear();
		for(int j=0;j<ss.length;j++) {
			w+=ss[j]; cnt++;
			if(cnt==i || j==ss.length-1) {  //글자 개수i를 채우거나, 부족해도 마지막이라면 add
				sss.add(w);
				w=""; cnt=0;
			}
		}
		cnt=0;
		int len=prel;
		for(int j=0;j<sss.size()-1;j++) {
			if( sss.get(j).equals(sss.get(j+1)) ) {
				cnt++;

				if(j==sss.size()-2) {
					len-=i*cnt;
					len+=Integer.toString(cnt+1).length();
				}
			}else {
				len-=i*cnt;
				if(cnt!=0) { len+=Integer.toString(cnt+1).length();}
				cnt=0;
			}
		}		
		if(len<newl) {newl=len;}
	}
	return newl;
		
		
		
	}
}
