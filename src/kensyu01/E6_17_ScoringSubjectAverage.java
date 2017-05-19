package kensyu01;

/*** 機能の読み込み *********************************/
//入力を扱う機能を読み込む
import java.util.Scanner;

/*** クラス *********************************/
// 6人の2科目の点数を読み込んで　科目ごとの平均点、学生ごとの平均点を求めるクラス
public class E6_17_ScoringSubjectAverage {

	/*** 定数設定 *********************************/
	// 数値型変数を初期化する値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// 学生の人数を設定する
	private static final int STUDENTS_NUMBER = 6;
	// 科目の数を設定する
	private static final int SUBJECT_NUMBER = 2;
	// 学生リストを設定する
	private static final String[] LIST_STUDENTS = {
		"Aaron",
		"Bert",
		"Calvin",
		"Abbie",
		"Barbara",
		"Calista"
	};
	// 国語の点数を保持するインデックスを設定する
	private static final int INDEX_JAPANESE = 0;
	// 英語の点数を保持するインデックスを設定する
	private static final int INDEX_ENGLISH = 1;
	// 各科目を示すテキストを設定する
	private static final String[] LIST_SUBJECTS = {
			"国語",
			"英語"
	};
	// 国語の点数入力を求めるテキストを設定する
	private static final String MESSAGE_REQUEST_JAPANESE_SCORE = "国語 : ";
	// 英語の点数入力を求めるテキストを設定する
	private static final String MESSAGE_REQUEST_ENGLISH_SCORE = "英語 : ";
	
	
	
	/*** メソッド *********************************/
	// 6人の2科目の点数を読み込んで　科目ごとの平均点、学生ごとの平均点を求める処理を行う
	public static void main(String[] arg){
		
		/*** オブジェクト作成 *********************************/
		// 点数を入力するオブジェクトを作成する
		Scanner scannerScore = new Scanner(System.in);
		// 採点用の配列を作成する
		int[][] scoreList = new int[STUDENTS_NUMBER][SUBJECT_NUMBER];
		

		
		/*** 点数の設定 *********************************/
		// 各学生の英語と国語の点数を設定する
		for (int studentID = INITIALIZE_NUMBER; studentID < STUDENTS_NUMBER; studentID++){
			// 各学生の名前を表示する
			System.out.println(LIST_STUDENTS[studentID]);
			// 国語の採点を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_JAPANESE_SCORE);
			// 入力した値を保持する
			scoreList[studentID][INDEX_JAPANESE] = scannerScore.nextInt();
			// 英語の採点を求めるメッセージを出力する
			System.out.println(MESSAGE_REQUEST_ENGLISH_SCORE);
			// 入力した値を保持する
			scoreList[studentID][INDEX_ENGLISH] = scannerScore.nextInt();	
		}
	

		/*** 科目ごとの合計点を求める **********************************/
		// 科目ごとの合計点を求めるための配列を作成する
		int[] valueSubjectSum = new int[SUBJECT_NUMBER];
		// 各学生の点数にアクセスする
		for (int studentID = INITIALIZE_NUMBER; studentID < STUDENTS_NUMBER; studentID++ ){
			// 各科目にアクセスする
			for (int subjectCount = INITIALIZE_NUMBER; subjectCount < SUBJECT_NUMBER; subjectCount++ ){
				// 各科目の点数を加算する
				valueSubjectSum[subjectCount] =  valueSubjectSum[subjectCount] + scoreList[studentID][subjectCount];
			}
		}
		// 各科目の平均点を出力する
		for ( int subjectCount = INITIALIZE_NUMBER; subjectCount < SUBJECT_NUMBER; subjectCount++ ){
			// 科目名を出力する
			System.out.println(LIST_SUBJECTS[subjectCount] + "の平均値");
			// 科目ごとの合計点を学生の数で割った平均を出力する
			System.out.println(valueSubjectSum[subjectCount] / STUDENTS_NUMBER);
		}

		/*** 学生ごとの平均点を求める **********************************/
		// 各学生の点数にアクセスする
		for (int studentID = INITIALIZE_NUMBER; studentID < STUDENTS_NUMBER; studentID++ ){
			// 各科目の合計点を保持する変数を初期化する
			int sumScoreStudent = INITIALIZE_NUMBER;
			// それぞれの科目の点数にアクセスする
			for (int subjectCount = INITIALIZE_NUMBER; subjectCount < SUBJECT_NUMBER; subjectCount++ ){
				// 各科目の点数を加算する
				sumScoreStudent += scoreList[studentID][subjectCount];
			}
			// 学生の名前を表示する
			System.out.println(LIST_STUDENTS[studentID] + "の平均点");
			// 各学生の平均点を表示する
			System.out.println(sumScoreStudent/SUBJECT_NUMBER);
		}
		
		/*** 終了処理 *********************************/
		scannerScore.close();
	}
}
