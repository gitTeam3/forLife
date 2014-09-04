package com.gitTeam3.forLife.pswMonitor.core;

public class Core
{
	private final long defaultSeed=8023;//默认的密码种子
	private long pswSeed;//密码种子
	
	
	public Core(){
		
		this.pswSeed=defaultSeed;
	}
	
	public Core(long seed){
		this.pswSeed=seed;
	}
	/**
	 *返回默认长度的密码
	 */
	public String getPsw(){
		
		return null;
	}
	/**
	 *根据lengt返回定长的纯数字密码
	 */
	public String getPsw(int length){

		return null;
	}
	/**
	 *返回长度为length包含letterLength个字母的混合密码
	 */
	public String getPsw(int length,int letterLength){

		return null;
	}
}
