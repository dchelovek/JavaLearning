package com.za.tutorial.patterns.command;

public abstract class Command {
	protected CommandMgr mgr;
	abstract void doSmth();
}
