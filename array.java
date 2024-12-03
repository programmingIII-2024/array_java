public class array 
{
	public static void main(String[] args)
	{
		int[] array;			// 最初に空の器を用意して
		array = new int[5];		// その個数をnewで割り当てる		
								// int[] array = new int[5]; と1行で書いても良い

		// int[] array; は 
		// int array[];  と書いても良い
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
//		array[10] = 60;			// 用意した数をあふれさせたときのテスト

		System.out.println(array[0]);



		// 動的に配列数を確保
		/*
		int number=12;
		double[] variable = new double[number];	// 変数の数だけ要素を用意できるmallocみたいなことは不要

		int count;
		count = variable.length;			// 配列名に.lengthをつけると要素数が取り出せる

		System.out.println("要素数は"+count);
		*/


		// 配列の参照
		/*
		int[] reference;
		reference = array;

		System.out.println("reference[3]=" +reference[3]);

		reference[3] = 5;
		System.out.println("array[3] =" +array[3]);
		*/

	}
}
