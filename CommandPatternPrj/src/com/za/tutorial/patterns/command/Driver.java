package com.za.tutorial.patterns.command;

public class Driver {

	public static void main(String[] args){
		CommandMgr mgr = new CommandMgr();
		CommandInvoker inv = new CommandInvoker(mgr);
		inv.invoke("open");
		inv.invoke("save");
		inv.invoke("close");
		CommandMgr.printHistory(mgr);
	}
}
