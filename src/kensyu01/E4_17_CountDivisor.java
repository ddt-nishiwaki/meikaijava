package kensyu01;

// 入力した値を扱う機能を読み込む
import java.util.Scanner;

// 入力した値の約数を出力するクラス
public class E4_17_CountDivisor {

	// int型変数を初期化する値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	
	// 出力回数のカウントの初期値を設定する
	public static final int COUNT_START_VALUE = 1;
	
	// 入力した値の約数を出力する処理を行う
	public static void main (String[] arg) {
		
		// 整数値の入力を保持する変数を初期化する
		int inputValue = INITIALIZATION_INTEGER;
		
		// カウントした約数の数を保持する変数を初期化する
		int divisorCount = INITIALIZATION_INTEGER;

		// 入力した値を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 整数値を入力させるメッセージを出力する
		System.out.println("整数値 : ");
		
		// 入力値を保持する
		inputValue = standardInput.nextInt();
		
		
		// 1 ~ 入力値までの整数回分処理を行う
		for ( int count = COUNT_START_VALUE; count <= inputValue; count++ ) {
		
			// countの値が入力値の約数だった場合の処理を行う
			if ( inputValue % count == 0 ) {
				
				// 現在の約数を表示する
				System.out.println(count);
			
				// 表示した約数をカウントする
				divisorCount++;
				
			}
		}
		// カウントした約数を表示する
		System.out.println("約数は" + divisorCount + "個です。");
		
			
		
		// 入力ストリームを閉じる
		standardInput.close();
	}
}
