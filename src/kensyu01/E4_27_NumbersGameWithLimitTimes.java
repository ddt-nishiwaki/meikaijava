package kensyu01;

// 乱数を生成する為の機能を読み込む
import java.util.Random;
// 入力された値を取得する為の機能を読み込む
import java.util.Scanner;

/*******************************************************/

// 数当てゲームを実行するクラス
public class E4_27_NumbersGameWithLimitTimes {

	// int型変数の値を初期化するための値を設定する
	public static final int INITIALIZE_INTEGER = 0;
	// 乱数の上限1を設定する
	public static final int LIMIT_OF_RAND = 99;
	// 乱数の値の範囲をシフトさせる値を設定する
	public static final int SHIFT_OF_RAND = 10;
	// 乱数の生成に使う値を生成する
	public static final int SEED_OF_RAND = LIMIT_OF_RAND - SHIFT_OF_RAND + 1;
	// 回答数を設定する
	public static final int TIMES_OF_ANSWER = 5;
	// ゲームのルール説明をするメッセージを設定する
	public static final String MESSAGE_ROURE_GAME = "10 ~ 99 のいずれかの値が作成されましたので同じ値を入力してください :  (終了する場合は q を入力 )";
	// ゲームの終了のメッセージを設定する
	public static final String MESSAGE_END_GAME = "プログラムを終了します。";
	// 入力が間違っていることを示すメッセージを設定する
	public static final String MESSAGE_COUTION_INPUT = "入力した値が間違っています。";
	// 入力範囲を際説明するメッセージを出力する
	public static final String MESSAGE_RANGE_ROURE = "入力は 10 ~ 99 の範囲でお願いします。";
	// 再入力を求めるメッセージを設定する
	public static final String MESSAGE_REPEAT_INPUT = "もう一度入力してください。 (終了する場合は q を入力 )";
	// もっと大きい数であるヒントのメッセージを設定する
	public static final String MESSAGE_HINT_BIG = "もっと大きい数です。いくつでしょうか？ : ";
	// もっと小さい数であるヒントのメッセージを設定する
	public static final String MESSAGE_HINT_SMALL = "もっと小さい数です。いくつでしょうか？ : ";
	// 正解した時のメッセージを設定する
	public static final String MESSAGE_COMPLETE = "正解です。";
	// 正解できなかった時のメッセージを設定する
	public static final String MESSAGE_FAILD = "残念!";
	// テキスト「正解」を設定する
	public static final String TEXT_ANSWER = "正解";
	// テキスト「残りの回答数」を設定する
	public static final String TEXT_ANOTHER_TIMES = "残りの回答数";
	
	
	
	/********************************************************/
	
	// 10 ~ 99 の乱数を生成し、それをユーザーに当てさせる処理を行う
	public static void main (String[] arg){

		// 0 ~ 89 の乱数を生成する為のオブジェクトを作成する
		Random randomValueGenerator = new Random();
		// 10 ~ 99 の乱数を作成し変数を初期化する
		int answer = randomValueGenerator.nextInt(SEED_OF_RAND) + SHIFT_OF_RAND;
		// 回答数をカウントする変数を初期化する
		int answerCount = INITIALIZE_INTEGER;
		// 入力された値を取得する為の機能を作成する
		Scanner standardInput = new Scanner(System.in);
		// 入力された値を保持する為の変数を 0 で初期化する
		int inputValue = INITIALIZE_INTEGER;
		// 作成された乱数と同じ数を入力するようにメッセージを出力する
		System.out.println(MESSAGE_ROURE_GAME);
		// 回答数の残りを出力する
		System.out.println(TEXT_ANOTHER_TIMES + TIMES_OF_ANSWER);
		

		/***************************************************/

		// 数当てが成功するまで処理を繰り返す
		do {
			// 入力された値が整数以外の場合の処理を行う
			if ( !standardInput.hasNextInt() ) {

				// 終了コマンドが入力された時の処理を行う
				if( standardInput.hasNext("q") ) {
					// 終了コマンドを実行することをメッセージで出力する
					System.out.println(MESSAGE_END_GAME);
					// 入力用ストリームを閉じる
					standardInput.close();
					// プログラムを終了する
					return;
				}
				// 入力された値が間違えていることをメッセージで出力する
				System.out.println(MESSAGE_COUTION_INPUT);
				// 再入力を求めるメッセージを出力する
				System.out.println(MESSAGE_REPEAT_INPUT);
				
				// standardInputのトークンを次に移動させる
				standardInput.next();

			// 入力された値が整数だった場合の処理を行う
			} else {
				// 回答回数をカウントする
				answerCount++;
				// 回答数が制限回数になった場合の処理を行う
				if ( answerCount == TIMES_OF_ANSWER ) {
					// ループを抜ける
					break;
				}
				// 残り回答数を示すためのメッセージを出力する
				System.out.print(TEXT_ANOTHER_TIMES);
				// 残り回答数を出力する
				System.out.println(TIMES_OF_ANSWER - answerCount);

				// 入力された値を変数に保持する
				inputValue = standardInput.nextInt();
				// 入力された値が 10 ~ 99 でない場合の処理を行う
				if ( inputValue < SHIFT_OF_RAND || inputValue > LIMIT_OF_RAND ) {

					// 10 ~ 99 を入力するようメッセージで出力する
					System.out.println(MESSAGE_RANGE_ROURE);
					// 値の入力を促すメッセージを出力する
					System.out.println(MESSAGE_REPEAT_INPUT);

				// 入力された値より作成された乱数が小さかった場合の処理を行う
				} else if ( inputValue < answer ) {

					// answer がより大きいことをメッセージで出力する
					System.out.println(MESSAGE_HINT_BIG);

				// 入力された値より作成された乱数が大きかった場合の処理を行う
				} else if (inputValue > answer ) {

					// answer がより小さいことをメッセージで出力する
					System.out.println(MESSAGE_HINT_SMALL);

				}
			}

		// 数当てが失敗していたら処理を繰り返す
		} while ( inputValue != answer );

		// 数当てが成功した場合の処理を行う
		if ( inputValue == answer ) {
			// 数当てに成功したことをメッセージで出力する
			System.out.println("正解です。");
		// 数当てが失敗した時の処理を行う
		} else {
			// 数当てが失敗したことをメッセージで出力する
			System.out.println(MESSAGE_FAILD);
			// 正解を出力する
			System.out.println(TEXT_ANSWER + "は" + answer + "です");
		}
		// プログラムの終了をメッセージで出力する
		System.out.println("プログラムを終了します。");
		// 入力用のストリームを閉じる
		standardInput.close();

	}
}
