package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	
    	int sum=0;
    	
    	System.out.println("상품을 입력해주세요");
    	
    	while(true) {
    		String info = sc.nextLine();
    	
    		if (info.equals("q")) {
    			sc.close();
    			break;
    		} else {
    			Goods goods = new Goods(info);
    			gList.add(goods);
    		}
    		
    		
    	}
    	
       for (Goods goods : gList) {
    	   
    	   goods.showInfo();
    	   
       }
       
       
       for(int i=0; i<gList.size(); i++) {
    	   
    	  
    	   
    	   sum = sum + gList.get(i).getCount();
    	   
    	   
    	   
       }
       
       System.out.println("모든 상품의 갯수는" + sum + "입니다.");
    	
    	
    	
    	
    }

}
