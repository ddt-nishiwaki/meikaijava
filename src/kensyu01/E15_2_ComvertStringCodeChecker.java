package kensyu01;

/**
 * スキャナークラスを読み込む
 */
import java.util.Scanner;

/**
 * stringパッケージ用のメソッドを読み込む
 * 
 */
import static string.CustomeStringMethod.*;

/**
 * 文字コード変換ラスを読みこむ
 */
import string.CharCodeConverter;

/**
 * 文字コードを変換するプログラムをテストするクラス
 * @author wakkky05
 *
 */
public class E15_2_ComvertStringCodeChecker {

	/*********************************************
		定数(String)
	*********************************************/
	// 処理内容を示すメッセージです
	private static final String MESSAGE_PROCESS = "入力した文字列の各文字を文字コードに変換します";
	// 入力を求めるメッセージです
	private static final String MESSAGE_REQUEST_INPUT = "文字列を入力してください";
	// 文字コード出力を知らせるメッセージです
	private static final String MESSAGE_OUTPUT_STRING_CODE = "各文字コードを表示します";

	/*********************************************
		メインプロセス
	*********************************************/
	/**
	 * 入力された文字列を文字コードに変換します
	 * @param arg
	 */
	public static void main(String[] arg){
		// 行う処理内容を出力します
		System.out.println(MESSAGE_PROCESS);
		// 文字列の入力を求めます
		System.out.println(MESSAGE_REQUEST_INPUT);
		// スキャナーを作成します
		Scanner inputScanner = new Scanner(System.in);
		// 入力された文字列を保持します
		String inputString = inputScanner.nextLine();
		// 文字コードコンバーターを作成する
		CharCodeConverter charCodeComverter = new CharCodeConverter();
		// 各文字を文字コードに変換する
		String resultString = changeEachChar(inputString, charCodeComverter);
		// 文字コードを表示することをメッセージ出力します
		System.out.println(MESSAGE_OUTPUT_STRING_CODE);
		// 変換した文字コードを出力する
		System.out.println(resultString);
		// スキャナーを閉じる
		inputScanner.close();
	}

}