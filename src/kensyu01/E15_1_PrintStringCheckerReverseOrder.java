package kensyu01;

import common.SingletonScannerVer1;
import java.util.Scanner;
import static string.CustomeStringMethod.*;
/**
 * 文字列を読み込んで、逆順に表示させるためのメソッドを実行するクラス
 * @author wakkky05
 *
 */
public class E15_1_PrintStringCheckerReverseOrder {
	/********************************************
		定数(String)
	********************************************/
	// 処理内容を示すメッセージです
	private static final String MESSAGE_PROCESS = "入力した文字列を逆順に表示します";
	// 文字入力を求めるメッセージです
	private static final String MESSAGE_REQUEST_INPUT = "文字を入力してください";
	// 逆順表示することを示すメッセージです
	private static final String MESSAGE_RESULT_PROCESS = "逆順に表示します";

	/********************************************
		スキャナー
	********************************************/
	private static Scanner inputScanner = SingletonScannerVer1.getInstance();

	/********************************************
		メインプロセス
	********************************************/
	// 文字列を読み込んで、逆順に表示させるためのメソッドを実行します
	public static void main(String[] arg){
		String inputString;		// 入力された文字列を保持する変数です
		// 処理内容を示します
		System.out.println(MESSAGE_PROCESS);
		// 文字入力を求めます
		System.out.println(MESSAGE_REQUEST_INPUT);
		// 入力された文字列を保持します
		inputString = inputScanner.nextLine();
		// 逆順表示することをメッセージ出力します
		System.out.println(MESSAGE_RESULT_PROCESS);
		// 入力された文字列を逆順表示します
		System.out.println( getReverseString(inputString) );
	}
}
