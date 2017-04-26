package kensyu01;

// 乱数を生成する為の機能を読み込む
import java.util.Random;

// 入力された値を取得する為の機能を読み込む
import java.util.Scanner;



// 数当てゲームを実行するクラス
public class E4_2_NumbersGame {


	// 10 ~ 99 の乱数を生成し、それをユーザーに当てさせる処理を行う
	public static void main (String[] arg){

		// 0 ~ 89 の乱数を生成する為のオブジェクトを作成する
		Random randomValueGenerator = new Random();

		// 10 ~ 99 の乱数を作成し変数を初期化する
		int Answer = randomValueGenerator.nextInt(90) + 10;

		// debug
		System.out.println("Answer  :  " + Answer);

		// 入力された値を取得する為の機能を作成する
		Scanner standardInput = new Scanner(System.in);

		// 入力された値を保持する為の変数を 0 で初期化する
		int inputValue = 0;



		// 作成された乱数と同じ数を入力するようにメッセージを出力する
		System.out.println("10 ~ 99 のいずれかの値が作成されましたので同じ値を入力してください :  (終了する場合は q を入力 )" );



		// 数当てが成功するまで処理を繰り返す
		do {
			// 入力された値が整数以外の場合の処理を行う
			if ( !standardInput.hasNextInt() ) {

				// 終了コマンドが入力された時の処理を行う
				if( standardInput.hasNext("q") ) {

					// 終了コマンドを実行することをメッセージで出力する
					System.out.println("プログラムを終了します。");

					// 入力用ストリームを閉じる
					standardInput.close();

					// プログラムを終了する
					return;

				}

				// 入力された値が間違えていることをメッセージで出力する
				System.out.println("入力した値が間違っています。");

				// プログラムを終了するメッセージを出力する
				System.out.println("もう一度入力してください。 (終了する場合は q を入力 )");

				// standardInputのトークンを次に移動させる
				standardInput.next();


			// 入力された値が整数だった場合の処理を行う
			} else {

				// 入力された値を変数に保持する
				inputValue = standardInput.nextInt();

				// 入力された値が 10 ~ 99 でない場合の処理を行う
				if ( inputValue < 10 || inputValue > 99 ) {

					// 10 ~ 99 を入力するようメッセージで出力する
					System.out.println("入力は 10 ~ 99 の範囲でお願いします。");

					// 値の入力を促すメッセージを出力する
					System.out.println("もう一度入力してください。  (終了する場合は q を入力 )");


				// 入力された値より作成された乱数が小さかった場合の処理を行う
				} else if ( inputValue < Answer ) {

					// Answer がより大きいことをメッセージで出力する
					System.out.println("もっと大きい数です。いくつでしょうか？ : ");


				// 入力された値より作成された乱数が大きかった場合の処理を行う
				} else if (inputValue > Answer ) {

					// Answer がより小さいことをメッセージで出力する
					System.out.println("もっと小さい数です。いくつでしょうか？ : ");

				}

			}

		// 数当てが失敗していたら処理を繰り返す
		} while ( inputValue != Answer );



		// 数当てに成功したことをメッセージで出力する
		System.out.println("正解です。");

		// プログラムの終了をメッセージで出力する
		System.out.println("プログラムを終了します。");

		// 入力用のストリームを閉じる
		standardInput.close();

	}
}




/**
 * 正常正常
 * 正常異常正常
 */
