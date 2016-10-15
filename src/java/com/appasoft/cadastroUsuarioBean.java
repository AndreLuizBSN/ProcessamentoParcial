package com.appasoft;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean (name ="cadastroUsuarioBean")
public class cadastroUsuarioBean implements Serializable{

    public static final long serialVersionUID = 1L; 
    
    private String login;
    private String nome;

    
    public void cadastrar(){
        System.out.println("Login: "+this.login);
        System.out.println("Nome: "+this.nome);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadatro Efetuado!"));
    }
    
    public void verDisp(){
        
        FacesMessage msg = null;
        
        //Sumila demora de processamento
        
        try{
            Thread.sleep(2000);//2 segundos
        }catch(InterruptedException e){
            
        }
        
        if("joao".equalsIgnoreCase(this.login)){
            msg = new FacesMessage("Login em uso!");
            msg.setSeverity(FacesMessage.SEVERITY_WARN);
            
        }else{
            msg = new FacesMessage("Disponível");
            System.out.println(this.login);
        }
        
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }
    
    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
