package id;

/*********************************************
  インポート宣
*********************************************/
// 日付を扱うクラスを読み込む
import java.util.GregorianCalendar;
// 日付を扱うクラス変数、メソッドを読み込む
import static java.util.GregorianCalendar.*;

/*********************************************
  クラス
*********************************************/
// 日付を扱うクラス
public class DateId {
	
	/*** 定数(数値) ********/
	// 月を示すデータを 0 ~ 11 から 1 ~ 12 に変更するための値を設定する
	private static final int NUMBER_FORMAT_MONTH = 1;
	// 年を識別番号用に調節するための値を設定する
	private static final int NUMBER_FORMAT_ID_YEAR = 1000000;
	// 月を識別番号用に調節するための値を設定する
	private static final int NUMBER_FORMAT_ID_MONTH = 10000;
	// 日を識別番号用に調節するための値を設定する
	private static final int NUMBER_FORMAT_ID_DATE = 100;

	/*** 定数(文字列) ********/
	// 設定された日付を出力する際のフォーマットを設定する
	private static final String FORMAT_OUTPUT_DATE = "今日は%04d年%02d月%02d日です。\n";

	/*** インスタンス変数 ********/
	// 識別番号フィールドを設定する
	private int mId;

	/*** クラス変数 ********/
	// 南蛮までの識別番号を与えたかを保持するクラス変数を宣言する
	private static int sIdCounter;

	/*** 静的初期化子 ********/
	static {
		// 現在時刻を取得するためのオブジェクトを作成する
		GregorianCalendar toDay = new GregorianCalendar();
		// 現在の年を取得する
		int currentYear = toDay.get(YEAR);
		// 現在の月を取得する
		int currentMonth = toDay.get(MONTH) + NUMBER_FORMAT_MONTH;
		// 現在の日を取得する
		int currentDate = toDay.get(DATE);
		// 設定された日付を出力する
		System.out.printf(FORMAT_OUTPUT_DATE,currentYear, currentMonth, currentDate);
		// 識別番号用に年の値を調整する
		currentYear *= NUMBER_FORMAT_ID_YEAR;
		// 識別番号用に月の値を調整する
		currentMonth *= NUMBER_FORMAT_ID_MONTH;
		// 識別番号用に日の値を調整する
		currentDate *= NUMBER_FORMAT_ID_DATE;
		// 識別番号のベースを設定する
		sIdCounter = currentYear + currentMonth + currentDate;
	}
	
	/*** コンストラクタ ********/
	// 引数なしのコンストラクタを設定する
	public DateId(){
		// 設定する識別番号を求める
		int nextID = sIdCounter++;
		// 識別番号を設定する
		this.mId = nextID;
	}
	
	/*** メソッド ********/
	// 識別番号を取得するメソッドを設定する
	public int mGetId() {
		// 識別番号を返す
		return this.mId;
	};
}


