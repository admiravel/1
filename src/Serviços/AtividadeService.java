package Serviços;

import java.util.List;

import Entidades.Atividade;
import InterfaceRepositorio.IAtividadeRepository;
import InterfacesdeServiço.IAtividadeService;

public class AtividadeService implements IAtividadeService {
    private IAtividadeRepository atividadeRepository;

    public AtividadeService(IAtividadeRepository atividadeRepository) {
        this.atividadeRepository = atividadeRepository;
    }

    @Override
    public void cadastrarAtividade(Atividade atividade) {
        atividadeRepository.adicionarAtividade(atividade);
    }

    @Override
    public Atividade buscarAtividade(String nome) {
        return atividadeRepository.buscarAtividade(nome);
    }

    @Override
    public void atualizarAtividade(Atividade atividade) {
        atividadeRepository.atualizarAtividade(atividade);
    }

    @Override
    public void removerAtividade(String nome) {
        atividadeRepository.removerAtividade(nome);
    }

    @Override
    public List<Atividade> listarAtividades() {
        return atividadeRepository.listarTodos();
    }

}