package kensyu01;

// 乱数を生成する為の機能を読み込む
import java.util.Random;

// 0,1,2 の何れかの乱数を生成し 値に応じてグーチョクパーを表示するクラス
public class E3_17_RockPaperScissors {
	/**
	 * マジックナンバーを避けるために
	 * switch文に使う値を設定する
	 * 
	 */
	// グーの値を設定する
	public static final int rock = 0;
	
	// チョキの値を設定する
	public static final int scissors = 1;
	
	// パーの値を設定する
	public static final int papers = 2;
	
	
	// 乱数の書く値によって 0 → グー, 1 → チョキ, 2 → パー を表示する為の処理を行う
	public static void main (String[] arg) {
		
		// 乱数を生成するオブジェクトの作成する
		Random rand = new Random();
		
		// 0 ~ 2 まで乱数を生成し、保持する
//		int rockPaperScissorsResult = rand.nextInt(3);
		// rockPaperScissorsResult は意味が広すぎるのでもう少し詳しい名前に変える
		int rockPaperScissorsResult = rand.nextInt(3);
		
		
		// 乱数の値によって処理を振り分ける
		switch ( rockPaperScissorsResult ) {
		
			// 値が0の場合、「グー」を出力する
			case rock : System.out.println("グー");
					 // 処理を終了する
					 break;
			
			// 値が1の場合、「チョキ」を出力する
			case scissors : System.out.println("チョキ");
					 // 処理を終了する
					 break;
			
			// 値が2の場合、「パー」を出力する
			case papers : System.out.println("パー");
					 // 処理を終了する
					 break;
			
		}
		
		
	}
}
