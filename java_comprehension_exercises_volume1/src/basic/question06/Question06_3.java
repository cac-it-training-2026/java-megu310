package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int amount = 0;
		int price = 100;

		System.out.println("鉛筆を購入しますか? ");
		System.out.println("はい：０、いいえ：1＞");

		String choice = reader.readLine();
		int buyFlag = Integer.parseInt(choice);
		//buyFlagが0の場合、繰り返す
		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の本数を 1 つ増やしますか？");
			System.out.print("はい：０、いいえ：1＞");

			choice = reader.readLine();
			buyFlag = Integer.parseInt(choice);
		}

		System.out.println("購入した鉛筆の本数は" + amount + "本です。");
		System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");

	}

}
