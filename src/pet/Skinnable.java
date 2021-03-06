package pet;

/**
 * 着せ替えを行うインターフェース
 * 着せ替えの色、柄を示す値を定義しています
 * 着せ替えを行うメソッドの実装を強制します
 * @author wakkky05
 *
 */
public interface Skinnable {
	/*******************************
		定数
	*******************************/
	int BLACK = 0;		// 黒
	int RED = 1;		// 赤
	int GREEN = 2;		// 緑
	int BLUE = 3;		// 青
	int LEOPARD = 4;	// ヒョウ柄

	/*******************************
		メソッド
	*******************************/
	/*
	 * 着せ替えを行うメソッドの実装をインスタンスに任せる
	 */
	public void mChangeSkin(int skin);
}
