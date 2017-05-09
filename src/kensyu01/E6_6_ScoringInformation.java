package kensyu01;

// 入力を扱う機能を読み込む
import java.util.Scanner;


/*************************************************************/

// 指定した人数の点数を設定し、合計点、平均点、最高点、最低点を出力するクラス
public class E6_6_ScoringInformation {

	// 数値型変数を初期化する値を設定する
	public static final int INITIALIZE_NUMERIC = 0;
	// 採点人数の設定を求めるメッセージを設定する
	public static final String REQUEST_TIMES_MARKING = "採点人数を設定してください";
	// 採点を求める文字列のフォーマットを設定する
	public static final String REQUEST_SCORE_FORMAT = "%d番目の点数 : ";
	
	
	/*************************************************************/

	// 指定した人数の点数を設定し、合計点、平均点、最高点、最低点を出力する処理を行う
	public static void main(String[] arg) {
		
		// 採点人数を保持する変数を初期化する
		int timesScoring = INITIALIZE_NUMERIC;
		// 合計点を求めるための変数を初期化する
		int sumResult = INITIALIZE_NUMERIC;
		// 平均点を求めるための変数を初期化する
		float averageResult = INITIALIZE_NUMERIC;
		// 最高点を求めるための変数を初期化する
		int highScoreResult = INITIALIZE_NUMERIC;
		// 平均点を求めるための変数を初期化する
		int lowestScoreResult = INITIALIZE_NUMERIC;
		

		/*************************************************************/

		// 採点に関する入力を扱うオブジェクトを作成する
		Scanner markingInput = new Scanner(System.in);
		// 採点人数の設定を求めるメッセージを出力する
		System.out.println(REQUEST_TIMES_MARKING);
		// 入力された人数を変数に保持する
		timesScoring = markingInput.nextInt();
		
		// 人数分の採点を格納する配列を作成する
		int[] scoringArray = new int[timesScoring];
		// 配列にそれぞれ点数を設定させる処理を行う
		for ( int count = INITIALIZE_NUMERIC; count < timesScoring; count++ ){
			// 採点入力を求める文字列を出力する
			System.out.printf(REQUEST_SCORE_FORMAT, count);
			// 入力された点数を配列に格納する
			scoringArray[count] = markingInput.nextInt();
		}
		
		// 点数を格納した配列を走査する	
		for ( int count = INITIALIZE_NUMERIC; count < timesScoring; count++ ) {
			int thisScore = scoringArray[count];
			// 合計点を求める
			sumResult += thisScore;
			// 最高点を求める
			highScoreResult = highScoreResult < thisScore ? thisScore : highScoreResult; 
			// 最低点を求める
			if( count == 0 ) {
				lowestScoreResult = thisScore;
			} else {
				lowestScoreResult = lowestScoreResult > thisScore ? thisScore : lowestScoreResult;
			}
		}
		// 平均点を求める
		averageResult = (float)sumResult/timesScoring;
		
		// 合計点を表示する
		System.out.printf("合計点は%dです\n", sumResult);
		// 平均点を表示する
		System.out.printf("平均点は%3.2fです\n", averageResult);
		// 最高点を出力する
		System.out.printf("最高点は%dです\n", highScoreResult);
		// 最低点を出力する
		System.out.printf("最低点は%dです\n", lowestScoreResult);
		

		/*************************************************************/

		// 採点に関する入力ストリームを閉じる
		markingInput.close();
		
	}
}
