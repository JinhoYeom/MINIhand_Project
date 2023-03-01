package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.DTO.payDTO;

public class payMtwoanswer extends JPanel {

		private MainFrame mf;
		private JPanel payMtwoanswer;
		public String result2 = payYtwo.getresult2();
		public String result1 = payYone.getresult1();

		public payMtwoanswer(MainFrame mf, payDTO pdto) {
			
			/*현재 프레임 및 클래스 set*/
			this.mf = mf;
			this.payMtwoanswer = this;

			/* 라벨에 배경이미지 삽입*/
			JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
			background.setBounds(0, 0, 740, 620);
			
			/* 라벨에 상대홀 삽입*/
			JLabel logo = new JLabel(new ImageIcon("images/ui/우리짝.png"));
			logo.setBounds(70, 0, 740, 620);
		
			/* 라벨에 우리손 삽입*/
			JLabel Ima = new JLabel(new ImageIcon("images/ui/우리손.png"));
			Ima.setBounds(150, 100, 650, 620);
			
			this.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if ("win".equals(result1)) {
						changePanel(mf, payMtwoanswer, new payYougive(mf, pdto));
			        } else if("lose".equals(result1)) {
			        	changePanel(mf, payMtwoanswer, new payMegive(mf, pdto));
			        } else if ("win".equals(result2)) {
						changePanel(mf, payMtwoanswer, new payMegive(mf, pdto));
			        } else {
			        	changePanel(mf, payMtwoanswer, new payYougive(mf, pdto));
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
