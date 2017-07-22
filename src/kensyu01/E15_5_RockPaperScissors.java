package kensyu01;
/************************************
	インポート
************************************/
// じゃんけんを行うプレーヤークラスを読み込む
import rockpaperscissors.AbstractPlayer;
// じゃんけんを行う人間プレーヤークラスを読みこむ
import rockpaperscissors.HumanPlayer;
// じゃんけんを行うコンピュータークラスを読みこむ
import rockpaperscissors.ComputerPlayer;
// 全パッケージ共有のメソッドを読み込む
import static common.CommonMethods.*;
/**
 * じゃんけんを行うクラス
 * プレーヤーは3人中2人をコンピューターとする
 * @author wakkky05
 * 
 */
public class E15_5_RockPaperScissors {
	/*******************************************
		定数(String)
	*******************************************/
	private static final String MESSAGE_PROCESS = "じゃんけんを開始します";
	private static final String DRAW_GAME = "引き分けです";
	private static final String WIN_GAME = "あなたの勝ちです";
	private static final String LOSE_GAME = "あなたの負けです";
	// テキス「グー」を設定する
	private static final String TEXT_ROCK = "グー";
	// テキス「チョキ」を設定する
	private static final String TEXT_SCISSERS = "チョキ";
	// テキス「パー」を設定する
	private static final String TEXT_PAPER = "パー";
	private static final String MESSAGE_REQUEST_CONTINUE_END = "じゃんけんを続けますか?";
	// 各プレーヤーの手を確認するテキストフォーマットを設定する
	private static final String FORMAT_OUTPUT_HANDS = "あなた : %s  ,  他プレーヤー1 : %s  ,  他プレーヤー2 : %s\n";
	/*******************************************
		定数(数値)
	*******************************************/
	// 引き分けをしめす値を設定します
	private static final int NUMBER_DRAW = -1;
	// グーを示す値を設定する
	private static final int COMMAND_ROCK = 1;
	// チョキを示す値を設定する
	private static final int COMMAND_SCISSERS = 2;
	// パーを示す値を設定する
	private static final int COMMAND_PAPER = 3;
	// 手を次の手にシフトする値を設定する
	private static final int SHIFT_NEXT_HAND = 1;
	// じゃんけんの手の種類の数を設定する
	private static final int NUMBER_HANDS_TYPES = 3;
	// じゃんけんを終了するための値を設定する
	private static final int NUMBER_GAME_END = 0;

	/**************************************
		クラス変数
	**************************************/
	// 決定した手を示す文字列を設定する
	private static String[] sTextPlayerHand = {
		TEXT_ROCK,	
		TEXT_SCISSERS,	
		TEXT_PAPER
	};

	/**************************************
		メインプロセス
	**************************************/
	/**
	 * 3プレーヤーを作成しじゃんけんを行います
	 */
	public static void main(String[] arg){
		// 人間プレーヤーを作成する
		AbstractPlayer humanPlayer = new HumanPlayer();
		// コンピュータープレーヤー1を作成する
		AbstractPlayer computerPlayer1 = new ComputerPlayer();
		// コンピュータープレーヤー2を作成する
		AbstractPlayer computerPlayer2 = new ComputerPlayer();
		
		// じゃんけんを行う
		playGame(humanPlayer, computerPlayer1, computerPlayer2);
	}

