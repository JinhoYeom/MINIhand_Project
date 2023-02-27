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

public class pimangInsert extends JPanel {

	private MainFrame mf;
	private JPanel pimangDrop;

	public pimangInsert(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.pimangDrop = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/피망게임종료배경화면.png"));
		background.setBounds(0, 0, 750, 650);
		
		/* 계속 버튼 생성 */
		JButton conBtn = new JButton(new ImageIcon("images/select/피망종료계속버튼.png"));
		conBtn.setBounds(260, 545, 190, 60);
		

		/* 계속 버튼 클릭 시 메인 피망게임종료 이동*/	
		conBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changePanel(mf, pimangDrop, new pimangOver(mf));
			}
		});
		
		
		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
		this.add(conBtn);

	
		
		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
		}
		

}

