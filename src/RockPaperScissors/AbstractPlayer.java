package rockpaperscissors;

/**
 * じゃんけんプレーヤの抽象クラス
 * 出す手の状態をフィールドで保持する
 * 1...グー / 2...チョキ / 3...パー
 * 
 * showHand
 *  人間 1,2,3 のいずれかを入力し返す
 *  コンピュータ 1~3の乱数を返す
 *  
 * @author wakkky05
 */
public abstract class AbstractPlayer {
	/**************************************
		抽象　インスタンスメソッド
	**************************************/
	/**
	 * 出す手を決めるメソッドを定義する
	 * 
	 * 1...グー / 2...チョキ / 3...パー
	 * のいずれかを返す
	 */
	public abstract int decideHand();
}
