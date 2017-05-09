package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;

// 入力した値からdouble型配列を作成し、要素の合計値と平均値を求めるクラス
public class E6_8_EnhancedForStatement {

	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMERIC = 0;
	// 配列の長さを求めるメッセージを設定する
	private static final String REQEST_ARRAY_LENGTH = "配列の長さを入力してください : ";
	// 値の設定を求めるメッセージを出力する
	private static final String REQUEST_INPUT_DOUBLE = "double型で値を設定してください : ";
	// 配列の合計値を出力する際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_SUM = "配列の各値の合計は%fです\n";
	// 配列の平均値を出力する際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_AVARAGE = "配列の各値の平均は%fです\n";


	/***********************************************************************/
	
	// 入力した値からdouble型配列を作成し、要素の合計値と平均値を求める処理を行う
	public static void main(String[] arg) {
		
		// 配列の長さを保持する変数を初期化する
		int arrayLength = INITIALIZE_NUMERIC;
		// 配列要素の合計値を保持する変数を初期化する
		double sumArrayValue = INITIALIZE_NUMERIC;
		// 配列要素の平均値を保持する変数を初期化する
		double avarageArrayValue = INITIALIZE_NUMERIC;
		
		// 配列設定の入力を扱うオブジェクトを作成する
		Scanner arraySettingInput = new Scanner(System.in);
		

		/***********************************************************************/

		// 配列の長さを求めるメッセージを出力する
		System.out.println(REQEST_ARRAY_LENGTH);
		// 入力された配列の長さを保持する
		arrayLength = arraySettingInput.nextInt();
		
		// 配列を作成する
		double[] doubleArray = new double[arrayLength];
		
		// 配列の各インデックスに値を設定させる
		for ( int count = INITIALIZE_NUMERIC; count < arrayLength; count++ ) {
			// 値の設定を求めるメッセージを出力する
			System.out.println(REQUEST_INPUT_DOUBLE);
			// 入力された値を現在のインデックスに設定する
			doubleArray[count] = arraySettingInput.nextDouble();
			
		}
		// 配列の各値の合計値を求める
		for ( double thisValue : doubleArray ) {
			// 各値を足していく
			sumArrayValue += thisValue;
		}
		
		// 配列の各値の平均値を求める
		avarageArrayValue = (double)sumArrayValue/arrayLength; 
		
		// 配列の合計値を出力する
		System.out.printf(FORMAT_OUTPUT_SUM,sumArrayValue);
		// 配列の平均値を出力する
		System.out.printf(FORMAT_OUTPUT_AVARAGE,avarageArrayValue);
		
		
		/***********************************************************************/

		// 配列を設定する入力ストリームを閉じる
		arraySettingInput.close();
	}
}
