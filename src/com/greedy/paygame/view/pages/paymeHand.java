package com.greedy.paygame.view.pages;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;


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
		
		// 마우스 클릭 이벤트 처리를 위한 MouseListener 등록
	    this.addMouseListener(new MouseAdapter() {
	        public void mouseClicked(MouseEvent e) {
	            // 마우스 클릭 시, 두 번째 페이지로 전환
	            mf.getContentPane().removeAll(); // 기존 컴포넌트 삭제
	            JPanel nextPage = new payBet(mf); // 새로운 페이지 생성
	            mf.getContentPane().add(nextPage); // 새로운 페이지 추가
	            mf.revalidate(); // 화면 갱신
	            mf.repaint();
	        }
	    });
		


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



