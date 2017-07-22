package kensyu01;

/**************************************
	インポート
**************************************/
// 全パッケージ共有の定数を読み込む
import static common.CommonConstants.*;
// スキャナーを使用するために全パッケージ共有のオブジェクトを読み込む
import static common.CommonObject.*;
// Stringパッケージ用メソッドを読み込む
import static string.CustomeStringMethod.*;

/**
 * 文字列を逆順に表示するメソッドを実行するクラス
 * @author wakkky05
 *
 */
public class E15_3_SearchStringChecker {
	/**************************************
		定数(String)
	**************************************/
	// 検索対象の入力を求めるメッセージです
	private static final String MESSAGE_REQUEST_TARGET_STRING = "検索対象の文字列を入力してください";
	// 検索する文字列の入力を求めるメッセージです
	private static final String MESSAGE_REQUEST_SEARCH_STRING = "検索する文字列を入力してください";
	// 入力した文字列を出力するフォーマットです
	private static final String FORMAT_OUTPUT_INPUT_STRING = "検索対象 : %s\n";
	// 検索結果がないことを示すメッセージを設定する
	private static final String MESSAGE_NO_MATCH = "検索対象は存在しません";
	
	// 検索した文字列を出力するフォーマットです
	private static final String FORMAT_OUTPUT_SEARCH_STRING = "検索結果 : %s\n";
	/**
	 * 対象文字列から検索文字列を探して表示します
	 * 
	 * 表示仕様(abcdefからbcdを検索した場合)
	 * 	検索対象 : abcdef
	 * 	検索結果 :  bcd  
	 * @param arg
	 */
	public static void main(String[] arg){
		/**************************************
			変数宣言
		**************************************/
		String targetString;		// 検索対象文字列を保持する変数です
		String searchString;		// 検索文字列を保持する変数です
		
		/**************************************
			文字列の入力を求める
		**************************************/
		// 検索対象文字列の入力を求めます
		System.out.println(MESSAGE_REQUEST_TARGET_STRING);
		// 入力された文字列を保持します
		targetString = sInputScanner.nextLine();
		
		// 検索文字列の入力を求めます
		System.out.println(MESSAGE_REQUEST_SEARCH_STRING);
		// 入力された文字列を保持します
		searchString = sInputScanner.nextLine();
		
		/**************************************
			検索マッチした文字列を出力する
		**************************************/
		// 検索マッチした場合の処理を行う
		if( !(searchString.equals(EMPTY_STRING)) ){
			// 検索対象を表示仕様に合わせて出力します
			System.out.printf(FORMAT_OUTPUT_INPUT_STRING,SearchString(targetString, targetString) );
			// 検索結果を表示仕様に合わせて出力します
			System.out.printf(FORMAT_OUTPUT_SEARCH_STRING,SearchString(targetString, searchString) );
		// 検索マッチしない場合の処理を行う
		} else {
			// 検索マッチしなかったことをメッセージで出力する
			System.out.println(MESSAGE_NO_MATCH);
		}
	}


}
