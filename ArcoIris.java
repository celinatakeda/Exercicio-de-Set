package com.kazue.collection.gft.collection.api.set;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {

        Set<String>cores = new LinkedHashSet<>();
        cores.add("vermelho");
        cores.add("laranja");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");
        System.out.println("Cores do Arco-Íris");
        for(String cor: cores){
            System.out.println(cor);
        }
        System.out.println("------------------------");
        System.out.println("Quantidade de cores do arco-íris: " + cores.size());

        System.out.println("------------------------");
        Set<String>coresOrdemAlfabetica = new TreeSet<>(cores);
        System.out.println("Cores na Ordem Alfabética: " + coresOrdemAlfabetica);

        System.out.println("------------------------");
        List<String>coresOrdemInversa = new ArrayList<>(cores);
        Collections.reverse(coresOrdemInversa);
        System.out.println("Cores na Ordem Inversa: " + coresOrdemInversa);

        System.out.println("------------------------");
        System.out.println("Cores que começam com v: ");
        for(String cor: cores) {
            if (cor.startsWith("v"))
                System.out.println(cor);
        }
        System.out.println("------------------------");
        System.out.println("Removido todas as cores que começam com v: ");
        Iterator<String> iterator1= cores.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().startsWith("v")) iterator1.remove();
        }
        System.out.println(cores);

        System.out.println("------------------------");
        System.out.println("Limpando o Conjunto");
        cores.clear();

        System.out.println("------------------------");
        System.out.println("Conferindo se o conjunto está vazio: " + cores.isEmpty());
    }
}
