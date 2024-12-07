package org.example;

public class PessoaJuridica {
    private Cnpj cnpj;
    private Modalidade modalidade;

    public PessoaJuridica (FabricaAbstrata fabrica) {
        this.cnpj = fabrica.createCnpj();
        this.modalidade = fabrica.getModalidade();
    }

    public String emitirNotaFiscal() {
        return this.modalidade.emitirNotaFiscal();
    }
}
