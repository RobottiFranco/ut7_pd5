package com.example;

import java.util.List;

public final class App {

    public static void main(String[] args) {
        TGrafoDirigido gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("src\\main\\java\\com\\example\\vertices.txt",
                "src\\main\\java\\com\\example\\conCiclos.txt", false, TGrafoDirigido.class);

        System.out.println(gd.tieneCiclo());

        gd = (TGrafoDirigido) UtilGrafos.cargarGrafo("src\\main\\java\\com\\example\\vertices.txt",
                "src\\main\\java\\com\\example\\sinCiclos.txt", false, TGrafoDirigido.class);

        System.out.println(gd.tieneCiclo());

        System.out.println("Grafo sin ciclos:");
        System.out.println("Clasificación topológica:");
        List<Comparable> ordenSinCiclos = gd.clasificacionTopologica("Asuncion");
        System.out.println(ordenSinCiclos);

    }
}
