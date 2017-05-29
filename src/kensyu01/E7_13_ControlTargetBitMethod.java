package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;


/*** クラス ******************************/
// 選択したビットを 1, 0, 反転した値 にするメソッドをそれぞれ実行するクラス
public class E7_13_ControlTargetBitMethod {

		/*** 数値型定数設定 ******************************/
		// 整数値を初期化するための 0 を設定する
		private static final int INITIALIZE_ZERO = 0;
		// 一桁目のビットが1かどうかを判定する値を設定する
		private static final int NUMBER_JADGE_BIT_ONE = 1;
		// ビットのカウントを繰り返し処理のフォーマットに変換する値を設定する
		private static final int NUMBER_FORMATING_BIT_INDEX = -1;
		// int型の値のビット数を設定する
		private static final int LENGTH_BIT_INTEGER = 32;
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
		private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "選択したビットを変換します";
		// 対象のビットを表示するためのフォーマットを設定する
		private static final String FORMAT_OUTPUT_TARGET_BIT = "対象のビット\n%s\n";
		// 対象ビットの位置の入力を求めるメッセージを設定する
		private static final String MESSAGE_REQUEST_TARGET_BIT = "変換するビットの場所を最下位0から数えた値で入力 : ";
		// 1に変換することを示すメッセージを設定する
		private static final String MESSAGE_OUTPUT_CHANGE_ONE = "選択したビットを1にします";
		// 0に変換することを示すメッセージを設定する
		private static final String MESSAGE_OUTPUT_CHANGE_ZERO = "選択したビットを0にします";
		// 反転することを示すメッセージを設定する
		private static final String MESSAGE_OUTPUT_CHANGE_REVERSE = "選択したビットを反転します";
		// 変換した値を出力するためのフォーマットを設定する
		private static final String FORMAT_OUTPUT_CHANGE_RESULT = "%s = %d\n";


		/*** メソッド ******************************/
		// 整数値のビットを出力するメソッドを設定する
		private static String printBits(int rotateOperand) {
			String operandBit = INITIALIZE_STRING;		// 対象のビットを保持する変数を宣言する
			// 対象の整数値のビットを調べる
			for (int bitCount = LENGTH_BIT_INTEGER + NUMBER_FORMATING_BIT_INDEX; bitCount >= 0; bitCount-- ) {
				// カウント分右シフトし、一桁目の値が 1 だった場合は 1 を出力し、そうでない場合は 0 を設定する
				operandBit +=  ((rotateOperand >>> bitCount & NUMBER_JADGE_BIT_ONE) == NUMBER_JADGE_BIT_ONE ) ? "1" : "0";
			}
			// 対象のビットを示す文字列を返す
			return operandBit;
		}
		
		/*** メソッド ******************************/
		// 狙うビットを1にした値を返すメソッドを設定する
		private static int generateTargetControlNumber (int targetIntValue, int targetPosition ) {
			// 2 のべき乗を保持する変数を初期化する
			int powerBinary = NUMBER_FIRST_BINARY;
			for ( int powerCount = INITIALIZE_ZERO; powerCount < targetPosition; powerCount++) {
				// 選択したビットを変換する値を設定する
				powerBinary *= NUMBER_BINARY_BASE;
			}
			return powerBinary;
		}

		/*** メソッド ******************************/
		// 選択したビットを1にするメソッドを設定する
		private static int set(int targetIntValue, int targetPosition ) {
			/*** 変数設定 ******************************/
			// 変換後の値を保持する変数を初期化する
			int resultBitChange = INITIALIZE_ZERO;
			// 選択したビットを変換するための値を保持する変数を初期化する
			int NumberTargetController = NUMBER_FIRST_BINARY;
			/*** 演算処理 ******************************/
			// 狙うビットを1にした値を設定する
			NumberTargetController = generateTargetControlNumber(targetIntValue, targetPosition);
			// 選択したビットを1にする
			resultBitChange = targetIntValue | NumberTargetController;
			/*** 終了処理 ******************************/
			// 変換後の値を返す
			return resultBitChange;
		}


		/*** メソッド ******************************/
		// 選択したビットを0にするメソッドを設定する
		private static int reset(int targetIntValue, int targetPosition ) {
			/*** 変数設定 ******************************/
			// 変換後の値を保持する変数を初期化する
			int resultBitChange = INITIALIZE_ZERO;
			// 選択したビットを変換するための値を保持する変数を初期化する
			int NumberTargetController = NUMBER_FIRST_BINARY;
			/*** 演算処理 ******************************/
			// 狙うビットを1にした値を設定する
			NumberTargetController = generateTargetControlNumber(targetIntValue, targetPosition);
			// 選択したビットを1にする
			resultBitChange = set(targetIntValue, targetPosition);
			// 選択したビットを0にする
			resultBitChange = resultBitChange ^ NumberTargetController;
			/*** 終了処理 ******************************/
			// 変換後の値を返す
			return resultBitChange;
		}


