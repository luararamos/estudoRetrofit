package com.example.digital.retrofitapplication.Model;

import com.google.gson.annotations.SerializedName;

public class Posts {
    @SerializedName("title")
    private String Titulo;

    private String Autor;
    private String Descricao;
    private String ImagemUrl;

    public Posts(String titulo, String autor, String descricao, String imagemUrl) {
        Titulo = titulo;
        Autor = autor;
        Descricao = descricao;
        ImagemUrl = imagemUrl;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getImagemUrl() {
        return ImagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        ImagemUrl = imagemUrl;
    }
}
