package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;


/******************************************************/

// 配列を入力した値から初期化して、その初期化子を表示するクラス
public class E6_5_OutputArrayInitializer {

	// 数値型変数を初期化する変数を初期化する値を設定する
	public static final int INITIALIZE_INGETGER = 0;
	// 配列の長さの設定を求めるメッセージを設定する
	public static final String REQUEST_ARRAY_LENGTH = "配列の長さを設定してください";
	// 出力に使う配列の変数名を設定する
	public static final String TEXT_ARRAY_NAME = "ensyuArray";
	// 代入演算子を示す文字列を設定する
	public static final String ASSIGNMENT_OPERATOR = " = ";
	// 配列型を示す括弧開きの文字を設定する
	public static final String OPEN_BRACKET = "[";
	// 配列型を示す閉じ括弧の文字を設定する
	public static final String CLOSE_BRACKET = "]";
	// 配列初期化子の括弧開きを示す文字を設定する
	public static final String START_ARRAY_INITIALIZER = "{";
	// 配列初期化子の閉じ括弧を示す文字を設定する
	public static final String END_ARRAY_INITIALIZER = "}";
	// 初期化子内の区切り文字を示す文字を設定する
	public static final String DELIMITER = ", ";


	/******************************************************/

	// 配列を入力した値から初期化して、その初期化子を表示する処理を行う
	public static void main(String[] arg) {

		// 配列の長さを設定する変数を初期化する
		int ensyuArrayLength = INITIALIZE_INGETGER;
		// 配列の設定を行う入力を扱うオブジェクトを作成する
		Scanner ensyuArrayInput = new Scanner(System.in);
		
		
		/******************************************************/

		// 配列の長さの設定を求めるメッセージを出力する
		System.out.println(REQUEST_ARRAY_LENGTH);
		// 配列の長さの設定を変数に保持する
		ensyuArrayLength = ensyuArrayInput.nextInt();
		// 配列を設定された長さで作成する
		int ensyuArray[] = new int[ensyuArrayLength];
		

		/******************************************************/

		// 配列の各要素に値を入力させる
		for ( int count = INITIALIZE_INGETGER; count < ensyuArrayLength; count++ ){
			// 各インデックスの値の設定を求める文字列を出力する
			System.out.println(TEXT_ARRAY_NAME + OPEN_BRACKET + count + CLOSE_BRACKET + ASSIGNMENT_OPERATOR);
			// 入力された値を各インデックスに保持する
			ensyuArray[count] = ensyuArrayInput.nextInt();
		}

		// 配列の初期化子を示す文字列の括弧開きまで表示する
		System.out.print(TEXT_ARRAY_NAME + ASSIGNMENT_OPERATOR + START_ARRAY_INITIALIZER);

		// 配列初期化子の括弧の中身を表示する
		for ( int count = INITIALIZE_INGETGER; count < ensyuArrayLength; count++ ) {
			// 初回の場合を除き処理を行う
			if( count != INITIALIZE_INGETGER ) {
				// 区切り文字を出力する
				System.out.print(DELIMITER);
			}
			// 各インデックスの値を出力する
			System.out.print(ensyuArray[count]);
		}

		// 配列初期化しの閉じ括弧を表示する
		System.out.println(END_ARRAY_INITIALIZER);


		/******************************************************/

		// 配列の設定を行う入力ストリームを閉じる
		ensyuArrayInput.close();
		
	}
}
