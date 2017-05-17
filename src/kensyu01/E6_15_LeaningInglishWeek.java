package kensyu01;

/*** 機能の読み込み ************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;


/*** クラス ************************/
// 各月の英語の名前を学習するクラス
public class E6_15_LeaningInglishWeek {

	/*** 定数設定 ************************/
	// 各曜日に対する正解を設定する
	private static final String[] LIST_INGLISH_WEEK = {
		"Monday",			// 月曜日
		"Tuesday",			// 火曜日
		"Wednesday",		// 水曜日
		"Thursday",			// 木曜日
		"Friday",			// 金曜日
		"Saturday",			// 土曜日
		"Sunday"			// 日曜日
	};
	// 各曜日を日本語で設定する
	private static final String[] LIST_JAPANESE_WEEK = {
		"月曜日",				// Monday
		"火曜日",				// Tuesday
		"水曜日",				// Wednesday
		"木曜日",				// Thursday
		"金曜日",				// Friday
		"土曜日",				// Saturday
		"日曜日"				// Sunday
	};
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// 文字列型変数を初期化する値を設定する
	private static final String INITIALIZE_STRING = "";
	// 出題の内容の内容を設定する
	private static final String MESSAGE_REQEST_ANSWER = "英語の曜日名を描いてください";
	// 回答のルールを設定する
	private static final String MESSAGE_RULE_INPUT = "なお、先頭は大文字で、2文字目以降は小文字とします";
	// 出題形式のフォーマットを設定する
	private static final String FORMAT_OUTPUT_QUESTION = "%sを英語で書いてください : ";
	// 正解時のメッセージを設定する
	private static final String MESSAGE_CORRECT = "正解です";
	// 不正解時のメッセージを設定する
	private static final String MESSAGE_INCORRECT = "不正解です";
	// 続けるかどうかのメッセージのフォーマットを設定する
	private static final String FORMAT_REQEST_REPLAY = "もう一度やりますか？ yes ... %d , no ... %d\n";
	// 処理を繰り返すための値を設定する
	private static final int VALUE_REPLAY = 1;
	// 処理を終了するための値を設定する
	private static final int VALUE_END_PLAY = 0;
	// 学習を終了するメッセージを出力する
	private static final String MESSAGE_END_LEANING = "学習を終了します";
	// 曜日を設定する配列の長さを設定する
	private static final int LENGTH_ARRAY_WEEK = 7;


	/*** メソッド ************************/
	// 各曜日の英語の名前を学習する処理を行う
	public static void main(String[] arg) {
		
		/*** 変数設定 ************************/
		// 曜日を取得するインデックスを保持する変数を初期化する
		int indexWeek = INITIALIZE_NUMBER;
		// 前回の出題文字列を保持する変数を初期化する
		String wordPreviousQuestion = INITIALIZE_STRING;
		// 正解を設定する変数を初期化する
		String wordCorrect = INITIALIZE_STRING;
		// 回答された答えを保持する変数を初期化する
		String wordAnswered = INITIALIZE_STRING;
		// 繰り返すかどうかのコマンドを保持する変数を初期化する
		int valueUserCommand = INITIALIZE_NUMBER;
		// 問題になる曜日を設定する値を保持する変数を初期化する
		String wordQuestionWeek = INITIALIZE_STRING;


		/*** オブジェクトの作成 ************************/
		// ランダムに曜日を設定するためのオブジェクトを作成する
		Random generatorRandomWeek = new Random();
		// 回答入力を扱うオブジェクトを作成する
		Scanner scannerAnswer = new Scanner(System.in);
		// 繰り返すかどうかのコマンド入力を扱うオブジェクトを作成する
		Scanner scannerCommandReplay = new Scanner(System.in);

		/*** 処理 ************************/
		// 英語の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQEST_ANSWER);
		// 入力に関するルールを出力する
		System.out.println(MESSAGE_RULE_INPUT);

		// 問題を出題する
		do {
			// 月曜日〜日曜日までのうちのいずれかを取得するインデックスを設定する
			indexWeek = generatorRandomWeek.nextInt(LENGTH_ARRAY_WEEK);
			// 正解の文字列を取得し保持する
			wordQuestionWeek = LIST_JAPANESE_WEEK[indexWeek];

			// 設定した課題が前回と同じ場合は設定を繰り返す
			while ( wordQuestionWeek.equals(wordPreviousQuestion) ) {
				// 問題を再設定するためのインデックスを生成する
				indexWeek = generatorRandomWeek.nextInt(LENGTH_ARRAY_WEEK);
				// 問題を再設定する
				wordQuestionWeek = LIST_JAPANESE_WEEK[indexWeek];
			}

			// 出題内容を次回まで保持する
			wordPreviousQuestion = wordQuestionWeek;
			// 正解を設定する
			wordCorrect = LIST_INGLISH_WEEK[indexWeek];
			
			// 正解するまで処理を繰り返す
			do {
				// 問題を出力する
				System.out.printf(FORMAT_OUTPUT_QUESTION, wordQuestionWeek );
				// 回答を保持する
				wordAnswered = scannerAnswer.next();
				
				// 正解が間違えていた場合の処理を行う
				if( !(wordAnswered.equals(wordCorrect)) ) {
					// 不正解のメッセージを出力する
					System.out.println(MESSAGE_INCORRECT);
				}
			// 不正解の場合は処理を繰り返す
			} while ( !(wordAnswered.equals(wordCorrect)) );

			// 正解のメッセージを出力する
			System.out.println(MESSAGE_CORRECT);
			// もう一度行うかどうかを確認するメッセージを出力する
			System.out.printf(FORMAT_REQEST_REPLAY,VALUE_REPLAY,VALUE_END_PLAY);
			// コマンドを保持する
			valueUserCommand = scannerCommandReplay.nextInt();
		// もう一度行うコマンドが入力された場合は繰り返す
		} while ( valueUserCommand == VALUE_REPLAY);
		
		// 学習を終了することをメッセージで出力する
		System.out.println(MESSAGE_END_LEANING);
		
		/*** 終了処理 ************************/
		// 回答入力用ストリームを閉じる
		scannerAnswer.close();
		// コマンド入力用ストリームを閉じる
		scannerCommandReplay.close();
		
	}
}
