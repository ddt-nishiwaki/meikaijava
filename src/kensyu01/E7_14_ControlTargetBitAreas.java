package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
//指定したビット範囲を 1 , 0 , 反転した値 にするメソッドをそれぞれ実行するクラス
public class E7_14_ControlTargetBitAreas {


	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 一桁目のビットが1かどうかを判定する値を設定する
	private static final int NUMBER_JADGE_BIT_ONE = 1;
	// ビットのカウントを,繰り返し処理のフォーマットに変換する値を設定する
	private static final int NUMBER_FORMATING_BIT_INDEX = -1;
	// int型のビット数を設定する
	private static final int LENGTH_INTEGER_BIT = 32;
	// 二進数の最初の数を設定する
	private static final int NUMBER_FIRST_BINARY = 1;
	// 二進数の基数を設定する
	private static final int NUMBER_BINARY_BASE = 2;
	// ビットの値を 1 マイナスした値に変換する値を設定する
	private static final int NUMBER_SHIFT_PREVIOUS_BIT = -1;
	
	/*** 文字列型定数設定 ******************************/
	// 文字列型変数を初期化するための値を設定する
	private static final String INITIALIZE_STRING = "";
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "指定したビット範囲を操作します";
	// 対象のビットを表示するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_TARGET_BIT = "対象のビット\n%s\n\n";
	// 対象ビット範囲の開始位置入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_START_RANGE = "範囲の開始位置を入力します\n最下位を0から数えた値で入力してください : ";
	// 対象ビット範囲の桁数入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH_RANGE = "開始位置から何桁目までの値を対象にしますか？ : ";
	// 1に変換することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_CHANGE_ONE = "指定したビット範囲を1にします";
	// 0に変換することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_CHANGE_ZERO = "指定したビット範囲を0にします";
	// 反転することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_CHANGE_REVERSE = "指定したビット範囲を反転します";
	// 変換した値を出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_CHANGE_RESULT = "%s = %d\n";


	/*** メソッド ******************************/
	// 整数値のビットを出力するメソッドを設定する
	private static String printBits(int convertedOperand) {
		String operandBit = INITIALIZE_STRING;		// 対象のビットを保持する変数を宣言する
		// 対象の整数値のビットを調べる
		for (int bitCount = LENGTH_INTEGER_BIT + NUMBER_FORMATING_BIT_INDEX; bitCount >= 0; bitCount-- ) {
			// カウント分右シフトし、一桁目の値が 1 だった場合は 1 を出力し、そうでない場合は 0 を設定する
			operandBit +=  ((convertedOperand >>> bitCount & NUMBER_JADGE_BIT_ONE) == NUMBER_JADGE_BIT_ONE ) ? "1" : "0";
		}
		// 対象のビットを示す文字列を返す
		return operandBit;
	}
	
	/*** メソッド ******************************/
	// 指定した範囲のビットを変換するための値を返すメソッドを設定する
	private static int generateTargetBitConvertor (int targetIntValue, int targetStartRange, int lengthDigit ) {
		/*** 変数設定 ******************************/
		// 指定した範囲のビットを1に設定するための変数を初期化する
		int targetBitRange = INITIALIZE_ZERO;
		// 指定した範囲のビットの桁数を設定するための変数を初期化する
		int bitRange = NUMBER_FIRST_BINARY;
		/*** 演算処理 ******************************/
		// 指定桁数より一つ上の桁が1になる値を設定する
		for ( int powerCount = INITIALIZE_ZERO; powerCount < lengthDigit; powerCount++) {
			// 二進数の基数を乗算してbitの値を調整する
			bitRange *= NUMBER_BINARY_BASE;
		}
		// 狙うビット範囲を1にした値を設定する
		targetBitRange = (bitRange + NUMBER_SHIFT_PREVIOUS_BIT) << targetStartRange;
		/*** 終了処理 ******************************/
		// 変換後の値を返す
		return targetBitRange;
	}

	/*** メソッド ******************************/
	// 指定したビット範囲を1にするメソッドを設定する
	private static int set(int targetIntValue, int targetStartRange, int lengthDigit ) {
		/*** 変数設定 ******************************/
		// 変換後の値を保持する変数を初期化する
		int resultConvertBit = INITIALIZE_ZERO;
		// 指定したビット範囲を変換するための変数を初期化する
		int NumberTargetConvertor = NUMBER_FIRST_BINARY;
		/*** 演算処理 ******************************/
		// 指定したビット範囲を変換するための値を設定する
		NumberTargetConvertor = generateTargetBitConvertor(targetIntValue, targetStartRange, lengthDigit);
		// 変換対象の値のbitのうち、指定したビット範囲だけ1にする
		resultConvertBit = targetIntValue | NumberTargetConvertor;
		/*** 終了処理 ******************************/
		// 変換後の値を返す
		return resultConvertBit;
	}


