package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.DTO.payDTO;


public class payyouHand extends JPanel {

	private MainFrame mf;
	private JPanel payyouHand;
	
	
	
	// 내 초코비 표시 레이블
	private JLabel myChocoLabel = new JLabel();
	// 상대방 초코비 표시 레이블
	private JLabel yourChocoLabel = new JLabel();

	public payyouHand(MainFrame mf, payDTO pdto) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.payyouHand = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		JLabel you = new JLabel(new ImageIcon("images/ui/보유초코비레드.png"));
		you.setBounds(570, 10, 150, 50);
		
		/* 라벨에 내초코비로고 삽입 */
		JLabel me = new JLabel(new ImageIcon("images/ui/보유초코비블루.png"));
		me.setBounds(15, 550, 150, 50);
		
		/* 라벨에 내손 삽입 */
		JLabel hand = new JLabel(new ImageIcon("images/ui/상대손.png"));
		hand.setBounds(0, -100, 650, 620);
		
			// 내 구슬 개수 레이블 위치 지정
			myChocoLabel.setBounds(685, 10, 150, 50);
			myChocoLabel.setText("" + pdto.getMyChoco());
			
			// 상대방 구슬 개수 레이블 위치 지정
			yourChocoLabel.setBounds(130, 550, 150, 50);
			yourChocoLabel.setText("" + pdto.getYourChoco());

			// 마우스 클릭 이벤트 처리를 위한 MouseListener 등록
			this.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if ((pdto.getYourChoco() <= 0)) {
					 changePanel(mf, payyouHand, new payLosePage(mf, pdto));
					} else if ((pdto.getMyChoco() <= 0)) {
					 changePanel(mf, payyouHand, new payWinPage(mf, pdto));
					} else {
					 changePanel(mf, payyouHand, new payChoice(mf, pdto));
					}
				}
			});


		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
		this.add(me);
		this.add(you);
		this.add(hand);
		
	
		// 패널에 초코비 레이블 삽입
		this.add(myChocoLabel);
		this.add(yourChocoLabel);


		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
		// myBeadLabel을 layout 맨 앞으로 오게 설정
	    this.setComponentZOrder(myChocoLabel, 0);
	    this.setComponentZOrder(yourChocoLabel, 0);
	    
	    // myBeadLabel의 폰트 설정
	    Font font = new Font("궁서", Font.BOLD, 20);
	    myChocoLabel.setForeground(Color.WHITE);
	    myChocoLabel.setFont(font);
	    yourChocoLabel.setForeground(Color.WHITE);
	    yourChocoLabel.setFont(font);
	}



}



