package ac2;

import java.io.Serializable;

public class Operation  implements  Serializable {
	int nb1, nb2, resultat;
	char operation;
	
	public Operation(int nb1, int nb2, char operation) {
		this.nb1 = nb1;
		this.nb2 = nb2;
		this.operation = operation;
	}
	
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}

}
