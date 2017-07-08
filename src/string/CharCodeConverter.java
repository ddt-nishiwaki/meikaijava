package string;
/**
 * stringパッケージ用定数クラスを読み込む
 */
import static string.CommonStringConstants.*;

/**
 * 文字を文字コードに変換して文字列として返します
 * @author wakkky05
 * @return String
 * @see ConverterInterface
 *
 */
public class CharCodeConverter implements ConverterInterface{

	/******************************
		定数(String)
	******************************/
	// Unicode拡張表示用フォーマットです
	private static final String FORMAT_OUTPUT_HEXADECIMAL = "\\u%04X";
	
	/******************************
		クラスメソッド
	******************************/
	/**
	 * 文字コードを取得して文字列で返します
	 * @return String
	 */
	public String convertChar(char character){
		// 文字コードを取得する
		int charCode = character;
		// Unicode拡張形式で文字列として返す
		return String.format(FORMAT_OUTPUT_HEXADECIMAL, charCode) + STRING_BREAK_LINE;
	}
}











//public class CharCodeConverter implements ConverterInterface {
//

//}