package br.ucsal.collections_e_Streams.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Italia", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println(campeoesMundiaisFifa);

        //Atualiza valor da chave Brasil
        campeoesMundiaisFifa.put("Brasil", 6);

        System.out.println(campeoesMundiaisFifa);

        //Retorna Argentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMundiaisFifa.remove("França");

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        // Retorna se existe ou não alguma seleção hexa campeã
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());

        // Navega nos registros do mapa

        for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }

        for (String key : campeoesMundiaisFifa.keySet()) {
            System.out.println(key + "---" + campeoesMundiaisFifa.get(key));
        }

        //Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundiaisFifa.containsKey("Estados unidos"));

        //Verifica se o mapa tem o valor 5
        System.out.println(campeoesMundiaisFifa.containsValue(5));

        System.out.println(campeoesMundiaisFifa.size());
        campeoesMundiaisFifa.clear();
        System.out.println(campeoesMundiaisFifa.size());




    }

}
