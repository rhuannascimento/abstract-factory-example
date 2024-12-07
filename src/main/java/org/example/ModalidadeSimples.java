package org.example;

public class ModalidadeSimples implements Modalidade {
    @Override
    public String emitirNotaFiscal() {
        return "NotafiscalSimples.pdf";
    }
}
