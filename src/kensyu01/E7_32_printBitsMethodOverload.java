package kensyu01;

/*** ライブラリの読み込み ******************************/
// 乱数を生成する機能を読み込む
import java.util.Random;

/*** クラス ******************************/
// 設定された値のbitを表示するメソッドを実行するクラス
public class E7_32_printBitsMethodOverload {
	
	// byte型のbit数を設定する
	private static final int NUMBER_BYTE_BIT = 8;
	// short型のbit数を設定する
	private static final int NUMBER_SHORT_BIT = 16;
	// int型のbit数を設定する
	private static final int NUMBER_INT_BIT = 32;
	// long型のbit数を設定する
	private static final int NUMBER_LONG_BIT = 64;
	// 一桁目のビットが1かどうかを判定する値を設定する
	private static final int NUMBER_JADGE_BIT_ONE = 1;

	// byte型の範囲を設定するための値を設定する
	private static final int NUMBER_SETTING_BYTE_BIT = 128;
	// short型の範囲を設定するための値を設定する
	private static final int NUMBER_SETTING_SHORT_BIT = 32768;


	// 指定する乱数の範囲開始位置を調整するための値を設定する
	private static final int NUMBER_ADJUST_RANDOM = 2;
	
	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "設定された値のbitを表示します";
	// byte型の値のbitを表示することを示すメッセージを表示する
	private static final String MESSAGE_OUTPUT_BYTE_BIT = "byte型の値のbitを表示します";
	// short型の値のbitを表示することを示すメッセージを表示する
	private static final String MESSAGE_OUTPUT_SHORT_BIT = "short型の値のbitを表示します";
	// int型の値のbitを表示することを示すメッセージを表示する
	private static final String MESSAGE_OUTPUT_INT_BIT = "int型の値のbitを表示します";
	// long型の値のbitを表示することを示すメッセージを表示する
	private static final String MESSAGE_OUTPUT_LONG_BIT = "long型の値のbitを表示します";
	// bitを出力することを示す文字列を設定する
	private static final String FORMAT_OUTPUT_BIT = "%d のbit\n  => ";

	/*** オブジェクト作成 ******************************/
	// 演算対象となる整数を生成するオブジェクトを作成する
	private static Random operandGenerator = new Random();	
	
	/*** メソッド printBits******************************/
	// byte型で設定された値のbitを表示するメソッドを設定する
	private static void printBits(byte operand) {
		// 各ビットの値を調べる
		for ( int bitCount = NUMBER_BYTE_BIT -1 ; bitCount >= 0; bitCount-- ){
			// 一番上の位のbitから各順に 一桁目にシフトさせる
			byte numberHasTargetBit = (byte)(operand >>> bitCount);
			// 一桁目のbitが 1 だったら 1 を, 0 だったら 0 を設定する
			byte targetBit = (byte)(  ( (numberHasTargetBit & NUMBER_JADGE_BIT_ONE) == NUMBER_JADGE_BIT_ONE ) ? 1 : 0  );
			// 調べたビットを出力する
			System.out.print(targetBit);
		}
		// 改行を出力する
		System.out.println("\n");
	}
	// int型で設定された値のbitを表示するメソッドを設定する
	private static void printBits(int operand) {
		// 各ビットの値を調べる
		for ( int bitCount = NUMBER_INT_BIT -1 ; bitCount >= 0; bitCount-- ){
			// 一番上の位のbitから各順に 一桁目にシフトさせる
			int numberHasTargetBit = operand >>> bitCount;
			// 一桁目のbitが 1 だったら 1 を, 0 だったら 0 を設定する
			int targetBit = (numberHasTargetBit & NUMBER_JADGE_BIT_ONE) == NUMBER_JADGE_BIT_ONE ? 1 : 0;
			// 調べたビットを出力する
			System.out.print(targetBit);
		}
		// 改行を出力する
		System.out.println("\n");
	}
	// short型で設定された値のbitを表示するメソッドを設定する
	private static void printBits(short operand) {
		// 各ビットの値を調べる
		for ( int bitCount = NUMBER_SHORT_BIT -1 ; bitCount >= 0; bitCount-- ){
			// 一番上の位のbitから各順に 一桁目にシフトさせる
			short numberHasTargetBit = (short)(operand >>> bitCount);
			// 一桁目のbitが 1 だったら 1 を, 0 だったら 0 を設定する
			short targetBit = (short)(  ( (numberHasTargetBit & NUMBER_JADGE_BIT_ONE) == NUMBER_JADGE_BIT_ONE ) ? 1 : 0  );
			// 調べたビットを出力する
			System.out.print(targetBit);
		}
		// 改行を出力する
		System.out.println("\n");
	}
	// long型で設定された値のbitを表示するメソッドを設定する
	private static void printBits(long operand) {
		// 各ビットの値を調べる
		for ( int bitCount = NUMBER_LONG_BIT -1 ; bitCount >= 0; bitCount-- ){
			// 一番上の位のbitから各順に 一桁目にシフトさせる
			long numberHasTargetBit = (long)(operand >>> bitCount);
			// 一桁目のbitが 1 だったら 1 を, 0 だったら 0 を設定する
			long targetBit = (long)(  ( (numberHasTargetBit & NUMBER_JADGE_BIT_ONE) == NUMBER_JADGE_BIT_ONE ) ? 1 : 0  );
			// 調べたビットを出力する
			System.out.print(targetBit);
		}
		// 改行を出力する
		System.out.println("\n");
	}
	

