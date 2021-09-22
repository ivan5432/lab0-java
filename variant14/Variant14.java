package variant14;

public class Variant14 {
	public static class WhileRes {
		public int k;
		public double sum;
		public WhileRes(int a, double b) {
			k=a;
			sum=b;
		}
		public void print() {
			System.out.print(k);
			System.out.print(" ");
			System.out.print(sum);
			System.out.print("\n");

		}

	}
	public static class IfRes {
		public float min;
		public float max;
		public IfRes(float a, float b) {
			min=a;
			max=b;
		}
		public void print() {
			System.out.print(min);
			System.out.print(" ");
			System.out.print(max);
			System.out.print("\n");

		}
	}
	public static class CaseRes {
		public double v1;
		public double v2;
		public double v3;
		public CaseRes(double a, double b, double c) {
			v1=a;
			v2=b;
			v3=c;
		}
		public void print() {
			System.out.print(v1);
			System.out.print(" ");
			System.out.print(v2);
			System.out.print(" ");
			System.out.print(v3);
			System.out.print("\n");
		}
	}
	public static class MinMax {
		public float v1;
		public int v2;
		public MinMax(float a, int b) {
			v1=a;
			v2=b;
		}
		public void print() {
			System.out.print(v1);
			System.out.print(" ");
			System.out.print(v2);
			System.out.print("\n");

		}
	}
	public static class ArrayRes{
		public float [] odd;
		public float [] even;
		public int n,m;
		public ArrayRes(float [] a, float [] b, int n, int m){
			this.odd= new float[n];
			for(int i=0; i<n;i++) {
				this.odd[i]=a[i];
			}
			this.even=new float[m];
			for(int i=0; i<m;i++) {
				this.even[i]=b[i];
			}
			this.n=n;
			this.m=m;
		}
		public void print() {
			System.out.print("\n");

			System.out.print("\tOdd: ");

			for (int i=0; i<n; i++) {
				System.out.print(odd[i]);
				System.out.print(" ");
			}
			System.out.print("\n");
			System.out.print("\tEven: ");

			for (int i=0; i<m; i++) {
				System.out.print(even[i]);
				System.out.print(" ");
			}
			System.out.print("\n");

		}
	}
	public class ForRes{
		public int n; 
		public int[] sums;
		int i=0;
		ForRes(int n){
			sums=new int[n];
			this.n=n;
		}
		public void add(int s) {
			sums[this.i]=s;
			this.i++;
		}
		public void print() {
			for (int i=0; i<n; i++) {
				System.out.print(sums[i]);
				System.out.print(" ");

			}
			System.out.print("\n");
		}
	}
	public int integerTask(int n) {
		//Дано трехзначное число. В нем зачеркнули первую справа цифру и приписали ее 
		//слева. Вывести полученное число.
		int tmp=n/100;
		n=n-tmp*100;
		n*=10;
		n+=tmp;
		return n;
	}
	public boolean boolTask(int a, int b, int c) {
		//Даны три целых числа: A, B, C. 
		//Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».
		if((a>0 || b>0 || c>0) && ((a<=0 && b<=0) || (a<=0 && c<=0) || (b<=0 && c<=0))) {
			return true;
		}
		return false;
	}
	public IfRes ifTask(float a, float b, float c) {
		float min = 0, max = 0;
		//Даны три числа. Вывести вначале наименьшее, а затем наибольшее из данных чисел.
		if (a<=b && a<=c) {
			min=a;
		} else if (b<=a && b<=c) {
			min=b;
		} else if (c<=a && c<=b) {
			min=c;
		}
		System.out.print(' ');

		if (a>=b && a>=c) {
			max=a;
		} else if (b>=a && b>=c) {
			max=b;
		} else if (c>=a && c>=b) {
			max=c;
		}


		return new IfRes(min, max);
		
	}
	
	//-------
	
