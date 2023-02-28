package com.greedy.paygame.view.pages;

import static com.greedy.common.constant.changePanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import com.greedy.common.MainFrame;

public class payBet extends JPanel {

	private MainFrame mf;
	public JPanel payBet;
	public JTextField chocoNumField; // 초코비 개수 입력받는 필드
	public static int ChocoNum;

	public payBet(MainFrame mf) {

		/*현재 프레임 및 클래스 set*/
		this.mf = mf;
		this.payBet = this;

		/* 라벨에 배경이미지 삽입*/
		JLabel background = new JLabel(new ImageIcon("images/background/홀짝배경.png"));
		background.setBounds(0, 0, 740, 620);

		/* 라벨에 배경이미지 삽입*/
		JLabel logo = new JLabel(new ImageIcon("images/background/홀짝몇개.png"));
		logo.setBounds(0, 0, 740, 620);

		/* 초코비 개수 입력받는 텍스트 필드 생성 */
		chocoNumField = new JTextField();
		chocoNumField.setBounds(270, 320, 100, 60);
		chocoNumField.setDocument(doc);
		
		/* 확인 버튼 생성 */
		JButton yesBtn = new JButton(new ImageIcon("images/select/홀짝확인버튼.png"));
		yesBtn.setBounds(200, 400, 100, 60);


		/* 확인 버튼 클릭 시 걸기*/	
		yesBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChocoNum = Integer.parseInt(chocoNumField.getText());
				// 초코비 개수 가져오기
				// TODO: 걸기 기능 구현
				changePanel(mf, payBet, new payStory(mf));
				System.out.println("스토리로 이동합니다.");
			}
		});
	
		/* 컴포넌트들 넣을 패널 생성 */
		this.setLayout(null);
		this.setBounds(0, 0, 750, 650);

		/* 패널에 컴포넌트들 삽입 */
		this.add(yesBtn);
		this.add(logo);
		this.add(chocoNumField);
		
		 Font font = new Font("궁서", Font.BOLD, 20);
		 chocoNumField.setFont(font);

		this.add(background);

		/* 프레임에 패널 올리기*/
		mf.add(this);

		/* 배경이미지 레이어위치 맨뒤로 보내기 */
		mf.getLayeredPane().setLayer(background, 0);
	}
	
	
	PlainDocument doc = new PlainDocument() {
	    @Override
	    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null) {
                return;
            }
            try {
                Integer.parseInt(str); // 입력값이 숫자인지 확인
            } catch (NumberFormatException e) {
                return; // 숫자가 아니면 입력 불가
            }
            if (getLength() + str.length() > 2) { // 입력값이 10자리를 초과하면 잘라내기
                str = str.substring(0, 2 - getLength());
            }
            super.insertString(offs, str, a);
        }
    };


    public static int getChocoNum() {
		return ChocoNum;
	}
}
