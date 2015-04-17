package iut.tdd;

public class Convert {

	public Convert() {

	}

	public static String zero2twenty(String input) {
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
		case "20":
			return "vingt";
		case "30":
			return "trente";
		case "40":
			return "quarante";
		case "50":
			return "cinquante";
		case "60":
			return "soixante";
		case "70":
			return "soixante-dix";
		case "80":
			return "quatre-vingt";
		case "90":
			return "quatre-fingt-dix";
		}
		return null;
	}

	public static String num2text(String input) {
		if (zero2twenty(input) == null && input.charAt(input.length() - 1) != 0) {
			switch (input.charAt(0)) {
			case '2':
				return zero2twenty("20") + "-"
						+ zero2twenty("" + input.charAt(1));
			case '3':
				return zero2twenty("30") + "-"
						+ zero2twenty("" + input.charAt(1));
			case '4':
				return zero2twenty("40") + "-"
						+ zero2twenty("" + input.charAt(1));
			case '5':
				return zero2twenty("50") + "-"
						+ zero2twenty("" + input.charAt(1));
			case '6':
				return zero2twenty("60") + "-"
						+ zero2twenty("" + input.charAt(1));
			case '7':
				return "soixante-dix" + "-" + zero2twenty("" + input.charAt(1));
			case '8':
				return "quatre-vingt" + "-" + zero2twenty("" + input.charAt(1));
			case '9':
				return "quatre-vingt-dix" + "-"
						+ zero2twenty("" + input.charAt(1));
			}
		}

		else {
			return zero2twenty(input);
		}

		return null;

	}

	public static String text2num(String input) {
		return null;
	}
}