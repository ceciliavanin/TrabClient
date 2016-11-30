package br.univel.socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Objects;
import br.univel.dto.MensagemComun;
import br.univel.dto.Recebimento;
/**
 * Esta classe envia mensagem para o Servidor, e transmite como objeto
 * @author Cecilia Vanin
 *
 */
public class ApliSocket implements CadastrarClient {

	@Override
	public Boolean enviandoMensagem(MensagemComun mensagem) throws IOException {
		Objects.requireNonNull(mensagem, "Mensagem não pode ser nula");
		Recebimento recebimento = mensagem.getRecebimento();
		Objects.requireNonNull(recebimento, "Não foi inserida mensagem para recebimento");

		try (Socket socket = new Socket(recebimento.getIp(), recebimento.getPorta());
				OutputStream output = socket.getOutputStream();
				ObjectOutputStream objectOut = new ObjectOutputStream(output)) {
			objectOut.writeObject(mensagem);
			return true;
		} catch (IOException e) {
			throw e;
		}
	}
}
