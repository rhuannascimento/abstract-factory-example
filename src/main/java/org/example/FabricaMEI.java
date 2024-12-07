package org.example;

public class FabricaMEI implements FabricaAbstrata{

    @Override
    public Cnpj createCnpj() {
        return new CnpjMEI();
    }

    @Override
    public Modalidade getModalidade() {
        return new ModalidadeMEI();
    }
}
