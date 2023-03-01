package com.greedy.food;

import static com.greedy.common.constant.changePanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.GameMenu;

public class pimangOver extends JPanel {

	private MainFrame mf;
	private JPanel pimangOver;

	public pimangOver(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.pimangOver = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/피망게임종료배경화면.png"));
		background.setBounds(0, 0, 750, 650);
		
		JLabel nowscore = new JLabel("0");
		nowscore.setBounds(340, 175, 100, 100);
		
		/* 도시락게임 종료화면 */
		JLabel overPage = new JLabel(new ImageIcon("images/select/피망게임종료창.png"));
		overPage.setBounds(40, 20, 650, 500);
		
		/* 다시하기 버튼 생성 */
		JButton retryBtn = new JButton(new ImageIcon("images/select/게임종료후다시하기버튼.png"));
		retryBtn.setBounds(130, 400, 200, 70);
		
		/* 다시하기 버튼 클릭 시 도시락게임 시작메뉴 로 이동*/	
		retryBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, pimangOver, new foodStartMenu(mf));
			}
		});

		/* 나가기 버튼 생성 */
		JButton quitBtn = new JButton(new ImageIcon("images/select/게임종료후나가기버튼.png"));
		quitBtn.setBounds(400, 400, 200, 70);
		

		/* 나가기 버튼 클릭 시 메인 게임메뉴로 이동*/	
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, pimangOver, new GameMenu(mf));
			}
		});
		
		/* 폰트 설정 */
		Font scorefont = new Font("Rix짱구 M", Font.PLAIN, 40);
		
		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);
		
		/* 폰트 삽입 */
		nowscore.setFont(scorefont);

		/* 패널에 컴포넌트들 삽입 */
		this.add(nowscore);
		this.add(retryBtn);
		this.add(quitBtn);
		this.add(overPage);

	
		
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
		}
		

}

