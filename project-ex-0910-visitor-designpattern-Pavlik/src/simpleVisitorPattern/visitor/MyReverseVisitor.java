package simpleVisitorPattern.visitor;

import java.io.File;
import java.util.List;

import simpleVisitorPattern.part.Body;
import simpleVisitorPattern.part.Brake;
import simpleVisitorPattern.part.Engine;
import simpleVisitorPattern.part.Wheel;
import util.UtilFile;

public class MyReverseVisitor extends CartPartVisitor {


   @Override
   public void visit(Wheel part) {
	   part.setName(reverseKeepInSpot(part.getName()));
	    part.setModelNumberWheel(reverseKeepInSpot(part.getModelNumberWheel()));
	    part.setModelYearWheel(reverseKeepInSpot(part.getModelYearWheel()));
   }

   @Override
   public void visit(Engine part) {
		part.setName(reverseKeepInSpot(part.getName()));
	    part.setModelNumberEngine(reverseKeepInSpot(part.getModelNumberEngine()));
	    part.setModelYearEngine(reverseKeepInSpot(part.getModelYearEngine()));
   }

   @Override
   public void visit(Body part) {
	   	part.setName(reverseKeepInSpot(part.getName()));
	    part.setModelNumberBody(reverseKeepInSpot(part.getModelNumberBody()));
	    part.setModelYearBody(reverseKeepInSpot(part.getModelYearBody()));
	}

	@Override
	public void visit(Brake part) {
	    part.setName(reverseKeepInSpot(part.getName()));
	    part.setModelNumberBrake(reverseKeepInSpot(part.getModelNumberBrake()));
	    part.setModelYearBrake(reverseKeepInSpot(part.getModelYearBrake()));
	}
	
	private String reverseKeepInSpot(String str) {
		String words[]=str.split("\\s");  
	    String reversed="";  
	    for(String word:words){  
	        StringBuilder sb=new StringBuilder(word);  
	        sb.reverse();  
	        reversed+=sb.toString()+" ";  
	    }  
		
		return reversed;
	}
}
