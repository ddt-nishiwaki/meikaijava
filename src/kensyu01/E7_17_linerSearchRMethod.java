package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス ******************************/
// 探索したい値を配列要素から後方検索するメソッドを実行するクラス
public class E7_17_linerSearchRMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 配列の最初のインデックスを設定する
	private static final int FIRST_INDEX_ARRAY = 0;
	// 配列の検索失敗を示す値を設定する
	private static final int NUMBER_FAIL_SEARCH = -1;
	
	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "探索したい値を配列要素から後方検索する";
	// 配列設定するメッセージを設定する
	private static final String MESSAGE_MAKE_ARRAY = "配列を作成します";
	// 配列要素の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH_ARRAY = "配列の長さを設定してください";
	// 配列各要素の値入力待ちを示すテキストフォーマットを設定する
	private static final String FORMAT_REQUEST_ARRAY_ELEMENT = "[%d] の値を入力 : ";
	// 探索したい値の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_SEARCH_KEY= "探索したい値を入力してください";
	// 探索した値を出力するためのメッセージフォーマットを設定する
	private static final String FORMAT_OUTPUT_SEARCH_INDEX= "探索した値は [%d] にあります";
	// 探索した場合に出力するメッセージフォーマットを設定する
	private static final String FORMAT_OUTPUT_SEARCH_FAIL= "探索失敗: %d";
	
	/*** スキャナーオブジェクト設定 ******************************/
	// 配列設定の入力を扱うオブジェクトを作成する
	private static final Scanner SCANNER_SETTING_ARRAY = new Scanner(System.in);
	// 検索する値入力を扱うオブジェクトを作成する
	private static final Scanner SCANNER_SEARCH_KEY = new Scanner(System.in);
	
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
	// 探索したい値を配列要素から後方検索するメソッドを設定する
	private static int linearSearchR ( int[] targetArray, int searchKey ) {
		/*** 変数初期化 ******************************/
		// 検索結果を保持する変数を初期化する
		int resultSearchIndex = NUMBER_FAIL_SEARCH;
		// 対象配列の長さを設定する変数を初期化する
		int lengthArray = INITIALIZE_ZERO;
		/*** 演算処理 ******************************/
		// 対象配列の長さを取得する
		lengthArray = targetArray.length;
		// 対象配列の各要素に後方からアクセスする
		for ( int indexCount = lengthArray - 1; indexCount > FIRST_INDEX_ARRAY; indexCount-- ) {
			// 探索する値と同じ値があった場合の処理を行う
			if (targetArray[indexCount] == searchKey ) {
				// 現在のインデックスを保持する 
				resultSearchIndex = indexCount;
				// 探索を終了する
				break;
			}
		}
		/*** 終了処理 ******************************/
		// 探索結果を返す
		return resultSearchIndex;
	}
	

	/*** メインメソッド ******************************/
	// 探索したい値を配列要素から後方検索するメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 配列の長さを保持する変数を初期化する
		int lengthArray = INITIALIZE_ZERO;
		// 探索結果を保持する変数を初期化する
		int indexSearchResult = NUMBER_FAIL_SEARCH;
		// 探索する値を設定する変数を初期化する
		int searchKey = INITIALIZE_ZERO;
		// 作成した配列を保持する変数を宣言する
		int[] targetArray;
		
		/*** 内容出力処理 ******************************/
		// これから行う処理の説明を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 配列を作成することをメッセージで出力する
		System.out.println(MESSAGE_MAKE_ARRAY);

		/*** 配列作成処理 ******************************/
		// 配列の長さ入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_LENGTH_ARRAY);
		// 入力された配列の長さを保持する
		lengthArray = SCANNER_SETTING_ARRAY.nextInt();
		// 配列を作成する
		targetArray = settingArray(lengthArray);

		/*** 探索処理 ******************************/
		// 探索する値入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_SEARCH_KEY);
		// 探索する値を保持する
		searchKey = SCANNER_SEARCH_KEY.nextInt();
		// 作成した配列要素を後方検索する
		indexSearchResult = linearSearchR(targetArray, searchKey);

		/*** 出力処理 ******************************/
		// 探索が成功している場合の処理を行う
		if (indexSearchResult != NUMBER_FAIL_SEARCH) {
			// 探索結果を出力する
			System.out.printf(FORMAT_OUTPUT_SEARCH_INDEX, indexSearchResult);
		// 探索が失敗している場合の処理を行う
		} else {
			// 探索に失敗したことを出力する
			System.out.printf(FORMAT_OUTPUT_SEARCH_FAIL, indexSearchResult);
		}
		
		/*** 終了処理 ******************************/
		// 配列設定用入力ストリームを閉じる
		SCANNER_SETTING_ARRAY.close();
		// 探索する値入力用ストリームを閉じる
		SCANNER_SEARCH_KEY.close();
	}
}
