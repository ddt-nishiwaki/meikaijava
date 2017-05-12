package kensyu01;

// 0 ~ 1 まで 0.001 づつカウントし、カウントとその二乗の値を表示するクラス
public class E5_7_Operation_Float_Squaring {

		// 数値型変数を初期化するための値を設定する
		private static final int INITIALIZE_NUMERIC = 0;
		// テキスト「カウントした値」を設定する
		private static final String TEXT_COUNT_VALUE = "カウントした値";
		// テキスト「二乗した値」を設定する
		private static final String TEXT_SQUARING_VALUE = "二乗した値";
		// カラム名間の余白を設定する
		private static final String STRING_OFFSET_COLUMN = "\t";
		// 出力結果間の余白を設定する
		private static final String STRING_OFFSET_RESULT = "\t";
		// 区切り線を文字列で設定する
		private static final String STRING_LINE = "------------------------------------";
		// 処理回数を設定する
		private static final int TIMES_OPERATION = 1000;
	

	/*********************************************************/
	
	// 0 ~ 1 まで 0.001 づつカウントし、カウントとその二乗の値を表示する処理を行う
	public static void main(String[] arg) {

		// 出力する値のカラム名を出力する
		System.out.print(TEXT_COUNT_VALUE + STRING_OFFSET_COLUMN + TEXT_SQUARING_VALUE);
		// 改行を出力する
		System.out.println();
		// 区切り線を出力する
		System.out.println(STRING_LINE);
		
		// 設定回数分の処理を行う
		for (int count = INITIALIZE_NUMERIC; count <= TIMES_OPERATION; count++ ) {
			
			// int型のカウンターをキャストした値を設定する
			float castValue = count/(float)TIMES_OPERATION;
			// int型のカウンターをキャストした値を出力する
			System.out.printf("%8.7f",castValue);
			// 余白を出力する
			System.out.print(STRING_OFFSET_RESULT);
			// 二乗した値を出力する
			System.out.printf("%8.7f",castValue*castValue);
			// 改行を出力する
			System.out.println();
		}
	}
}
