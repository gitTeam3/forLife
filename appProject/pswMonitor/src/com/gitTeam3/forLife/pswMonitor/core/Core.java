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
	
}
