package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;

/********************************************************/

// 入力された値を様々な基数で変換するクラス
public class E5_1_Cardinal_Comverter {
	
	// int型変数を初期化するための値を設定する
	public static final int INITIALIZE_INTEGER = 0;
	// 処理内容を示すメッセージを設定する
	public static final String MESSAGE_PROCESSING = "入力した値を8進数、16進数で表示します。";
	// 整数値の入力を求めるメッセージを設定する
	public static final String MESSAGE_REQEST_INPUT = "整数値を入力してください";
	// 入力された値を8進数で表示することをメッセージで出力する
	public static final String MESSAGE_OUT_OCTAL = "8進数 => : ";
	// 入力された値を16進数で表示することをメッセージで出力する
	public static final String MESSAGE_OUT_HEXADECIMAL = "16進数 => : ";
	
	
	/********************************************************/

	// 入力された値を様々な基数を元に変換する処理を行う
	public static void main(String[] arg) {

		// 入力された値を保持する変数を初期化する
		int integerValue = INITIALIZE_INTEGER;
		// 整数値の入力を扱うオブジェクトを作成する
		Scanner integerInput = new Scanner(System.in);
		
		/********************************************************/

		// 処理内容を示すメッセージを出力する
		System.out.println(MESSAGE_PROCESSING);
		// 整数値の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQEST_INPUT);
		// 入力された値を保持する
		integerValue = integerInput.nextInt();
		// 入力された値を8進数で表示する
		System.out.printf(MESSAGE_OUT_OCTAL+"%o\n", integerValue);
		// 入力された値16を進数で表示する
		System.out.printf(MESSAGE_OUT_HEXADECIMAL+"%X\n", integerValue);
		// 入力された値16を進数で表示する
		
		/********************************************************/

		// 整数入力のストリームを閉じる
		integerInput.close();
	}
}
