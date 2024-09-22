import br.com.demanxier.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Algoritmos com Java");
        curso1.setDescricao("Descrição do curso Algoritmos com Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO com Java");
        curso2.setDescricao("Descrição do curso POO com Java");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Banco de dados para DEV");
        curso3.setDescricao("Descrição do curso Banco de dados para DEV");
        curso3.setCargaHoraria(5);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria: Iniciando com Java");
        mentoria1.setDescricao("descrição da mentoria iniciando com Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria: Evoluindo na programação");
        mentoria2.setDescricao("descrição da mentoria Evoluindo na programação");
        mentoria2.setData(LocalDate.now());
/*
        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println(curso2);
 */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Formação Java Developer");
        bootcamp.setDescricao("Descrição da formação de desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);

        Dev devDemanxier = new Dev();
        devDemanxier.setNome("Demanxier");
        devDemanxier.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Demanxier: " + devDemanxier.getConteudosInscritos());
        devDemanxier.progredir();
        System.out.println("-------Após progredir----------");
        System.out.println("Conteúdos concluidos Demanxier: " + devDemanxier.getConteudosConcluidos());
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos Demanxier: " + devDemanxier.getConteudosInscritos());
        System.out.println("XP: " + devDemanxier.calcularTotalXp());
        System.out.println(" ");
        Dev devThaina = new Dev();
        devThaina.setNome("Thaina");
        devThaina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Thaina: " + devThaina.getConteudosInscritos());
        devThaina.progredir();
        devThaina.progredir();
        devThaina.progredir();
        System.out.println("-------Após progredir----------");
        System.out.println("Conteúdos concluidos Thaina: " + devThaina.getConteudosConcluidos());
        System.out.println("----------------------");
        System.out.println("Conteúdos inscritos Thaina: " + devThaina.getConteudosInscritos());
        System.out.println("XP: " + devDemanxier.calcularTotalXp());

    }
}