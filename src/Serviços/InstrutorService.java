package Serviços;

import java.util.List;

import Entidades.Instrutor;
import InterfaceRepositorio.IInstrutorRepository;
import InterfacesdeServiço.IInstrutorService;

public class InstrutorService implements IInstrutorService {
    private IInstrutorRepository instrutorRepository;

    public InstrutorService(IInstrutorRepository instrutorRepository) {
        this.instrutorRepository = instrutorRepository;
    }

    @Override
    public void cadastrarInstrutor1(Instrutor instrutor) {
        instrutorRepository.adicionarInstrutor(instrutor);
    }

    @Override
    public Instrutor buscarInstrutor(String cpf) {
        return instrutorRepository.buscarInstrutor(cpf);
    }

    @Override
    public void atualizarInstrutor1(Instrutor instrutor) {
        instrutorRepository.atualizarInstrutor(instrutor);
    }

    @Override
    public void removerInstrutor(String cpf) {
        instrutorRepository.removerInstrutor(cpf);
    }

    @Override
    public List<Instrutor> listarInstrutores() {
        return instrutorRepository.listarTodos();
    }

	@Override
	public void cadastrarInstrutor(Instrutor instrutor) {
		
	}

	@Override
	public void atualizarInstrutor(Instrutor instrutor) {
		
	}
}