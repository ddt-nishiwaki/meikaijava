package kensyu01;

// 入力された値を扱う機能を読み込む
import java.util.Scanner;

// 値が素数かどうか判定するクラス
public class E4_24_DeterminationOfPrimeNumber {

	// int型変数を初期化するための値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	
	// 最初の素数を設定しておく
	public static final int FIRST_PRIME_NUMBER = 2;
	
	// 素数を判定するための値を設定する
	public static final int VALUE_OF_JADGE_NOT_PRIME_NUMBER = 0;
	
	// 繰り返し処理の最初のカウントを設定する
	public static final int VALUE_OF_COUNT_START = 1;
	
	// プログラムの処理内容をテキストで設定する
	public static final String MESSAGE_OF_DETERMINATION_OF_PRIME_NUMBER = "素数を判定します 。";
	
	// 整数値の入力を促すメッセージを設定する
	public static final String MESSAGE_OF_REQEST_INPUT_INTEGER = "整数値を入力してください。"; 
	
	// 素数ではないことを示すメッセージを設定する
	public static final String MESSAGE_OF_NOT_PRIME_NUMBER = "素数ではありません。";
	
	// 素数であることを示すメッセージを設定する
	public static final String MESSAGE_OF_PRIME_NUMBER = "素数です。";
	
	
	// 値が素数かどうか判定する処理を行う
	public static void main(String[] arg) {
		
		// 整数値の入力を扱うオブジェクトを作成する
		Scanner integerValueInput = new Scanner(System.in);
		
		// 入力された整数値を保持する変数を初期化する
		int integerValue = INITIALIZATION_INTEGER;
		
		// これから行う処理をメッセージで出力する
		System.out.println(MESSAGE_OF_DETERMINATION_OF_PRIME_NUMBER);
		
		// 整数値の入力を促すメッセージを出力する
		System.out.println(MESSAGE_OF_REQEST_INPUT_INTEGER);
		
		// 入力された整数値を変数に保持する
		integerValue = integerValueInput.nextInt();
		
		// 入力された値が2の整数だった場合の処理を行う
		if ( integerValue == FIRST_PRIME_NUMBER ) {
		
			// 素数であることをメッセージで出力する
			System.out.println(integerValue + "は" + MESSAGE_OF_PRIME_NUMBER);
			
			// 整数の入力ストリームを閉じる
			integerValueInput.close();
		
			// プログラムを終了する
			return;

		} else if ( integerValue < FIRST_PRIME_NUMBER ) {
			
			// 素数ではないことをメッセージで出力する
			System.out.println(MESSAGE_OF_NOT_PRIME_NUMBER);
			
			// 整数の入力ストリームを閉じる
			integerValueInput.close();
		
			// プログラムを終了する
			return;
			
		}
			
		// 入力された値が偶数だった場合の処理を行う
		if ( integerValue % FIRST_PRIME_NUMBER ==  VALUE_OF_JADGE_NOT_PRIME_NUMBER ) {
		
			// 素数ではないことをメッセージで出力する
			System.out.println(MESSAGE_OF_NOT_PRIME_NUMBER);
			
			// 整数の入力ストリームを閉じる
			integerValueInput.close();
		
			// プログラムを終了する
			return;
			
		}

		
		
		// 最初の素数 ~ 入力された値未満 まで繰り返す
		for ( int count = FIRST_PRIME_NUMBER; count < integerValue; count++ ) {
		
			// 入力された値が素数ではなかった(割り切れた)場合の処理を行う
			if ( integerValue % count == VALUE_OF_JADGE_NOT_PRIME_NUMBER ) {
	
				// 素数ではないことをメッセージで出力する
				System.out.println(MESSAGE_OF_NOT_PRIME_NUMBER);
				
				// 整数の入力ストリームを閉じる
				integerValueInput.close();

				// プログラムを終了する
				return;
			}
		}


		// 素数であることをメッセージで出力する
		System.out.println(integerValue + "は" + MESSAGE_OF_PRIME_NUMBER);
		
		// 整数の入力ストリームを閉じる
		integerValueInput.close();

		// プログラムを終了する
		return;
		
				
	}
}
