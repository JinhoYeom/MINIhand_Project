package com.greedy.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class foodMake {
	
	


	public static String[] randomFood() {
		
		
		String[] food = {"피망", "계란말이", "김치", "소시지", "불고기", "초코비", "당근", "베이컨", "낫토", "닭가슴살", "딸기"};
		
		List<String> randomList = Arrays.asList(food);
				
		Collections.shuffle(randomList);
		
		randomList.toArray(food);
		System.out.println("==========이번 게임의 재료 순서============");
		System.out.println(Arrays.toString(food));
		
		return food;
	}


}
