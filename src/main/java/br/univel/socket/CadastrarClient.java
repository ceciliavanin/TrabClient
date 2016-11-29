package br.univel.socket;

import java.io.IOException;

import br.univel.dto.MensagemComun;


public interface CadastrarClient {

	Boolean enviandoMensagem(final MensagemComun mensagem) throws IOException;
}
