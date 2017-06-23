package kensyu01;

/*
 * Day4 の定数クラス 
 */
public class DayConstants {
	/********************************************
		数値型定数
	********************************************/
	// 初期化のための 0 を設定する
	protected static final int INITIALIZE_ZERO = 0;
	// 初期化のための 1 を設定する
	protected static final int INITIALIZE_ONE = 1;


	/*** 月設定 ***************************/
	// 月の上限を設定する
	protected static final int NUMBER_MONTH_UPPER_LIMIT = 12;
	// 月の下限を設定する
	protected static final int NUMBER_MONTH_LOWER_LIMIT = 1;
	// 初月、初日を示す値を設定する
	protected static final int NUMBER_FIRST_DATE = 1;


	/*** ツェラーの公式用定数設定 ***************************/
	// ツェラーの公式で使用する4を設定する
	protected static final int ZELLERS_FOUR = 4;
	// ツェラーの公式で使用する5を設定する
	protected static final int ZELLERS_FIVE = 5;
	// ツェラーの公式で使用する7を設定する
	protected static final int ZELLERS_SEVEN = 7;
	// ツェラーの公式で使用する8を設定する
	protected static final int ZELLERS_EIGHT = 8;
	// ツェラーの公式で使用する12を設定する
	protected static final int ZELLERS_TWELVE = 12;
	// ツェラーの公式で使用する13を設定する
	protected static final int ZELLERS_THIRTEEN = 13;
	// ツェラーの公式で使用する14を設定する
	protected static final int ZELLERS_FOURTEENTH = 14;
	// ツェラーの公式で使用する100を設定する
	protected static final int ZELLERS_A_HUNDRED = 100;
	// ツェラーの公式で使用する400を設定する
	protected static final int ZELLERS_FOUR_HUNDRED = 400	;
	// 月の値を調整する値を設定する
	protected static final int NUMBER_FORMATING_MONTH = 1;
	// 調整した月の値を元の形式に戻す値を設定する
	protected static final int NUMBER_UNDO_FORMATING_MONTH = -1;

	
	/*** 日付の前後関係設定 ***************************/
	// 日付の比較結果が同じことを示す値を設定する
	protected static final int NUMBER_DAY_COMPARE_SAME = 0;
	// 日付の比較結果が前であることを示す値を設定する
	protected static final int NUMBER_DAY_COMPARE_BEFORE = -1;
	// 日付の比較結果が後ろであることを示す値を設定する
	protected static final int NUMBER_DAY_COMPARE_AFTER = 1;

	// 次の日を設定するための値を設定する
	protected static final int NUMBER_SET_NEXT_DAY = 1;
	// 前の日を設定するための値を設定する
	protected static final int NUMBER_SET_PREVIOUS_DAY = -1;
 

	/********************************************
		文字列型定数
	********************************************/

	/*** テキスト設定 *********************************/
	// テキスト「日」を設定する
	protected static final String TEXT_SUNDAY = "日";
	// テキスト「月」を設定する
	protected static final String TEXT_MONDAY = "月";
	// テキスト「火」を設定する
	protected static final String TEXT_TUESDAY = "火";
	// テキスト「水」を設定する
	protected static final String TEXT_WEDNESDAY = "水";
	// テキスト「木」を設定する
	protected static final String TEXT_THURSDAY = "木";
	// テキスト「金」を設定する
	protected static final String TEXT_FRIDAY = "金";
	// テキスト「土」を設定する
	protected static final String TEXT_SATURDAY = "土";


	/*** 出力フォーマット設定 *********************************/
	// 日付情報出力のためのフォーマットを設定する
	protected static final String FORMAT_OUTPUT_DAY_INFORMATION = "%04d年%02d月%02d日(%s)";
}
