package lanchonete.view;

import java.util.List;

import lanchonete.model.UsuarioModel;

public class UsuarioView {
	
	public void listarUsuarios(List<UsuarioModel> lista) {
		System.out.println(
				"---------------------------------------- Lista de Usu�rios -------------------------------------");
		if(!lista.isEmpty()) {
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("C�digo: " + lista.get(i).getCod_user());
				System.out.print("Perfil: "); System.out.println(lista.get(i).getPerfil_user() == 1 ? "Propriet�rio" : "Funcion�rio"); 
				System.out.println("Nome: " + lista.get(i).getNome_user());
				
				System.out.println("CPF: " + lista.get(i).getCpf_user());
				System.out.println("Login: " + lista.get(i).getLogin_user());
				System.out.println("N�vel alerta de estoque: " + lista.get(i).getQtd_alerta_estoque());
				if (i != lista.size() - 1) {
					System.out.println(
							"------------------------------------------------------------------------------------------------");
				}
			}
		} else {
			System.out.println("Nenhum usu�rios encontrado.");
		}
		System.out.println(
				"------------------------------------------------------------------------------------------------");

	}
}