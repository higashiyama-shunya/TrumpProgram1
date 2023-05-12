package trump;

public class Card {
	//フィールド
	private int Number;
	private String Mark;

	//コンストラクタ
	public Card(int number, String mark) {
		this.Number = number;
		this.Mark = mark;
	}

	//メソッド
	//NumberとMarkを取得するメソッド
	public String getNumber() {
		return Integer.toString(this.Number);
	}

	public String getMark() {
		return this.Mark;
	}

	//大小を比較するメソッド
	public int compareTo(Card anotherCard) {
		return Integer.compare(this.Number, anotherCard.getPower());
	}

	//数値を代わりにintとして渡すメソッド
	public int getPower() {
		return this.Number;
	}

	//11以上の数値を文字表現にして返すメソッド
	public String getNewNumber() {
		if (this.Number == 11) {
			return "ジャック";
		} else if (this.Number == 12) {
			return "クイーン";
		} else if (this.Number == 13) {
			return "キング";
		} else if (this.Number >= 14) {
			return "ジョーカー";
		} else {
			return Integer.toString(this.Number);
		}
	}

	//ジョーカーを生成するメソッド
	public static Card getJoker() {
		Card card = new Card(99, "ジョーカー");
		return card;

	}

}
