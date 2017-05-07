package kensyu01;

// 5つの値を持つdouble型配列を設定し、小数点第一までの値を設定し、設定した値を出力するクラス
public class E6_3_OutputArray5DoubleValueFirstDecimal {

	// 数値型変数を初期化するための値を設定する
	public static final int INITIALIZE_INTEGER = 0;
	// 配列の長さを設定する
	public static final int ARRAY_LENGTH = 5;
	// 桁を変える値を設定する
	public static final int VALUE_CHANGE_DIGIT = 10;
	
	// 配列の値を出力する際のフォーマットを設定する
	public static final String FORMAT_OUTPUT_ARRAY = "fiveLengthArray[%d] = %2.1f\n";

	
	/*************************************************************/
	
	// 5つの値を持つdouble型配列を設定し、小数点第一までの値を設定し、設定した値を出力する処理を行う
	public static void main(String[] arg) {
		
		// 長さ5の配列を作成する
		double[] fiveLengthArray = new double[ARRAY_LENGTH];
		// 作成した配列に値を設定する
		for ( int count = INITIALIZE_INTEGER; count < ARRAY_LENGTH; count++  ) {
			// count 0 のときに 1となる値を設定する
			int settingValue = count + 1;
			// countが 0 のとき 1.1 となるように配列に値を設定する
			fiveLengthArray[count] = (settingValue + (double)settingValue/VALUE_CHANGE_DIGIT);
		}
		// 設定した値を出力する
		for ( int count = INITIALIZE_INTEGER; count < ARRAY_LENGTH; count++  ) {
			// 設定したフォーマットに従って出力する
			System.out.printf(FORMAT_OUTPUT_ARRAY, count,fiveLengthArray[count]);
		}
		
	}
}
