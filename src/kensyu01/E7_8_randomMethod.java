package kensyu01;

/*** ライブラリの読み込み ******************************/
//入力を扱う機能を読み込む
import java.util.Scanner;
// 乱数を生成する機能を読み込む
import java.util.Random;

/*** クラス ******************************/
// 乱数の範囲を設定して、その範囲の乱数を返すメソッドを実行するクラス
public class E7_8_randomMethod {

	/*** 数値型定数設定 ******************************/
	// 整数値を初期化するための 0 を設定する
	private static final int INITIALIZE_ZERO = 0;
	private static final int NUMBER_FORMATING_OUTPUT_RAMDOM = 1;
	/*** 文字列型定数設定 ******************************/
	// 処理内容を示すメッセージを設定する
	private static final String MESSAGE_OUTPUT_PROCESS_DETAIL = "乱数を生成します";
	// 乱数の範囲の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_RAMDOM_RANGE = "乱数の範囲を設定してください";
	// 乱数範囲の最小値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_RAMDOM_MINIMUM = "乱数の最小値を入力 : ";
	// 乱数範囲の最大値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_RAMDOM_MAX = "乱数の最大値を入力 : ";
	// 乱数を出力するためのフォーマットを設定する
	private static final String FORMAT_OUTPUT_RAMDOM_NUMBER = "生成された乱数は%dです\n";
	

	/*** メソッド ******************************/
	// 乱数を生成して返すメソッド
	private static int generateRandomNumber (int minumumNumberRange, int maxNumberRange) {
		/*** 変数初期化 ******************************/
		//生成された乱数を保持する変数を初期化する
		int randomNumber = INITIALIZE_ZERO;

		/*** オブジェクト作成 ******************************/
		// 乱数を生成するオブジェクトを作成する
		Random generatorRandomNumber = new Random();
		
		/*** 演算処理 ******************************/
		// 設定された乱数の最大値を,最小値の設定のために調節する
		maxNumberRange = maxNumberRange - minumumNumberRange + NUMBER_FORMATING_OUTPUT_RAMDOM;
		// 調整した上限までの乱数を生成する
		randomNumber = generatorRandomNumber.nextInt(maxNumberRange);
		// 乱数の範囲を設定した最小値の値分ずらす
		randomNumber += minumumNumberRange;

		/*** 終了処理 ******************************/
		// 生成した乱数を返す
		return randomNumber;
	}
	

	/*** メインメソッド ******************************/
	// 乱数の範囲を設定して、その範囲の乱数を返すメソッドを実行する
	public static void main (String[] arg) {
		/*** 変数初期化 ******************************/
		// 設定された乱数範囲の最小値を保持する変数を初期化する
		int numberMinumumRandom = INITIALIZE_ZERO;
		// 設定された乱数範囲の最大値を保持する変数を初期化する
		int numberMaxRandom = INITIALIZE_ZERO;
		// 生成された乱数を保持する変数を初期化する
		int generatedRamdom = INITIALIZE_ZERO;

		/*** オブジェクトの作成 ******************************/
		Scanner scannerRamdomRange = new Scanner(System.in);
		
		/*** 内容出力処理 ******************************/
		// 処理内容を出力する
		System.out.println(MESSAGE_OUTPUT_PROCESS_DETAIL);
		
		/*** 入力処理 ******************************/
		// 乱数範囲の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_RAMDOM_RANGE);
		// 乱数の最小値の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_RAMDOM_MINIMUM);
		// 設定された最小値を保持する
		numberMinumumRandom = scannerRamdomRange.nextInt();
		// 乱数の最大値の入力を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_RAMDOM_MAX);
		// 設定された最大値を保持する
		numberMaxRandom = scannerRamdomRange.nextInt();

		/*** 演算処理 ******************************/
		// 入力された範囲内で乱数を生成する
		generatedRamdom = generateRandomNumber(numberMinumumRandom, numberMaxRandom);

		/*** 出力処理 ******************************/
		// 生成した乱数を出力する
		System.out.printf(FORMAT_OUTPUT_RAMDOM_NUMBER, generatedRamdom);

		/*** 終了処理 ******************************/
		// 乱数範囲の入力用ストリームを閉じる
		scannerRamdomRange.close();
	}
}
