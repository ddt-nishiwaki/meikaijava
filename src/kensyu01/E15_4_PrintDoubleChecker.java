package kensyu01;
/****************************************
	インポート
****************************************/
// printDoubleメソッドを読み込む
import static math.DoublePrinter.*;

// スキャナーを読み込む
import java.util.Scanner;
// 乱数を生成するライブラリを読み込む
import java.util.Random;
/**
 * printDoubleメソッドの実行確認を行うクラス
 * double型の値の全体を'少なくとも' minDigit桁表示
 * 小数点以下の部分をfloatDigit桁で表示する
 * @author wakkky05
 *
 */
public class E15_4_PrintDoubleChecker {

	/*****************************************************
		定数(String)
	*****************************************************/
	// Double型の値を設定することを示すメッセージです
	private static final String MESSAGE_PROCESS = "Double型の値を設定します";
	// 整数値部分の入力を求めるメッセージです
	private static final String MESSAGE_REQUEST_INPUT_INTEGER = "整数値部分を入力してください";
	// 小数点以下はランダムで設定することを示すメッセージです
	private static final String MESSAGE_SETTING_FLOAT = "小数点以下はランダムで設定します";
	// 出力の最小桁数の入力を求める
	private static final String MESSAGE_REQUEST_MINIMUM_DIGIT = "出力の最小桁数を入力してください";
	// 小数点以下の出力桁数の入力を求める
	private static final String MESSAGE_REQUEST_FLOAT_DIGIT = "小数点以下の出力桁数を入力してください";
	// 設定したフォーマットでdouble型の値を出力することを示すメッセージです
	private static final String MESSAGE_OUTPUT_DOUBLE_VALUE = "設定したフォーマットでdouble型の値を出力します";

	/*****************************************************
		オブジェクト
	*****************************************************/
	// 入力読み取り用スキャナーを作成する
	private static Scanner inputScanner = new Scanner(System.in);
	// 小数点以下の値を生成するオブジェクトを作成する
	private static Random floatValueGenerator = new Random();

	/**
	 * printDoubleメソッドを検証します
	 * @param arg
	 */
	public static void main(String[] arg){
		double doubleValue;			// 検証用にdouble型の値を設定するための変数です
		int intValue;				// 整数値部分の入力を保持する変数です
		int minDigit;				// 最小桁数を設定するための変数です
		int floatDigit;				// 小数点以下の桁数を設定するための変数です
		// Double型の値を設定することを示すメッセージを出力します
		System.out.println(MESSAGE_PROCESS);
		// 整数値部分の入力を求めるメッセージを出力します
		System.out.println(MESSAGE_REQUEST_INPUT_INTEGER);
		// 整数値部分の入力を保持します
		intValue = inputScanner.nextInt();
		// 小数点以下はランダムで設定することを示すメッセージを出力します
		System.out.println(MESSAGE_SETTING_FLOAT);
		// double型の値を設定します
		doubleValue = (double)intValue + floatValueGenerator.nextDouble();
		// 設定されたdouble型の値を出力します
		System.out.println(doubleValue);
		// 出力の最小桁数の入力を求めます
		System.out.println(MESSAGE_REQUEST_MINIMUM_DIGIT);
		// 出力の最小桁数の入力を保持します
		minDigit = inputScanner.nextInt();
		// 小数点以下の出力桁数の入力を求めます
		System.out.println(MESSAGE_REQUEST_FLOAT_DIGIT);
		// 小数点以下の出力桁数の入力を保持します
		floatDigit = inputScanner.nextInt();
		// 設定したフォーマットでdouble型の値を出力することを示すメッセージを出力します
		System.out.println(MESSAGE_OUTPUT_DOUBLE_VALUE);
		printDouble(doubleValue, minDigit, floatDigit);
	}
}
