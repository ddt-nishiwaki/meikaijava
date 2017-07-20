package rockpaperscissors;

/**************************************
	インポート
**************************************/
// 全パッケージ共有の定数をインポートする
import static common.CommonConstants.*;
// 乱数を扱うランブラリをインポートする
import java.util.Random;

/**************************************
	クラス
**************************************/
/**
 * じゃんけんプレーヤー(コンピュータ)クラス
 * @author wakkky05
 */
public class ComputerPlayer extends AbstractPlayer{

	/**************************************
		定数(数値)
	**************************************/
	// コマンドの最大値を設定する
	private static final int COMMAND_MAX = 2;

	/**************************************
		乱数オブジェクト
	**************************************/
	private static Random generateHand = new Random();
	
	/**************************************
		実装　インスタンスメソッド
	**************************************/
	/**
	 * 出す手を決めるメソッドを定義する
	 * 
	 * 1...グー / 2...チョキ / 3...パー
	 * のいずれかの値を返す
	 */
	public int decideHand(){
		// 入力されたコマンドを返す
		return generateHand.nextInt(COMMAND_MAX) + NUMBER_FORMAT_RAMDOM;
	};
}
