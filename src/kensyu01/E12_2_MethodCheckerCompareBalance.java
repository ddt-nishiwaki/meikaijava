package kensyu01;

// 共有定数を読み込む
import static kensyu01.commonConstants.*;

/**************************************************
	クラス
**************************************************/
/*
 *  銀行口座クラスの残高を比較して結果を返すメソッドを検証するクラス
 */
public class E12_2_MethodCheckerCompareBalance {

	/**************************************************
		定数(口座作成用)
	**************************************************/
	// 普通口座用名義を設定する
	private static final String NAME_NOMAL_ACCOUNT = "普通預金口座";
	// 定期預金付き口座用名義を設定する
	private static final String NAME_TIME_ACCOUNT = "定期預金付き口座";
	// 普通口座用の口座番号を設定する
	private static final String NOMAL_ACCOUNT_NUMBER = "1111111";
	// 定期預金付き口座用の口座番号を設定する
	private static final String TIME_ACCOUNT_NUMBER = "2222222";

	// 普通預金用口座の残高を設定する
	private static final int NOMAL_ACCOUNT_BALANCE = 10000000;
	// 定期預金付き口座の普通預金残高を設定する
	private static final int TIME_ACCOUNT_BALANCE = 5000000;
	// 定期預金付き口座の定期預金残高を設定する
	private static final int TIME_ACCOUNT_TIME_BALANCE = 5000000;
	
	
	/**************************************************
		定数(出力メッセージ)
	**************************************************/
	// 比較結果が二つ目の口座より多い場合のメッセージを設定する
	private static final String MESSAGE_OUTPUT_RESULT_UPPER = "二つ目の口座より残高が多いです";
	// 比較結果が二つ目の口座より少ない場合のメッセージを設定する
	private static final String MESSAGE_OUTPUT_RESULT_LOWER = "二つ目の口座より残高が少ないです";
	// 比較結果が二つ目の口座と同じ場合のメッセージを設定する
	private static final String MESSAGE_OUTPUT_RESULT_SAME = "二つ目の口座と残高が同じです";
	
	
	/**************************************************
		クラスメソッド
	**************************************************/
	/*
	 * 普通預金、定期預金を合わせた残高を取得するメソッドを設定する
	 * 
	 * 定期預金がない場合は普通預金残高のみを返す
	 */
	private static long mGetTotalBalance(BankAccount account){
		// 総残高を設定する変数を宣言する
		long totalBalance;
		// 普通預金残高を総残高に設定する
		totalBalance = account.mGetBalance();
		// もし定期預金付き口座だった場合の処理を行う
		if(account instanceof TimeBankAccount){
			totalBalance += ( (TimeBankAccount)account ).mGetTimeBalance();
		}
		// 総残高を返す
		return totalBalance;
	}
	/*
	 *  二つの銀行口座の残高を比較した結果を返すメソッドを設定する
	 *  
	 *  第一引数 < 第二引数  -> -1
	 *  第一引数 = 第二引数  -> 0
	 *  第一引数 > 第二引数  -> 1
	 */
	private static int mCompareBalance(BankAccount firstAccount, BankAccount secondAccount){
		// 比較結果を保持する変数を宣言する
		int resultCompare;
		// 一つ目の口座の総残高を取得する
		long firstTotalBalance = mGetTotalBalance(firstAccount);
		// 二つ目の口座の総残高を取得する
		long secondTotalBalance = mGetTotalBalance(secondAccount);

		// 比較結果が大きい場合は 1 を,それ以外は 0 を設定する
		resultCompare = (firstTotalBalance > secondTotalBalance) ? NUMBER_COMPARE_UPPER : NUMBER_COMPARE_SAME;
		// 比較結果が小さい場合は - 1 を,それ以外は 0 を比較結果に保持する
		resultCompare = (firstTotalBalance < secondTotalBalance) ? NUMBER_COMPARE_LOWER : NUMBER_COMPARE_SAME;

		// 比較結果を返す
		return resultCompare;

	}

	/**************************************************
		メインプロセス
	**************************************************/
	// 残高比較用メソッドを作成し、実行検証する処理を行う
	public static void main(String[] arg){
		/**************************************************
			銀行口座を作成する
		**************************************************/
		// 一つ目の口座を普通預金のみで作成する
		BankAccount firstAccount = new BankAccount(NAME_NOMAL_ACCOUNT,NOMAL_ACCOUNT_NUMBER,NOMAL_ACCOUNT_BALANCE);
		// 二つ目の口座を定期預金付きで作成する
		BankAccount secondAccount = new TimeBankAccount(NAME_TIME_ACCOUNT,TIME_ACCOUNT_NUMBER,TIME_ACCOUNT_BALANCE,TIME_ACCOUNT_TIME_BALANCE);
		
		/**************************************************
			銀行口座総残高を比較する
		**************************************************/
		// 普通預金口座と定期預金付き口座の総残高を比較した結果を保持する
		int resultCompareBalance = mCompareBalance(firstAccount, secondAccount);
		
		/**************************************************
			比較結果を出力する
		**************************************************/
		// 総残高の比較結果に応じて処理を振り分ける
		switch (resultCompareBalance){
			// 第一引数の口座の総残高が大きい場合の処理を行う
			case NUMBER_COMPARE_UPPER :
				// 残高が多いことを示すメッセージを出力する
				System.out.println(MESSAGE_OUTPUT_RESULT_UPPER);
				// 処理を抜ける
				break;
			// 第一引数の口座の総残高が小さい場合の処理を行う
			case NUMBER_COMPARE_LOWER :
				// 残高が少ないことを示すメッセージを出力する
				System.out.println(MESSAGE_OUTPUT_RESULT_LOWER);
				// 処理を抜ける
				break;
			// 第一引数の口座の総残高が同じ場合の処理を行う
			case NUMBER_COMPARE_SAME :
				// 残高が同じことを示すメッセージを出力する
				System.out.println(MESSAGE_OUTPUT_RESULT_SAME);
				// 処理を抜ける
				break;
		}
	}
}
