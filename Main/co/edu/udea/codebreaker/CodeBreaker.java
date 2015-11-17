package co.edu.udea.codebreaker;

public class CodeBreaker {
	String code = "1234";
	char[] splitcode;
	char[] splitcadena;


	public String breaker(String cadena) {
		String resultado = "";
		splitcode = code.toCharArray();
		splitcadena = cadena.toCharArray();
		for (int i = 0; i < 4; i++) {
			if (splitcadena[i] == splitcode[i]) {// comparar que el digito i en cadena sea igual al digito i del String code
				resultado = " X".concat(resultado);
			} else if (code.indexOf(splitcadena[i]) > -1) {//busca si el digito [i] de cadena esta en el String codigo pero no concuerda la posición
				resultado = resultado.concat(" _");
			}
		}

		return resultado;
	}

}
