package test;

import java.util.ArrayList;
import java.util.List;

 public class NewIDRecommend {
	 
	  public String solution(String new_id) {
		  String answer = "";
		  ArrayList<String> list = new ArrayList<String>();
		  String specialWords[] = {"~","!","@","#","$","%","^","&","*","(",")","=","+","[","{","]","}",":","?",",","<",">","/"};
		  
		  new_id = new_id.toLowerCase(); // 1단계
		  
	      for(int i=0; i<new_id.length(); i++) { // id길이 만큼 반복문 수행
	    	  char eachIdWord = new_id.charAt(i); // id문자열 하나하나를 char타입 변수에 저장
	    	  String eachIdWords = String.valueOf(eachIdWord); // char타입의 값을 String타입으로 변환
	    	  list.add(eachIdWords); 
	    	 }
	      
	      for(int i=0; i<list.size();i++) { // 2단계  ...!@BaT#*..y.abcdefghijklm
	    	  String id_text = list.get(i);
	    	  	for(int j=0; j<specialWords.length;j++) {
	    	  		if(id_text.equals(specialWords[j])) {
	    	  			list.remove(i);
	    	  			i=0;
	    	  			break;
	    	  		}
	    	  	}
	      	}
	      	
	      	for (int i=0; i<list.size()-1;i++) { // 3단계
	      		if(list.get(i).equals(".")) {
	      			if(list.get(i+1).equals(".")) {
	      				list.remove(i);
	      				i=-1;
	      			}
	      		}
	      	}
	      	if(!list.isEmpty()) {
		      	if(list.get(list.size()-1).equals(".")) {  // 4단계  //=.=
		      		list.remove(list.size()-1);
		      		}
	      		}
	      	if(!list.isEmpty()) {
		      	if(list.get(0).equals(".")) {
			      		list.remove(0);
			      		}
	      			}else list.add("a"); //5단계
	      		 

	      	if(list.size()>=16) { // 6.1단계   19->17자
	      		for(int i=15; i<list.size(); i++) { 
	      			list.remove(i);
	      			i=14;
	      		}
	      	}
	      	if(list.get(list.size()-1).equals(".")) {// 6.2단계 
	      		list.remove(list.size()-1);
	      	}
	      	
	      	if (list.size()<=2) { // 7단계
	      		for(int i=list.size(); i<3; i++) {
	      			list.add(list.get(i-1));
	      		}
	      	}

	      	
	      	for(String finalID:list) {
	      		answer+=finalID;
	      	}
	        return answer;
	       
	  }
 }

class NewIDRecommendTest{
	public static void main(String[] args) {

	NewIDRecommend nir = new NewIDRecommend();
	
	String new_id = "...!@BaT#*..y.abcdefghijklm"; 
	nir.solution(new_id);
	

  	 }
}