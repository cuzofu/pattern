package com.cuzofu.pattern.visitor;

public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);

}
