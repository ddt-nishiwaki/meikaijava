package kensyu01;

/*** 機能の読み込み ************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;


/*** クラス ************************/
// 各月の英語の名前を学習するクラス
public class E6_14_LeaningInglishMonth {

	/*** 定数設定 ************************/
	// 各月に対する正解を設定する
	private static final String[] LIST_WORD_MONTH = {
		"January",			// 1月の英語
		"Februaly",			// 2月の英語
		"March",			// 3月の英語
		"April",			// 4月の英語
		"May",				// 5月の英語
		"June",				// 6月の英語
		"July",				// 7月の英語
		"August",			// 8月の英語
		"September",		// 9月の英語
		"October",			// 10月の英語
		"November",			// 11月の英語
		"December"			// 12月の英語
	};
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// 文字列型変数を初期化する値を設定する
	private static final String INITIALIZE_STRING = "";
	// 出題の内容の内容を設定する
	private static final String MESSAGE_REQUEST_ANSWER = "英語の月名を描いてください";
	// 回答のルールを設定する
	private static final String MESSAGE_RULE_INPUT = "なお、先頭は大文字で、2文字目以降は小文字とします";
	// 出題形式のフォーマットを設定する
	private static final String FORMAT_OUTPUT_QUESTION = "%d月を英語で書いてください : ";
	// 正解時のメッセージを設定する
	private static final String MESSAGE_CORRECT_ANSWER = "正解です";
	// 不正解時のメッセージを設定する
	private static final String MESSAGE_INCORRECT_ANSWER = "不正解です";
	// 続けるかどうかのメッセージのフォーマットを設定する
	private static final String FORMAT_REQUEST_REPLAY = "もう一度やりますか？ yes ... %d , no ... %d\n";
	// 学習を終了するメッセージを出力する
	private static final String MESSAGE_END_LEARNING = "学習を終了します";
	// 処理を繰り返すための値を設定する
	private static final int VALUE_REPLAY = 1;
	// 処理を終了するための値を設定する
	private static final int VALUE_END_PLAY = 0;
	// 月を設定する配列の長さを設定する
	private static final int VALUE_RANGE_ARRAY_MONTH = 12;
	// 生成された乱数を実際の月になおす値を設定する
	private static final int VALUE_FORMAT_RAMDOM_RANGE = 1;


	/*** メソッド ************************/
	// 各月の英語の名前を学習する処理を行う
	public static void main(String[] arg) {
		
		/*** 変数設定 ************************/
		// 前回の出題を保持する変数を初期化する
		int valuePreviousQuestion = INITIALIZE_NUMBER;
		// 正解を設定する変数を初期化する
		String wordCorrect = INITIALIZE_STRING;
		// 回答された答えを保持する変数を初期化する
		String wordAnswered = INITIALIZE_STRING;
		// 繰り返すかどうかのコマンドを保持する変数を初期化する
		int valueUserCommand = INITIALIZE_NUMBER;
		// 問題になる月を設定する値を保持する変数を初期化する
		int indexQuestionMonth = INITIALIZE_NUMBER;
		// 実際の月の値を保持する変数を初期化する
		int numberQuestionMonth = INITIALIZE_NUMBER;
		/*** オブジェクトの作成 ************************/
		// ランダムに月を設定するオブジェクトを作成する
		Random generatorRandomMonth = new Random();
		// 回答入力を扱うオブジェクトを作成する
		Scanner scannerAnswer = new Scanner(System.in);
		// 繰り返すかどうかのコマンド入力を扱うオブジェクトを作成する
		Scanner scannerCommandReplay = new Scanner(System.in);

		/*** 処理 ************************/
		// 英語の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_ANSWER);
		// 入力に関するルールを出力する
		System.out.println(MESSAGE_RULE_INPUT);

		// 問題を出題する
		do {
			// 1月から12月までのうちのいずれかを問題に設定する
			indexQuestionMonth = generatorRandomMonth.nextInt(VALUE_RANGE_ARRAY_MONTH);
			// 設定した問題のインデックスを実際の月に変換する
			numberQuestionMonth = indexQuestionMonth + VALUE_FORMAT_RAMDOM_RANGE;
			// 設定した課題が前回と同じ場合は設定を繰り返す
			while ( indexQuestionMonth == valuePreviousQuestion ) {
				// 問題を再設定する
				indexQuestionMonth = generatorRandomMonth.nextInt(VALUE_RANGE_ARRAY_MONTH);
				// 設定した問題のインデックスを実際の月に変換する
				numberQuestionMonth = indexQuestionMonth + VALUE_FORMAT_RAMDOM_RANGE;
			}
			// 出題内容を次回まで保持する
			valuePreviousQuestion = indexQuestionMonth;

			// 正解を設定する
			wordCorrect = LIST_WORD_MONTH[indexQuestionMonth];
			
			// 正解するまで出題を繰り返す
			do {
				// 月の名前を英語で答えさせる問題を出力する
				System.out.printf(FORMAT_OUTPUT_QUESTION, numberQuestionMonth);
				// 回答を保持する
				wordAnswered = scannerAnswer.next();
				
				// 不正解の場合の処理を行う
				if ( !(wordAnswered.equals(wordCorrect)) ){
					// 不正解のメッセージを出力する
					System.out.println(MESSAGE_INCORRECT_ANSWER);
				}
			} while (!(wordAnswered.equals(wordCorrect)));
			// 正解のメッセージを出力する
			System.out.println(MESSAGE_CORRECT_ANSWER);
			// もう一度行うかどうかを確認するメッセージを出力する
			System.out.printf(FORMAT_REQUEST_REPLAY,VALUE_REPLAY,VALUE_END_PLAY);
			// コマンドを保持する
			valueUserCommand = scannerCommandReplay.nextInt();
			// もう一度行うコマンドが入力された場合は繰り返す
		} while ( valueUserCommand == VALUE_REPLAY);
		
		// 学習を終了することをメッセージで出力する
		System.out.println(MESSAGE_END_LEARNING);
		
		/*** 終了処理 ************************/
		// 回答入力用ストリームを閉じる
		scannerAnswer.close();
		// コマンド入力用ストリームを閉じる
		scannerCommandReplay.close();
		
	}
}