		/*** メソッド ******************************/
		// 選択したビットを0にするメソッドを設定する
		private static int inverse(int targetIntValue, int targetPosition ) {
			/*** 変数設定 ******************************/
			// 変換後の値を保持する変数を初期化する
			int resultBitChange = INITIALIZE_ZERO;
			// 選択したビットを変換するための値を保持する変数を初期化する
			int NumberTargetController = NUMBER_FIRST_BINARY;
			/*** 演算処理 ******************************/
			// 狙うビットを1にした値を設定する
			NumberTargetController = generateTargetControlNumber(targetIntValue, targetPosition);
			// 選択したビットを0にする
			resultBitChange = targetIntValue ^ NumberTargetController;
			/*** 終了処理 ******************************/
			// 変換後の値を返す
			return resultBitChange;
		}


		/*** メインメソッド ******************************/
		// 選択したビットを 1, 0, 反転した値 にするメソッドをそれぞれ実行する
		public static void main (String[] arg) {
			/*** 変数初期化 ******************************/
			// 入力されたビットの位置を保持する変数を初期化する
			int numberTargetBitPosition = INITIALIZE_ZERO;
			// setメソッドの返値を保持する変数を初期化する
			int resultNumberSet = INITIALIZE_ZERO;
			// resetメソッドの返値を保持する変数を初期化する
			int resultNumberReset = INITIALIZE_ZERO;
			// inverseメソッドの返値を保持する変数を初期化する
			int resultNumberInverse = INITIALIZE_ZERO;
			// bit変換対象となる値を設定するための変数を初期化する
			int convertedInteger = NUMBER_FIRST_BINARY;
			// 整数値のbitの半分の桁数を設定する
			int lengthHalfIntBit = LENGTH_BIT_INTEGER / 2;
			
			/*** 対象の値設定 ******************************/
			// 対象の値として16bit目までを1にしたときの整数値を設定する
			convertedInteger = (NUMBER_FIRST_BINARY << lengthHalfIntBit) + NUMBER_SHIFT_PREVIOUS_BIT;
			// 対象のビットを示す文字列を保持する変数を初期化する
			String targetBit = printBits(convertedInteger);

			/*** オブジェクト作成 ******************************/
			// 変換するビットの位置入力を扱うオブジェクトを作成する
			Scanner scannerTargetBitPosition = new Scanner(System.in);

			/*** 内容出力処理 ******************************/
			// 処理内容を出力する
			System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
			// 対象のビットを表示する
			System.out.printf(FORMAT_OUTPUT_TARGET_BIT, targetBit);

			/*** 入力処理 ******************************/
			// 変換するbitの入力を求める
			System.out.println(MESSAGE_REQUEST_TARGET_BIT);
			// 入力されたbitの位置を保持する
			numberTargetBitPosition = scannerTargetBitPosition.nextInt();

			/*** 演算処理 ******************************/
			// setメソッドの返値を保持する変数を初期化する
			resultNumberSet = set(convertedInteger, numberTargetBitPosition);
			// resetメソッドの返値を保持する変数を初期化する
			resultNumberReset = reset(convertedInteger, numberTargetBitPosition);
			// inverseメソッドの返値を保持する変数を初期化する
			resultNumberInverse = inverse(convertedInteger, numberTargetBitPosition);
			
			/*** 出力処理 ******************************/
			// 選択したビットを1にして値を出力することをメッセージで出力する
			System.out.println(MESSAGE_OUTPUT_CHANGE_ONE);
			// 選択したビットを1にして値を出力する
			System.out.printf(FORMAT_OUTPUT_CHANGE_RESULT, printBits(resultNumberSet), resultNumberSet);

			// 選択したビットを0にして値を出力することをメッセージで出力する
			System.out.println(MESSAGE_OUTPUT_CHANGE_ZERO);
			// 選択したビットを0にして値を出力する
			System.out.printf(FORMAT_OUTPUT_CHANGE_RESULT, printBits(resultNumberReset), resultNumberReset);

			// 選択したビットを反転した値を出力することをメッセージで出力する
			System.out.println(MESSAGE_OUTPUT_CHANGE_REVERSE);
			// 選択したビットを反転した値を出力する
			System.out.printf(FORMAT_OUTPUT_CHANGE_RESULT, printBits(resultNumberInverse), resultNumberInverse);

			/*** 終了処理 ******************************/
			// 変換するビットの位置入力を扱うストリームを閉じる
			scannerTargetBitPosition.close();
		}
}
