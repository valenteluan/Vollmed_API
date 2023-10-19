package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciete(
        @NotNull Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
