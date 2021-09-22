package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import variant14.Variant14;
import variant14.Variant14.WhileRes;
import variant14.Variant14.CaseRes;
import variant14.Variant14.IfRes;
import variant14.Variant14.MinMax;
import variant14.Variant14.ForRes;
import variant14.Variant14.ArrayRes;




public class TestVariant14 {
	//WhileRes wr=new WhileRes();
	public static double EPS = 0.001;

	@Test (dataProvider="integerProvider")
	public void intTask(int n, int res) {
		assertEquals(new Variant14().integerTask(n), res);
	}
  
	@DataProvider
	public Object[][] integerProvider(){
		return new Object[][] {{123, 231}};
	}
  
  ///////////////////////////
  
	@Test (dataProvider="boolProvider")
	public void boolTask(int a, int b, int c, boolean res) {
		assertEquals(new Variant14().boolTask(a, b, c), res);
	}
  
	@DataProvider
	public Object[][] boolProvider(){
		return new Object[][] {{1,0,0, true}};
	}
  
  //////////////////////////
  
	@Test (dataProvider="ifProvider")
	public void ifTask(float a, float b, float c, IfRes res) {
		IfRes result=new Variant14().ifTask(a, b, c);
		assertEquals(result.min, res.min);
		assertEquals(result.max, res.max);

	}
  
	@DataProvider
	public Object[][] ifProvider(){
		return new Object[][] {{1,2,3, new IfRes(1,3)}};
	}
	
	///////////////////
	
	@Test (dataProvider="caseProvider")
	public void ifTask(int n, double v, CaseRes res) {
		CaseRes result=new Variant14().caseTask(n, v);
		assertEquals(result.v1, res.v1, EPS);
		assertEquals(result.v2, res.v2, EPS);
		assertEquals(result.v3, res.v3, EPS);
	}
  
	@DataProvider
	public Object[][] caseProvider(){
		return new Object[][] {{1,4, new CaseRes(1.15470054,2.30940108,6.92820323)}};
	}
	
	////////////////////
	
	@Test (dataProvider="forProvider")
	public void forTask(int n, int[] sums) {
		ForRes for_res=new Variant14().forTask(n);
		for(int i=0; i<for_res.n; i++) {
			assertEquals(for_res.sums[i], Math.pow(i+1, 2));
		}
	}
  
	@DataProvider
	public Object[][] forProvider(){
		int sums[]= {1,4,9,16};
		return new Object[][] {{4, sums}};
	}
	
	///////////////
	
	@Test (dataProvider="whileProvider")
	public void whileTask(double a, WhileRes res) {
		WhileRes result=new Variant14().whileTask(a);
		assertEquals(result.k, res.k);
		assertEquals(result.sum, res.sum, EPS);
	}
  
	@DataProvider
	public Object[][] whileProvider(){
		return new Object[][] {{2, new WhileRes(3, 1.83333)}};
	}
	
	///////////////
	
	@Test (dataProvider="minMaxProvider")
	public void minMaxTask(int n,float[]arr, MinMax res) {
		

		MinMax result=new Variant14().minMax(n,arr);
		assertEquals(result.v1, res.v1, EPS);
		assertEquals(result.v2, res.v2, EPS);
	}
  
	@DataProvider
	public Object[][] minMaxProvider(){
		float []arr= {1,2,3,4,4,6,7,8,9,-1};
		return new Object[][] {{3,arr, new MinMax(4, 3)}};
	}
	
	//////////////
	
	@Test (dataProvider="arrayProvider")
	public void minMaxTask(int n,float[]arr, ArrayRes res) {
		

		ArrayRes result=new Variant14().array(arr, n);
		for(int i=0; i<result.n; i++) {
			assertEquals(result.odd[i], res.odd[i], EPS);
		}
		for(int i=0; i<result.m; i++) {
			assertEquals(result.even[i], res.even[i], EPS);
		}
	}
  
	@DataProvider
	public Object[][] arrayProvider(){
		float []arr= {1,2,3,4,4,6,7,8,9,-1};
		float[]odd={1,3,4,7,9}; 
		float []even= {2,4,6,8,-1};
		return new Object[][] {{10, arr, new ArrayRes(odd, even, 5, 5)}};
	}
	
	///////
	
	@Test (dataProvider="matrixProvider")
	public void minMaxTask(int n,float[][]arr, float[] res) {

		float[] result=new Variant14().matrix(arr, n);
		for(int i=0; i<n*n; i++) {
			assertEquals(result[i], res[i], EPS);
		}

	}
  
	@DataProvider
	public Object[][] matrixProvider(){
		float[]res={1,2,3,6,9,4,5,8,7}; 
		float [][]arr= {{1,2,3},{4,5,6},{7,8,9}};

		return new Object[][] {{3,arr, res}};
	}
}
