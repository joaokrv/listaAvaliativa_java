public class exercicio4 {
    public static void main(String[] args) {
        
        double habitantesA, habitantesB,taxaCrescA, taxaCrescB;
        int anos;

        habitantesA = 80000;
        habitantesB = 200000;
        taxaCrescA = 0.03;
        taxaCrescB = 0.015;
        anos = 0;

        while (habitantesA <= habitantesB) {

            habitantesA += habitantesA * taxaCrescA;
            habitantesB += habitantesB * taxaCrescB;
            anos ++;
            
        } System.out.print("Foram necessários "+anos+" para que a população do país A iguale ou ultrapasse a população do país B.");
    } 
}   
