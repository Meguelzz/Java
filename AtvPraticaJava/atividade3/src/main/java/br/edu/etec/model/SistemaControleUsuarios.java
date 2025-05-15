package br.edu.etec.model;

public class SistemaControleUsuarios {
    public enum NivelAcesso {
        ADMIN,
        USUARIO,
        CONVIDADO
    }

    public static class Usuario {
        private final String login;
        private final String senha;
        private final NivelAcesso nivel;
        private boolean ativo;

        public Usuario(String login, String senha, NivelAcesso nivel) {
            this.login = login;
            this.senha = senha;
            this.nivel = nivel;
            this.ativo = true;
        }

        public boolean autenticar(String senha) {
            return this.ativo && this.senha.equals(senha);
        }

        public void desativar() {
            this.ativo = false;
        }

        public NivelAcesso getNivel() {
            return nivel;
        }

        public String getLogin() {
            return login;
        }
    }
}