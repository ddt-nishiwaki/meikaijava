package kensyu01;

// 入力した値を取得する為の機能を読み込む
import java.util.Scanner;

// 読み込んだ 1~12の値から対応する季節を出力するクラス
public class E3_18_JadgeSeasons {
	
	// 整数値1~12を読み込み,対応するクラスを出力する処理を行う
	public static void main (String[] arg) {
		
		// 入力した値を取得する為のオブジェクトの生成する
		Scanner stdIn = new Scanner(System.in);
		
		// 1~12までの整数値の入力を促すメッセージを出力する
		System.out.println("季節を求めます。\n1 ~ 12 までの整数を入力してください。");
		
		// 入力された値が整数値だった場合の処理を行う
		if ( stdIn.hasNextInt() ) {
			
			// 入力された値を変数に保持する
			int inputValue = stdIn.nextInt();
			
			// 入力された値が 1 ~ 12 だった場合の処理を行う
			if ( inputValue >= 1 && inputValue <= 12 ) {
				
				// 入力された値が 3 ~ 5 だった場合の処理を行う
				if ( inputValue >= 3 && inputValue <= 5 ) {
					
					// 春 であることをメッセージで出力する 
					System.out.println("それは春です。");
					
				// 入力された値が 6 ~ 8 だった場合の処理を行う
				} else if ( inputValue >= 6 && inputValue <= 8 ) {
					
					// 夏であることをメッセージで出力する
					System.out.println("それは夏です。");
				
				// 入力された値が 9 ~ 11 だった場合の処理を行う
				} else if ( inputValue >= 9 && inputValue <= 11) {
					
					// 秋であることをメッセージで出力する
					System.out.println("それは秋です。");
					
				// 入力された値が 3 ~ 11 以外の値だった場合の処理を行う
				} else {
					
					// 冬であることをメッセージで出力する
					System.out.println("それは冬です。");
					
				}
			
			// 入力された値が 1 ~ 12 の範囲外だった場合の処理を行う
			} else {
				
				// 入力する値のルールをメッセージで出力する
				System.out.println("1 ~ 12 の範囲で入力してください。");
				
			}
			
		// 入力された値が整数値でない場合の処理を行う
		} else {
			
			// 整数値が入力されていないことをメッセージで出力する
			System.out.println("整数 で入力してください。");

		}
		
		// 入力用ストリームを閉じる
		stdIn.close();
	}

}
