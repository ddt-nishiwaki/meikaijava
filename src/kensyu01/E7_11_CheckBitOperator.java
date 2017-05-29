package kensyu01;

/*** ライブラリの読み込み ******************************/
//入力を扱う機能を読み込む
import java.util.Scanner;

// シフト演算子の実行結果が2のべき乗での乗算や除算と等しくなることを証明するクラス
public class E7_11_CheckBitOperator {
	
	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	// 演算対象として 10 を設定する
	private static final int TARGET_NUMBER = 1024;
	// 二進数の基数を設定する
	private static final int BINARY_BASE = 2;

	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "シフト演算の結果と2のべき乗の乗算除算の結果を比較する";
	// 演算回数の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_OPERATION_TIMES = "演算回数を入力してください : ";

	/*** メインメソッド ******************************/
	// シフト演算子の実行結果が2のべき乗での乗算や除算と等しくなることを証明するクラス
	public static void main(String[] arg) {

		/*** オブジェクト作成 ******************************/
		// シフト演算の結果比較を行う回数を入力するオブジェクトを作成する
		Scanner scannerOperationTimes = new Scanner(System.in);

		/*** 変数初期化 ******************************/
		// 演算回数を保持する変数を初期化する
		int operationTimes = INITIALIZE_ZERO;
		// 二進数の基数を設定する
		int powerValue = BINARY_BASE;
		// ビットを左にシフトした値を保持する変数を初期化する
		int leftShiftValue = INITIALIZE_ZERO;
		// 2のべき乗を乗算した値を保持する変数を初期化する
		int multiplicationShiftValue = INITIALIZE_ZERO;
		// ビットをにシフトした値を保持する変数を初期化する
		int rightShiftValue = INITIALIZE_ZERO;
		// 2のべき乗を除算した値を保持する変数を初期化する
		int divisionValue = INITIALIZE_ZERO;
		
		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		// 演算を行う回数の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_OPERATION_TIMES);
		// 入力された演算回数を保持する
		operationTimes = scannerOperationTimes.nextInt();
		
		// 各演算結果を比較のために出力する
		for ( int operateCount = INITIALIZE_ZERO + 1; operateCount < operationTimes; operateCount++ ) {
			
			// 演算対象を左にシフトし、値を保持する
			leftShiftValue = TARGET_NUMBER << operateCount;
			// 演算対象を2のべき乗で乗算し、値を保持する
			multiplicationShiftValue = TARGET_NUMBER * powerValue;
			// 演算対象をにシフトし、値を保持する
			rightShiftValue = TARGET_NUMBER >> operateCount;
			// 演算対象を2のべき乗で除算し、値を保持する
			divisionValue = TARGET_NUMBER / powerValue;
			
			// 左シフトの結果を出力する
			System.out.printf("%d << %d の結果: %d  |   ",TARGET_NUMBER, operateCount, leftShiftValue);
			// 2のべき乗の乗算結果を出力する
			System.out.printf("%d * %d の結果: %d  |   ",TARGET_NUMBER, powerValue, multiplicationShiftValue);
			// シフトの結果を出力する
			System.out.printf("%d >> %d の結果: %d  |   ",TARGET_NUMBER, operateCount, rightShiftValue);
			// 2のべき乗の除算結果を出力する
			System.out.printf("%d / %d の結果: %d  |   ",TARGET_NUMBER, powerValue, divisionValue);
			
			// 改行を出力する
			System.out.println();
			
			// 2をべき乗する
				powerValue *= BINARY_BASE; 
		}

		/*** 終了処理 ******************************/
		// シフト演算の結果比較を行う回数を入力するストリームを閉じる
		scannerOperationTimes.close();
	}
}