package org.projeto.alterdata.hotdogos.model.enums;


public enum Ingrediente {

    Pao,
    BatataPalha,
    Linguica,
    Salsicha,
    Codorna,
    PureDeBatata,
    Ervilha;

    public static String ingrediente (Ingrediente tipoIngrediente){
        switch (tipoIngrediente){
            case Pao:
                return "Pão";
            case BatataPalha:
                return "Batata Palha";
            case Linguica:
                return "Linguiça";
            case Salsicha:
                return "Salsicha";
            case Codorna:
                return "Ovo de Codorna";
            case PureDeBatata:
                return "Pure de Batata";
            case Ervilha:
                return "Ervilha";
            default:
                break;
        }
        return null;
    }
}
