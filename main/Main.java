package main;

import variant14.Variant14;
import variant14.Variant14.WhileRes;
import variant14.Variant14.CaseRes;
import variant14.Variant14.IfRes;
import variant14.Variant14.MinMax;
import variant14.Variant14.ForRes;
import variant14.Variant14.ArrayRes;




public class Main {

	public static void main(String[] args) {
		Variant14 v = new Variant14();
				
		//Integer:
		System.out.print("Integer: ");
		System.out.print(v.integerTask(123));
		System.out.print('\n');
				
		//Bool
		System.out.print("Bool: ");
		System.out.print(v.boolTask(0,0,0));
		System.out.print('\n');
				
		// If
		IfRes if_res;
		System.out.print("If: ");
		if_res=v.ifTask(3,1,2);
		if_res.print();
				
		//Case
		CaseRes case_res;
		System.out.print("Case: ");
		case_res=v.caseTask(1, 3);
		case_res.print();

		//For
		System.out.print("For: ");
		ForRes for_res;
		for_res=v.forTask(5);
		for_res.print();
		
		//While
		System.out.print("While: ");
		WhileRes while_res;
		while_res=v.whileTask(2);
		while_res.print();
		
		//minMax
		System.out.print("MinMax: ");
		MinMax minmax;
		float []arr= {1,2,3,4,4,6,7,8,9,-1};
		minmax=v.minMax(3, arr);
		minmax.print();
		
		//array
		System.out.print("Array: ");
		ArrayRes arr_res;
		arr_res=v.array(arr, 10);
		arr_res.print();
		
		//Matrix
		System.out.print("Matrix: ");
		float [][] m_in={{1,2,3},{4,5,6},{7,8,9}};
		float[] m_res=v.matrix(m_in, 3);
		for (int i=0; i<3*3; i++) {
			System.out.print(m_res[i]);
			System.out.print(' ');
		}
	}

}
