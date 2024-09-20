import java.util.LinkedHashSet;
import java.util.Set;

import Modelo.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Set<Disciplina> modulo01 = new LinkedHashSet<>();
        Set<Disciplina> modulo02 = new LinkedHashSet<>();
        Set<Disciplina> modulo03 = new LinkedHashSet<>();
        Set<Disciplina> modulo04 = new LinkedHashSet<>();
        Set<Disciplina> modulo05 = new LinkedHashSet<>();
        Set<Disciplina> modulo06 = new LinkedHashSet<>();


        try {
            modulo01.add(new Disciplina("Gramática 1", 113, 60));
            modulo01.add(new Disciplina("Literatura Portuguesa 1", 107, 60));
            modulo01.add(new Disciplina("Matematica 1", 130, 72));
            modulo01.add(new Disciplina("Geografia 1", 103, 60));
            modulo01.add(new Disciplina("Historia 1", 114, 60));
            modulo01.add(new Disciplina("Biologia 1", 163, 60));
            modulo01.add(new Disciplina("Física 1", 178, 60));
            modulo01.add(new Disciplina("Inglês 1", 195, 45));
            modulo01.add(new Disciplina("Espanhol 1", 162, 45));
            modulo01.add(new Disciplina("Química 1", 102, 60));
            modulo01.add(new Disciplina("Filosofia 1", 173, 30));
            modulo01.add(new Disciplina("Sociologia 1", 198, 30));

            modulo02.add(new Disciplina("Gramática 2", 213, 72));
            modulo02.add(new Disciplina("Literatura Portuguesa 2", 207, 60));
            modulo02.add(new Disciplina("Matematica 2", 230, 72));
            modulo02.add(new Disciplina("Geografia 2", 203, 45));
            modulo02.add(new Disciplina("Historia 2", 214, 45));
            modulo02.add(new Disciplina("Biologia 2", 263, 60));
            modulo02.add(new Disciplina("Física 2", 278, 60));
            modulo02.add(new Disciplina("Inglês 2", 295, 45));
            modulo02.add(new Disciplina("Espanhol 2", 262, 45));
            modulo02.add(new Disciplina("Química 2", 202, 45));
            modulo02.add(new Disciplina("Filosofia 2", 273, 30));
            modulo02.add(new Disciplina("Sociologia 2", 298, 30));

            modulo03.add(new Disciplina("Gramática 3", 313, 45));
            modulo03.add(new Disciplina("Literatura Portuguesa 3", 307, 60));
            modulo03.add(new Disciplina("Matematica 3", 330, 72));
            modulo03.add(new Disciplina("Geografia 3", 303, 60));
            modulo03.add(new Disciplina("Historia 3", 314, 45));
            modulo03.add(new Disciplina("Biologia 3", 363, 45));
            modulo03.add(new Disciplina("Física 3", 378, 60));
            modulo03.add(new Disciplina("Inglês 3", 395, 30));
            modulo03.add(new Disciplina("Espanhol 3", 362, 30));
            modulo03.add(new Disciplina("Química 3", 302, 60));
            modulo03.add(new Disciplina("Literatura Inglesa 1", 373, 45));
            modulo03.add(new Disciplina("Tecnologia 1", 398, 60));

            modulo04.add(new Disciplina("Gramática 4", 413, 45));
            modulo04.add(new Disciplina("Literatura Portuguesa 4", 407, 60));
            modulo04.add(new Disciplina("Matematica 4", 430, 72));
            modulo04.add(new Disciplina("Geografia 4", 403, 60));
            modulo04.add(new Disciplina("Historia 4", 414, 45));
            modulo04.add(new Disciplina("Biologia 4", 463, 45));
            modulo04.add(new Disciplina("Física 4", 478, 60));
            modulo04.add(new Disciplina("Inglês 4", 495, 30));
            modulo04.add(new Disciplina("Espanhol 4", 462, 30));
            modulo04.add(new Disciplina("Química 4", 402, 60));
            modulo04.add(new Disciplina("Literatura Ingles 2", 473, 45));
            modulo04.add(new Disciplina("Tecnologia 2", 498, 60));

            modulo05.add(new Disciplina("Gramática 5", 513, 45));
            modulo05.add(new Disciplina("Literatura Portuguesa 5", 507, 60));
            modulo05.add(new Disciplina("Matematica 5", 530, 72));
            modulo05.add(new Disciplina("Geografia 5", 503, 60));
            modulo05.add(new Disciplina("Historia 5", 514, 45));
            modulo05.add(new Disciplina("Biologia 5", 563, 45));
            modulo05.add(new Disciplina("Física 5", 578, 60));
            modulo05.add(new Disciplina("Inglês 5", 595, 30));
            modulo05.add(new Disciplina("Espanhol 5", 562, 30));
            modulo05.add(new Disciplina("Química 5", 502, 60));
            modulo05.add(new Disciplina("Literatura Ingles 3", 573, 45));
            modulo05.add(new Disciplina("Tecnologia 3", 598, 60));

            modulo06.add(new Disciplina("Gramática 6", 613, 45));
            modulo06.add(new Disciplina("Literatura Portuguesa 6", 607, 60));
            modulo06.add(new Disciplina("Matematica 6", 630, 72));
            modulo06.add(new Disciplina("Geografia 6", 603, 60));
            modulo06.add(new Disciplina("Historia 6", 614, 45));
            modulo06.add(new Disciplina("Biologia 6", 663, 45));
            modulo06.add(new Disciplina("Física 6", 678, 60));
            modulo06.add(new Disciplina("Inglês 6", 695, 30));
            modulo06.add(new Disciplina("Espanhol 6", 662, 30));
            modulo06.add(new Disciplina("Química 6", 602, 60));
            modulo06.add(new Disciplina("Literatura Ingles 4", 673, 45));
            modulo06.add(new Disciplina("Tecnologia 4", 698, 60));
        } catch (Exception e){
            System.out.println("erro: " + e.getMessage());
            
        }
        Area primeiroModulo = new Area("Ensino Médio - Modulo 01", 16, modulo01, 10);
        Area segundoModulo = new Area("Ensino Médio - Modulo 02", 25, modulo02, 11);
        Area terceiroModulo = new Area("Ensino Médio - Modulo 03", 36, modulo03, 9);
        Area quartoModulo = new Area("Ensino Médio - Modulo 04", 49, modulo04, 8);
        Area quintoModulo = new Area("Ensino Médio - Modulo 05", 64, modulo05, 8);
        Area sextoModulo = new Area("Ensino Médio - Modulo 06", 64, modulo06, 7);

        Set<Area> curso = new LinkedHashSet<>();
        
        curso.add(primeiroModulo);
        curso.add(segundoModulo);
        curso.add(terceiroModulo);
        curso.add(quartoModulo);
        curso.add(quintoModulo);
        curso.add(sextoModulo);

        Curso c = new Curso(null, 0, curso.stream().reduce(0, (n1,n2) -> n1.getIdentificadorAreaDisciplina().), curso.size());

        System.out.println(primeiroModulo.getIdentificadorAreaDisciplina().values());

        
        System.out.println(terceiroModulo.getIdentificadorAreaDisciplina().values());
    }
}