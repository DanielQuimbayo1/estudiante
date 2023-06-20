package com.example.demo.estudiante;

public class estudiante {
    public  int codigo;
    public String nombre;
    public String apellido;
    public String curso;
    public double nota1;
    public double nota2;
    public double nota3;

    private double promedio;
    private String aprobado;

    public estudiante() {

    }
    public estudiante(int codigo, String nombre, String apellido, String curso, double nota1, double nota2, double nota3, double promedio, String aprobado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
        this.aprobado = aprobado;
    }

    public estudiante(int codigo, String nombre, String apellido, String curso, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String determinarAprobado() {
        return promedio >= 3.0 ? "Aprobado" : "Reprobado";
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", curso='" + curso + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", promedio=" + promedio +
                ", aprobado='" + aprobado + '\'' +
                '}';
    }
}
