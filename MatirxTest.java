package eecs448_lab7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatirxTest {
	@Test
	public void testMatrix() {
		try{
			new Matirx(10);
			new Matirx(12);
			new Matirx(14);
			new Matirx(16);
			new Matirx(18);
			assertTrue("It did something", true);
		}
		catch(Exception e){
			fail("It's broken");
		}
	}
	
	@Test
	public void testdeterminant() {
		Matirx mymat= new Matirx(3);
		double[][] mat= new double[3][3];
		mat[0][0]=8;
		mat[0][1]=9;
		mat[0][2]=7;
		mat[1][0]=3;
		mat[1][1]=5;
		mat[1][2]=2;
		mat[2][0]=-2;
		mat[2][1]=3;
		mat[2][2]=-1;
		
		assertEquals(-78.0, mymat.determinant(),0.001);
	}
	@Test
	public void testinverse() {
		boolean working=true;
		Matirx myMatrix = new Matirx(3);
		double[][] matrix1=new double[3][3];
		myMatrix.setMat(matrix1);
		matrix1[0][0]=1;
		matrix1[0][1]=2;
		matrix1[0][2]=3;
		matrix1[1][0]=3;
		matrix1[1][1]=2;
		matrix1[1][2]=1;
		matrix1[2][0]=2;
		matrix1[2][1]=3;
		matrix1[2][2]=1;
		Matirx myMatrixInv=myMatrix.inverse();
		double[][] InverseMat=new double[3][3];
		myMatrixInv.setMat(InverseMat);
		InverseMat[0][0]= -1/12;
		InverseMat[0][0]= 7/12;
		InverseMat[0][0]= -1/3;
		InverseMat[0][0]= -1/12;
		InverseMat[0][0]= -5/12;
		InverseMat[0][0]= 2/3;
		InverseMat[0][0]= 5/12;
		InverseMat[0][0]= 1/12;
		InverseMat[0][0]= -1/3;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(InverseMat[i][j]==myMatrixInv.getValue(i, j)){
					working=true;
				}
				else{
					working=false;
					fail("Broken");
				}
			}
		}
	}
	@Test
	public void testsubMatrix() {
		boolean working=true;
		Matirx myMat=new Matirx(3);
		double[][] m1=new double[3][3];
		myMat.setMat(m1);
		m1[0][0]=1;
		m1[0][0]=2;
		m1[0][0]=3;
		m1[0][0]=3;
		m1[0][0]=2;
		m1[0][0]=1;
		m1[0][0]=2;
		m1[0][0]=3;
		m1[0][0]=1;
		Matirx myMat2= myMat.subMatrix(0,0);
		myMat.setMat(m1);
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(m1[0][0]==myMat2.getValue(0, 0)){
					working=true;
				}
				else{
					fail("Broken");
				}
			}
		}
	}
}
