package kensyu01;

/*** ライブラリの読み込み ******************************/
//乱数を生成する機能を読み込む
import java.util.Random;


/*** クラス ******************************/
// 二つの整数値、三つの整数値、配列要素のいずれからも最小値を求めるメソッドを実行するクラス
public class E7_30_minMethodOverload {

	/*** オブジェクト作成 ******************************/
	// 検証用の値を設定するオブジェクトを作成する
	private static Random operandGenerator = new Random();

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の長さを配列の最後のインデックスに変換する値を設定する
	private static final int NUMBER_FORMATING_LAST_INDEX = -1;
	// 乱数生成の範囲の最小値を設定する
	private static final int NUMBER_RANDOM_MINIMUM_RANGE = -10;
	// 乱数生成の範囲の最大値を設定する
	private static final int NUMBER_RANDOM_MAX_RANGE = 10;
	// 設定した乱数範囲を実際の乱数生成時の値に変換する値を設定する
	private static final int NUMBER_FORMATING_RANDOM = 1;
	// 作成する配列の長さを設定する
	private static final int NUMBER_LENGTH_ARRAY = 10;
	
	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "二つの整数値、三つの整数値、配列要素のいずれからも最小値を求めます";
	// 二つの整数値のうち小さい方を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_MIN_TWO = "次の二つの整数値のうち小さい方を出力します";
	// 三つの整数値のうち小さい方を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_MIN_THREE = "三つの整数値のうち小さい方を出力します";
	// 配列要素のうち最小の値を出力することを示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_MIN_ELEMENT = "配列要素のうちから最小値を出力します";
	// 設定する値を示すフォーマットを設定する
	private static final String FORMAT_OUTPUT_SET_TWO = "%d, %d\n";
	// 設定する値を示すフォーマットを設定する
	private static final String FORMAT_OUTPUT_SET_THREE = "%d, %d, %d\n";
	// 最小値を出力することを示す文字列を設定する
	private static final String FORMAT_OUTPUT_MIN_VALUE = "最小値 => %d\n";

	/*** printArrayElementメソッド用定数 ******************************/
	// 配列要素の出力開始を示す文字列を設定する
	private static final String STRING_START_OUTPUT_ELEMENT = "{ ";
	// 配列要素の出力終了を示す文字列を設定する
	private static final String STRING_END_OUTPUT_ELEMENT = " }";
	// 配列要素を出力する際の区切り文字を設定する
	private static final String ELEMENT_DELIMITER = ", ";

