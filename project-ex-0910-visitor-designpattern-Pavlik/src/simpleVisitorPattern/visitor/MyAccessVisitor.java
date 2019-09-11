package simpleVisitorPattern.visitor;

import simpleVisitorPattern.part.Body;
import simpleVisitorPattern.part.Brake;
import simpleVisitorPattern.part.Engine;
import simpleVisitorPattern.part.Wheel;

public class MyAccessVisitor extends CartPartVisitor {
	public void visit(Wheel part) {
		System.out.print("[DBG] Name: " + part.getName());
		System.out.print(", Model #: " + part.getModelNumberWheel());
		System.out.println(", Year: " + part.getModelYearWheel());
	}

	public void visit(Engine part) {
		System.out.print("[DBG] Name: " + part.getName());
		System.out.print(", Model #: " + part.getModelNumberEngine());
		System.out.println(", Year: " + part.getModelYearEngine());
	}

	public void visit(Body part) {
		System.out.print("[DBG] Name: " + part.getName());
		System.out.print(", Model #: " + part.getModelNumberBody());
		System.out.println(", Year: " + part.getModelYearBody());
	}
	public void visit(Brake part) {
		System.out.print("[DBG] Name: " + part.getName());
		System.out.print(", Model #: " + part.getModelNumberBrake());
		System.out.println(", Year: " + part.getModelYearBrake());
	}
}
