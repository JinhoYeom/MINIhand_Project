package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.payStartMenu;
import com.greedy.paygame.view.DTO.payDTO;

public class payYtwo extends JPanel {

	private MainFrame mf;
	private JPanel payYtwo;
	public int myChoco;
	public int yourChoco;
	public static String result2;
	
	public  payYtwo(MainFrame mf, payDTO pdto) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.payYtwo = this;
		
		/* payDTO 인스턴스 생성 */
		payDTO paydto = new payDTO();

		/* payDTO에서 myChoco와 yourChoco값을 가져와서 클래스 변수에 저장 */
		myChoco = paydto.getMyChoco();
		yourChoco = paydto.getYourChoco();

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 라벨에 상대홀 삽입*/
		JLabel logo = new JLabel(new ImageIcon("images/ui/Ytwo.png"));
		logo.setBounds(-150, -180, 740, 620);

		/* 라벨에 우리손 삽입*/
		JLabel Ima = new JLabel(new ImageIcon("images/ui/우리손.png"));
		Ima.setBounds(150, 100, 650, 620);

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// payBet 패널에서 입력한 숫자 가져오기
				int chocoNum = payBet.getChocoNum();
				String whoNum = (chocoNum % 2 == 0) ? "짝" : "홀";
				if (whoNum.equals("홀")) {
					pdto.setMyChoco(pdto.getMyChoco()-chocoNum);
		            pdto.setYourChoco(pdto.getYourChoco()+chocoNum);
		            result2 = "win";
		            changePanel(mf, payYtwo, new payMoneanswer(mf, pdto));
		        } else {
		        	pdto.setMyChoco(pdto.getMyChoco()+chocoNum);
		            pdto.setYourChoco(pdto.getYourChoco()-chocoNum);
		            result2 = "lose";
		            changePanel(mf, payYtwo, new payMtwoanswer(mf, pdto));
		        }
				mf.revalidate(); // 화면 갱신
				mf.repaint();
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
	
	 public static String getresult2() {
			return result2;
		}
}
