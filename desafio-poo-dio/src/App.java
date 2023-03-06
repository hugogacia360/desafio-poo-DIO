import java.time.LocalDate;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("pt", "BR"));
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("descricao curso python");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devHugo = new Dev();
        devHugo.setNome("Hugo");
        devHugo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devHugo.getConteudosInscritos());
        devHugo.progredir();
        System.out.println("Conteudos inscritos " + devHugo.getConteudosInscritos());
        System.out.println("Conteudos inscritos " + devHugo.getConteudosConcluidos());
        System.out.println("XP : " + devHugo.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos inscritos " + devJoao.getConteudosConcluidos());
        System.out.println("XP : " + devJoao.calcularTotalXp());
    }
}