	/*** メソッド printArrayElement ******************************/
	// 配列の全要素を出力するメソッドを設定する
	private static void printArrayElement (int[] targetArray) {
		// 配列の長さを保持する変数を初期化する
		int lengthArray = INITIALIZE_ZERO;
		// 配列の長さを取得する
		lengthArray = targetArray.length;
		// 配列要素の出力開始を示す文字列を設定する
		System.out.print(STRING_START_OUTPUT_ELEMENT);
		// 対象の配列の要素にアクセスする
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthArray; indexCount++ ) {
			// 初回以外で、区切り文字を出力する
			if ( indexCount != 0 ) {
				// 区切り文字を出力する
				System.out.print(ELEMENT_DELIMITER);
			};
			// 各要素の値を出力する
			System.out.print(targetArray[indexCount]);
		}
		// 配列要素の出力終了を示す文字列を出力する
		System.out.println(STRING_END_OUTPUT_ELEMENT);
	}
	
	/*** メソッド min ******************************/
	// 二つの整数値のうち小さい方の値を返すメソッドを設定する
	private static int min(int firstNumber, int secondNumber) {
		/*** 変数初期化 ******************************/
		// 最小値を保持する変数を宣言する
		int minNumber;
		/*** 処理 ******************************/
		// 一つ目の引数と二つ目の引数を比べて小さい方を最小値に設定する
		minNumber = (firstNumber <= secondNumber) ? firstNumber : secondNumber;
		/*** 終了処理 ******************************/
		// 最小値を返す
		return minNumber;
	}

	/*** メソッド min ******************************/
	// 三つの整数値のうち小さい方の値を返すメソッドを設定する
	private static int min(int firstNumber, int secondNumber, int thirdNumber) {
		/*** 変数初期化 ******************************/
		// 最小値を保持する変数を宣言する
		int minNumber;
		/*** 処理 ******************************/
		// 一つ目の引数と二つ目の引数を比べて小さい方を最小値に設定する
		minNumber = (firstNumber <= secondNumber) ? firstNumber : secondNumber;
		// 現在の最小値と三つ目の引数を比べて小さい方を最小値に設定する
		minNumber = (minNumber <= thirdNumber) ? minNumber : thirdNumber;
		/*** 終了処理 ******************************/
		// 最小値を返す
		return minNumber;
	}

	/*** メソッド min ******************************/
	// 配列要素のうち最も小さい値を返すメソッドを設定する
	private static int min(int[] targetArray) {
		/*** 変数初期化 ******************************/
		// 最小値を保持する変数を宣言する
		int minNumber;
		// 対象配列の長さを取得する
		int lengthArray = targetArray.length;
		// 対象配列の最後のインデックスを取得する
		int lastIndex = lengthArray + NUMBER_FORMATING_LAST_INDEX;
		/*** 処理 ******************************/
		// 最小値として配列の最後のインデックスの要素を設定する
		minNumber = targetArray[lastIndex];
		// 配列の各要素にアクセスする
		for ( int indexCount = lastIndex--; indexCount >= 0; indexCount-- ){
			// 現在の要素の値を取得する
			int currentElement = targetArray[indexCount];
			// 現在の最小値と現在の要素の値を比較して小さい方を最小値に設定する
			minNumber = (minNumber < currentElement) ? minNumber : currentElement;
		}
		/*** 終了処理 ******************************/
		// 最小値を返す
		return minNumber;
	}
	
	
	private static int generateRandomOperand(int startRange, int endRange) {
		// 乱数のスタート範囲を調節つすための乱数を生成する
		int generatedOperand = operandGenerator.nextInt(endRange - startRange + NUMBER_FORMATING_RANDOM);
		// 生成した乱数範囲のスタート位置を調整する
		generatedOperand += startRange;
		// 範囲を調整した乱数を返す
		return generatedOperand;
	}

	/*** メインメソッド ******************************/
	// 二つの整数値、三つの整数値、配列要素のいずれからも最小値を求めるメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数宣言 ******************************/
		int firstNumber;		// 一つ目の整数値を設定するための変数を宣言する
		int secondNumber;		// 二つ目の整数値を設定するための変数を宣言する
		int thirdNumber;		// 三つ目の整数値を設定するための変数を宣言する
		int[] targetArray;		// 対象配列を設定するための変数を宣言する


		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** 出力1 ******************************/
		// 二つの整数値のうち小さい方を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_MIN_TWO);
		// 一つ目の整数値に乱数を設定する
		firstNumber = generateRandomOperand(NUMBER_RANDOM_MINIMUM_RANGE,NUMBER_RANDOM_MAX_RANGE);
		// 二つ目の整数値に乱数を設定する
		secondNumber = generateRandomOperand(NUMBER_RANDOM_MINIMUM_RANGE,NUMBER_RANDOM_MAX_RANGE);
		// 設定する二つの整数値を表示する
		System.out.printf(FORMAT_OUTPUT_SET_TWO,firstNumber,secondNumber);
		// 二つの整数値のうち小さい方を出力する
		System.out.printf(FORMAT_OUTPUT_MIN_VALUE,min(firstNumber, secondNumber));

		/*** 出力2 ******************************/
		// 三つの整数値のうち小さい方を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_MIN_THREE);
		// 一つ目の整数値に乱数を設定する
		firstNumber = generateRandomOperand(NUMBER_RANDOM_MINIMUM_RANGE,NUMBER_RANDOM_MAX_RANGE);
		// 二つ目の整数値に乱数を設定する
		secondNumber = generateRandomOperand(NUMBER_RANDOM_MINIMUM_RANGE,NUMBER_RANDOM_MAX_RANGE);
		// 三つ目の整数値に乱数を設定する
		thirdNumber = generateRandomOperand(NUMBER_RANDOM_MINIMUM_RANGE,NUMBER_RANDOM_MAX_RANGE);
		// 設定する三つの整数値を表示する
		System.out.printf(FORMAT_OUTPUT_SET_THREE,firstNumber,secondNumber,thirdNumber);
		// 三つの整数値のうち最小値を出力する
		System.out.printf(FORMAT_OUTPUT_MIN_VALUE,min(firstNumber, secondNumber,thirdNumber));

		/*** 出力3 ******************************/
		// 配列要素のうち最小の値を出力することを示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_MIN_ELEMENT);
		// 配列の長さを設定する
		targetArray = new int[NUMBER_LENGTH_ARRAY];
		// 各配列要素にアクセスする
		for ( int indexCount = 0; indexCount < NUMBER_LENGTH_ARRAY; indexCount++) {
			// 各要素に乱数を設定する
			targetArray[indexCount] = generateRandomOperand(NUMBER_RANDOM_MINIMUM_RANGE,NUMBER_RANDOM_MAX_RANGE);
		}
		// 配列要素のうち最小の値を出力する
		printArrayElement(targetArray);
		// 配列要素のうちの最小値を出力する
		System.out.printf(FORMAT_OUTPUT_MIN_VALUE,min(targetArray));
	}
}
