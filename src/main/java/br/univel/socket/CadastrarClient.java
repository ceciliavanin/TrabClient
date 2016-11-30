package br.univel.socket;

/**
 * 
 * Interface com o método para que seja enviada a mensagem para o server
 * 
 */
import java.io.IOException;

import br.univel.dto.MensagemComun;

public interface CadastrarClient {

	Boolean enviandoMensagem(final MensagemComun mensagem) throws IOException;
}
