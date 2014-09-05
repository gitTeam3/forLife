package com.gitTeam3.forLife.pswMonitor.core;

public abstract class Regulation
{
	private int length=6;//密码总长度
	private int letter=0;//字母长度，默认为0
	private String src;//用于生成密码的原型，由数字构成的字符串
	
	public Regulation(){}
	public Regulation(int length){
		this.length =length;
	}
	public Regulation(int length,int letter){
		this(length);
		this.letter=letter;
	}

	public void setSrc(String src)
	{
		this.src = src;
	}

	public String getSrc()
	{
		return src;
	}

	public void setLetter(int letter)
	{
		this.letter = letter;
	}

	public int getLetter()
	{
		return letter;
	}
	
	public int getLength(){
		return this.length;
	}
	public void setLengt(int length){
		this.length=length;
	}
	public String produce(){
		
		return null;
	}
}
