package com.greedy.start;

import static com.greedy.common.constant.changePanel;

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
import com.greedy.login.LogIn1;

public class StartMenu extends JPanel{
	
	private MainFrame mf;
	private JPanel StartMenu;

	public StartMenu(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.StartMenu = this;

	/* 배경화면 이미지 */
	JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
	background.setBounds(0, 0, 750, 630);
	
	/* 짱구의 하루 라벨 */
	JLabel logo = new JLabel(new ImageIcon("images/ui/Start_logo.PNG"));
	logo.setBounds(0, 30, 750, 150);
	
	/* 시작하기 버튼 */
	JButton b1 = new JButton(new ImageIcon("images/select/Start_startbt.PNG"));
	b1.setBounds(190, 370, 360, 60);
	
	/* 시작하기 버튼 클릭 시 로그인화면으로 이동*/	
	b1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			changePanel(mf, StartMenu, new LogIn1(mf));
		}
	});
	
	/* 종료하기 버튼 */
	JButton b2 = new JButton(new ImageIcon("images/select/Start_quitbt.PNG"));
	b2.setBounds(190, 450, 360, 60);
	
	/* 나가기 버튼 클릭 시 로그인화면으로 이동*/	
	b2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			changePanel(mf, StartMenu, new LogOut(mf));
		}
	});
	
	/* 짱구 그림 */
	JLabel picture = new JLabel(new ImageIcon("images/ui/Start_짱구.PNG"));
	picture.setBounds(20, 280, 160, 250);
	
	/* 컴포넌트들 넣을 패널 생성 */
	this.setLayout(null);
	this.setBounds(0, 0, 750, 650);
	
	/* 패널에 컴포넌트 추가 */
    this.add(b1);
    this.add(b2);
    this.add(picture);
    this.add(logo);
    this.add(background);
    
	/* 프레임에 패널 올리기*/
	mf.add(this);

	/* 배경이미지 레이어위치 맨뒤로 보내기 */
	mf.getLayeredPane().setLayer(background, 0);

	}
}

