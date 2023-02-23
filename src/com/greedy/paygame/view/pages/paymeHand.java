package com.greedy.paygame.view.pages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.payStartMenu;

import static com.greedy.common.constant.changePanel;


public class paymeHand extends JPanel {

	private MainFrame mf;
	private JPanel paymeHand;

	public paymeHand(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.paymeHand = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 라벨에 상대초코비로고 삽입 */
		JLabel you = new JLabel(new ImageIcon("images/ui/보유초코비레드.png"));
		you.setBounds(570, 10, 150, 50);
		
		/* 라벨에 내초코비로고 삽입 */
		JLabel me = new JLabel(new ImageIcon("images/ui/보유초코비블루.png"));
		me.setBounds(15, 550, 150, 50);
		
		/* 라벨에 내손 삽입 */
		JLabel hand = new JLabel(new ImageIcon("images/ui/우리손.png"));
		hand.setBounds(150, 100, 650, 620);
		
		
	


		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
		this.add(me);
		this.add(you);
		this.add(hand);
		
	
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}



}



