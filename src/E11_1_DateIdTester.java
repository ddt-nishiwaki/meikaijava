
// idパッケージの DateIdクラス型をインポートする
import id.DateId;

/************************************************
	DateIdクラスをチェックするクラス
************************************************/
public class E11_1_DateIdTester {

	/************************************************
		定数(数値)
	************************************************/
	// 1回目を示す値を設定する
	private static final int FIRST_TIME = 1;
	// 2回目を示す値を設定する
	private static final int SECOND_TIME = 2;
	// 3回目を示す値を設定する
	private static final int THIRD_TIME = 3;

	/************************************************
		定数(文字列)
	************************************************/
	private static final String FORMAT_OUTPUT_ID = "%sの識別番号 : ";

	/************************************************
		メインメソッド
	************************************************/
	/*
	 * DateIdクラスの検証を行う
	 * 
	 * インスタンスを生成するたびに
	 * 現在時刻を示す数字の後ろに識別番号をつけた文字列を出力できていることを確認する
	 */
	public static void main(String[] arg){
		
		/*** インスタンス生成 **************/
		// 1回目のインスタンス生成を行う
		DateId firstId = new DateId();
		// 2回目のインスタンス生成を行う
		DateId secondId = new DateId();
		// 3回目のインスタンス生成を行う
		DateId thirdId = new DateId();

		/*** 1回目の作成確認 **************/
		// 1回目のインスタンスの情報を確認することを示すテキストを表示する
		System.out.printf(FORMAT_OUTPUT_ID, FIRST_TIME);
		// 1回目のインスタンスの情報を確認するために出力する
		System.out.println(firstId.mGetId());

		/*** 2回目の作成確認 **************/
		// 2回目のインスタンスの情報を確認することを示すテキストを表示する
		System.out.printf(FORMAT_OUTPUT_ID, SECOND_TIME);
		// 2回目のインスタンスの情報を確認するために出力する
		System.out.println(secondId.mGetId());

		/*** 3回目の作成確認 **************/
		// 3回目のインスタンスの情報を確認することを示すテキストを表示する
		System.out.printf(FORMAT_OUTPUT_ID, THIRD_TIME);
		// 3回目のインスタンスの情報を確認するために出力する
		System.out.println(thirdId.mGetId());
	}

}
