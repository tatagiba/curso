package br.gov.caixa.conta.historico;

import br.gov.caixa.conta.enumeradores.Acao;

import java.util.Date;

public record HistoricoAcao(Date dataEvento, Acao acao, Double valorPretendido, Double valorReal, String usuarioOrigem, String usuDestino, String observacao, Boolean sucesso) {

}

