package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseCaracter extends AnalyseContract {

	public boolean analyse(String lexeme, String next) {
		boolean found = true;

		this.tokenValue = lexeme;
		if (lexeme.matches("\\=")) {
			this.tokenName = "operator";
		} else if (lexeme.matches("\\(")) {
			this.tokenName = "delimiter";
		} else if (lexeme.matches("\\)")) {
			this.tokenName = "delimiter";
		} else if (lexeme.matches("\\{")) {
			this.tokenName = "delimiter";
		} else if (lexeme.matches("\\}")) {
			this.tokenName = "delimiter";
		} else if (lexeme.matches("\\,")) {
			this.tokenName = "delimiter";
		} else if (lexeme.matches("\\;")) {
			this.tokenName = "delimiter";
		} else if (lexeme.matches("\\[")) {
			this.tokenName = "delimiter";
		} else if (lexeme.matches("\\]")) {
			this.tokenName = "delimiter";
		} else {
			found = false;
		}

		return found;
	}
}
