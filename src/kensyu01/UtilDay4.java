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
// Day4 定数クラスを読み込む
import static kensyu01.DayConstants.*;

/*************************************************
	Day4ユーティリティークラス
**************************************************/
// Day4のユーティリティークラスを設定する
public class UtilDay4 {

	/**
	 * 以下4つのメソッドは日付データを変更したい時に使用する
	 * 
	 * 存在しない日付にならないよう調整するために
	 * カレンダークラスのオブジェクトとして設定後
	 * そのオブジェクトを返す
	 */
	/************************************************
		現在時刻を設定するメソッドを設定する
	*************************************************/
	protected static GregorianCalendar sGetCalendar(){
		// 現在時刻を取得するためのオブジェクトを作成して返す
		return new GregorianCalendar();
	}
	
	/************************************************
		指定年/初月/初日を設定するメソッドを設定する
	*************************************************/
	protected static GregorianCalendar sGetCalendar(int year){
		// 指定年を設定したオブジェクトを返す
		return new GregorianCalendar(year,NUMBER_FIRST_DATE + NUMBER_UNDO_FORMATING_MONTH,NUMBER_FIRST_DATE);
	}
	
	/************************************************
		指定年/指定月/初日を設定するメソッドを設定する
	*************************************************/
	protected static GregorianCalendar sGetCalendar(int year, int month){
		// 指定年月を設定したオブジェクトを返す
		return new GregorianCalendar(year,month + NUMBER_UNDO_FORMATING_MONTH,NUMBER_FIRST_DATE);
	}
	
	/************************************************
		指定年/指定月/指定日を設定するメソッドを設定する
	*************************************************/
	protected static GregorianCalendar sGetCalendar(int year, int month, int date){
		// 指定年月を設定したオブジェクトを返す
		return new GregorianCalendar(year,month + NUMBER_UNDO_FORMATING_MONTH,date);
	}
	
	
	
	
	/**
	 * 以下のメソッドはコンストラクタに次の機能を追加するために設定
	 * 
	 * 月日の入力が不正な場合 ( -1日, 13月 など )は
	 * 1以下の場合なら1として
	 * 最大値を超えていた場合は最大値として
	 * 設定するために使用する
	 */
	/********************************************************
		月の設定が 1 以下の場合は 1 として返すメソッドを設定する
	*********************************************************/
	protected static int slimitMinumumMonth(int month){
		// 月の設定が 1 以下の時の場合は、1 として返す
		return ( month < NUMBER_FIRST_DATE) ? NUMBER_FIRST_DATE : month;
	}

	/********************************************************
		月の設定が 12 以上の場合は 12 として返すメソッドを設定する
	*********************************************************/
	protected static int slimitMaxMonth(int month){
		// 月の設定が 12 以上の時の場合は, 12 として返す
		return ( month > NUMBER_MONTH_UPPER_LIMIT) ? NUMBER_MONTH_UPPER_LIMIT : month ;
	}

	/********************************************************
		月の設定が 不正な場合は適当な値に設定するメソッドを設定する
	*********************************************************/
	protected static int slimitRangeMonth(int month){
		// 返す月を設定する変数を宣言する
		int settingMonth = month;
		// 1 以下の時は 1 として設定する
		settingMonth = slimitMinumumMonth(month);
		// 12 以上の時は 12 として設定する
		settingMonth = slimitMaxMonth(month);
		// 設定した月を返す
		return settingMonth;
	}

	/********************************************************
		日の設定が 1 以下の場合は 1 として返すメソッドを設定する
	*********************************************************/
	protected static int slimitMinumumDate(int date){
		// 日の設定が 1 以下の時は 1 として返す
		return ( date < NUMBER_FIRST_DATE) ? NUMBER_FIRST_DATE : date;
	}

	/********************************************************
		日の設定が 月末日 以上の場合は 月末日 として返すメソッドを設定する
	*********************************************************/
	protected static int slimitMaxDate(int date, GregorianCalendar day){
		// 月末日を取得する
		int lastDayOfMonth = sGetlastDayMonth(day);
		// 日の設定が 月末日 以上の時は 月末日 として返す
		return ( date > lastDayOfMonth) ? lastDayOfMonth : date;
	}

