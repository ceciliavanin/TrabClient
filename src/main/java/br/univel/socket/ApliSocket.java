package br.univel.socket;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Objects;
import br.univel.dto.MensagemComun;
import br.univel.dto.Recebimento;

public class ApliSocket implements CadastrarClient {

	@Override
	public Boolean enviandoMensagem(MensagemComun mensagem) throws IOException {
		Objects.requireNonNull(mensagem, "Message cannot be null");
		Recebimento recebimento = mensagem.getRecebimento();
		Objects.requireNonNull(recebimento, "Receiver was not set in message");

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
