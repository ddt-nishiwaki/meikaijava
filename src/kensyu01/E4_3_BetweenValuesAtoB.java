package kensyu01;

// 入力された値を扱う機能を読み込む
import java.util.Scanner;

// 入力された2つの値の間の数を出力するクラス
public class E4_3_BetweenValuesAtoB {
	
	
	// 入力された2つの値の間の数を出力する処理
	public static void main (String[] arg){
		
		// 入力された値を扱うオブジェクトの作成
		Scanner standardInput = new Scanner(System.in);
		
	
		// 入力される A の値を保持する変数を 0 で初期化する
		int inputValueA = 0;
		
		// 入力される B の値を保持する変数を 0 で初期化する
		int inputValueB = 0;
		
		// 出力回数をカウントする変数を 0 で初期化する
		int loopCount = 0;
		
		// 出力を終了させる変数を 0 で初期化する
		int endCount = 0;
		
		// 2つの入力値の間の数を出力することをメッセージで出力する
		System.out.println("2つの整数の間の数を全て出力します。");
		
		// 二つの値A,Bの入力を促すメッセージを出力する
		System.out.println("二つの整数値を入力してください。\n");
	
		// A の値の入力を促すメッセージを出力する
		System.out.println("Aの値(整数)を入力してください。(終了するときは q を入力) : ");

		
		// 整数値が入力されるまで処理を繰り返す
		while ( !standardInput.hasNextInt() ){
			
			// q が入力された場合の処理を行う
			if ( standardInput.hasNext("q") ) {
			
				// プログラムを終了することをメッセージで出力する
				System.out.println("プログラムを終了します。");
		
				// 入力ストリームを閉じる
				standardInput.close();
				
				// プログラムを終了する
				return;
				
			}
			
			// 入力が間違えていることをメッセージで出力する
			System.out.println("入力された値が間違えています。");
			
			// 再度入力を促すメッセージを出力する
			System.out.println("Aの値(整数)を入力してください。(終了するときは q を入力) : ");
			
			// 入力ストリームのトークンを次に移動する
			standardInput.next();
			
		
		}
		
		// 入力された値を inputValueA に保持する
		inputValueA = standardInput.nextInt();
	
		
		// B の値の入力を促すメッセージを出力する
		System.out.println("Bの値(整数)を入力してください。(終了するときは q を入力) : ");

		
		// 整数値が入力されるまで処理を繰り返す
		while ( !standardInput.hasNextInt() ){
			
			
		
			// q が入力された場合の処理を行う
			if ( standardInput.hasNext("q") ) {
			
				// プログラムを終了することをメッセージで出力する
				System.out.println("プログラムを終了します。");
		
				// 入力ストリームを閉じる
				standardInput.close();
				
				// プログラムを終了する
				return;
				
			}
			
			// 入力が間違えていることをメッセージで出力する
			System.out.println("入力された値が間違えています。");
			
			// 再度入力を促すメッセージを出力する
			System.out.println("Bの値(整数)を入力してください。(終了するときは q を入力) : ");
			
			// 入力ストリームのトークンを次に移動する
			standardInput.next();
			
		
		}
		
		// 入力された値を inputValueB に保持する
		inputValueB = standardInput.nextInt();
		
		
		// A ~ B の間の数を出力するメッセージを出力する
		System.out.println("A と B の間の数を出力します。");
		
		
		// A と B の うち 小さい方 + 1 を loopCount に設定する
		loopCount = inputValueA < inputValueB ? inputValueA + 1 : inputValueB + 1; 
		
		// A と B　のうち 大きい方を - 1 を endCount に設定する
		endCount = inputValueA > inputValueB ? inputValueA - 1: inputValueB - 1; 
		
		
		
		// loopCount から endCount までの回数だけ処理を繰り返す
		do {
		
			// loopCount を出力する
			System.out.print( loopCount + " ");
		
			// loopCount に + 1 加算する
			loopCount += 1;
		
		} while ( loopCount <= endCount );
			
		
		
		
		// 入力ストリームを閉じる
		standardInput.close();
		
	}
	
}
