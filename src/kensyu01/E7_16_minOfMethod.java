package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 受け取った配列要素の最小値を求めるメソッドを実行するクラス
public class E7_16_minOfMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の最初のインデックスを設定する
	private static final int FIRST_INDEX_ARRAY = 0;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "受け取った配列要素の最小値を求めます";
	// 配列要素の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH_ARRAY = "配列の長さを設定してください";
	// 配列各要素の値入力待ちを示すテキストフォーマットを設定する
	private static final String FORMAT_REQUEST_ARRAY_ELEMENT = "[%d] の値を入力 : ";
	// 配列要素の最小値を出力するフォーマットを設定する
	private static final String FORMAT_OUTPUT_MINIMUM_ELEMENT = "配列要素の最小値は %d です";

	/*** スキャナーオブジェクト設定 ******************************/
	private static final Scanner SCANNER_SETTING_ARRAY = new Scanner(System.in);

	/*** メソッド ******************************/
	// 配列の作成を行うメソッドを設定する
	private static int[] settingArray (int lengthArray) {
		/*** オブジェクト作成 ******************************/
		// 設定された長さで配列を作成する
		int[] generatedArray = new int[lengthArray];
		/*** 各要素の値設定 ******************************/
		// 作成した配列の各要素にアクセスする
		for ( int indexCount = INITIALIZE_ZERO; indexCount < lengthArray; indexCount++ ) {
			// 各要素の設定待ちを示すテキストを表示する
			System.out.printf(FORMAT_REQUEST_ARRAY_ELEMENT, indexCount);
			// 各要素に値を設定する
			generatedArray[indexCount] = SCANNER_SETTING_ARRAY.nextInt();
		}
		/*** 終了処理 ******************************/
		// 作成した配列を返す
		return generatedArray;
	}

	/*** メソッド ******************************/
	// 配列要素の最小値を返すメソッドを設定する
	private static int minOf (int[] targetArray) {
		/*** 変数初期化 ******************************/
		// 対象配列の長さを変数に設定する
		int lengthTargetArray = targetArray.length;
		// 要素の最小値を設定するための変数を初期化する
		int minimumElement = INITIALIZE_ZERO;
		/*** 演算処理 ******************************/
		// 配列の最初の要素を取得する
		minimumElement = targetArray[FIRST_INDEX_ARRAY];
		// 要素の最小値を取得するために対象配列の各要素にアクセスする
		for ( int indexCount = lengthTargetArray - 1; indexCount > FIRST_INDEX_ARRAY; indexCount-- ) {
			// 現在の要素を取得する
			int currentElement = targetArray[indexCount];
			// 各要素の値を比べ,より小さい値を設定する
			minimumElement = (currentElement < minimumElement ) ? currentElement : minimumElement;
		}
		/*** 終了処理 ******************************/
		// 配列要素の最小値を返す
		return minimumElement;
	}
	

	/*** メインメソッド ******************************/
	// 受け取った配列要素の最小値を求めるメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 配列の長さを設定するための変数を初期化する
		int lengthArray = INITIALIZE_ZERO;
		// 配列要素の最小値を保持する変数を初期化する
		int minimumElement = INITIALIZE_ZERO;

		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);

		/*** 入力処理 ******************************/
		// 配列の長さ入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_LENGTH_ARRAY);
		// 入力された配列の長さを保持する
		lengthArray = SCANNER_SETTING_ARRAY.nextInt();

		/*** 演算処理 ******************************/
		// 配列を設定し、各要素の最小値を取得する
		minimumElement = minOf( settingArray(lengthArray) );

		/*** 出力処理 ******************************/
		// 取得した最小値を出力する
		System.out.printf(FORMAT_OUTPUT_MINIMUM_ELEMENT, minimumElement);

		/*** 終了処理 ******************************/
		// 配列設定用入力ストリームを閉じる
		SCANNER_SETTING_ARRAY.close();
	}
}
