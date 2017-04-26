package kensyu01;

// 入力された値を取得する機能の読み込み
import java.util.Scanner;

// 入力された正の整数値が5の倍数であるかどうか判定し、結果を出力するクラス
public class E3_5_IO_CheckMultipleOf5 {
	
	// 入力された正の整数値が5の倍数であるかどうか判定し、結果を出力する処理を行う
	public static void main(String[] arg){
		
		// 入力された値を取得する為のオブジェクトの作成する
		Scanner stdIn = new Scanner(System.in);
		
		// 正の整数値の入力を促すメッセージを出力する
		System.out.print("正の整数値を入力してください : ");
		// 入力された値を変数に保持する
		int inputNumber = stdIn.nextInt();
		
		// 入力用のストリームを閉じる
		stdIn.close();
		
		// inputNumberの値が正の値でない場合の処理を行う
		if ( inputNumber < 1 ) {
			// 正の値ではないことをメッセージで出力する
			System.out.println("正でない値が入力されました。");
		// inputNumberの値が5で割り切れる場合の処理を行う
		} else if ( inputNumber % 5 == 0 ){
			// 5で割り切れることをメッセージで出力する
			System.out.println("その値は5で割り切れます。");
		// inputNumberの値が5で割り切れない場合の処理を行う
		} else {
			// 5で割り切れないことをメッセージで出力する
			System.out.println("その値は5で割り切れません。");
		}
		
	}
}
