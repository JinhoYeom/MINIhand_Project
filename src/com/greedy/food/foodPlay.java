package com.greedy.food;

import static com.greedy.common.constant.changePanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	private JLabel recipe = new JLabel(RandomRecipe());

	public foodPlay (MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.foodPlay = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/도시락게임배경.png"));
		background.setBounds(0, 0, 740, 620);
		
		/* 도시락목표창 생성 */
		JLabel RecipePage = new JLabel(new ImageIcon("images/ui/도시락목표창.png"));
		RecipePage.setBounds(0, 50, 250, 200);
		
		/* 목표 도시락 생성 */
		recipe.setBounds(0, 4, 250, 180);
		
		/* 1 재료 배열 */
		JLabel make1 = new JLabel(new ImageIcon("images/ui/재료배열-계란말이.png"));
		make1.setBounds(300, 300, 120, 90);
		
		/* 2 재료 배열 */
		JLabel make2 = new JLabel(new ImageIcon("images/ui/재료배열-계란말이.png"));
		make2.setBounds(300, 200, 120, 90);
		
		/* 3 재료 배열 */
		JLabel make3 = new JLabel(new ImageIcon("images/ui/재료배열-계란말이.png"));
		make3.setBounds(300, 100, 120, 90);
		
		/* 4 재료 배열 */
		JLabel make4 = new JLabel(new ImageIcon("images/ui/재료배열-계란말이.png"));
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
		
		/* 도시락재료넣기버튼 생성 */
		JButton insertBtn = new JButton(new ImageIcon("images/select/도시락재료넣기버튼.png"));									
		insertBtn.setBounds(50, 380, 160, 70);
		

		/* 도시락재료버리기버튼 생성 */
		JButton dropBtn = new JButton(new ImageIcon("images/select/도시락재료버리기버튼.png"));
		dropBtn.setBounds(540, 380, 160, 70);
		
		/* 목표 도시락 폰트 설정 */
		Font font = new Font("Rix짱구 M", Font.PLAIN, 33);



		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);
		
		/*폰트 생성*/
		recipe.setFont(font);

		/* 패널에 컴포넌트들 삽입 */
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
		
	public String RandomRecipe() {
		
		String wantrecipe = null;
		
		Random random = new Random();
		
		int recipeCode = random.nextInt(3)+1;
	
		if(recipeCode == 1) {
			wantrecipe = 짱구;
		} else if(recipeCode == 2) {
			wantrecipe = 철수;
		} else if(recipeCode == 3) {
			wantrecipe = 유리;
		}
		
		return wantrecipe;
	}

}
