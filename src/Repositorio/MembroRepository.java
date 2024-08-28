package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Entidades.Membro;
import InterfaceRepositorio.IMembroRepository;

public class MembroRepository implements IMembroRepository {
    private List<Membro> membros = new ArrayList<>();

    @Override
    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    @Override
    public Membro buscarMembro(int id) {
        for (Membro membro : membros) {
            if (membro.getId() == id) {
                return membro;
            }
        }
        return null;
    }

    @Override
    public void atualizarMembro(Membro membro) {
        for (int i = 0; i < membros.size(); i++) {
            if (membros.get(i).getId() == membro.getId()) {
                membros.set(i, membro);
                return;
            }
        }
    }

    @Override
    public void removerMembro(int id) {
        membros.removeIf(membro -> membro.getId() == id);
    }

    @Override
    public List<Membro> listarTodos() {
        return new ArrayList<>(membros);
    }
}