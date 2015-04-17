package iut.tdd;

public class Convert {

	public Convert() {

	}

	public static String num2text(String input) {
		int taille = input.length();
		String res;
		switch (input) {
		case "0":
			return "zéro";
		case "1":
			return "un";
		case "2":
			return "deux";
		case "3":
			return "trois";
		case "4":
			return "quatre";
		case "5":
			return "cinq";
		case "6":
			return "six";
		case "7":
			return "sept";
		case "8":
			return "huit";
		case "9":
			return "neuf";
		case "10":
			return "dix";
		case "11":
			return "onze";
		case "12":
			return "douze";
		case "13":
			return "treize";
		case "14":
			return "quatorze";
		case "15":
			return "quinze";
		case "16":
			return "seize";
		case "17":
			return "dix-sept";
		case "18":
			return "dix-huit";
		case "19":
			return "dix-neuf";

		}
		return null;
	}

	public static String text2num(String input) {
		return null;
	}
}