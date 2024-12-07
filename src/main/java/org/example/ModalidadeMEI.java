package org.example;

public class ModalidadeMEI implements Modalidade {
    @Override
    public String emitirNotaFiscal() {
        return "NotafiscalMEI.pdf";
    }
}
