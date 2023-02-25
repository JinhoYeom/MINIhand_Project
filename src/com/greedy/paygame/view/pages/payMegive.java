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


public class payMegive extends JPanel {

	private MainFrame mf;
	private JPanel payMegive;

	public payMegive(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.payMegive = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 우리짱구 삽입 */
		JLabel logo = new JLabel(new ImageIcon("images/ui/우리짱구.png"));
		logo.setBounds(70, 10, 700, 620);
		
		/* 대화 삽입 */
		JLabel talk = new JLabel(new ImageIcon("images/ui/우리가져라.png"));
		talk.setBounds(20, 100, 250, 200);


	

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



