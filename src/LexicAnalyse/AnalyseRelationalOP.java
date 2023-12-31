package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseRelationalOP extends AnalyseContract {

	public boolean analyse(String lexeme, String next) {
		boolean found = true;

		if (lexeme.matches("\\==")) {
			this.tokenName = "logic_operator";
		} else if (lexeme.matches("\\<")) {
			this.tokenName = "logic_operator";
		} else if (lexeme.matches("\\>")) {
			this.tokenName = "logic_operator";
		} else if (lexeme.matches("\\<=")) {
			this.tokenName = "logic_operator";
		} else if (lexeme.matches("\\>=")) {
			this.tokenName = "logic_operator";
		} else if (lexeme.matches("\\!=")) {
			this.tokenName = "logic_operator";
		} else {
			found = false;
		}

		return found;
	}

}
