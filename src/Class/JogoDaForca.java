package Class;

import java.util.ArrayList;

public class JogoDaForca {
    //Atributos
    private String dica;
    private String palavra;
    private char[] letras;
    private Integer contErros = 7;
    
    public JogoDaForca(String dica, String palavra) {
    this.dica = dica;
    this.palavra = palavra;
    converteChar();
    }


    public Integer getContErros() {
        return contErros;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    public char[] converteChar() {
        letras = palavra.toCharArray();
        return letras;
    }

    public String escolheLetra(char letra, String aux) {
        boolean bool = false;
        boolean sucesso = false;
        String saida = "";
        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                saida += letras[i];
                bool = true;
            } else if (aux.charAt(i) != '_') {
                saida += aux.charAt(i);
            } else {
                saida += '_';
            }

        }
        for (int i = 0; i < letras.length; i++) {
            if (saida.charAt(i) == '_') {
                sucesso = true;
            }
        }
        if (!sucesso) {
            saida = "sucesso";
        }
        if (!bool) {
            contErros--;
        }

        return saida;
    }
}
