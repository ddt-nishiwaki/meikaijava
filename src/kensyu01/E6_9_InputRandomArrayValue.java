package kensyu01;

// 入力された値を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;

// 任意の長さの配列を作成し、各インデックスを乱数で埋めるクラス
public class E6_9_InputRandomArrayValue {

	// 数値型変数を初期化する値を設定する
	private static final int NUMBER_INITIALIZE_NUMERIC = 0;
	// 配列の長さの入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_ARRAY_LENGTH = "配列の長さを設定してください";
	// 乱数の上限を設定する
	private static final int NUMBER_LIMIT_RAMDOM_RANGE = 9;
	// 乱数の範囲をシフトする値を設定する
	private static final int NUMBER_SHIFT_RANDOM_RANGE = 1;
	// 配列の値出力フォーマットを設定する
	private static final String FORMAT_OUTPUT_ARRAY_VALUE = "RandomArray[%d] = %d\n";

	// 任意の長さの配列を作成し、各インデックスを乱数で埋める処理を行う
	public static void main(String[] arg) {
		
		// 入力された配列の長さを保持する変数を初期化する
		int lengthRandomArray = NUMBER_INITIALIZE_NUMERIC;

		// 配列の長さの入力を扱うオブジェクトを作成する
		Scanner scannerRandomArray = new Scanner(System.in);
		
		// 乱数を生成するオブジェクトを作成する
		Random generatorRandomArray = new Random();
		
		// 配列の長さの入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_ARRAY_LENGTH);
		// 入力された配列の長さを保持する
		lengthRandomArray = scannerRandomArray.nextInt();
		// 入力された配列の長さから配列を作成する
		int[] arrayRandom = new int[lengthRandomArray];
		
		// 作成された配列の各インデックス値をを設定する
		for ( int count = NUMBER_INITIALIZE_NUMERIC; count < lengthRandomArray; count++ ) {
			// 現在のインデックスに乱数を設定する
			arrayRandom[count] = generatorRandomArray.nextInt(NUMBER_LIMIT_RAMDOM_RANGE) + NUMBER_SHIFT_RANDOM_RANGE;
		}
		// 配列に設定された各インデックスの値を確認する
		for ( int count = NUMBER_INITIALIZE_NUMERIC; count < lengthRandomArray; count++ ) {
			// 現在のインデックスを出力する
			System.out.printf(FORMAT_OUTPUT_ARRAY_VALUE,count,arrayRandom[count]);
		}
		// 配列の長さ設定の入力ストリームを閉じる
		scannerRandomArray.close();
	}
}
