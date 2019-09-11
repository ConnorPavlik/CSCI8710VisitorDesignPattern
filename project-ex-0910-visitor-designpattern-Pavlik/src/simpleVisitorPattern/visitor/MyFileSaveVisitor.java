package simpleVisitorPattern.visitor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import simpleVisitorPattern.part.Body;
import simpleVisitorPattern.part.Brake;
import simpleVisitorPattern.part.Engine;
import simpleVisitorPattern.part.Wheel;
import util.UtilFile;

public class MyFileSaveVisitor extends CartPartVisitor {

   private String filePath = System.getProperty("user.dir");
   private String fileOutPath;
   private File file;

   public MyFileSaveVisitor() {
	   fileOutPath = filePath + File.separator + "outputdata.txt";
	   file = new File(fileOutPath);
	   try {
		   if (!file.exists()) {
          
				file.createNewFile();
				
		   }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
       
   }

   @Override
   public void visit(Wheel part) {
	   try {
		   FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter writer = new BufferedWriter(fw);
		writer.write(part.getName().trim() + ", " + part.getModelNumberWheel().trim()
		   + ", " + part.getModelYearWheel().trim()+"\n");
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

   @Override
   public void visit(Engine part) {
	   try {
		   FileWriter fw = new FileWriter(file,true);
			BufferedWriter writer = new BufferedWriter(fw);
			
		
		writer.append(part.getName().trim() + ", " + part.getModelNumberEngine().trim()
		   + ", " + part.getModelYearEngine().trim()+"\n");
		writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

   @Override
   public void visit(Body part) {
	   try {
		   FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter writer = new BufferedWriter(fw);
			
		
		writer.append(part.getName().trim() + ", " + part.getModelNumberBody().trim()
		   + ", " + part.getModelYearBody().trim()+"\n");
		writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

	@Override
	public void visit(Brake part) {
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter writer = new BufferedWriter(fw);
			
		
		writer.append(part.getName().trim() + ", " + part.getModelNumberBrake().trim()
		   + ", " + part.getModelYearBrake().trim()+"\n");
		writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
