package LexicAnalyse;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

	private List<Token> tokenTable;

	public SymbolTable() {
		this.tokenTable = new ArrayList<Token>();
	}

	// Adicionando um token à tabela.
	public void add(Token token) {
        tokenTable.add(token);
    }
	
	//RESUMO: retorna o token na posição i da tabela. (COM ISSO EU VOU SABER A (quantidade de tokens pelas posições) 
	//Obtendo o token na posição i da tabela.
	public Token getToken(int i) {
		Token object = this.tokenTable.get(i);
		return object;
	}
	
	//Retornando o tamanho da tabela (quantidade de tokens).
	public int getSize() {
		int size = this.tokenTable.size();
		return size;
	}
	
	//Removendo o token na posição index.
	public void removeToken(int index) {
		tokenTable.remove(index);
	}

	// Retornando a lista de tokens.
	public List<Token> getList() {
        return this.tokenTable;
    }
	
	public String toString() {
    	
    	String object = "+";
        for (int i = 1; i < 60; i++) {
            if (i == 15) {
                object += "|";
                continue;
            }
            object += "-";
        }
        object +="+\n";

        object += "Entrada" + " : " + "Informacoes" + "\n";

        for (int i = 0; i < tokenTable.size(); i++) {
        	object += tokenTable.get(i).toString() + "\n";
        }

        object += "+";
        for (int i = 1; i < 60; i++) {
            if (i == 15) {
            	object += "|";
                continue;
            }
            object += "-";
        }
        object += "+";
        
        return object;
    }	
}
