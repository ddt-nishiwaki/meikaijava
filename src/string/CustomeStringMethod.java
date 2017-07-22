package string;

/***********************************************
	インポート
***********************************************/
// 全パッケージ共有の定数
import static common.CommonConstants.*;

/**
 * 文字列を扱うカスタムメソッドを定義するクラス
 * @author wakkky05
 *
 */
public class CustomeStringMethod {

	/*********************************************
		定数(String)
	*********************************************/
	// 検索対象が存在しないことを示す値を設定する
	private static final int NUMBER_RESULT_NO_MATCH = -1;

	// 空白文字を設定する
	private static final String TEXT_WHITE_SPACE = " "; 

	/**
	 * 文字列を逆順にして返します
	 * @return String
	 */
	public static String getReverseString(String text){
		String reverseString = EMPTY_STRING;		// 逆順にした文字列を保持する変数を宣言します
		// 設定された文字列の長さを取得します
		int stringLength = text.length();
		// 文字列の各文字に逆順にアクセスする
		for(int charCount = stringLength; charCount > NUMBER_FIRST_INDEX; charCount-- ){
			// リターン用の文字列に文字を追加していく
			reverseString += String.valueOf(text.charAt(charCount + NUMBER_FORMAT_INDEX));
		}
		// 逆順に並べた文字列を返す
		return reverseString;
	}
	
	/**************************************
		クラスメソッド
	**************************************/
	/**
	 * 対象文字列から検索文字列を検索し、マッチしない部分を空白文字に置き換えた文字列を返します
	 * マッチしない場合は空白文字を返します
	 * @return String
	 */
	public static String SearchString(String targetString, String searchString){
		int numberSearchResult;		// 文字列検索結果を保持する変数です
		String resultSearch = "";
		// 検索対象が存在するか調べてその結果を保持する
		numberSearchResult = targetString.indexOf(searchString);
		// 検索対象が存在した場合の処理を行う
		if (numberSearchResult != NUMBER_RESULT_NO_MATCH){
			// マッチした文字列より前のインデックス分の空白文字を作る
			for(int charCount = NUMBER_START_COUNT; charCount < numberSearchResult; charCount++){
				// マッチしない部分に空白文字を設定する
				resultSearch += TEXT_WHITE_SPACE;
			}
			// 検索対象文字列を追加する
			resultSearch += searchString;
		}
		// 検索結果を返す
		return resultSearch;
	}
		

	/**
	 * 入力された文字列の各文字に変更処理を行い
	 * 変更後の文字列として返します
	 * @return String
	 */
	public static String changeEachChar(String text, ConverterInterface comverter){
		String changeString = EMPTY_STRING;		// 処理を行った後の文字列を格納するための変数です
		String character;						// 各文字を保持するための変数です
		// 設定された文字列の長さを取得します
		int stringLength = text.length();
		// 文字列の各文字にアクセスする
		for(int charCount = NUMBER_FIRST_INDEX; charCount < stringLength; charCount++ ){
			// 各文字を設定したコンバーターで変換します
			character = comverter.convertChar( text.charAt(charCount) );
			// 変換した文字を文字列に追加します
			changeString += String.valueOf(character);
		}
		// 変換した文字列を返します
		return changeString;
	}
}
