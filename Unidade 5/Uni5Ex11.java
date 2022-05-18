public class Uni5Ex11 {
    public static void main(String[] args) {
        /*
        Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, 
        na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, 
        e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia 
        (a máquina opera 16 horas por dia).
        */
        int biscuits = 1;

        for (int i = 1; i < 16; i++) {
            if (i == 1) {
                biscuits = biscuits;
            } else {
                biscuits *= 3;
            }
        }

        System.out.println(biscuits);
    }
}
