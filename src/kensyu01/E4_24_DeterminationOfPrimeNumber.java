package kensyu01;

// 入力された値を扱う機能を読み込む
import java.util.Scanner;

// 値が素数かどうか判定するクラス
public class E4_24_DeterminationOfPrimeNumber {

	//// 定数初期化 ///////////////////////////////////////////

	// int型変数を初期化するための値を設定する
	public static final int INITIALIZE_INTEGER = 0;
	// Strint型変数を初期化するための値を設定する
	public static final String INITIALIZE_STRING = "";
	// 最初の素数を設定する
	public static final int FIRST_PRIME_NUMBER = 2;
	// 整数値の入力を求めるメッセージを設定する
	public static final String MESSAGE_INTEGER_INPUT = "整数値を入力してください";
	// 素数であることを示すメッセージを出力する
	public static final String MESSAGE_PRIME_NUMBER = "素数です";
	// 素数でないことを示すメッセージを設定する
	public static final String MESSAGE_NOT_PRIME = "素数ではありません";

	
	//// メソッド ///////////////////////////////////////////

	// 値が素数かどうか判定する処理を行う
	public static void main (String[] arg) {

		//// 変数初期化 ///////////////////////////////////////////

		// 整数値の入力を扱うオブジェクトを作成する
		Scanner integerValueInput = new Scanner(System.in);
		// 整数値の入力を保持する変数を初期化する
		int integerValue = INITIALIZE_INTEGER;
		// 割り切れるか調べるための変数を初期化する
		int divisor = FIRST_PRIME_NUMBER;
		// 調べた約数を保持する変数を初期化する
		int resultDivisor = INITIALIZE_INTEGER;


		//// 整数値の入力処理 ///////////////////////////////////////////

		// 整数値の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_INTEGER_INPUT);
		// 入力された値を保持する
		integerValue = integerValueInput.nextInt();

		
		//// 素数判定処理 ///////////////////////////////////////////
		
		// 入力された値が 2未満の場合は その値を結果として保持する
		if (integerValue < FIRST_PRIME_NUMBER ) {
			resultDivisor = integerValue;
		}
		// 入力された値が 2 以上の場合、割り切れる数を調べる
		while( divisor <= integerValue ) {
			// 割り切れた時の処理
			if ( integerValue % divisor == 0 ) {
				// その約数を保持する
				resultDivisor = divisor;
				// 次の処理へ進む
				break;
			}
			// 調査する数を次の値に変える
			divisor++;
		}

		
		//// 判定結果出力処理 ///////////////////////////////////////////
		
		// 調べた結果が 素数の条件に満たない場合 の処理を行う
		if ( resultDivisor < FIRST_PRIME_NUMBER || resultDivisor < integerValue){
			// 素数でないことを出力する
			System.out.println(MESSAGE_NOT_PRIME);
		// それ以外の場合の処理を行う
		} else {
			// 素数であることを出力する
			System.out.println(MESSAGE_PRIME_NUMBER);
		}

		//// 終了処理 ///////////////////////////////////////////
		
		// 整数値入力ストリームを閉じる
		integerValueInput.close();
	}
}
