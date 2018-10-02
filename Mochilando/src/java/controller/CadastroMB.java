/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.domin.usuario.java;
/**
 *
 * @author Aluno
 */
public class CadastroMB {
    private Long codUsuario;
    private String nomUsuario;
    private String sobrenomeUsuario;
    private String txtEmail;
    private String txtSenha;
    private Byte imgPerfil;
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

    public Byte getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(Byte imgPerfil) {
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
