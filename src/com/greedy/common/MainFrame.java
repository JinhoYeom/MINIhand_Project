package com.greedy.common;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.greedy.food.foodPlay;



public class MainFrame extends JFrame {
	
	public MainFrame() {
		
		this.setTitle("짱구의 하루");		//타이틀
		this.setSize(750,650);				//레이아웃을 내맘대로 설정
		this.setResizable(false);			//창 크기 변경 금지
		this.setLocationRelativeTo(null);	//창 가운데에 나오도록
		


//		new StartMenu(this);     //시작
//		new payStartMenu(this);
//	  	new GameMenu(this);

//		new foodStartMenu(this);
//		new LogOut(this);
//		new LogIn1(this);
//		new Regist(this);
//		new RegistFail1(this);
//		new RegistFail2(this);
//		new foodOver(this);
//		new pimangDrop(this);
//		new pimangOver(this);
//		new loading(this);
//		new payStory(this);
//		new payYtwoanswer(this);
		new foodPlay(this);	
//		new payYouget(this);
//		new payyouHand(this);
		
		/*프레임창 아이콘*/
		try {
			this.setIconImage(ImageIO.read(new File("images/ui/짱구icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.setVisible(true);									//창이 보이도록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//JFrame이 정상적으로 종료되게
		
	}

}
