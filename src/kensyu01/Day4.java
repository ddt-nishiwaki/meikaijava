package kensyu01;

/*************************************************
	カレンダークラスの読み込み
**************************************************/
// 現在の日付を取得するための機能を読み込む
import java.util.GregorianCalendar;
// GregorianCalendarの静的メンバを読み込む
import static java.util.GregorianCalendar.*;
// 日付クラス第四版のユーティリティークラス

/*************************************************
	Day4関連クラスの読み込み
**************************************************/
// Day4 のユーティリティークラスを読み込む
import static kensyu01.UtilDay4.*;
// Day4 定数クラスを読み込む
import static kensyu01.DayConstants.*;


/*************************************************
	Day4クラス
**************************************************/
// 日付クラス第四版
public class Day4 {
	
	
	/*************************************************
		フィールド 
	**************************************************/
	// 日付フィールドを設定する
	private GregorianCalendar mDay;
	// 年フィールドを設定する
	private int mYear = NUMBER_FIRST_DATE;
	// 月フィールドを設定する
	private int mMonth = NUMBER_FIRST_DATE;
	// 日フィールドを設定する
	private int mDate = NUMBER_FIRST_DATE;

	/*************************************************
		コンストラクタ 
	*************************************************/
	// 現在時刻を設定するコンストラクタを設定する
	Day4(){
		// 現在時刻を設定する
		this.mDay = sGetCalendar();
		// 年フィールドに現在の年を設定する
		this.mYear = this.mDay.get(YEAR);
		// 月フィールドに現在の月を設定する
		this.mMonth = this.mDay.get(MONTH) + NUMBER_FORMATING_MONTH;
		// 日フィールドに現在の日を設定する
		this.mDate = this.mDay.get(DATE);	
	}
	// 指定年/初月/初日を設定するコンストラクタを設定する
	Day4(int year){
		// 指定年/初月/初日 を設定する
		this.mDay = sGetCalendar(year);
		// 年フィールドに年を設定する
		this.mYear = this.mDay.get(YEAR);
		// 月フィールドに初月を設定する
		this.mMonth = this.mDay.get(MONTH) + NUMBER_FORMATING_MONTH;
		// 日フィールドに初日を設定する
		this.mDate = this.mDay.get(DATE);	
	}
	// 指定年/指定月/初日を設定するコンストラクタを設定する
	Day4(int year, int month){
		// 指定年/設定月/初日 を設定する
		this.mDay = sGetCalendar(year,month);
		// 年フィールドに年を設定する
		this.mYear = this.mDay.get(YEAR);
		// 月フィールドに月を設定する
		this.mMonth = this.mDay.get(MONTH) + NUMBER_FORMATING_MONTH;
		// 日フィールドに初日を設定する
		this.mDate = this.mDay.get(DATE);	
	}
	// 指定年/指定月/指定日を設定するコンストラクタを設定する
	Day4(int year, int month, int date){
		// 指定年/設定月/設定日 を設定する
		this.mDay = sGetCalendar(year,month);
		// 年フィールドに年を設定する
		this.mYear = this.mDay.get(YEAR);
		// 月フィールドに月を設定する
		this.mMonth = this.mDay.get(MONTH) + NUMBER_FORMATING_MONTH;
		// 日フィールドに日の入力をチェックして設定する
		this.mDate = slimitRangeDate(date, this.mDay);	
	}
	// コピーコンストラクタを設定する
	Day4(Day4 day){
		// 年フィールドをコピーする
		this.mYear = day.mGetYear();
		// 月フィールドをコピーする
		this.mMonth = day.mGetMonth();
		// 日フィールドをコピーする
		this.mDate = day.mGetDate();
		// 日付フィールドをコピーする
		this.mDay = day.mGetDay();
	}
	
	/*************************************************
		インスタンスメソッド
	**************************************************/
	
