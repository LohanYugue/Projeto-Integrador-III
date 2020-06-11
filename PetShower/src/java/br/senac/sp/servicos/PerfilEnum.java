package br.senac.sp.servicos;

public enum PerfilEnum {
    admin("admin"), vendedor("vendedor");
     
    private final String perfil;
    
    PerfilEnum(String perfil){
        this.perfil = perfil;
    }
    public String getPerfil(){
        return this.perfil;
    }
}
