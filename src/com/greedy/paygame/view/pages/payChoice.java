package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.payStartMenu;

public class payChoice extends JPanel {

		private MainFrame mf;
		private JPanel payChoice;

		public payChoice(MainFrame mf) {

			/*현재 프레임 및 클래스 set*/
			this.mf = mf;
			this.payChoice = this;

			/* 라벨에 배경이미지 삽입*/
			JLabel background = new JLabel(new ImageIcon("images/background/홀짝개수맞춰.png"));
			background.setBounds(0, 0, 740, 620);
			
			/* 홀 버튼 생성 */
			JButton oneBtn = new JButton(new ImageIcon("images/select/홀.png"));
			oneBtn.setBounds(420, 340, 100, 70);

			/* 홀 버튼 클릭 시 시스템 종료*/	
			oneBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					changePanel(mf, payChoice, new payStartMenu(mf));
					System.out.println("홀짝게임 메뉴로 이동합니다.");

				}
			});
			/* 짝 버튼 생성 */
			JButton twoBtn = new JButton(new ImageIcon("images/select/짝.png"));
			twoBtn.setBounds(540, 340, 100, 70);
			
			/* 짝 버튼 클릭 시 시스템 종료*/	
			twoBtn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					changePanel(mf, payChoice, new payStartMenu(mf));
					System.out.println("홀짝게임 메뉴로 이동합니다.");
				}
			});
			
			
			/* 컴포넌트들 넣을 패널 생성 */
			this.setLayout(null);
			this.setBounds(0, 0, 750, 650);

			/* 패널에 컴포넌트들 삽입 */
			this.add(oneBtn);
			this.add(twoBtn);

		
			
			this.add(background);

			/* 프레임에 패널 올리기*/
			mf.add(this);

			/* 배경이미지 레이어위치 맨뒤로 보내기 */
			mf.getLayeredPane().setLayer(background, 0);
			}
			


		
	}
