package com.greedy.start;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;

public class loading extends JPanel{
	
	private MainFrame mf;
	private JPanel loading;

	public loading(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.loading = this;

	/* 배경화면 이미지 */
	JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
	background.setBounds(0, 0, 750, 630);

	
	/* 컴포넌트들 넣을 패널 생성 */
	this.setLayout(null);
	this.setBounds(0, 0, 750, 650);
	
	/* 패널에 컴포넌트 추가 */
    this.add(background);
    
	/* 프레임에 패널 올리기*/
	mf.add(this);

	/* 배경이미지 레이어위치 맨뒤로 보내기 */
	mf.getLayeredPane().setLayer(background, 0);

	}
}

