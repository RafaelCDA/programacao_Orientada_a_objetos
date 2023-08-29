package atividade3.Estoque;

 class Item {
    private String nome;
    private int qtd;

public Item(String nome, int qtd){
this.nome=nome;
this.qtd=qtd;
}
public String nome(){
    return nome;
}

public int qtd(){
    return qtd;
}

public void atualizar(int nqtd){
    this.qtd=nqtd;
    
    }
    public String toString() {
        return "Item: " + nome + " | quantidade: " + qtd;
}


















}
