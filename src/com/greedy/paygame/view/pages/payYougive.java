package com.greedy.paygame.view.pages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;



public class payYougive extends JPanel {
	int chocoNum = payBet.getChocoNum();
	public int yourChoco = paymeHand.getyourChoco();// 다른 클래스에서 초콜릿 개수를 가져옴
	private MainFrame mf;
	private JPanel payYougive;
	
	
	public payYougive(MainFrame mf) {
	
		

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.payYougive = this;
		

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 상대짱구 삽입 */
		JLabel logo = new JLabel(new ImageIcon("images/ui/상대짱구.png"));
		logo.setBounds(10, 40, 700, 620);

		/* 대화 삽입 */
		JLabel talk = new JLabel(new ImageIcon("images/ui/상대가져라.png"));
		talk.setBounds(420, 100, 250, 200);
		
		
		
		

		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		// 마우스 클릭 이벤트 처리를 위한 MouseListener 등록
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// 마우스 클릭 시, 두 번째 페이지로 전환
				mf.getContentPane().removeAll(); // 기존 컴포넌트 삭제
				JPanel nextPage = new payMeget(mf); // 새로운 페이지 생성
				mf.getContentPane().add(nextPage); // 새로운 페이지 추가
				mf.revalidate(); // 화면 갱신
				mf.repaint();
			}
		});

		
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


