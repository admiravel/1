package Serviços;

import java.util.List;
import Entidades.Plano;
import InterfacesdeServiço.IPlanoService;
import Repositorio.PlanoRepository;

public class PlanoService implements IPlanoService {
    private PlanoRepository planoRepository;

    public PlanoService(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    @Override
    public void cadastrarPlano(Plano plano) {
        planoRepository.adicionarPlano(plano);
    }

    @Override
    public Plano buscarPlano(String nome) {
        return planoRepository.buscarPlano(nome);
    }

    @Override
    public void atualizarPlano(Plano plano) {
        planoRepository.atualizarPlano(plano);
    }

    @Override
    public void removerPlano(String nome) {
        planoRepository.removerPlano(nome);
    }

    @Override
    public List<Plano> listarPlanos() {
        return planoRepository.listarTodos();
    }

    @Override
    public void cadastrarPlano1(Plano plano) {
        // Implementação do método cadastrarPlano1
    }

    @Override
    public void atualizarPlano1(Plano plano) {
        // Implementação do método atualizarPlano1
    }
}