package com.greedy.food;

import static com.greedy.common.constant.changePanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.common.constant;
import com.greedy.paygame.view.GameMenu;

public class foodPlay extends JPanel {
	
	
	private static String 짱구 = "짱구의 불고기 파티";
	private static String 철수 = "철수의 건강 식단";
	private static String 유리 = "유리의 단백질 식단";


	private MainFrame mf;
	private JPanel foodPlay;
	
	private String[] nowRecipe;
	
	private int makeNum = 11;
	private String 재료1;
	private String 재료2;
	private String 재료3;
	private String 재료4;
	

	
	/* 현재 점수 표시 라벨 */
	
	private int foodScore = 0;
	
	String score = Integer.toString(foodScore);
	
	private JLabel nowscore = new JLabel("0");
	
	
	/* 랜덤 레시피 표시 라벨 */
	private JLabel recipe = new JLabel(RandomRecipe());
	
	/* 재료 배열할 라벨 선언 */
	private JLabel make1 = new JLabel();
	private JLabel make2 = new JLabel();
	private JLabel make3 = new JLabel();
	private JLabel make4 = new JLabel();
	

	
	/* 게임 시작시 이번 게임에서 사용할 레시피가 무작위로 정해진다 */
	public String RandomRecipe() {
		
		String wantrecipe = null;
		
		Random random = new Random();
		
		int recipeCode = random.nextInt(3)+1;
	
		if(recipeCode == 1) {
			
			wantrecipe = 짱구;
			nowRecipe = foodRecipe.newRecipe(recipeCode);
			
		} else if(recipeCode == 2) {
			
			wantrecipe = 철수;
			nowRecipe = foodRecipe.newRecipe(recipeCode);
			
		} else if(recipeCode == 3) {
			
			wantrecipe = 유리;
			nowRecipe = foodRecipe.newRecipe(recipeCode);
		}
		
		return wantrecipe;
	}
	
	/* 재료 무작위 배열 */
	List<String> food = new ArrayList<>(Arrays.asList(foodMake.randomFood()));
	
	String[] foodList = new String[11];
	

