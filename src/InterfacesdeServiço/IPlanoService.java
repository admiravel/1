package InterfacesdeServiço;

import java.util.List;

import Entidades.Plano;

public interface IPlanoService {
    void cadastrarPlano(Plano plano);
    Plano buscarPlano(String nome);
    void atualizarPlano(Plano plano);
    void removerPlano(String nome);
    List<Plano> listarPlanos();
	void cadastrarPlano1(Plano plano);
	void atualizarPlano1(Plano plano);
}