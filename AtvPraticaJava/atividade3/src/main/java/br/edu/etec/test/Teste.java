package br.edu.etec.test;

import br.edu.etec.model.SistemaControleUsuarios.NivelAcesso;
import br.edu.etec.model.SistemaControleUsuarios.Usuario;

public class Teste{

public static void main(String[] args) {
        Usuario admin = new Usuario("adminUser ", "senhaSegura", NivelAcesso.ADMIN);
        String senhaTeste = "senhaSegura";
        if (admin.autenticar(senhaTeste)) {
            System.out.println("Autenticação bem-sucedida!");
            System.out.println("Nível de acesso: " + admin.getNivel());
        } else {
            System.out.println("Falha na autenticação.");
        }


        admin.desativar();
        if (admin.autenticar(senhaTeste)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Usuário desativado. Falha na autenticação.");
        }
    }
}