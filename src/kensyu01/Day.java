package kensyu01;

/*** クラス ********************/
// 日付を設定するクラス
public class Day {

	/*** 数値型定数 ********************/
	// 一月の値を設定する
	private static final int JANUARY = 1;
	// 二月の値を設定する
	private static final int FEBRUARY = 2;
	// ツェラーの公式で使用する4を設定する
	private static final int ZELLERS_FOUR = 4;
	// ツェラーの公式で使用する5を設定する
	private static final int ZELLERS_FIVE = 5;
	// ツェラーの公式で使用する7を設定する
	private static final int ZELLERS_SEVEN = 7;
	// ツェラーの公式で使用する8を設定する
	private static final int ZELLERS_EIGHT = 8;
	// ツェラーの公式で使用する12を設定する
	private static final int ZELLERS_TWELVE = 12;
	// ツェラーの公式で使用する13を設定する
	private static final int ZELLERS_THIRTEEN = 13;
	// ツェラーの公式で使用する14を設定する
	private static final int ZELLERS_FOURTEENTH = 14;
	// ツェラーの公式で使用する100を設定する
	private static final int ZELLERS_A_HUNDRED = 100;
	// ツェラーの公式で使用する400を設定する
	private static final int ZELLERS_FOUR_HUNDRED = 400	;
	
	
	/*** フィールド ********************/
	// 年フィールドを初期化する
	private int year = 1;
	// 月フィールドを初期化する
	private int month = 1;
	// 日フィールドを初期化する
	private int date = 1;
	
	/*** コンストラクタ ********************/
	// 引数なしのコンストラクタを設定する
	public Day (){}
	// 引数一つのコンストラクタを設定する
	public Day (int year){ 
		// 年フィールドを設定する
		this.year = year;
	}
	// 引数二つのコンストラクタを設定する
	public Day (int year, int month){
		// 引数一つのコンストラクタを利用する
		this(year);
		// 月フィールドを設定する
		this.month = month;
	}
	// 引数三つのコンストラクタを設定する
	public Day (int year, int month, int date){
		// 引数二つのコンストラクタを利用する
		this(year, month);
		// 日フィールドを設定する
		this.date = date;
	}
	// コピーコンストラクタを設定する
	public Day (Day d){
		// インスタンスの各フィールドをコピーする
		this(d.year, d.month, d.date);
	}
	


	/*** ゲッター ********************/
	// 年を取得するメソッドを設定する
	public int getYear() {
		return this.year;
	}
	// 月を取得するメソッドを設定する
	public int getMonth() {
		return this.month;
	}
	// 日を取得するメソッドを設定する
	public int getDate() {
		return this.date;
	}
	/*** セッター ********************/
	// 年を設定するメソッドを設定する
	public void setYear(int year) {
		// 年を設定する
		this.year = year;
	}
	// 月を設定するメソッドを設定する
	public void setMonth(int month) {
		// 月を設定する
		this.month = month;
	}
	// 日を設定するメソッドを設定する
	public void setDate(int date) {
		// 日を設定する
		this.date = date;
	}
	// 年月日を設定するメソッドを設定する
	public void set(int year, int month, int date) {
		// 年を設定する
		this.year = year;
		// 年を設定する
		this.month = month;
		// 日を設定する
		this.date = date;
	}
	
	
	/*** メソッド ********************/
	// 曜日を求めるメソッドを設定する
	public int dayOfWeek() {
		// 年の値を保持する
		int year = this.year;
		// 月の値を保持する
		int month = this.month;
		// 1月と2月の場合の処理を行う
		if (month == JANUARY || month == FEBRUARY) {
			// 年を前年に設定する
			year--;
			// 月の値に12を足す
			month += ZELLERS_TWELVE;
		}
		
		// ツェラーの公式より曜日を設定する値を返す
		return (year + year / ZELLERS_FOUR 
				- year / ZELLERS_A_HUNDRED 
				+ year / ZELLERS_FOUR_HUNDRED 
				+ (ZELLERS_THIRTEEN * month + ZELLERS_EIGHT) / ZELLERS_FIVE + date) % 7;
	}
	// 日付インスタンスの値が同じかどうかを比較するメソッドを設定する
	public boolean equalTo (Day day){
		// 年月日の値が全て同じ場合は true 一つでも異なれば false を返す
		return this.year == day.year && this.month == day.month && this.date == day.date;
	}
	// 設定されている年月日を文字列で返すメソッドを設定する
	public String toString() {
		String[] weekText = {"日","月","火","水","木","金","土"};
		return String.format("%04d年%02d月%02d日(%s)", this.year,this.month,this.date,weekText[dayOfWeek()]);
	}
}

