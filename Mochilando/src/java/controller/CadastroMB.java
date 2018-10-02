package controller;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.domain.Cidade;
import org.primefaces.model.UploadedFile;

@SessionScoped
@ManagedBean
public class CadastroMB {
    private Long codUsuario;
    private String nomUsuario;
    private String sobrenomeUsuario;
    private String txtEmail;
    private String txtSenha;
    private UploadedFile imgPerfil;
    private String sexo;
    private Date datNascimento;
    private Cidade cidade;

    public Long getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getSobrenomeUsuario() {
        return sobrenomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenomeUsuario = sobrenomeUsuario;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public String getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(String txtSenha) {
        this.txtSenha = txtSenha;
    }

    public UploadedFile getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(UploadedFile imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDatNascimento() {
        return datNascimento;
    }

    public void setDatNascimento(Date datNascimento) {
        this.datNascimento = datNascimento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
}
