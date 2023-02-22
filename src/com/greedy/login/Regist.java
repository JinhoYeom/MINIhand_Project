package com.greedy.login;

import java.awt.TextField;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;

public class Regist extends JPanel {
	
	private MainFrame mf;
	private JPanel Regist;

	
	public Regist(MainFrame mf) {
		
		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.Regist = this;

	
    /* JPanel 생성 */
    JPanel panel = new JPanel(null);
    panel.setLayout(null);
	
	/* 배경화면 이미지 */
	JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
	background.setBounds(0, 0, 750, 630);
	
	/* 짱구의 하루 라벨 */
	JLabel logo = new JLabel(new ImageIcon("images/ui/Start_logo.PNG"));
	logo.setBounds(0, 30, 750, 150);
	logo.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
	
	/* 회원가입 창 */
	JLabel regist = new JLabel(new ImageIcon("images/ui/login-regist.PNG"));
	regist.setBounds(40, 60, 650, 500);
	regist.setHorizontalAlignment(JLabel.CENTER); 		// 수평 가운데 정렬
	
	/* 나가기 버튼 */
	JButton b1 = new JButton(new ImageIcon("images/select/login-registout.PNG"));
	b1.setBounds(150, 450, 160, 55);

	/* 회원가입 버튼 */
	JButton b2 = new JButton(new ImageIcon("images/select/login_registbt.PNG"));
	b2.setBounds(420, 450, 160, 55);
	
	/* 아이디 입력 */
	TextField idtext = new TextField();
	idtext.setBounds(220, 200, 450, 45);
	
	/* 비밀번호 입력 */
	TextField pwdtext = new TextField();
	pwdtext.setBounds(220, 275, 450, 45);
	
	/* 닉네임 입력 */
	TextField nametext = new TextField();
	nametext.setBounds(220, 350, 450, 45);
	
	/* 짱구 그림 */
	JLabel picture = new JLabel(new ImageIcon("images/ui/Start_짱구.PNG"));
	picture.setBounds(20, 280, 160, 250);
	
	/* 컴포넌트들 넣을 패널 생성 */
	this.setLayout(null);
	this.setBounds(0, 0, 750, 650);
	
	
	/* 패널에 컴포넌트 추가 */
	this.add(b1);			//나가기
	this.add(b2);			//가입하기
    this.add(idtext);		//아이디 텍스트
    this.add(pwdtext);		//비밀번호 텍스트
    this.add(nametext);	//닉네임 텍스트
	this.add(regist);		//회원가입 창
    this.add(logo);		//짱구의 하루 라벨
    this.add(picture);		//짱구 그림
    this.add(background);	//배경화면


	/* 프레임에 패널 올리기*/
	mf.add(this);

	/* 배경이미지 레이어위치 맨뒤로 보내기 */
	mf.getLayeredPane().setLayer(background, 0);

	}
}


