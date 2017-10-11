package eecs448_lab7;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int size=50;
		try{
			Scanner myFile = new Scanner(new FileReader("input.txt"));
			PrintWriter writer=new PrintWriter("output.txt", "UTF-8");
		       while(myFile.hasNext()){
				size = myFile.nextInt();
				if(size>0){
		        double[][] inputval=new double[size][size];
		        writer.println("M = ");
		        for(int i=0; i<size; i++){
		        	for(int j=0; j<size; j++){
		        		inputval[i][j]=myFile.nextInt();
		        		writer.print((int)inputval[i][j]+" ");
		        	}
		        	writer.println("");
		        }
		        Matirx m=new Matirx(size);
		        m.setMat(inputval);
		        double det=m.determinant();
		        System.out.println("det: "+det);
		        writer.println("det(M) = "+det+"\n\n");
		        if(det !=0){
		        	Matirx inv=m.inverse();
		        	writer.println("Minv = ");
		        	for(int i=0; i<size; i++){
			        	for(int j=0; j<size; j++){
			        		writer.print(inv.mdata[i][j]+" ");
			        	}
			        	writer.println("");
			        }
		        }
		       }
		       }
		       writer.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage()+"Somthing went wrong");
	} 

	}

	}

