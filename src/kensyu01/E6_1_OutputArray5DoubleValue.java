package kensyu01;

// 5つの値を持つ配列を設定れぞれぞれの値を出力するクラス
public class E6_1_OutputArray5DoubleValue {

	// 数値型変数を初期化するための値を設定する
	private static final int INITIALIZE_INTEGER = 0;
	// 配列の長さを設定する
	private static final int ARRAY_LENGTH = 5;
	// 配列の値を出力する際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_ARRAY = "fiveLengthArray[%d] = %f\n";

	
	/*************************************************************/
	
	// 5つの値を持つ配列を設定れぞれぞれの値を出力する処理を行う
	public static void main(String[] arg) {
		
		// 長さ5の配列を作成する
		double[] fiveLengthArray = new double[ARRAY_LENGTH];
		// 作成した配列に値を設定する
		for ( int count = INITIALIZE_INTEGER; count < ARRAY_LENGTH; count++  ) {
			// カウンターをdouble型にキャストして設定する
			fiveLengthArray[count] = (double)count;
		}
		// 設定した値を出力する
		for ( int count = INITIALIZE_INTEGER; count < ARRAY_LENGTH; count++  ) {
			// 設定したフォーマットに従って出力する
			System.out.printf(FORMAT_OUTPUT_ARRAY, count,fiveLengthArray[count]);
		}
		
	}
}
