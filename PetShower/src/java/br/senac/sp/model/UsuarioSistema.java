
package br.senac.sp.model;

import br.senac.sp.servicos.PerfilEnum;

public class UsuarioSistema {
    
    private String usuario;
    private String senha;
    private PerfilEnum perfil;
    private boolean isAdmin;
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public PerfilEnum getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEnum perfil) {
        this.perfil = perfil;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isAdmin() {
        return PerfilEnum.admin.equals(this.getPerfil());
    }
    
    
    
}
