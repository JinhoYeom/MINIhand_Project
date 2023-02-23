package com.greedy.login;

import static com.greedy.common.constant.changePanel;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.GameMenu;
import com.greedy.start.StartMenu;

public class LogInFail1 extends JPanel{
	
	private MainFrame mf;
	private JPanel LogInFail1;

			public LogInFail1 (MainFrame mf) {
				
				/*현재 프레임 및 클래스 set*/
				this.mf = mf;
				this.LogInFail1 = this;

		    /* JPanel 생성 */
		    JPanel panel = new JPanel(null);
		    panel.setLayout(null);
			
			/* 배경화면 이미지 */
			JLabel background = new JLabel(new ImageIcon("images/background/Start-bg.PNG"));
			background.setBounds(0, 0, 750, 630);
			
			/* 짱구의 하루 라벨 */
			JLabel logo = new JLabel(new ImageIcon("images/ui/Start_logo.PNG"));
			logo.setBounds(0, 30, 750, 150);
			
			/* 아이디 입력 */
			TextField idtext = new TextField();
			idtext.setBounds(230, 190, 450, 45);
			
			/* 아이디 입력 경고 */
			JLabel idfail = new JLabel(new ImageIcon("images/ui/입력요구-아이디.PNG"));
			idfail.setBounds(235, 245, 350, 20);
			
			/* 비밀번호 입력 */
			TextField pwdtext = new TextField();
			pwdtext.setBounds(230, 305, 450, 45);
			
			
			/* 로그인 라벨 */
			JLabel logo2 = new JLabel(new ImageIcon("images/ui/login1.PNG"));
			logo2.setBounds(60, 60, 650, 500);
			
			/* 나가기 버튼 */
			JButton b1 = new JButton(new ImageIcon("images/select/login_outbt1.PNG"));
			b1.setBounds(100, 450, 160, 55);
			
			/* 나가기 버튼 클릭 시 시작화면으로 이동*/	
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					changePanel(mf, LogInFail1, new StartMenu(mf));
				}
			});
			
			/* 확인 버튼 */
			JButton b2 = new JButton(new ImageIcon("images/select/login_inbt1.PNG"));
			b2.setBounds(300, 450, 160, 55);
			
			/* 확인 버튼 클릭시 아이디와 비밀번호 입력이 제대로 됐는지 확인 후 로그인 */
			b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(idtext.getText().equals("")) {
						changePanel(mf, LogInFail1, new LogInFail1(mf));
					} else if(pwdtext.getText().equals("")) {
						changePanel(mf, LogInFail1, new LogInFail2(mf)); 
					} else {
						changePanel(mf, LogInFail1, new GameMenu(mf));
				}
				}
			});
			
			/* 회원가입 버튼 */
			JButton b3 = new JButton(new ImageIcon("images/select/login_registbt.PNG"));
			b3.setBounds(500, 450, 160, 55);
			
			/* 회원가입 버튼 클릭 시 회원가입창으로 이동*/	
			b3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					changePanel(mf, LogInFail1, new Regist(mf));
				}
			});
			

			/* 짱구 그림 */
			JLabel picture = new JLabel(new ImageIcon("images/ui/Start_짱구.PNG"));
			picture.setBounds(20, 280, 160, 250);
			
			/* 컴포넌트들 넣을 패널 생성 */
			this.setLayout(null);
			this.setBounds(0, 0, 750, 650);
			
			
			/* 패널에 컴포넌트 추가 */
			this.add(b1);			//나가기
			this.add(b2);			//확인
			this.add(b3);			//회원가입
		    this.add(idtext);		//아이디 텍스트
		    this.add(idfail);		//아이디 입력 경고
		    this.add(pwdtext);		//비밀번호 텍스트
			this.add(logo2);		//로그인 창
		    this.add(logo);		//짱구의 하루 라벨
		    this.add(picture);		//짱구 그림
		    this.add(background);	//배경화면


			/* 프레임에 패널 올리기*/
			mf.add(this);

			/* 배경이미지 레이어위치 맨뒤로 보내기 */
			mf.getLayeredPane().setLayer(background, 0);

			}
		}

