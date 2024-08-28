package Serviços;

import java.util.List;

import Entidades.Sala;
import InterfaceRepositorio.ISalaRepository;
import InterfacesdeServiço.ISalaService;

public class SalaService implements ISalaService {
    private ISalaRepository salaRepository;

    public SalaService(ISalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    @Override
    public void cadastrarSala(Sala sala) {
        salaRepository.adicionarSala(sala);
    }

    @Override
    public Sala buscarSala(int numero) {
        return salaRepository.buscarSala(numero);
    }

    @Override
    public void atualizarSala(Sala sala) {
        salaRepository.atualizarSala(sala);
    }

    @Override
    public void atualizarSala(int numero, int novaCapacidade) {
        Sala sala = salaRepository.buscarSala(numero);
        if (sala != null) {
            sala.setCapacidade(novaCapacidade);
            salaRepository.atualizarSala(sala);
        } else {
            System.out.println("Sala não encontrada.");
        }
    }

    @Override
    public void removerSala(int numero) {
        salaRepository.removerSala(numero);
    }

    @Override
    public List<Sala> listarSalas() {
        return salaRepository.listarTodos();
    }

}