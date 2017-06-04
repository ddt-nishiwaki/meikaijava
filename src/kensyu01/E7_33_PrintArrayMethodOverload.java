package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;

/*** クラス ******************************/
// 一次元、二次元の配列要素を出力するメソッドを実行するクラス
public class E7_33_PrintArrayMethodOverload {
	/*** スキャナー作成 ******************************/
	// 入力を扱うオブジェクトを作成する
	private static Scanner scannerInput = new Scanner(System.in);
	
	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の長さを配列の最後のインデックスに変換する値を設定する
	private static final int NUMBER_FORMATING_LAST_INDEX = -1;
	// 配列操作時のカウントを次のカウントに変換するための値を設定する
	private static final int NUMBER_FORMATING_NEXT_INDEX = 1;
	// 配列操作時のカウントを前のカウントに変換するための値を設定する
	private static final int NUMBER_FORMATING_PREVIOUS_INDEX = -1;
	
	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "一次元、二次元の配列要素を出力します\n";
	private static final String TEXT_ARRAY_ONE_DIMENTION = "一次元の配列";
	private static final String TEXT_ARRAY_TWO_DIMENTION = "二次元の配列";
	private static final String FORMAT_MAKE_ARRAY_OF = "%sの配列を作成します\n";
	private static final String FORMAT_OUTPUT_ARRAY_OF = "%sの配列要素を出力します\n";

	/*** printArrayElementメソッド用定数 ******************************/
	// 配列要素の出力開始を示す文字列を設定する
	private static final String STRING_START_OUTPUT_ELEMENT = "{ ";
	// 配列要素の出力終了を示す文字列を設定する
	private static final String STRING_END_OUTPUT_ELEMENT = " }";
	// 配列要素を出力する際の区切り文字を設定する
	private static final String ELEMENT_DELIMITER = ", ";
	
	/*** makeArrayメソッド用定数 ******************************/
	// 配列の長さ入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH = "配列の長さを 1 以上の整数値で設定してください";
	// 各要素の値の入力待ちを示す文字列を設定する
	private static final String FORMAT_REQUEST_ELEMENT = "[%d] の値を入力 : ";

	/*** メソッド ******************************/
	// 一次元の配列要素を出力するメソッドを設定する
	private static void printArray(int[] targetArray) {
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
	// 二次元の配列要素を出力するメソッドを設定する
	private static void printArray(int[][] targetArray) {
		// 配列要素の出力開始を示す文字列を設定する
		System.out.print(STRING_START_OUTPUT_ELEMENT);
		// 改行を出力する
		System.out.println();
		// 一次元目の配列の長さを取得する
		int lengthPrimaryArray  = targetArray.length;
		// 二次元目の各配列にアクセスする
		for ( int primaryCount = INITIALIZE_ZERO; primaryCount < lengthPrimaryArray; primaryCount++ ){
			// 配列要素の出力開始を示す文字列を設定する
			System.out.print("   "+STRING_START_OUTPUT_ELEMENT);
			// 各配列の長さを取得する
			int lengthSecondaryArray = targetArray[primaryCount].length;
			// 各配列の要素にアクセスする
			for ( int secondaryCount = INITIALIZE_ZERO; secondaryCount < lengthSecondaryArray; secondaryCount++){
				// 初回以外で、区切り文字を出力する
				if ( secondaryCount != 0 ) {
					// 区切り文字を出力する
					System.out.print(ELEMENT_DELIMITER);
				};
				// 各要素の値を出力する
				System.out.print(targetArray[primaryCount][secondaryCount]);
			}
			// 配列要素の出力終了を示す文字列を出力する
			System.out.print(STRING_END_OUTPUT_ELEMENT);
			// 最後を除き、区切り文字を出力する
			if ( primaryCount < lengthPrimaryArray + NUMBER_FORMATING_LAST_INDEX) {
				// 区切り文字を出力する
				System.out.println(ELEMENT_DELIMITER);
			};
		}
		// 改行を出力する
		System.out.println();
		// 配列要素の出力終了を示す文字列を出力する
		System.out.println(STRING_END_OUTPUT_ELEMENT);
	}

	/*** メソッド makeArray******************************/
	// 配列を作成するメソッドを設定する
	private static int[] makeArray () {
		// 配列の長さを保持する変数を初期化する
		int lengthMakeArray = INITIALIZE_ZERO;
		// 配列が作成できる長さを入力するまで繰り返す
		do {
			// 配列の長さ入力を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_LENGTH);
			// 入力された長さを保持する
			lengthMakeArray = scannerInput.nextInt();
		// 長さが 0 以下の時は再入力を求める
		} while (lengthMakeArray <= 0);
		// 配列を作成する
		int[] makedArray = new int[lengthMakeArray];
		// 各インデックスにアクセスする
		for (int indexCount = INITIALIZE_ZERO; indexCount < lengthMakeArray; indexCount++ ) {
			// 各インデックスの入力待ちを示す文字列を出力する
			System.out.printf(FORMAT_REQUEST_ELEMENT,indexCount);
			// 各インデックスに値を設定する
			makedArray[indexCount] = scannerInput.nextInt();
		}
		// 作成された配列を返す
		return makedArray;
	}
	// 二次元配列を作成するメソッドを設定する
	private static int[][] makeArrayTwoDimention () {
		// 配列の長さを保持する変数を初期化する
		int lengthMakeArray = INITIALIZE_ZERO;
		// 配列が作成できる長さを入力するまで繰り返す
		do {
			// 配列の長さ入力を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_LENGTH);
			// 入力された長さを保持する
			lengthMakeArray = scannerInput.nextInt();
		// 長さが 0 以下の時は再入力を求める
		} while (lengthMakeArray <= 0);
		// 配列を作成する
		int[][] makedArray = new int[lengthMakeArray][];
		
		// 二次元目の各要素に配列を設定する
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthMakeArray; indexCount++ ){
			// 各要素に配列を設定する
			makedArray[indexCount] = makeArray();
		}
		// 作成された配列を返す
		return makedArray;
	}

	/*** メインメソッド ******************************/
	// 一次元、二次元の配列要素を出力するメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数宣言 ******************************/
		// 一次元配列を保持する変数を宣言する
		int[] arrayOneDimention;
		// 二次元配列を保持する変数を宣言する
		int[][] arrayTwoDimention;

		/*** 内容出力処理 ******************************/
		// これから行う処理を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** 対象配列作成 ******************************/
		// 一次元配列を作成することをメッセージで出力する
		System.out.printf(FORMAT_MAKE_ARRAY_OF,TEXT_ARRAY_ONE_DIMENTION);
		// 一次元配列を作成する
		arrayOneDimention = makeArray();

		// 二次元配列を作成することをメッセージで出力する
		System.out.printf(FORMAT_MAKE_ARRAY_OF,TEXT_ARRAY_TWO_DIMENTION);
		// 二次元配列の一次元目を作成する
		arrayTwoDimention = makeArrayTwoDimention();

		/*** 対象配列出力 ******************************/
		// 一次元配列の要素を出力することをメッセージで出力する
		System.out.printf(FORMAT_OUTPUT_ARRAY_OF,TEXT_ARRAY_ONE_DIMENTION);
		// 一次元配列の要素を出力する
		printArray(arrayOneDimention);
		// 二次元配列の要素を出力することをメッセージで出力する
		System.out.printf(FORMAT_OUTPUT_ARRAY_OF,TEXT_ARRAY_TWO_DIMENTION);
		// 二次元配列の要素を出力する
		printArray(arrayTwoDimention);

		/*** 終了処理 ******************************/
		// 入力ストリームを閉じる
		scannerInput.close();
	}
}
