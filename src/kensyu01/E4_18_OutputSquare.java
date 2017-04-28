package kensyu01;

// 入力された値を扱う機能の読み込みを行う
import java.util.Scanner;

// 入力値 n までのそれぞれの値の2乗した値を出力するクラス
public class E4_18_OutputSquare {
	
	// int 型変数の初期化のための値を設定する
	public static final int INITIALIZATION_INTEGER = 0;
	
	// 出力回数のカウントの初期値を設定する
	public static final int COUNT_START_VALUE = 1;
	
	
	// 入力値 n までのそれぞれの値の2乗した値を出力する処理を行う
	public static void main (String[] arg) {
		
		// 入力された値を扱うオブジェクトを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 入力した値を保持する変数を初期化する
		int inputValue = INITIALIZATION_INTEGER;
	
		// n の値 を入力させるためのメッセージを出力する
		System.out.println("nの値 : ");
		
		// 入力された値を変数に保持する
		inputValue = standardInput.nextInt();
		
		// 入力された値の数分処理を行う
		for ( int count = COUNT_START_VALUE; count <= inputValue; count++ ) {
		
			// 処理回数とそれを2乗した値を出力する
			System.out.println(count + "の2乗は" + count*count);
		
		}
		
		// 入力ストリームを閉じる
		standardInput.close();
		
	}

}
