package com.greedy.paygame.view.pages;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static com.greedy.common.constant.changePanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.DTO.payDTO;


public class paymeHand extends JPanel {
	

	private MainFrame mf;
	private JPanel paymeHand;
//	public int myChoco;
//	public int yourChoco;
	
	// 내 초코비 표시 레이블
	private JLabel myChocoLabel = new JLabel();
	// 상대방 초코비 표시 레이블
	private JLabel yourChocoLabel = new JLabel();

	public paymeHand(MainFrame mf, payDTO pdto) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.paymeHand = this;
		
		/* payDTO 인스턴스 생성 */
//		payDTO paydto = new payDTO();

		/* payDTO에서 myChoco와 yourChoco값을 가져와서 클래스 변수에 저장 */
//		myChoco = paydto.getMyChoco();
//		yourChoco = paydto.getYourChoco();
		
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

		// 내 구슬 개수 레이블 위치 지정
		myChocoLabel.setBounds(685, 10, 150, 50);
		myChocoLabel.setText("" + pdto.getMyChoco()); // JLabel에 값을 설정
		
		// 상대방 구슬 개수 레이블 위치 지정
		yourChocoLabel.setBounds(130, 550, 150, 50);
		yourChocoLabel.setText("" + pdto.getYourChoco()); // JLabel에 값을 설정

		// 마우스 클릭 이벤트 처리를 위한 MouseListener 등록
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if ((pdto.getYourChoco() <= 0)) {
				 changePanel(mf, paymeHand, new payLosePage(mf, pdto));
				}else if ((pdto.getMyChoco() <= 0)) {
				 changePanel(mf, paymeHand, new payWinPage(mf, pdto));
				}else {
				 changePanel(mf, paymeHand, new payBet(mf, pdto));
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
	    Font font = new Font("Rix짱구 M", Font.BOLD, 20);
	    myChocoLabel.setForeground(Color.WHITE);
	    myChocoLabel.setFont(font);
	    yourChocoLabel.setForeground(Color.WHITE);
	    yourChocoLabel.setFont(font);
	    
	    
		}
	}




