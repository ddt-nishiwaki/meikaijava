package kensyu01;

// 入力した値を取得する為の機能の読み込みを行う
import java.util.Scanner;

// 点数に応じた評価を出力するクラス
public class E3_8_EvaluationScore {

	// 点数に応じた評価を出力する処理を行う
	public static void main(String[] arg){
	
		// 入力した値を取得する為のオブジェクトの生成する
		Scanner stdIn = new Scanner(System.in);
		
		// 0 ~ 100 の点数入力を促すメッセージを出力する
		System.out.println("0 ~ 100 の点数を入力してください");
		
		int score = 0; // 入力された値を格納する変数

		// 整数が入力されている場合の処理を行う
		if( stdIn.hasNextInt()){
			// 入力された値を変数に保持する
			score = stdIn.nextInt();
			
			// score が 0 ~ 59 だった場合の処理を行う
			if ( score >= 0 && score <= 59 ){
				// 「不可」という評価を出力する
				System.out.println("不可");
			// score が 60 ~ 69 だった場合の処理を行う
			} else if ( score >= 60 && score <= 69 ){
				// 「可」という評価を出力する
				System.out.println("可");
			// score が 70 ~ 79 だった場合の処理を行う
			} else if ( score >= 70 && score <= 79 ){
				// 「良」という評価を出力する
				System.out.println("良");
			// score が 80 ~ 89 だった場合の処理を行う
			} else if ( score >= 80 && score <= 100 ){
				// 「優」という評価を出力する
				System.out.println("優");
			// 0 ~ 100 以外の値が入った場合の処理を行う
			} else if ( score < 0 || score > 100 ) {
				// 入力した値が不正であることをメッセージで出力する
				System.out.println("正しい値を入力してください。");
			}

		// 整数でない値が入力されている場合の処理を行う
		} else {

			// 入力された値が不正であることをメッセージで出力する
			System.out.println("入力された値が不正です。");
			
		}
		
		// 入力用ストリームを閉じる
		stdIn.close();
		
	}
}
