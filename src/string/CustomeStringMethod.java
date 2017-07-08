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

	/**
	 * 文字列を逆順にして返します
	 * @return String
	 */
	public static String getReverseString(String text){
		String reverseString = EMPTY_STRING;		// 逆順にした文字列を保持する変数を宣言します
		// 設定された文字列の長さを取得します
		int stringLength = text.length();
		// 文字列の各文字に逆順にアクセする
		for(int charCount = stringLength; charCount > NUMBER_FIRST_INDEX; charCount-- ){
			// リターン用の文字列に文字を追加していく
			reverseString += String.valueOf(text.charAt(charCount + NUMBER_FORMAT_INDEX));
		}
		// 逆順に並べた文字列を返す
		return reverseString;
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
