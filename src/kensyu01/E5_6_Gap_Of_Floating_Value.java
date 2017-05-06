package kensyu01;

// 浮動小数点数の演算に誤差が生じる様子を出力するクラス
public class E5_6_Gap_Of_Floating_Value {

		// 数値型変数を初期化するための値を設定する
		public static final int INITIALIZE_NUMERIC = 0;
		// テキスト「float」を設定する
		public static final String TEXT_FLOAT = "float";
		// テキスト「int」を設定する
		public static final String TEXT_INT = "int";
		// カラム名間の余白を設定する
		public static final String STRING_OFFSET_COLUMN = "\t\t";
		// 出力結果間の余白を設定する
		public static final String STRING_OFFSET_RESULT = "\t";
		// 区切り線を文字列で設定する
		public static final String STRING_LINE = "------------------------------------";
		// 処理回数を設定する
		public static final int TIMES_OPERATION = 1000;
	

	/*********************************************************/
	
	// 浮動小数点数の演算に誤差が生じる様子を出力する処理を行う
	public static void main(String[] arg) {
		
		// int型カウンターを初期化する
		int integerCount = INITIALIZE_NUMERIC;
		// float型の値を加算するための変数を初期化する
		float sumFloat = INITIALIZE_NUMERIC;
		// float型で加算する値を設定する
		float addFloat = 1/(float)TIMES_OPERATION;


		/*********************************************************/

		// 出力する値のカラム名を出力する
		System.out.print(TEXT_FLOAT + STRING_OFFSET_COLUMN + TEXT_INT);
		// 改行を出力する
		System.out.println();
		// 区切り線を出力する
		System.out.println(STRING_LINE);
		
		// 設定回数分の処理を行う
		while( integerCount <= TIMES_OPERATION ) {
			
			// float型の値の加算結果を出力する
			System.out.printf("%8.7f",sumFloat);
			// 余白を出力する
			System.out.print(STRING_OFFSET_RESULT);
			// int型のカウンターをキャストした値を出力する
			System.out.printf("%8.7f",integerCount/(float)TIMES_OPERATION);
			// 改行を出力する
			System.out.println();
			
			// int型カウンターをインクリメントする
			integerCount++;
			// float型カウンターを0.001づつ加算する
			sumFloat += addFloat;
		}
	}
}
