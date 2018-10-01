package controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "templateMB", eager = true)
@RequestScoped
public class templateMB implements Serializable{
   public String moveToPerfil() {
      return "perfil";
   }
   public String moveToCriarDiario() {
      return "criarDiario";
   }
   public String moveToAjuda() {
      return "ajuda";
   }
   public String moveToIndex() {
      return "index";
   }
}
