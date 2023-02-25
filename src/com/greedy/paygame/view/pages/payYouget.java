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


public class payYouget extends JPanel {

	private MainFrame mf;
	private JPanel payYouget;

	public payYouget(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.payYouget = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 상대짱구 삽입 */
		JLabel logo = new JLabel(new ImageIcon("images/ui/상대짱구.png"));
		logo.setBounds(10, 40, 700, 620);
		
		/* 대화 삽입 */
		JLabel talk = new JLabel(new ImageIcon("images/ui/상대내놔.png"));
		talk.setBounds(420, 100, 250, 200);


	

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
	
		this.add(logo);
		this.add(talk);
		
	
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}



}



