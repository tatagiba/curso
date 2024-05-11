package br.gov.caixa.conta.antigo.historico;

import br.gov.caixa.conta.antigo.enumeradores.Acao;

import java.util.Date;

public record HistoricoAcao(Date dataEvento, Acao acao, Double valorPretendido,
                            Double valorReal, String usuarioOrigem, String usuDestino,
                            String observacao, Boolean sucesso) {

}

