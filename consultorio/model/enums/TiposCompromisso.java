package br.com.consultorio.model.enums;

public enum TiposCompromisso {
    CONSULTA("Consulta"),
    COMPROMISSO_EXTERNO("Compromisso Externo");

    private final String descricao;

    TiposCompromisso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}