	/*** セッター *************/
	// 日付フィールドから年月日フィールドをそれぞれ設定するメソッドを設定する
	protected void mSetDayField(){
		// 年フィールドに年を設定する
		this.mYear = this.mDay.get(YEAR);
		// 月フィールドに月を設定する
		this.mMonth = this.mDay.get(MONTH) + NUMBER_FORMATING_MONTH;
		// 日フィールドに日を設定する
		this.mDate = this.mDay.get(DATE);
	}
	// 年月日を一括指定で変更するメソッドを設定する
	protected void mSetDayField(int year, int month, int date){
		// 指定年月日に変更した日付を設定する
		this.mDay = sGetCalendar(year,month,date);
		// 年月日を更新する
		mSetDayField();
	}
	// 年を設定するメソッドを設定する
	protected void mSetYear(int year){
		// 指定年に変更した日付を設定する
		this.mDay = sGetCalendar(year,this.mMonth,this.mDate);
		// 年月日を更新する
		this.mSetDayField();
	};
	// 月を設定するメソッドを設定する
	protected void mSetMonth(int month){
		// 指定月に変更した日付を設定する
		this.mDay = sGetCalendar(this.mYear,month,this.mDate);
		// 年月日を更新する
		this.mSetDayField();
	};
	// 日を設定するメソッドを設定する
	protected void mSetDate(int date){
		// 指定日に変更した日付を設定する
		this.mDay = sGetCalendar(this.mYear,this.mMonth,date);
		// 年月日を更新する
		this.mSetDayField();
	};
	// 日付を設定するメソッドを設定する
	protected void mSetDay(GregorianCalendar day){
		// 日付を設定する
		this.mDay = day;
		// 年月日を更新する
		this.mSetDayField();
	}
	
	/*** ゲッター *************/
	// 年を取得するメソッドを設定する
	protected int mGetYear(){
		// 年を返す
		return this.mYear;
	}
	// 月を取得するメソッドを設定する
	protected int mGetMonth(){
		// 月を返す
		return this.mMonth;
	}
	// 日を取得するメソッドを設定する
	protected int mGetDate(){
		// 日を返す
		return this.mDate;
	}
	// 日付を取得するメソッドを設定する
	protected GregorianCalendar mGetDay(){
		// 日付を返す
		return this.mDay;
	}
	// 設定されている年月日を文字列で返すメソッドを設定する
	public String toString() {
		// 各曜日を示すテキストを設定する
		String[] weekText = {TEXT_SUNDAY,TEXT_MONDAY,TEXT_TUESDAY,TEXT_WEDNESDAY,TEXT_THURSDAY,TEXT_FRIDAY,TEXT_SATURDAY};
		// 日付情報をを返す
		return String.format(FORMAT_OUTPUT_DAY_INFORMATION, this.mYear,this.mMonth,this.mDate,weekText[sDayOfWeek(this)]);
	}
	
	
	/*************************************************
		追加メソッド
	**************************************************/
	// 任意の値分前の日付を返却するメソッドを設定
	protected Day4 mGetOldDay(int numberOfDays){
		// 現在の日付をコピーする
		Day4 cloneDay = new Day4(this);
		// 日付を過去に戻すための値を求める
		int settingDay = cloneDay.mGetDate() - numberOfDays;
		// コピーした日付の日を設定した日数分戻す
		cloneDay.mSetDate(settingDay);
		// 過去の日付を返す
		return cloneDay;
	}
	// 任意の値分前の日付に戻すメソッドを設定する
	protected void mSetOldDay(int numberOfDays){
		// 設定した日数分前の日付を取得する
		Day4 oldDay = this.mGetOldDay(numberOfDays);
		// 取得した日付で更新する
		this.mSetDay(oldDay.mGetDay());
	}
	// 任意の日数分先の日付を返却するメソッドを設定する
	protected Day4 mGetFutureDay(int numberOfDays){
		// 現在の日付をコピーする
		Day4 cloneDay = new Day4(this);
		// 日付を未来に設定するための値を求める
		int settingDay = cloneDay.mGetDate() + numberOfDays;
		// コピーした日付の日を設定した日にち分進める
		cloneDay.mSetDate(settingDay);
		// 未来の日付を返す
		return cloneDay;
	}
	// 任意の日数分先の日付に進めるメソッドを設定する
	protected void mSetFutureDay(int numberOfDays){
		// 設定した日数分先の日付を取得する
		Day4 futureDay = this.mGetFutureDay(numberOfDays);
		// 取得した日付で更新する
		this.mSetDay(futureDay.mGetDay());
	}
	// 次の日の日付を返却するメソッドを設定する
	protected Day4 mGetNextDay(){
		// 明日の日付を設定して返す
		return this.mGetFutureDay(NUMBER_SET_NEXT_DAY);
	}
	// 日付を1日進めるメソッドを設定する
	protected void mSetNextDay(){
		//次の日の日付を取得する
		Day4 nextDay = this.mGetNextDay();
		// 日付を明日に更新する
		this.mSetDay(nextDay.mGetDay());
	}
	// 昨日の日付を返却するメソッドを設定する
	protected Day4 mGetPreviousDay(){
		// 昨日の日付を設定して返す
		return this.mGetOldDay(NUMBER_SET_PREVIOUS_DAY);
	}
	// 日付を一つ前に戻すメソッドを設定する
	protected void mSetPreviousDay(){
		// 昨日の日付を取得する
		Day4 futureDay = this.mGetPreviousDay();
		// 取得した日付で更新する
		this.mSetDay(futureDay.mGetDay());
	}

	
	// 設定された年での経過日数を取得するメソッドを設定する
	protected int mGetElapsedDate (){
		// 経過日数を返す
		return sGetElapsedDate(this.mDay);
	}
	