	/*** メソッド ******************************/
	// 指定したビット範囲を0にするメソッドを設定する
	private static int reset(int targetIntValue, int targetStartRange, int lengthDigit) {
		/*** 変数設定 ******************************/
		// 変換後の値を保持する変数を初期化する
		int resultConvertBit = INITIALIZE_ZERO;
		// 指定したビット範囲を変換するための変数を初期化する
		int NumberTargetConvertor = NUMBER_FIRST_BINARY;
		/*** 演算処理 ******************************/
		// 指定したビット範囲を変換するための値を設定する
		NumberTargetConvertor = generateTargetBitConvertor(targetIntValue, targetStartRange, lengthDigit);
		// 変換対象のbitを 0 に変換するために, 全て 1 に変換する
		resultConvertBit = set(targetIntValue, targetStartRange, lengthDigit);
		// 1に設定した範囲のビットを0にする
		resultConvertBit = resultConvertBit ^ NumberTargetConvertor;
		/*** 終了処理 ******************************/
		// 変換後の値を返す
		return resultConvertBit;
	}


	/*** メソッド ******************************/
	// 指定したビット範囲の 1と0 を反転するメソッドを設定する
	private static int inverse(int targetIntValue, int targetStartRange, int lengthDigit) {
		/*** 変数設定 ******************************/
		// 変換後の値を保持する変数を初期化する
		int resultConvertBit = INITIALIZE_ZERO;
		// 指定したビット範囲を変換するための変数を初期化する
		int NumberTargetConvertor = NUMBER_FIRST_BINARY;
		/*** 演算処理 ******************************/
		// 指定したビット範囲を変換するための値を設定する
		NumberTargetConvertor = generateTargetBitConvertor(targetIntValue, targetStartRange, lengthDigit);
		// 指定した範囲のビットを反転する
		resultConvertBit = targetIntValue ^ NumberTargetConvertor;
		/*** 終了処理 ******************************/
		// 変換後の値を返す
		return resultConvertBit;
	}


	/*** メインメソッド ******************************/
	// 指定したビット範囲を 1, 0, 反転した値 にするメソッドをそれぞれ実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 入力されたビット範囲の開始位置を保持する変数を初期化する
		int numberTargetStartRange = INITIALIZE_ZERO;
		// 入力されたビット範囲の桁数を保持する変数を初期化する
		int numberLengthTargetRange = INITIALIZE_ZERO;
		// setメソッドの返値を保持する変数を初期化する
		int resultNumberSet = INITIALIZE_ZERO;
		// resetメソッドの返値を保持する変数を初期化する
		int resultNumberReset = INITIALIZE_ZERO;
		// inverseメソッドの返値を保持する変数を初期化する
		int resultNumberInverse = INITIALIZE_ZERO;

		// bit変換対象となる値を設定するための変数を初期化する
		int convertedInteger = NUMBER_FIRST_BINARY;
		// 整数値のbitの半分の桁数を設定する
		int lengthHalfIntBit = LENGTH_INTEGER_BIT / 2;

		/*** オブジェクト作成 ******************************/
		// 変更するビット範囲の位置入力を扱うオブジェクトを作成する
		Scanner scannerTargetBitRange = new Scanner(System.in);

		/*** 対象の値設定 ******************************/
		// 対象の値として16bit目までを1にしたときの整数値を設定する
		convertedInteger = (NUMBER_FIRST_BINARY << lengthHalfIntBit) + NUMBER_SHIFT_PREVIOUS_BIT;

		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 対象のビットを表示する
		System.out.printf(FORMAT_OUTPUT_TARGET_BIT, printBits(convertedInteger));



		/*** 入力処理 ******************************/
		// 操作するbit範囲の開始位置の入力を求める
		System.out.println(MESSAGE_REQUEST_START_RANGE);
		// 入力されたbit範囲の開始位置を保持する
		numberTargetStartRange = scannerTargetBitRange.nextInt();
		// 操作するbit範囲の終了位置の入力を求める
		System.out.println(MESSAGE_REQUEST_LENGTH_RANGE);
		// 入力されたbit範囲の開始位置を保持する
		numberLengthTargetRange = scannerTargetBitRange.nextInt();

		/*** 演算処理 ******************************/
		// setメソッドの返値を保持する変数を初期化する
		resultNumberSet = set(convertedInteger, numberTargetStartRange, numberLengthTargetRange);
		// resetメソッドの返値を保持する変数を初期化する
		resultNumberReset = reset(convertedInteger, numberTargetStartRange, numberLengthTargetRange);
		// inverseメソッドの返値を保持する変数を初期化する
		resultNumberInverse = inverse(convertedInteger, numberTargetStartRange, numberLengthTargetRange);
		
		/*** setメソッドの結果出力 ******************************/
		// 指定したビットを1にして値を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_CHANGE_ONE);
		// 指定したビットを1にして値を出力する
		System.out.printf(FORMAT_OUTPUT_CHANGE_RESULT, printBits(resultNumberSet), resultNumberSet);

		/*** resetメソッドの結果出力 ******************************/
		// 指定したビットを0にして値を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_CHANGE_ZERO);
		// 指定したビットを0にして値を出力する
		System.out.printf(FORMAT_OUTPUT_CHANGE_RESULT, printBits(resultNumberReset), resultNumberReset);

		/*** inverseメソッドの結果出力 ******************************/
		// 指定したビットを反転した値を出力することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_CHANGE_REVERSE);
		// 指定したビットを反転した値を出力する
		System.out.printf(FORMAT_OUTPUT_CHANGE_RESULT, printBits(resultNumberInverse), resultNumberInverse);

		/*** 終了処理 ******************************/
		// bitの変換対象範囲の入力ストリームを閉じる
		scannerTargetBitRange.close();
	}
}