	public CaseRes caseTask(int n, double v) {
		double R1, R2, S, a;
		CaseRes res = null;
		//Элементы равностороннего треугольника пронумерованы следующим образом: 
		//1 — сторона a, 2 — радиус R1 вписанной окружности (R1 = a·(3)1/2/6), 
		//3 — радиус R2 описанной окружности (R2 = 2·R1), 4 — площадь S = a2·(3)1/2/4. 
		//Дан номер одного из этих элементов и его значение. 
		//Вывести значения остальных элементов данного треугольника (в том же порядке).
		switch(n) {
			case 1:
				R1=v * Math.sqrt(3)/6;
				R2=2*R1;
				S=v*v*Math.sqrt(3)/4;
				res=new CaseRes(R1, R2, S);
				break;
			case 2:
				a=v*6/Math.sqrt(3);
				R2=v*2;
				S=a*a*Math.sqrt(3)/4;
				res=new CaseRes(a, R2, S);

				break;
			case 3:
				R1=v/2;
				a=R1*6/Math.sqrt(3);
				S=a*a*Math.sqrt(3)/4;
				res=new CaseRes(a, R1, S);
				break;
			case 4:
				a=Math.sqrt(v*4/Math.sqrt(3));
				R1=a * Math.sqrt(3)/6;
				R2=2*R1;
				res=new CaseRes(a, R1, R2);
				break;
		}
		return res;
	}
	
	public ForRes forTask(int n) {
		//Дано целое число N (> 0). Найти квадрат данного числа, 
		//используя для его вычисления следующую формулу:
		//N^2 = 1 + 3 + 5 + … + (2·N – 1).
		//После добавления к сумме каждого слагаемого выводить 
		//текущее значение суммы (в результате будут выведены квадраты всех целых чисел от 1 до N).
		int sum=0;
		ForRes res=new ForRes(n);
		if (n>0) {
			for(int i=1; i<=2*n; i+=2) {
				sum+=i;
				res.add(sum);

			}
			return res;

		}
		return null;
	}
	public WhileRes whileTask(double a) {
		// Дано число A (> 1). Вывести наибольшее из целых чисел K, 
		//для которых сумма 1 + 1/2 + … + 1/K будет меньше A, и саму эту сумму.
		if(a<1) {
			System.out.print("Error!");
			return null;
		}
		double s_prev=0;
		double sum=0;
		int k=0;

		while(sum<a) {
			s_prev=sum;
			k++;
			sum+=1/(double)k;
		}

		WhileRes res=new WhileRes(k-1, s_prev);

		return res;
	}
	public MinMax minMax(float b, float[] n) {
		//Minmax14. Дано число B (> 0) и набор из десяти чисел. 
		//Вывести минимальный из тех элементов набора, которые больше B, а также его номер. 
		//Если чисел, больших B, в наборе нет, то дважды вывести 0.
		if (b<=0 || n.length!=10) {
			return null;
		}
		float min=-1;
		int j=0;
		for (int i=0; i<10; i++) {
			if (n[i]>b) { min=n[i]; j=i;break;}
		}
		if (min==-1) {
			return null;
		}
		for (int i=0; i<10; i++) {
			if (n[i]<min && n[i]>b) { min=n[i]; j=i;}
		}
		return new MinMax(min, j);
	}

	public ArrayRes array(float [] a, int n){
		float [] odd, even;
		int _n=(int)Math.ceil(n/2), m=(int)n/2;
		odd = new float[_n];
		even = new float[m];
		for(int i=0; i<_n*2; i+=2) {
			odd[(int)i/2]=a[i];
		}
		for(int i=1; i<m*2; i+=2) {
			even[(int)i/2]=a[i];
		}
		ArrayRes res=new ArrayRes(odd, even, _n, m);
		return res;
	}
	
	public float[] matrix(float[][]matrix, int M) {
		float [] res= new float[M*M];
		int k=0;
		for (int i=0; i<M; i++) {
			
				for (int j=0; j<M-i; j++) {
					res[k]=matrix[i][j];
					k++;
				}
			
					
				for (int j=i+1; j<M; j++) {
					res[k]=matrix[j][M-1-i];
					k++;
				}
	
			
		}
		return res;
	}
	
}
