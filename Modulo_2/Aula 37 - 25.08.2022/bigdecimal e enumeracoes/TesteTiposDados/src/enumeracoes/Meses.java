package enumeracoes;

public enum Meses {
    JANEIRO(1, "Janeiro", 31), 
    FEVEREIRO(2, "Fevereiro", 28), 
    MARCO(3, "Março", 31), 
    ABRIL(4, "Abril", 30), 
    MAIO(5, "Maio", 31), 
    JUNHO(6, "Junho", 30), 
    JULHO(7, "Julho", 31), 
    AGOSTO(8, "Agosto", 31), 
    SETEMBRO(9, "Setembro", 30), 
    OUTUBRO(10, "Outubro", 31),
    NOVEMBRO(11, "Novembro", 30), 
    DEZEMBRO(12, "Dezembro", 31);

    private final int numero, dias;
    private final String nome;

    Meses(int numero, String nome, int dias) {
        this.numero = numero;
        this.nome = nome;
        this.dias = dias;
    }

    public int getNumero() { 
    	return this.numero; 
    }
    
    public String getNome() { 
    	return this.nome; 
    }
    
    public int getDias() { 
    	return this.dias; 
    }
}