	// 設定された年での残日数を取得するメソッドを設定する
	protected int mGetRemainingDaysYear (){
		// 設定されている日付を取得する
		GregorianCalendar settingDay = this.mDay;
		// その年の日数を取得する
		int daysOfYear = sGetDaysOfYear(settingDay);
		// その年の経過日数を取得する
		int elapsedDate = sGetElapsedDate(settingDay);
		// 経過日数を引いて、残日数として返す
		return daysOfYear - elapsedDate;
	}

	// 日時を比較するクラスメソッドを設定する
	protected int mCompareDay(Day4 compareDay){
		// 返り値を設定するための変数を宣言する
		int resultCompareDay;
		// 年を比較して結果を保持する
		resultCompareDay = sCompareYear(this.mGetDay(), compareDay.mGetDay());
		// 年が同じだった場合の処理を行う
		if(resultCompareDay == NUMBER_DAY_COMPARE_SAME) {
			// 比較のために自身の経過日数を取得する
			int selfDayCount = this.mGetElapsedDate();
			// 比較のために比較対象の経過日数を取得する
			int compareDayCount = compareDay.mGetElapsedDate();
			// 自身の経過日数が対象より進んでいるかどうかを比較する
			resultCompareDay = (selfDayCount > compareDayCount) ? NUMBER_DAY_COMPARE_AFTER : NUMBER_DAY_COMPARE_BEFORE;
			// 自身の経過日数が対象同じかどうかを比較する
			resultCompareDay = (selfDayCount == compareDayCount) ? NUMBER_DAY_COMPARE_SAME : resultCompareDay;
		}
		// 比較結果を返す
		return resultCompareDay;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*************************************************
		クラスメソッド
	**************************************************/
	static boolean sIsLeap(int year){
		return year % ZELLERS_FOUR == 0 && year % ZELLERS_A_HUNDRED != 0
				|| year % ZELLERS_FOUR_HUNDRED == 0;
	}

	// 二つの日時を比較するクラスメソッドを設定する
	protected static int sCompareDay(Day4 targetDay, Day4 compareDay){
		// 返り値を設定するための変数を宣言する
		int resultCompareDay;
		// 年を比較して結果を保持する
		resultCompareDay = sCompareYear(targetDay.mGetDay(), compareDay.mGetDay());
		// 年が同じだった場合の処理を行う
		if(resultCompareDay == NUMBER_DAY_COMPARE_SAME) {
			// 比較のために自身の経過日数を取得する
			int selfDayCount = targetDay.mGetElapsedDate();
			// 比較のために比較対象の経過日数を取得する
			int compareDayCount = compareDay.mGetElapsedDate();
			// 自身の経過日数が対象より進んでいるかどうかを比較する
			resultCompareDay = (selfDayCount > compareDayCount) ? NUMBER_DAY_COMPARE_AFTER : NUMBER_DAY_COMPARE_BEFORE;
			// 自身の経過日数が対象同じかどうかを比較する
			resultCompareDay = (selfDayCount == compareDayCount) ? NUMBER_DAY_COMPARE_SAME : resultCompareDay;
		}
		// 比較結果を返す
		return resultCompareDay;
	}
}