	/********************************************************
		日の設定が不正な場合は適当な値を返すメソッドを設定する
	*********************************************************/
	protected static int slimitRangeDate(int date, GregorianCalendar day){
		// 返す日を設定する変数を設定する
		int settingDay = date;
		// 日付が 1 以下の時は 1 を設定する
		settingDay = slimitMinumumDate(settingDay);
		// 日付が月末日 以上の時は 月末日 として設定する
		settingDay = slimitMaxDate(settingDay, day);
		// 日付を設定した日に再設定する
		day.set(DATE, settingDay);
		// 設定した日付を返す
		return settingDay;
	}

	/********************************************************
		月末日を取得するメソッドを設定する
	*********************************************************/
	// 設定されている月の月末日を取得するメソッドを設定する
	protected static int sGetlastDayMonth(GregorianCalendar day){
		//　月末日を取得し返す
		return day.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
	}
	// 設定されている年の指定月の月末日を取得するメソッドを設定する
	protected static int sGetlastDayMonth(GregorianCalendar day,int month){
		// 月を変更した日付を取得するための変数を初期化する
		GregorianCalendar dayGetLastDay = new GregorianCalendar(day.get(YEAR), month, NUMBER_FIRST_DATE);
		//　月末日を取得し返す
		return dayGetLastDay.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
	}

	
	
	/**
	 * 以下メソッドは年内での日数計算を行うために設定
	 * 
	 */
	/************************************************
		年内での経過日数を取得するメソッドを設定する
	*************************************************/
	protected static int sGetElapsedDate(GregorianCalendar day) {
		// 日付をカウントするための変数を初期化する
		int dayCount = INITIALIZE_ZERO;
		// 設定されている月を取得する
		int settingMonth = day.get(MONTH);
		// 設定されている日を取得する
		int settingDate = day.get(DATE);
		// 1月から先月までの月数分処理を行う
		for (int monthCount = JANUARY; monthCount < settingMonth; monthCount++) {
			// 各月の月末日を取得して経過日数に加算する
			dayCount += sGetlastDayMonth(day, monthCount);
		}
		// 設定された日付を経過日数に追加する
		dayCount += settingDate;
		// 経過日数を返す
		return dayCount;
	}
	
	/************************************************
		一年の日数を取得して返すメソッドを設定する
	*************************************************/
	protected static int sGetDaysOfYear (GregorianCalendar day){
		// 一年の日数を設定するための変数を初期化する
		int daysOfYear = INITIALIZE_ZERO;
		// 1月から12月までの各日数を取得して一年の日数をカウントする
		for (int monthCount = JANUARY; monthCount <= DECEMBER; monthCount++) {
			// 月末日を取得して日数にカウントする
			daysOfYear += sGetlastDayMonth(day, monthCount);
		}
		return daysOfYear;
	}
	
	/************************************************
		年を比較するメソッドを設定する
	*************************************************/
	protected static int sCompareYear(GregorianCalendar targetDay, GregorianCalendar compareDay){
		// 返り値を設定するための変数を宣言する
		int resultCompareYear;
		// 引数と比べて後ろの年かそうでないかを比較する
		resultCompareYear = (targetDay.get(YEAR ) > compareDay.get(YEAR)) ? NUMBER_DAY_COMPARE_AFTER : NUMBER_DAY_COMPARE_BEFORE;
		// 引数と比べて同じ年かそうでないかを比較する
		resultCompareYear = (targetDay.get(YEAR ) == compareDay.get(YEAR)) ? NUMBER_DAY_COMPARE_SAME : resultCompareYear;
		// 比較結果を返す
		return resultCompareYear;
	}
	
	
	
	/**
	 * toStringメソッド内で曜日を表示するために設定
	 */
	/************************************************
		曜日を取得するメソッドを設定する
	*************************************************/
	protected static int sDayOfWeek(Day4 day){
		// 設定されている年を保持する
		int year = day.mGetYear();
		// 設定されている月を保持する
		int month = day.mGetMonth();
		// 設定されている日を保持する
		int date = day.mGetDate();
		// ツェラーの公式より1,2月の場合は 13,14 月として設定する
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
				+ (ZELLERS_THIRTEEN * month + ZELLERS_EIGHT) / ZELLERS_FIVE + date) % ZELLERS_SEVEN;
	}
}
