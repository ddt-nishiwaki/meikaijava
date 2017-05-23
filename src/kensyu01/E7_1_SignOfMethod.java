package kensyu01;

/*** 機能の読み込み *******************************************/
// 入力の値を扱う機能を読み込む
import java.util.Scanner;

/*** クラス *******************************************/
// 整数が負の値か正の値か判定するメソッドを持つクラス
public class E7_1_SignOfMethod {

	/*** 定数設定 *******************************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// 判定結果が正であることを示す値を設定する
	private static final int VALUE_JUDGE_POSITIVE_SIGN = 1;
	// 判定結果が負であることを示す値を設定する
	private static final int VALUE_JUDGE_NEGATIVE_SIGN = -1;
	
	// 処理内容を出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_PROCESS_DETAIL = "入力さた整数が%sの値か%sの値か判定します\n";
	// 正負を判定する整数値の入力を求めるメッセージを出力する
	private static final String MESSAGE_REQUEST_INTEGER_NUMBER = "整数を入力してください : ";
	// 入力された数値の正負判定の結果を出力するフォーマットを設定する
	private static final String FORMAT_OUTPUT_RESULT_SIGN = "入力された値は%sです\n";
	
	// テキスト「正」を設定する
	private static final String WORD_POSITIVE_SIGN = "正";
	// テキスト「負」を設定する
	private static final String WORD_NEGATIVE_SIGN = "負";
	// テキスト「0」を設定する
	private static final String WORD_ZERO = "0";
	
	
	/*** 正負判定メソッド *******************************************/
	// 受け取ったint型引数が 正の値か負の値か 判定する
	public static int signOf ( int inputNumber ) {
		/*** 変数初期化 *******************************************/
		int resultInputSign;		// 正負の判定結果を保持する変数を初期化する

		/*** 処理 *******************************************/
		// 受け取った引数の正負を 0 で判定し、正だった場合の処理を行う
		if ( inputNumber > 0 ) {
			// 正の値を示す値を設定する
			resultInputSign = VALUE_JUDGE_POSITIVE_SIGN;
		 // 負の値だった場合の処理を行う
		} else if ( inputNumber < 0 ) {
			// 負の値を示す値を設定する
			resultInputSign = VALUE_JUDGE_NEGATIVE_SIGN;
		// 正でも負でもない場合の処理を行う
		} else {
			// 0 を設定する
			resultInputSign = 0;
		}

		/*** 終了処理 *******************************************/
		// 判定結果を返す
		return resultInputSign;
	}


	/*** メインメソッド *******************************************/
	// 整数が負の値か正の値か判定する処理を行う
	public static void main (String[] arg){
		/*** 変数初期化 *******************************************/
		// 正負を判定するために入力された値を保持する変数を初期化する
		int targetNumberJadgeSign = INITIALIZE_NUMBER;
		// 正負の判定結果を保持する変数を初期化する
		int resultJadgeSign = INITIALIZE_NUMBER;

		/*** オブジェクト作成 *******************************************/
		// 正負を判定する整数値の入力を扱うオブジェクトを作成する
		Scanner scannerNumberJadgeSign = new Scanner(System.in);
	
		/*** 処理 *******************************************/
		// 処理内容を出力する
		System.out.printf(FORMAT_OUTPUT_PROCESS_DETAIL, WORD_POSITIVE_SIGN, WORD_NEGATIVE_SIGN);
		// 整数値の入力を求める
		System.out.println(MESSAGE_REQUEST_INTEGER_NUMBER);
		// 入力された値を保持する
		targetNumberJadgeSign = scannerNumberJadgeSign.nextInt();
		// 入力された値の正負を判定する
		resultJadgeSign = signOf(targetNumberJadgeSign);
		
		// 入力された値が正だった場合の処理を行う
		if ( resultJadgeSign == VALUE_JUDGE_POSITIVE_SIGN ) {
			// 正の値であることを表示する
			System.out.printf(FORMAT_OUTPUT_RESULT_SIGN,WORD_POSITIVE_SIGN);
		// 負の値だった場合の処理を行う
		} else if ( resultJadgeSign == VALUE_JUDGE_NEGATIVE_SIGN ) {
			// 負の値であることを出力する
			System.out.printf(FORMAT_OUTPUT_RESULT_SIGN,WORD_NEGATIVE_SIGN);
		// それ以外( 0 )だった場合の処理を行う
		} else {
			// 0 であることを表示する
			System.out.printf(FORMAT_OUTPUT_RESULT_SIGN, WORD_ZERO);
		}

		/*** 終了処理 *******************************************/
		// 正負を判定する整数値の入力用ストリームを閉じる
		scannerNumberJadgeSign.close();

	}
}
