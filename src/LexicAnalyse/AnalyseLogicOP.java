package LexicAnalyse;

import LexicAnalyse.Contract.AnalyseContract;

public class AnalyseLogicOP extends AnalyseContract {

	public boolean analyse(String lexeme, String next) {
		boolean found = true;

		if (lexeme.matches("\\&{2}")) {
			this.tokenName = "logic_operator";
		} else if (lexeme.matches("\\|{2}")) {
			this.tokenName = "logic_operatore";
		} else if (lexeme.matches("\\!")) {
			this.tokenName = "logic_operator";
		} else {
			found = false;
		}

		return found;
	}

}
