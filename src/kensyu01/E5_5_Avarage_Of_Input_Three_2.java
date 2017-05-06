package kensyu01;

// 入力した値を扱う機能を読み込む
import java.util.Scanner;


/*************************************************************************/

// 3つの整数の入力を受け取って、合計と平均を表示するクラス
public class E5_5_Avarage_Of_Input_Three_2 {

	// 数値型変数を初期化するための値を設定する
	public static final int INITIALIZE_NUMERIC = 0;
	// 平均値を求めるための値を設定する
	public static final double DIVISOR_THREE = 3;

	// 整数入力を求めるメッセージを設定する
	public static final String MESSAGE_REQEST_INPUT = "整数値を入力してください";
	// テキスト「1つめ」を設定する
	public static final String TEXT_FIRST_TIMES = "1つめ";
	// テキスト「2つめ」を設定する
	public static final String TEXT_SECOND_TIMES = "2つめ";
	// テキスト「3つめ」を設定する
	public static final String TEXT_THIRD_TIMES = "3つめ";
	// テキスト「合計」を設定する
	public static final String TEXT_SUM = "合計";
	// テキスト「平均」を設定する
	public static final String TEXT_AVARAGE = "平均";

	
	/*************************************************************************/
	
	// 3つの整数の入力を受け取って、合計と平均を表示する処理を行う
	public static void main(String[] arg) {
		
		// 入力した値を扱うオブジェクトを作成する
		Scanner integerInput = new Scanner(System.in);
		// 1つめの入力された整数を保持するための変数を初期化する
		int firstValue = INITIALIZE_NUMERIC;
		// 2つめの入力された整数を保持するための変数を初期化する
		int secondValue = INITIALIZE_NUMERIC;
		// 3つめの入力された整数を保持するための変数を初期化する
		int thirdValue = INITIALIZE_NUMERIC;
		// 合計値を保持する変数を初期化する
		int sumValue = INITIALIZE_NUMERIC;
		
		
		/*************************************************************************/

		// 1つめの整数入力を求めるメッセージを出力する
		System.out.println(TEXT_FIRST_TIMES + "の" + MESSAGE_REQEST_INPUT);
		// 入力された値を保持する
		firstValue = integerInput.nextInt();

		// 2つめの整数入力を求めるメッセージを出力する
		System.out.println(TEXT_SECOND_TIMES + "の" + MESSAGE_REQEST_INPUT);
		// 入力された値を保持する
		secondValue = integerInput.nextInt();

		// 3つめの整数入力を求めるメッセージを出力する
		System.out.println(TEXT_THIRD_TIMES + "の" + MESSAGE_REQEST_INPUT);
		// 入力された値を保持する
		thirdValue = integerInput.nextInt();
		
		// 入力された値の合計値を保持する
		sumValue = firstValue + secondValue + thirdValue;
		
		// 入力された値の合計を出力する
		System.out.printf(TEXT_SUM + "は%dです\n" , sumValue);
		// 入力された値の平均を出力する
		System.out.printf(TEXT_AVARAGE + "は%fです\n" , (double)sumValue/DIVISOR_THREE);
		

		/*************************************************************************/

		// 整数値入力ストリームを閉じる
		integerInput.close();
	}
}
