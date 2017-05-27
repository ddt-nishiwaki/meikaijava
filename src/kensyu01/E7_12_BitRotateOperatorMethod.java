package kensyu01;

/*** クラス ******************************/
// 整数値のビットを左右に回転するメソッドを実行をするクラス
public class E7_12_BitRotateOperatorMethod {

	/*** 数値型定数設定 ******************************/
	// 一桁目のビットが1かどうかを判定する値を設定する
	private static final int NUMBER_JADGE_BIT_ONE = 1;
	// ビットのカウントを繰り返し処理のフォーマットに変換する値を設定する
	private static final int NUMBER_FORMATING_BIT_INDEX = -1;
	// int型の値のビット数を設定する
	private static final int LENGTH_BIT_INTEGER = 32;
	// ビットが 00000000000000011111111111111111 となる整数を設定する
	private static final int TARGET_ROTATE_INTEGER = 131071;

	/*** 文字列型定数設定 ******************************/
	// 単語「左」を設定する
	private static final String WORD_LEFT = "左";
	// 単語「右」を設定する
	private static final String WORD_RIGHT = "右";
	// 処理内容を示すメッセージを出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_PROCESS_DETAIL = "以下のビットをメソッドを利用して%s%sに一回転する\n";
	// 左右どちらに回転するかを表示するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_ROTATE_TYPE = "ビットを%sに一回転する\n";
	// 何回転したかを表示するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_RESULT_ROTATE = "%2d%sに回転 : ";
	// 水平線を設定する
	private static final String DRAW_HORIZONAL_LINE = "-------------------------------------------------";


	/*** メソッド ******************************/
	// 整数値のビットを出力するメソッドを設定する
	private static void printBits(int rotateOperand) {
		// 対象の整数値のビットを調べる
		for (int bitCount = LENGTH_BIT_INTEGER + NUMBER_FORMATING_BIT_INDEX; bitCount >= 0; bitCount-- ) {
			// カウント分右シフトし、一桁目の値が 1 だった場合は 1 を出力し、そうでない場合は 0 を出力する
			System.out.print( ((rotateOperand >>> bitCount & NUMBER_JADGE_BIT_ONE) == NUMBER_JADGE_BIT_ONE ) ? '1' : '0' );
		}
	}


	/*** メソッド ******************************/
	// 整数値のビットを,設定した値だけ左回転するメソッドを設定する
	private static int lRotate(int rotateOperand , int rotateLength ) {
		int leftShiftBit = rotateOperand << rotateLength;
		int rightRotatedBit = rotateOperand >>> LENGTH_BIT_INTEGER - rotateLength;
		int resultBit = leftShiftBit | rightRotatedBit;
		return resultBit;
	}


	/*** メソッド ******************************/
	// 整数値のビットを,設定した値だけ右回転するメソッドを設定する
	private static int rRotate(int rotateOperand , int rotateLength ) {
		int rightShiftBit = rotateOperand >>> rotateLength;
		int leftRotatedBit = rotateOperand << LENGTH_BIT_INTEGER - rotateLength;
		int resultBit = rightShiftBit | leftRotatedBit;
		return resultBit;
	}
	

	/*** メインメソッド ******************************/
	// 対象の整数のビットを左右に一回転する処理を行う
	public static void main (String[] arg) {
		
		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.printf(FORMAT_OUTPUT_PROCESS_DETAIL,WORD_LEFT,WORD_RIGHT);
		// 回転対象のビットを出力する
		printBits(TARGET_ROTATE_INTEGER);

		/*** 左回転処理 ******************************/
		// 改行を出力する
		System.out.println();
		// 左回転するときのメッセージを出力する
		System.out.printf(FORMAT_OUTPUT_ROTATE_TYPE,WORD_LEFT);
		// 水平線を出力する
		System.out.println(DRAW_HORIZONAL_LINE);
		// 左回転するメソッドを整数値のビット数分繰り返す
		for (int operateCount = 0; operateCount <= LENGTH_BIT_INTEGER; operateCount++ ){
			int leftRotateValue;	// 左回転した値を保持する変数を宣言する
			// 回転数を示すメッセージを出力する
			System.out.printf(FORMAT_OUTPUT_RESULT_ROTATE, operateCount,WORD_LEFT);
			// 左回転するメソッドを実行する
			leftRotateValue = lRotate(TARGET_ROTATE_INTEGER, operateCount);
			// 回転した値のビットを表示する
			printBits(leftRotateValue);
			// 回転した値を表示する
			System.out.printf(" = %d", leftRotateValue);
			// 改行を出力する
			System.out.println();
			
		}

		/*** 右回転処理 ******************************/
		// 改行を出力する
		System.out.println();
		// 左回転するときのメッセージを出力する
		System.out.printf(FORMAT_OUTPUT_ROTATE_TYPE,WORD_RIGHT);
		// 水平線を出力する
		System.out.println(DRAW_HORIZONAL_LINE);	
		// 右回転するメソッドを整数値のビット数分繰り返す
		for (int operateCount = 0; operateCount <= LENGTH_BIT_INTEGER; operateCount++ ){
			int rightRotateValue;		// 左回転した値を保持する変数を宣言する	
			// 回転数を示すメッセージを出力する
			System.out.printf(FORMAT_OUTPUT_RESULT_ROTATE, operateCount,WORD_RIGHT);
			// 右回転するメソッドを実行する
			rightRotateValue = rRotate(TARGET_ROTATE_INTEGER, operateCount);
			// 回転した値のビットを表示する
			printBits(rightRotateValue);
			// 回転した値を表示する
			System.out.printf(" = %d", rightRotateValue);
			// 改行を出力する
			System.out.println();
		}
	}
}
