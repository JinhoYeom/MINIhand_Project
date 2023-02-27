package com.greedy.paygame.view.pages.food;

import static com.greedy.common.constant.changePanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.common.constant;
import com.greedy.paygame.view.GameMenu;

public class foodPlay extends JPanel {

	/* 전역변수에 컬러파레트 지정 */
//	private Color MAINCOLOR = constant.MAINCOLOR;
//	private Color NAVYCOLOR = constant.NAVYCOLOR;
//	private Color GRAYCOLOR = constant.GRAYCOLOR;

	private MainFrame mf;
	private JPanel foodPlay;

	public foodPlay (MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.foodPlay = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/도시락게임배경.png"));
		background.setBounds(0, 0, 740, 620);
		
		/* 도시락목표창 생성 */
		JLabel targetRecipe = new JLabel(new ImageIcon("images/ui/도시락목표창.png"));
		targetRecipe.setBounds(0, 50, 250, 200);
		
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
		insertpt.setBounds(68, 250, 120, 150
				);
	
		/* 도시락재료 버리기 쓰레기통 그림 */
		JLabel droppt = new JLabel(new ImageIcon("images/ui/도시락재료버리기그림.PNG"));
		droppt.setBounds(560, 260, 120, 180);
		
		/* 도시락재료넣기버튼 생성 */
		JButton insertBtn = new JButton(new ImageIcon("images/select/도시락재료넣기버튼.png"));									
		insertBtn.setBounds(50, 380, 160, 70);
		

		/* 도시락재료버리기버튼 생성 */
		JButton dropBtn = new JButton(new ImageIcon("images/select/도시락재료버리기버튼.png"));
		dropBtn.setBounds(540, 380, 160, 70);



		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
		this.add(insertBtn);
		this.add(dropBtn);
		this.add(insertpt);
		this.add(droppt);
		this.add(foodSc);
		this.add(playerName);
		this.add(lunchBox);
		this.add(targetRecipe);
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}
		


}
