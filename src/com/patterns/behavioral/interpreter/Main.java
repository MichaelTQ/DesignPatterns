package com.patterns.behavioral.interpreter;

public class Main {
	static Expression buildInterpreterTree() {
		Expression terminal1 = new TerminalExpression("John");
		Expression terminal2 = new TerminalExpression("Henry");
		Expression terminal3 = new TerminalExpression("Mary");
		Expression terminal4 = new TerminalExpression("Owen");
		
		Expression alternation1 = new OrExpression(terminal2, terminal3);
		Expression alternation2 = new OrExpression(terminal1, alternation1);
		
		return new AndExpression(terminal4, alternation2);
	}
	
	public static void main(String[] args) {
		String context = "Mary Owen";
		Expression define = buildInterpreterTree();
		System.out.println(context + " is " + define.interpret(context));
	}
}