	/**************************************
		クラスメソッド
	**************************************/
	/**
	 * じゃんけんを行います
	 */
	private static void playGame(AbstractPlayer myPlayer,AbstractPlayer otherPlayer1,AbstractPlayer otherPlayer2){
		int command;	// プレイを続けるかどうか決めるコマンドを保持する変数です
		// じゃんけんを繰り返します
		do {
			// プレーヤー1の手を決定します
			int myHands = myPlayer.decideHand();
			// プレーヤー2の手を決定します
			int other1Hands = otherPlayer1.decideHand();
//			int other1Hands = 2;
			// プレーヤー3の手を決定します
			int other2Hands = otherPlayer2.decideHand();
//			int other2Hands = 3;
			// 各プレーヤーの手を確認します
			System.out.printf(FORMAT_OUTPUT_HANDS, sTextPlayerHand[--myHands],
					sTextPlayerHand[--other1Hands],sTextPlayerHand[--other2Hands]);
			// 勝負した結果を表示します
			System.out.println( getGameResult(myHands, other1Hands, other2Hands) );
			// プレイを続けるか入力を求める
			System.out.println(MESSAGE_REQUEST_CONTINUE_END);
		// 終了コマンドが入力されるまで繰り返す
		} while(inputYesOrNo() != NUMBER_GAME_END);
	}
	/**
	 * 3人でのじゃんけんの勝敗を文字列で返します
	 * @return String
	 */
	private static String getGameResult(int myHand, int otherHand1, int otherHand2){
		// 勝負結果を示す文字列を設定するための変数です
		String gameResult;
		// 自分の手と異なる手を示す値を設定します
		int defferentHand = getDifferentHand(myHand, otherHand1, otherHand2);
		// 引き分けの場合の処理を行います
		if(defferentHand == NUMBER_DRAW){
			// 引き分けであることを示すメッセージを設定します
			gameResult = DRAW_GAME;
		// 勝敗が分かれる場合の処理を行います
		} else {
			// 勝敗を調べて設定します
			gameResult = getGameResult(myHand, defferentHand);
		}
		// 勝負結果を示す文字列を返します
		return gameResult;
	}
	/**
	 * 一対一のじゃんけんの勝敗をメッセージで返します
	 * @param myHand
	 * @param otherHand
	 * @return String
	 */
	private static String getGameResult(int myHand, int otherHand){
		String gameResultMessage;		// 勝敗を示すメッセージを設定します
		// 引き分けの場合の処理を行う
		if( myHand == otherHand ) {
			gameResultMessage = DRAW_GAME;
		// 勝っている場合の処理を行う
		} else if ( jadgeWin(myHand, otherHand) ){
			gameResultMessage = WIN_GAME;
		} else {
			gameResultMessage = LOSE_GAME;
		}
		// 勝敗を示す文字列を返します
		return gameResultMessage;
	}
	/**
	 * 自分の手と異なる手を探して返します
	 * @return int
	 */
	private static int getDifferentHand(int myHand, int otherHand1, int otherHand2){
		// 引き分けだった場合は -1 を返します
		if(jadgeDraw(myHand, otherHand1, otherHand2)){
			return NUMBER_DRAW;
		}

		int differentHand;		// 自分の手と異なる値の手を保持するための変数です
		// 他プレーヤー1と手が異なる場合の処理を行う
		if(myHand != otherHand1){
			differentHand = otherHand1;
		// 他プレーヤー2と手が異なる場合の処理を行う
		} else {
			differentHand = otherHand2;
		}
		// 自分と異なる手を示す値を返します
		return differentHand;
	}

	/**
	 * 引き分けかどうかを判定します
	 */
	private static boolean jadgeDraw(int myHand, int otherHand1, int otherHand2){
		boolean isDraw;		// 引き分けかどうかを設定するための変数です 
		// 引き分けの場合の処理を行います
		if( ( myHand == otherHand1 && myHand == otherHand2 ) || ( myHand != otherHand1 && myHand != otherHand2 && otherHand1 != otherHand2 ) ){
			// 引き分けであることを設定します
			isDraw = true;
		} else{
			// 引き分けではないことを設定します
			isDraw = false;
		}
		// 
		return isDraw;
	}
	/**
	 * じゃんけんで勝っているかどうかを判定します
	 * return @boolean
	 */
	private static boolean jadgeWin(int myHand, int otherHand){
		boolean gameResult;		// 勝っているかどうかを判定するための変数です
		// 勝ちパターンのときの相手の手を設定する
		int winPatternHand = ( myHand + SHIFT_NEXT_HAND ) % NUMBER_HANDS_TYPES;
		// 勝ちパターンの場合の処理を行う
		if(winPatternHand == otherHand){
			// 勝っている場合はtrueを設定する
			gameResult = true;
		} else {
			// 負けている場合はfalseを設定する
			gameResult = false;
		}
		// 判定結果を返す
		return gameResult;
	}
}