	public foodPlay (MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.foodPlay = this;

		food.toArray(foodList);
		
		재료1 = "재료배열-"+foodList[0];
		재료2 = "재료배열-"+foodList[1];
		재료3 = "재료배열-"+foodList[2];
		재료4 = "재료배열-"+foodList[3];

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/도시락게임배경.png"));
		background.setBounds(0, 0, 740, 620);
		
		/* 도시락재료넣기버튼 생성 */
		JButton insertBtn = new JButton(new ImageIcon("images/select/도시락재료넣기버튼.png"));									
		insertBtn.setBounds(50, 380, 160, 70);
		
		/* 넣기 버튼 클릭 시 넣은 재료와 시스템 종료*/	
		insertBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String[] check = new String[makeNum]; 
				
				food.toArray(check);
				
				boolean contains = false;
				
				if(check[0].equals("피망")) {
					foodScore = 0;
		        	changePanel(mf, foodPlay, new pimangInsert(mf));
					System.out.println("짱구가 싫어하는 피망을 선택하였습니다.");
				}
	
				for(int i=0; i<nowRecipe.length; i++) {
				    if(nowRecipe[i] == check[0]) {
				        contains = true;
				        break;
				    }
				}

				if(contains) {
				    foodScore = foodScore + 20;
				    score = Integer.toString(foodScore);
				    System.out.println("맞습니다. 현재 점수는 " + score);
					/* 현재 점수 생성 */
				    nowscore.setText(score);
				} else {
				    foodScore = foodScore - 10;
				    if ( foodScore < 0 ) {
				    	foodScore = 0;
				    }
				    score = Integer.toString(foodScore);
				    System.out.println("틀립니다. 현재 점수는 " + score);
					/* 현재 점수 생성 */
				    nowscore.setText(score);
				}
				
				
				food.remove(0);
				  
				String[] foodList = new String[makeNum];
				

				food.toArray(foodList);
				
		        if (makeNum >= 4) {
		        	
				재료1 = "재료배열-"+foodList[0];
				make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
				make1.setBounds(300, 300, 120, 90);
				
				재료2 = "재료배열-"+foodList[1];
				make2.setIcon(new ImageIcon("images/ui/"+재료2+".png"));
				make2.setBounds(300, 200, 120, 90);
				
				재료3 = "재료배열-"+foodList[2];
				make3.setIcon(new ImageIcon("images/ui/"+재료3+".png"));
				make3.setBounds(300, 100, 120, 90);
				
				재료4 = "재료배열-"+foodList[3];
				make4.setIcon(new ImageIcon("images/ui/"+재료4+".png"));
				make4.setBounds(300, 0, 120, 90);
			
				
		        } else if(makeNum >= 4){
		        	
		        	재료1 = "재료배열-"+foodList[0];
					make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
					
					재료2 = "재료배열-"+foodList[1];
					make2.setIcon(new ImageIcon("images/ui/"+재료2+".png"));
					
					재료3 = "재료배열-"+foodList[2];
					make3.setIcon(new ImageIcon("images/ui/"+재료3+".png"));
					
		        	make4.setIcon(null);
		        	
		        } else if(makeNum >= 3){
		        	
		        	재료1 = "재료배열-"+foodList[0];
					make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
					
					재료2 = "재료배열-"+foodList[1];
					make2.setIcon(new ImageIcon("images/ui/"+재료2+".png"));
					
		        	make3.setIcon(null);
		        	make4.setIcon(null);
		        	
		        } else if(makeNum >= 2){
		        	재료1 = "재료배열-"+foodList[0];
					make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
					
		        	make2.setIcon(null);
		        	make3.setIcon(null);
		        	make4.setIcon(null);
     	
		        } else {
		        	foodOver.getScore(foodScore);
		        	changePanel(mf, foodPlay, new foodOver(mf));
					System.out.println("도시락 게임이 종료되었습니다.");
		        }
				makeNum = makeNum - 1;
			}

		});
		

		/* 도시락재료버리기버튼 생성 */
		JButton dropBtn = new JButton(new ImageIcon("images/select/도시락재료버리기버튼.png"));
		dropBtn.setBounds(540, 380, 160, 70);
		
		/* 넣기 버튼 클릭 시 넣은 재료와 시스템 종료*/	
		dropBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				food.remove(0);
				  
				String[] foodList = new String[makeNum];
				

				food.toArray(foodList);
				
				
		        if (makeNum >= 4) {
		        	
				재료1 = "재료배열-"+foodList[0];
				make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
				
				재료2 = "재료배열-"+foodList[1];
				make2.setIcon(new ImageIcon("images/ui/"+재료2+".png"));
				
				재료3 = "재료배열-"+foodList[2];
				make3.setIcon(new ImageIcon("images/ui/"+재료3+".png"));
				
				재료4 = "재료배열-"+foodList[3];
				make4.setIcon(new ImageIcon("images/ui/"+재료4+".png"));
			
				
		        } else if(makeNum >= 4){
		        	
		        	재료1 = "재료배열-"+foodList[0];
					make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
					
					재료2 = "재료배열-"+foodList[1];
					make2.setIcon(new ImageIcon("images/ui/"+재료2+".png"));
					
					재료3 = "재료배열-"+foodList[2];
					make3.setIcon(new ImageIcon("images/ui/"+재료3+".png"));
					
		        	make4.setIcon(null);
		        	
		        } else if(makeNum >= 3){
		        	
		        	재료1 = "재료배열-"+foodList[0];
					make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
					
					재료2 = "재료배열-"+foodList[1];
					make2.setIcon(new ImageIcon("images/ui/"+재료2+".png"));
					
		        	make3.setIcon(null);
		        	make4.setIcon(null);
		        	
		        } else if(makeNum >= 2){
		        	재료1 = "재료배열-"+foodList[0];
					make1.setIcon(new ImageIcon("images/ui/" + 재료1 + ".png"));
					
		        	make2.setIcon(null);
		        	make3.setIcon(null);
		        	make4.setIcon(null);
     	
		        } else {
		        	changePanel(mf, foodPlay, new foodOver(mf));
					System.out.println("도시락 게임이 종료되었습니다.");
					
		        }
				makeNum = makeNum - 1;
				
			}
			});
		
		
		/* 도시락목표창 생성 */
		JLabel RecipePage = new JLabel(new ImageIcon("images/ui/도시락목표창.png"));
		RecipePage.setBounds(0, 50, 250, 200);
		
		/* 목표 도시락 생성 */
		recipe.setBounds(0, 4, 250, 180);
		
		/* 현재 점수 생성 */
		nowscore.setBounds(670, 490, 200, 200);
		
		/* 1 재료 배열 */
		make1.setIcon(new ImageIcon("images/ui/"+재료1+".png"));
		make1.setBounds(300, 300, 120, 90);
		
		/* 2 재료 배열 */
		make2.setIcon(new ImageIcon("images/ui/"+재료2+".png"));
		make2.setBounds(300, 200, 120, 90);
		
		/* 3 재료 배열 */
		make3.setIcon(new ImageIcon("images/ui/"+재료3+".png"));
		make3.setBounds(300, 100, 120, 90);
		
		/* 4 재료 배열 */
		make4.setIcon(new ImageIcon("images/ui/"+재료4+".png"));
		make4.setBounds(300, 0, 120, 90);
		
		/* 도시락게임도시락 생성 */
		JLabel lunchBox = new JLabel(new ImageIcon("images/ui/도시락게임도시락.png"));
		lunchBox.setBounds(160, 400, 400, 300);
		
		/* 플레이어닉네임표시 */
		JLabel playerName = new JLabel(new ImageIcon("images/ui/플레이어닉네임표시.png"));
		playerName.setBounds(10, 7, 100, 30);
		
		/* 도시락게임점수표시 */
		JLabel foodSc = new JLabel(new ImageIcon("images/ui/도시락점수표시.png"));
		foodSc.setBounds(550, 570, 100, 40);
		
		/* 도시락재료 넣기 짱구 그림 */
		JLabel insertpt = new JLabel(new ImageIcon("images/ui/도시락재료넣기그림.PNG"));
		insertpt.setBounds(68, 250, 120, 150);
		
	
		/* 도시락재료 버리기 쓰레기통 그림 */
		JLabel droppt = new JLabel(new ImageIcon("images/ui/도시락재료버리기그림.PNG"));
		droppt.setBounds(560, 260, 120, 180);
		

		/* 목표 도시락 폰트 설정 */
		Font font = new Font("Rix짱구 M", Font.PLAIN, 29);
		Font scorefont = new Font("Rix짱구 M", Font.PLAIN, 40);



		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);
		
		/*폰트 생성*/
		recipe.setFont(font);
		nowscore.setFont(scorefont);
		nowscore.setForeground(Color.WHITE);

		/* 패널에 컴포넌트들 삽입 */
		this.add(nowscore);
		this.add(recipe);
		this.add(make1);
		this.add(make2);
		this.add(make3);
		this.add(make4);
		this.add(insertBtn);
		this.add(dropBtn);
		this.add(insertpt);
		this.add(droppt);
		this.add(foodSc);
		this.add(playerName);
		this.add(lunchBox);
		this.add(RecipePage);
		this.add(background);
		

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}
		

}
