package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;

public class payStory extends JPanel {

		private MainFrame mf;
		private JPanel payStory;

		public  payStory(MainFrame mf) {

			/*현재 프레임 및 클래스 set*/
			this.mf = mf;
			this.payStory = this;

			/* 라벨에 배경이미지 삽입*/
			JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
			background.setBounds(0, 0, 740, 620);
			
			/* 라벨에 놀려 삽입*/
			JLabel logo = new JLabel(new ImageIcon("images/ui/놀려.png"));
			logo.setBounds(-150, 150, 740, 620);
		
			/* 라벨에 우리손 삽입*/
			JLabel Ima = new JLabel(new ImageIcon("images/ui/우리손.png"));
			Ima.setBounds(150, 100, 650, 620);
		
			
			/* 컴포넌트들 넣을 패널 생성 */
			this.setLayout(null);
			this.setBounds(0, 0, 750, 650);

			/* 패널에 컴포넌트들 삽입 */
			this.add(logo);
			this.add(Ima);
		
			this.add(background);

			/* 프레임에 패널 올리기*/
			mf.add(this);

			/* 배경이미지 레이어위치 맨뒤로 보내기 */
			mf.getLayeredPane().setLayer(background, 0);

			// 랜덤 숫자 생성 및 홀짝 판별
        	int randomNumber;
        	String whoNum;
        	do {
        		randomNumber = new Random().nextInt(10) + 1; // 1부터 10까지의 랜덤 숫자 생성
        		whoNum = (randomNumber % 2 == 0) ? "짝" : "홀";
        	}	while (whoNum.equals("홀")); // 홀수가 나오면 다시 랜덤 숫자 생성
			

			// 이동할 화면 선택
			if (whoNum.equals("홀")) {
				changePanel(mf, payStory, new payYone(mf));
			} else {
		    changePanel(mf, payStory, new payYtwo (mf));
			}


		}
	}
