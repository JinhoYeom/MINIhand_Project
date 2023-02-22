package com.greedy.start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;

public class LogOut extends JPanel {

	private MainFrame mf;
	private JPanel LogOut;
	
	public LogOut(MainFrame mf) {
		
		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.LogOut = this;

		
		/* JPanel 생성 */
		JPanel panel = new JPanel(null);
		panel.setLayout(null);

		/* 배경화면 생성 */
		JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
		background.setBounds(0, 0, 750, 630);

		/* 짱구의 하루 라벨 생성 */
		JLabel logo1 = new JLabel(new ImageIcon("images/ui/Start_logo.PNG"));
		logo1.setBounds(0, 30, 750, 150);
		logo1.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬

		/* 종료 라벨 생성 */
		JLabel logo2 = new JLabel(new ImageIcon("images/ui/Start_logout.PNG"));
		logo2.setBounds(60, 60, 650, 500);
		logo2.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
		
		/* 짱구 그림 */
		JLabel picture = new JLabel(new ImageIcon("images/ui/Start_짱구.PNG"));
		picture.setBounds(20, 280, 160, 250);

		/* 종료 버튼 생성 */
		JButton b1 = new JButton(new ImageIcon("images/select/Start_logoutBt.PNG"));
		b1.setBounds(300, 400, 140, 60);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);
		
		/* 패널에 컴포넌트 추가 */
		this.add(b1);
		this.add(logo2);
		this.add(logo1);
		this.add(picture);
		this.add(background);
		
		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);

	}

}


