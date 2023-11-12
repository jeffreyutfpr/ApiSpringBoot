package com.apirastreamento.rastreamento.credential;

import lombok.AllArgsConstructor;
import lombok.Getter;



/**
 * Responsavel pela autenticacao com a API dos correios.
 */
@Getter
@AllArgsConstructor
public class CorreioCredential {

    /**
     * Identificação do cliente
     * Informado pela área comercial dos Correios na ativação do serviço.
     * Usuario é case sensitive
     */
    private final String usuario;

    /**
     * Senha do cliente
     * Informado pela área comercial dos Correios na ativação do serviço.
     * Senha é case sensitive
     */
    private final String senha;

    @Override
    public String toString() {
        return "CorreioCredential{" +
                "usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
