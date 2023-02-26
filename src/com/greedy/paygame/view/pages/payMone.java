package com.greedy.paygame.view.pages;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;

public class payMone extends JPanel {

		private MainFrame mf;
		private JPanel payMone;

		public  payMone(MainFrame mf) {

			/*현재 프레임 및 클래스 set*/
			this.mf = mf;
			this.payMone = this;

//			payBet betPanel = (payBet) mf.getPanel("payBet");
//	        String inputText = betPanel.getField().getText();
//	        int inputNumber = Integer.parseInt(inputText);
      
			/* 라벨에 배경이미지 삽입*/
			JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
			background.setBounds(0, 0, 740, 620);
			
			/* 라벨에 상대홀 삽입*/
			JLabel logo = new JLabel(new ImageIcon("images/ui/Mone.png"));
			logo.setBounds(150, 200, 740, 620);
		
			/* 라벨에 우리손 삽입*/
			JLabel Ima = new JLabel(new ImageIcon("images/ui/상대손.png"));
			Ima.setBounds(0, -150, 650, 620);
		
			// 입력한 숫자가 짝수인지 홀수인지 판별
//	        String whoNum = (inputNumber % 2 == 0) ? "짝" : "홀";

//	        // 화면 전환
//	        if (whoNum.equals("홀")) {
//	            changePanel(mf, payMone.this, new payYone(mf));
//	        } else {
//	            changePanel(mf, payMone.this, new payYtwo(mf));
//	        }
			
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
		}
			
}