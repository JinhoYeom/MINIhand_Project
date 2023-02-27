package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;

public class payMtwo extends JPanel {

	private MainFrame mf;
	private JPanel payMtwo;

	public  payMtwo(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.payMtwo = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 라벨에 상대홀 삽입*/
		JLabel logo = new JLabel(new ImageIcon("images/ui/Mtwo.png"));
		logo.setBounds(150, 200, 740, 620);

		/* 라벨에 우리손 삽입*/
		JLabel Ima = new JLabel(new ImageIcon("images/ui/상대손.png"));
		Ima.setBounds(0, -150, 650, 620);


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
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// 1부터 10까지의 난수 생성
				int randomNumber = (int) (Math.random() * 10) + 1;
				// 입력한 숫자가 짝수인지 홀수인지 판별
				String whoNum = (randomNumber % 2 == 0) ? "짝" : "홀";

				if (whoNum.equals("홀")) {
					changePanel(mf, payMtwo, new payYoneanswer(mf));
				} else {
					changePanel(mf, payMtwo, new payYtwoanswer(mf));
				}
			}
		});

	}
}


