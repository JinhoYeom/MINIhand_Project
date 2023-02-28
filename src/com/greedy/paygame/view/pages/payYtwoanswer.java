package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;

public class payYtwoanswer extends JPanel {

		private MainFrame mf;
		private JPanel payYtwoanswer;
		public String result3 = payMtwo.getresult3();
		public String result4 = payMone.getresult4();

		public  payYtwoanswer(MainFrame mf) {

			/*현재 프레임 및 클래스 set*/
			this.mf = mf;
			this.payYtwoanswer = this;

			/* 라벨에 배경이미지 삽입*/
			JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
			background.setBounds(0, 0, 740, 620);
			
			/* 라벨에 상대홀 삽입*/
			JLabel logo = new JLabel(new ImageIcon("images/ui/상대짝.png"));
			logo.setBounds(0, -50, 740, 620);
		
			/* 라벨에 우리손 삽입*/
			JLabel Ima = new JLabel(new ImageIcon("images/ui/상대손.png"));
			Ima.setBounds(0, -150, 650, 620);
			
			this.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if ("win".equals(result3)) {
						changePanel(mf, payYtwoanswer, new payYYougive(mf));
					} else if("lose".equals(result3)) {
						changePanel(mf, payYtwoanswer, new payMMegive(mf));
					} else if ("lose".equals(result4)) {
						changePanel(mf, payYtwoanswer, new payMMegive(mf));
					} else {
						changePanel(mf, payYtwoanswer, new payYYougive(mf));
					}


				}
			});

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
