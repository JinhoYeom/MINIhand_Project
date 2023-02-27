package com.greedy.paygame.view.pages.food;

import static com.greedy.common.constant.changePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.greedy.common.MainFrame;
import com.greedy.paygame.view.GameMenu;

public class foodOver extends JPanel {

	private MainFrame mf;
	private JPanel foodOver;

	public foodOver(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.foodOver = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/도시락게임배경.png"));
		background.setBounds(0, 0, 740, 620);
		
		
		/* 도시락게임 종료화면 */
		JLabel overPage = new JLabel(new ImageIcon("images/select/도시락게임종료창.png"));
		overPage.setBounds(40, 20, 650, 500);
		
		/* 다시하기 버튼 생성 */
		JButton retryBtn = new JButton(new ImageIcon("images/select/게임종료후다시하기버튼.png"));
		retryBtn.setBounds(130, 400, 200, 70);
		
		/* 다시하기 버튼 클릭 시 도시락게임 시작메뉴 로 이동*/	
		retryBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, foodOver, new foodStartMenu(mf));
			}
		});

		/* 나가기 버튼 생성 */
		JButton quitBtn = new JButton(new ImageIcon("images/select/게임종료후나가기버튼.png"));
		quitBtn.setBounds(400, 400, 200, 70);
		

		/* 나가기 버튼 클릭 시 메인 게임메뉴로 이동*/	
		quitBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, foodOver, new GameMenu(mf));
			}
		});
		
		
		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
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

