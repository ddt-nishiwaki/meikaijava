package kensyu01;

/*** 機能の読み込み ***************************/
// 入力を扱う機能を読み込む
import java.util.Scanner;


/*** クラス ***************************/
// 各クラスの合計点, 平均点を計算し、出力するクラス
public class E6_19_OperationAverageScoreOfClassRoom {


	/*** 定数設定 ***************************/
	// 数値型変数を初期化するための値を設定する
	private static final int INITIALIZE_NUMBER = 0;
	// カウントの値を出力形式に変換する値を設定する
	private static final int VALUE_FORMATING_OUTPUT_NUMBER = 1;
	// クラス数の入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_LENGTH_CLASS = "クラスの数を入力してください";
	// 生徒の人数の入力を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_LENGTH_STUDENT = "%d組の人数 : ";
	// 入力内容を区切る水平線を設定する
	private static final String DRAWING_CHARACTOR_HORIZONAL = "-----------------------------";
	// 各生徒の点数の入力を求めるフォーマットを設定する
	private static final String FORMAT_REQUEST_SCORE_STUDENT = "%d組%d番の生徒の点数 : ";
	// 各クラスの点数を出力するフォーマットを設定する
	private static final String FORMAT_OUTPUT_SCORE = "  %s組   |   %3d   |   %5.2f   \n";
	// 表組みのヘッダーを出力するフォーマットを作成する
	private static final String FORMAT_TABLE_HEADER = "   %s   |   %s   |   %s\n";
	// 表組みの横線を出力するフォーマットを設定する
	private static final String MESSAGE_TABLE_HORIZONTAL = "--------+--------------------\n";
	// テキスト「組」を設定する
	private static final String TEXT_CLASS_ROOM = "組";
	// テキスト「合計」を設定する
	private static final String TEXT_SUM = "合計"; 
	// テキスト「平均」を設定する
	private static final String TEXT_AVERAGE = "平均"; 
	// 合計点、平均点の総計を出力するフォーマットを設定する
	private static final String FORMAT_OUTPUT_TOTAL_SCORE = "   計   |   %3d   |   %5.2f   \n";
	
	

	/*** メソッド ***************************/
	// 各クラスの合計点, 平均点を計算し、出力する処理を行う
	public static void main(String[] arg){

		/*** オブジェクトの作成 ***************************/
		// クラス構成の入力を扱うオブジェクトを作成する
		Scanner scannerClassRoom = new Scanner(System.in);
		// 学生の点数の入力を扱うオブジェクトを作成する
		Scanner scannerScoreStudent = new Scanner(System.in);

		/*** 変数の初期化 ***************************/
		// 教室の数を保持するための変数を初期化する
		int lengthClassRoom = INITIALIZE_NUMBER;

		/*** クラス、生徒数、スコアノートの設定 ***************************/
		// 教室の数を設定を求めるメッセージを出力する
		System.out.println(MESSAGE_REQUEST_LENGTH_CLASS);
		// 入力された教室の数を保持する
		lengthClassRoom = scannerClassRoom.nextInt();
		// クラスの数を設定する
		int[][] listClassRoomMember = new int[lengthClassRoom][];
		// スコアノートに教室の数を設定する
		int[] listClassScoreNote = new int[lengthClassRoom];
		// 各クラスの設定を行う
		for ( int classRoomCount = INITIALIZE_NUMBER; classRoomCount < lengthClassRoom; classRoomCount++) {
			// 生徒の人数を保持する変数を宣言する
			int lengthStudent = INITIALIZE_NUMBER;
			// 生徒の人数入力を求めるメッセージを出力する
			System.out.printf(FORMAT_REQUEST_LENGTH_STUDENT, classRoomCount + VALUE_FORMATING_OUTPUT_NUMBER);
			// 入力された生徒の人数を保持する
			lengthStudent = scannerClassRoom.nextInt();
			// 区切り線を出力する
			System.out.println(DRAWING_CHARACTOR_HORIZONAL);
			// 生徒の人数を設定する
			listClassRoomMember[classRoomCount] = new int[lengthStudent];
			// 各生徒の点数の設定を行う
			for(int studentCount = INITIALIZE_NUMBER; studentCount < lengthStudent; studentCount++) {
				// 点数入力を求めるメッセージを出力する
				System.out.printf(FORMAT_REQUEST_SCORE_STUDENT, classRoomCount + VALUE_FORMATING_OUTPUT_NUMBER, studentCount + VALUE_FORMATING_OUTPUT_NUMBER );
				// 点数を設定する
				listClassRoomMember[classRoomCount][studentCount] = scannerScoreStudent.nextInt();
				// スコアノートに加算する
				listClassScoreNote[classRoomCount] += listClassRoomMember[classRoomCount][studentCount];
			}
		}
		
		/*** 各クラスの合計点から平均点を計算して表に出力する ***************************/
		int scoreClassRoomSum; 				// 各クラスの合計点を保持する変数を宣言する
		float scoreClassRoomAverage;		// 各クラスの平均点を保持する変数を宣言する
		// クラスの合計点の総計を保持する変数を初期化する
		int totalSumClassRoom = INITIALIZE_NUMBER;
		// 生徒のそう人数を保持する変数を初期化する
		int totalNumberStudent = INITIALIZE_NUMBER;
		// 表のヘッダーを表示する
		System.out.printf(FORMAT_TABLE_HEADER,TEXT_CLASS_ROOM,TEXT_SUM,TEXT_AVERAGE);
		// 表組みの水平線を表示する
		System.out.printf(MESSAGE_TABLE_HORIZONTAL);
		// 各クラスの合計点と平均点を調べる
		for( int classRoomCount = INITIALIZE_NUMBER; classRoomCount < lengthClassRoom; classRoomCount++ ) {
			// 生徒の人数を調べて、その数を保持する
			int lengthStudent = listClassRoomMember[classRoomCount].length;
			// 各クラスの合計点を保持する
			scoreClassRoomSum = listClassScoreNote[classRoomCount];
			// 各教室の平均点を計算する
			scoreClassRoomAverage = (float)scoreClassRoomSum/lengthStudent;
			// 各クラスの合計点と平均点を出力する
			System.out.printf(FORMAT_OUTPUT_SCORE,
					classRoomCount + VALUE_FORMATING_OUTPUT_NUMBER,
					scoreClassRoomSum,scoreClassRoomAverage);
			// 各クラスの合計点の総計を計算する
			totalSumClassRoom += scoreClassRoomSum;
			// 各クラスの人数の総計を計算する
			totalNumberStudent += lengthStudent;
			
		}
		// 表組みの水平線を表示する
		System.out.printf(MESSAGE_TABLE_HORIZONTAL);
		// 合計点と平均点の総計を出力する
		System.out.printf(FORMAT_OUTPUT_TOTAL_SCORE,totalSumClassRoom,(float)totalSumClassRoom/totalNumberStudent );
		
		/*** 終了処理 ***************************/
		// 教室設定用入力ストリームを閉じる
		scannerClassRoom.close();
		// 点数設定用入力ストリームを閉じる
		scannerScoreStudent.close();
	}
}
