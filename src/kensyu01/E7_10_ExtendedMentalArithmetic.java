package kensyu01;

/*** ライブラリの読み込み ******************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;
// 乱数を扱う機能を読み込む
import java.util.Random;

/*** クラス ******************************/
public class E7_10_ExtendedMentalArithmetic {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 設問に使用する3けたの乱数の範囲を設定するための値を設定する
	private static final int NUMBER_SET_RANDOM_RANGE = 900;
	// 乱数の範囲を調整するための値を設定する
	private static final int NUMBER_FORMATING_RANDOM_RANGE = 100;
	// 設問形式の種類の数を設定する
	private static final int NUMBER_QUESTION_TYPES = 4;
	// 一つ目設問形式の種類を示す値を設定する
	private static final int NUMBER_FIRST_QUESTION_TYPE = 0;
	// 二つ目設問形式の種類を示す値を設定する
	private static final int NUMBER_SECOND_QUESTION_TYPE = 1;
	// 三つ目設問形式の種類を示す値を設定する
	private static final int NUMBER_THIRD_QUESTION_TYPE = 2;
	// 四つ目設問形式の種類を示す値を設定する
	private static final int NUMBER_FOURTH_QUESTION_TYPE = 3;
	// もう一度回答を行うための値を設定する
	private static final int NUMBER_RETRY_QUESTION = 1;
	// 回答を終了するための値を設定する
	private static final int NUMBER_END_QUESTION = 0;
	

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "暗算力トレーニングを開始します";
	// 計算式の答えの入力を求めるメッセージを設定する
	private static final String[] FORMAT_LIST_QUESTION_TYPES = {
		"x + y + z = ",
		"x + y - z = ",
		"x - y + z = ",
		"x - y - z = "
	};
	// 答えが正解していることを示すメッセージを設定する
	private static final String MESSAGE_ANSWER = "正解です";
	// 答えが間違っていることを示すメッセージを設定する
	private static final String MESSAGE_WRONG_ANSWER = "答えが間違っています";
	// リプレイをするかどうかを尋ねるメッセージを設定する
	private static final String MESSAGE_RETRY_QUESTION = "もう一度？< yes...1 / no...0 > : ";


	/*** オブジェクト作成 ******************************/
	// 回答入力を扱うためのオブジェクトを作成する
	private static final Scanner scannerQuestionAnswer = new Scanner(System.in);
	// 回答を続けるかどうかのコマンド入力を扱うオブジェクトを作成する
	private static final Scanner scannerUserCommand = new Scanner(System.in);
	
	
	
	/*** メソッド ******************************/
	// 計算問題を出題するメソッドを設定する
//	private static void makeOperateQuestion () {
//		/*** 変数初期化 ******************************/
//		/*** オブジェクト作成 ******************************/
//		/*** 内容出力処理 ******************************/
//		/*** 入力処理 ******************************/
//		/*** 出力処理 ******************************/
//		/*** 終了処理 ******************************/
//	};
	

	/*** メインメソッド ******************************/
	// 計算問題を出題するメソッドを実行する
	public static void main (String[] arg) {

		/*** 変数初期化 ******************************/
		// 回答を続けるかどうか決定するコマンドを保持する為の変数を初期化する
		int retryCommand = INITIALIZE_ZERO;
		// 問題の回答を設定する変数を初期化する
		int answer = INITIALIZE_ZERO;
		// ユーザーの回答を保持する変数を初期化する
		int inputAnswer = INITIALIZE_ZERO;
		
		/*** オブジェクト作成 ******************************/
		// 3桁の乱数を生成するためのオブジェクトを作成する
		Random generateOperand = new Ramdom();
		// 設問タイプを決定するための乱数を生成するオブジェクトを作成する
		Random generateQuestionType = new Ramdom();


		/*** 内容出力処理 ******************************/
		// 処理内容を示すメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		// リトライコマンドが実行された場合は処理を繰り返す
		do {
			/*** 演算処理 ******************************/
			// 最初の演算対象を設定する
			int firstOperand = generateOperand.nextInt(NUMBER_SET_RANDOM_RANGE) + NUMBER_FORMATING_RANDOM_RANGE;
			// 二つ目の演算対象を設定する
			int secondOperand = generateOperand.nextInt(NUMBER_SET_RANDOM_RANGE) + NUMBER_FORMATING_RANDOM_RANGE;
			// 三つ目の演算対象を設定する
			int thirdOperand = generateOperand.nextInt(NUMBER_SET_RANDOM_RANGE) + NUMBER_FORMATING_RANDOM_RANGE;
			// 出題形式を決定する
			int numberQuestionType = generateOperand.nextInt(NUMBER_QUESTION_TYPES);

			// 出題形式に応じて正解を振り分ける
			switch (numberQuestionType) {
			// 一つ目の出題形式の場合
			case NUMBER_FIRST_QUESTION_TYPE :
					// 出題形式に応じた回答を設定し保持する
					answer = firstOperand + secondOperand + thirdOperand;
					// 出題形式に応じた設問を出力する
					System.out.print(FORMAT_LIST_QUESTION_TYPES[NUMBER_FIRST_QUESTION_TYPE]);
					// スイッチ文を終了する
					break;
			// 二つ目の出題形式の場合
			case NUMBER_SECOND_QUESTION_TYPE :
					// 出題形式に応じた回答を設定し保持する
					answer = firstOperand - secondOperand + thirdOperand;
					// 出題形式に応じた設問を出力する
					System.out.print(FORMAT_LIST_QUESTION_TYPES[NUMBER_SECOND_QUESTION_TYPE]);
					// スイッチ文を終了する
					break;
			// 三つ目の出題形式の場合
			case NUMBER_THIRD_QUESTION_TYPE :
					// 出題形式に応じた回答を設定し保持する
					answer = firstOperand + secondOperand - thirdOperand;
					// 出題形式に応じた設問を出力する
					System.out.print(FORMAT_LIST_QUESTION_TYPES[NUMBER_THIRD_QUESTION_TYPE]);
					// スイッチ文を終了する
					break;
			// 四つ目の出題形式の場合
			case NUMBER_FOURTH_QUESTION_TYPE :
					// 出題形式に応じた回答を設定し保持する
					answer = firstOperand - secondOperand - thirdOperand;
					// スイッチ文を終了する
					break;
			}
			/*** 出題と回答入力 ******************************/
			// 正解するまで処理を繰り返す
			do {
				// 出題形式に応じた設問を出力し、回答を求める
				System.out.print(FORMAT_LIST_QUESTION_TYPES[numberQuestionType]);
				// 入力された回答を保持する
				inputAnswer = scannerQuestionAnswer.nextInt();
				// 正解した場合の処理を行う
				if ( inputAnswer == answer ) {
					// 繰り返し処理を抜ける
					break;
				}
				// 不正解であることを出力する
				System.out.println(MESSAGE_WRONG_ANSWER);
			} while ( inputAnswer != answer );
			// 正解であることを出力する
			System.out.println(MESSAGE_ANSWER);
			// 回答を続けるかどうかのコマンド入力を求める
			System.out.println(MESSAGE_RETRY_QUESTION);
			// 入力されたコマンドを保持する
			retryCommand = scannerUserCommand.nextInt();

		// リトライコマンドが入力された場合は繰り返し処理を抜ける
		} while ( retryCommand == NUMBER_RETRY_QUESTION );
		/*** 終了処理 ******************************/
		// 回答入力用ストリームを閉じる
		scannerQuestionAnswer.close();
		// コマンド入力用ストリームを閉じる
		scannerUserCommand.close();
	}
}
