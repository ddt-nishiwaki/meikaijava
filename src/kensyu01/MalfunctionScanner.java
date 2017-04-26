package kensyu01;

// 入力された値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 入力された2つの整数値の差を計算して出力するクラス
public class MalfunctionScanner {

	// 入力された2つの整数値の差を計算して出力する為の処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成する
		Scanner stdIn = new Scanner(System.in);
		
		int a; //入力された値aを保持する為の変数
		int b; //入力された値bを保持する為の変数
		boolean isIntA; // 入力された値Aが整数かどうかの判定結果を保持する変数
		boolean isIntB; // 入力された値Bが整数かどうかの判定結果を保持する変数
		
		// 入力された両方の値が整数かどうかの判定結果を保持する変数
		boolean isInt = false; 
		
		// 整数値aの入力を促すメッセージを出力
		System.out.print("整数値aを入力してください。");
		// 入力された値aが整数かどうかの判定結果を保持する
		isIntA = stdIn.hasNextInt();
		
		// aの値が整数だった場合の処理
		if ( isIntA ){
			// 入力されたaの値を保持する
			a = stdIn.nextInt();
			// 入力が正しいことをフラグに設定する
			isInt = true;
		
		// 整数でなかった場合の処理を行う
		} else {
			// aを0で初期化する
			a = 0;
			// 入力が誤っているフラグを設定する
			isInt = false;
		}

		
		// 整数値bの入力を促すメッセージを出力
		System.out.print("整数値bを入力してください。");
		// 入力された値aが整数かどうかの判定結果を保持する
		isIntB = stdIn.hasNextInt();	// 入力をしていないのにfalseで初期化されている
		
		/*
		 * 入力をする前にBにfalseが入ってしまい
		 * 以下処理に飛び
		 * エラー時の処理を行なって終了してしまっているように見える
		 * 
		 * aの入力がfalseの時には stdIn.hasNextInt に falseの状態が残ってしまうのだろうか？
		 * 正しく整数を入力すると期待通りに動いているので
		 * 入力を受け付ける処理が背後でどのように動いているのかわからない
		 * 
		 */
		// bの値が整数だった場合の処理
		if( isIntB ){
				// 入力されたbの値を保持する
				b = stdIn.nextInt();
				// 入力が正しいことをフラグに設定する
				isInt = true;
		} else {
			
			// bを0で初期化する
			b = 0;
			// 入力が誤っているフラグを設定する
			isInt = false;
		}
				
		// 入力が正しかった場合の処理を行う
		if ( isInt ){
			
			// 入力用のストリームを閉じる
			stdIn.close();	
			// 二つの値の差を出力する
			System.out.println("aの値とbの値の差は" + ( a - b ) + "です。");
			
		} else {
			// 入力用のストリームを閉じる
			stdIn.close();
			// 入力が不正であることをメッセージで出力する
			System.out.println("入力された値が不正です。");
		}
		
	}
}
