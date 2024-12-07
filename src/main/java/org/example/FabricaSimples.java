package org.example;

public class FabricaSimples implements FabricaAbstrata{

    @Override
    public Cnpj createCnpj() {
        return new CnpjSimples();
    }

    @Override
    public Modalidade getModalidade() {
        return new ModalidadeSimples();
    }
}
