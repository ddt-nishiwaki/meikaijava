package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 配列から要素を削除するメソッドaryRmvを実行するクラス
public class E7_18_aryRmvMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 次のインデックスを参照するための値を設定する
	private static final int NUMBER_CHANGE_NEXT = 1;
	// 前のインデックスを参照するための値を設定する
	private static final int NUMBER_CHANGE_PREVIOUS = -1;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "配列から要素を削除します";
	// 対象の配列を作成することをメッセージで出力する
	private static final String MESSAGE_OUTPUT_MAKE_ARRAY = "対象の配列を作成します";
	// 配列の長さ設定を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH_ARRAY = "配列の長さを入力してください : ";
	// 配列の各要素の値入力を求めるメッセージを出力する
	private static final String MESSAGE_REQUEST_ELEMENT_VALUE = "各要素の値を入力してください : ";
	// 各要素の入力待ちであることを示すテキストフォーマットを設定する
	private static final String FORMAT_START_REQUEST_ELEMENT = "int[] targetArray = { ";
	// 各要素の入力が終了したことを示すテキストフォーマットを設定する
	private static final String FORMAT_END_REQUEST_ELEMENT = " }";
	// 要素の入力の区切り文字を設定する
	private static final String ELEMENT_DELIMITER = ", ";
	// 削除するインデックスの入力を求めるメッセージを出力する
	private static final String FORMAT_REQUEST_DELETE_INDEX = "削除する要素のインデックスを 0 ~ %d で指定してください : ";
	// 指定範囲の入力があった場合のメッセージを出力する
	private static final String MESSAGE_CAUTION_OUT_RANGE = "入力範囲外です";
	// 削除実行後の配列を出力することを示すメッセージを設定する
	private static final String MESSAGE_RESULT_DELETE_ELEMENT = "削除実行後の配列を表示します";
	
	/*** スキャナー作成 ******************************/
	// 配列設定用のオブジェクトを作成する
	private static Scanner scannerSettingArray = new Scanner(System.in);

	/*** メソッド ******************************/
	private static void aryRmv (int[] targetArray, int targetIndex) {
		/*** 変数初期化 ******************************/
		// 配列の長さを取得する
		int lengthTargetArray = targetArray.length;
		// 配列の最後のインデックスを設定する
		int lastIndex = lengthTargetArray + NUMBER_CHANGE_PREVIOUS;

		/*** 入力判定処理 ******************************/
		// 削除対象のインデックスが存在しない場合は、値の再入力を求める
		while ( targetIndex >= lengthTargetArray || targetIndex < 0 ) {
			// 入力が範囲外であること示すメッセージを出力する
			System.out.println(MESSAGE_CAUTION_OUT_RANGE);
			// 長さの入力を求める
			System.out.println(MESSAGE_REQUEST_LENGTH_ARRAY);
			// 入力された値を保持する
			targetIndex = scannerSettingArray.nextInt();
		};
		/*** 演算処理 ******************************/
		// 削除対象のインデックスから最後のインデックス手前まで順にアクセスする
		for ( int indexCount = targetIndex; indexCount < lastIndex; indexCount++ ) {
			// 現在のインデックスの値を次のインデックスの値で上書きする
			targetArray[indexCount] = targetArray[indexCount + NUMBER_CHANGE_NEXT];
		}
	}
	

	/*** メインメソッド ******************************/
	// 配列から要素を削除するメソッドaryRmvを実行するクラス
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		int lengthTargetArray = INITIALIZE_ZERO;

		/*** 内容出力処理 ******************************/
		// これから行う処理を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 対象配列を作成することをメッセージで出力する
		System.out.println(MESSAGE_OUTPUT_MAKE_ARRAY);

		/*** 配列設定 ******************************/
		// 配列の長さ入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_LENGTH_ARRAY);
		// 入力された長さを保持する
		lengthTargetArray = scannerSettingArray.nextInt();
		// 配列を作成する
		int[] targetArray = new int[lengthTargetArray];
		// 作成した配列の要素に値を設定することをメッセージで出力する
		System.out.println(MESSAGE_REQUEST_ELEMENT_VALUE);
		// 配列の各インデックスにアクセスする
		for (int indexCount = INITIALIZE_ZERO; indexCount < lengthTargetArray; indexCount++ ){
			// 現在のインデックスに値を設定する
			targetArray[indexCount] = scannerSettingArray.nextInt();
		}
		// 削除するインデックスの入力を求めるメッセージを出力する
		System.out.printf(FORMAT_REQUEST_DELETE_INDEX, lengthTargetArray + NUMBER_CHANGE_PREVIOUS);
		// 入力されたインデックスを保持する
		int targetIndex = scannerSettingArray.nextInt();
		// aryRmvメソッドを実行する
		aryRmv(targetArray, targetIndex);

		/*** 出力処理 ******************************/
		// 配列の値表示のためのテキストフォーマットを出力する
		System.out.println(MESSAGE_RESULT_DELETE_ELEMENT);
		// 削除実行後の配列を表示することそメッセージで出力する
		System.out.print(FORMAT_START_REQUEST_ELEMENT);
		// aryRmvメソッドに渡した配列の各要素の値を出力する
		for (int indexCount = 0; indexCount < lengthTargetArray; indexCount++ ) {
			if(indexCount != 0 ) {
				System.out.print(ELEMENT_DELIMITER);
			}
			System.out.print(targetArray[indexCount]);
		}
		// 配列の値表示終了を示すテキストフォーマットを出力する
		System.out.println(FORMAT_END_REQUEST_ELEMENT);
		
		/*** 終了処理 ******************************/
		// 配列設定用ストリームを閉じる
		scannerSettingArray.close();
	}
}
