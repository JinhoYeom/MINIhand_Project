package com.greedy.paygame.view.DTO;

public class payDTO {
	private int myChoco = 20;
	private int yourChoco = 20;
	private int max = 10;
	
	public payDTO() {}

	public payDTO(int myChoco, int yourChoco, int max) {
		super();
		this.myChoco = myChoco;
		this.yourChoco = yourChoco;
		this.max = max;
	}

	public int getMyChoco() {
		return myChoco;
	}

	public void setMyChoco(int myChoco) {
		this.myChoco = myChoco;
	}

	public int getYourChoco() {
		return yourChoco;
	}

	public void setYourChoco(int yourChoco) {
		this.yourChoco = yourChoco;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "payDTO [myChoco=" + myChoco + ", yourChoco=" + yourChoco + ", max=" + max + "]";
	}
}
