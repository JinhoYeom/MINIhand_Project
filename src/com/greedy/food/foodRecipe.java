package com.greedy.food;

import java.util.ArrayList;

public class foodRecipe {

	public static String[] newRecipe(int i) {
		String[] nowRecipe = new String[5];
		
		if( i == 1 ) {
				nowRecipe[0] = "소시지";
				nowRecipe[1] = "불고기";
				nowRecipe[2] = "초코비";
				nowRecipe[3] = "베이컨";
				nowRecipe[4] = "낫토";
				System.out.print("이번 게임 레시피: ");
				for (int j = 0; j < nowRecipe.length; j++) {
					System.out.print(nowRecipe[j] + " ");
				}
				System.out.println();
				
			} else if( i == 2) {
				nowRecipe[0] = "계란말이";
				nowRecipe[1] = "김치";
				nowRecipe[2] = "당근";
				nowRecipe[3] = "낫토";
				nowRecipe[4] = "딸기";
				System.out.print("이번 게임 레시피: ");
				for (int j = 0; j < nowRecipe.length; j++) {
					System.out.print(nowRecipe[j] + " ");
				}
				System.out.println();
				
		}	else if( i == 3) {
			nowRecipe[0] = "불고기";
			nowRecipe[1] = "당근";
			nowRecipe[2] = "베이컨";
			nowRecipe[3] = "닭가슴살";
			nowRecipe[4] = "딸기";
			System.out.print("이번 게임 레시피: ");
			for (int j = 0; j < nowRecipe.length; j++) {
				System.out.print(nowRecipe[j] + " ");
			}
			System.out.println();
			
			}
		
		return nowRecipe;
	    }
	

		
	
	
}


