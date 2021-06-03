package Main;

import Entidades.Medico;

public class main {
    public static void main(String[] args) {
        Medico medic = new Medico();

        medic.setNome("Ricardo Martins");
        medic.setSexo("Masculino");
        medic.setDataAdmissao("2000/12/31");
        medic.setMatricula("1234");
        medic.setCrm("00000000-0/BR");

        System.out.println(medic.statusMedico());
    }
}
