package Serviços;

import java.util.List;

import Entidades.Membro;
import InterfaceRepositorio.IMembroRepository;
import InterfacesdeServiço.IMembroService;

public class MembroService implements IMembroService {
    private IMembroRepository membroRepository;

    public MembroService(IMembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    @Override
    public void cadastrarMembro(Membro membro) {
        membroRepository.adicionarMembro(membro);
    }

    @Override
    public Membro buscarMembro(int id) {
        return membroRepository.buscarMembro(id);
    }

    @Override
    public void atualizarMembro(Membro membro) {
        membroRepository.atualizarMembro(membro);
    }

    @Override
    public void removerMembro(int id) {
        membroRepository.removerMembro(id);
    }

    @Override
    public List<Membro> listarMembros() {
        return membroRepository.listarTodos();
    }

    @Override
    public void cadastrarMembro1(Membro membro) {
       
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarMembro1'");
    }

    @Override
    public void atualizarMembro1(Membro membro) {
       
        throw new UnsupportedOperationException("Unimplemented method 'atualizarMembro1'");
    }

}