	/*** メインメソッド ******************************/
	// 設定された値のbitを表示するメソッドを実行する
	public static void main (String[] arg) {
		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
	
		/*** 絶対値に変換する値を設定 ******************************/
		// int型乱数を設定する
		int integerValue = operandGenerator.nextInt();
		// long型乱数を設定する
		long longValue = operandGenerator.nextLong();
		// byte型乱数を設定する
		byte byteValue = (byte)(operandGenerator.nextInt(NUMBER_SETTING_BYTE_BIT * NUMBER_ADJUST_RANDOM) - NUMBER_SETTING_BYTE_BIT);
		// short型乱数を設定する
		short shortValue = (short)(operandGenerator.nextInt(NUMBER_SETTING_SHORT_BIT * NUMBER_ADJUST_RANDOM) - NUMBER_SETTING_SHORT_BIT);
		
		/*** 出力1 ******************************/
		// byte型の値のbitを表示することを示すメッセージを設定する
		System.out.println(MESSAGE_OUTPUT_BYTE_BIT);
		// byte型のbitを表示することを示す文字列を表示する
		System.out.printf(FORMAT_OUTPUT_BIT, byteValue);
		// byte型の値のbitを表示する
		printBits(byteValue);
		
		/*** 出力2 ******************************/
		// short型の値のbitを表示することを示すメッセージを設定する
		System.out.println(MESSAGE_OUTPUT_SHORT_BIT);
		// short型のbitを表示することを示す文字列を表示する
		System.out.printf(FORMAT_OUTPUT_BIT, shortValue);
		// short型の値のbitを表示する
		printBits(shortValue);
		
		/*** 出力3 ******************************/
		// int型の値のbitを表示することを示すメッセージを設定する
		System.out.println(MESSAGE_OUTPUT_INT_BIT);
		// int型のbitを表示することを示す文字列を表示する
		System.out.printf(FORMAT_OUTPUT_BIT, integerValue);
		// int型の値のbitを表示する
		printBits(integerValue);
		
		/*** 出力4 ******************************/
		// long型の値のbitを表示することを示すメッセージを設定する
		System.out.println(MESSAGE_OUTPUT_LONG_BIT);
		// long型のbitを表示することを示す文字列を表示する
		System.out.printf(FORMAT_OUTPUT_BIT, longValue);
		// long型の値のbitを表示する
		printBits(longValue);
	}
}
