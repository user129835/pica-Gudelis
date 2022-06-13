
import java.util.Scanner;
import java.util.ArrayList;

public class PicaPica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Picca> pizzas = new ArrayList<>();
        System.out.println('\n'+"Liela pica - 9.99€ "+'\n'+"Videja pica - 7.99€"+'\n'+"Maza pica - 5.99€"+"Piegade uz majam - 2.99€"+'\n'+'\n');
        
        // Klineta informacija
        Scanner klientaV= new Scanner(System.in);   
        System.out.print("Ievadiet klienta vardu: ");  // Tiek pajautats ievadit klienta vardu 
        String str= klientaV.nextLine(); 
        Scanner klientaTel= new Scanner(System.in);
        System.out.print("Ievadiet klienta telefona numuru: ");  // Tiek pajautats ievadit klienta tel. numuru 
        String str2= klientaTel.nextLine();
        Scanner klientaEpasts= new Scanner(System.in);   
        System.out.print("Ievadiet klienta e-pastu (pec izveles): ");  // Tiek pajautats ievadit klienta tel. numuru 
        String str3= klientaTel.nextLine();
       
        // Jauta cik picas klients velas pasutit
        System.out.println("Cik picas pasūtīsiet?: ");
        int picasKopaa = scanner.nextInt();

        // 1. Nolasa picas lieluma un piedevu daudzumu
        for (int i = 0; i < picasKopaa; ++i) {
        	Picca pica = new Picca();

            ArrayList<String> Piedevas = new ArrayList<>();

            String picasLielums;
            System.out.println("Ievadiet picas izmēru (Liels, Vidējs, Mazs): ");
            picasLielums = scanner.next();
            pica.uzIzm(picasLielums);

            int kopaPiedevas;
            System.out.println("Pieejamas piedevas: "+'\n'+'\t'+"Dārzeņi - Avokado, Burkāns, Salāti, Sēnes, Olīvas"+'\n'+'\t'+"Garšaugi - Baziliks, Čili, Dilles, Ķiploki, Pipari"+'\n'+'\t'+"Siers - Zilais-siers, Chedar, Limburger, Mocarella"+'\n');
            System.out.println("Ievadiet kopējo picas piedevu daudzumu (piem.: 1, 5, 17): ");
            kopaPiedevas = scanner.nextInt();

            for (int j = 0; j < kopaPiedevas; ++j) {
                System.out.println("Ievadiet vienu no izvēlētajām piedevām (piem.: tomāts, gurķis): ");
                String piedevu = scanner.next();
                Piedevas.add(piedevu);
            }

            double piegCena = 2.99;
            System.out.println('\n'+"Piegades cena uz majam - 2.99€");
            Scanner piegMajas= new Scanner(System.in);   
            System.out.print("Vai velaties pasutijumu sanemt majas (ja/ne)? -  ");  // Tiek pajautats ievadit klienta tel. numuru 
            String str4= klientaTel.nextLine();
            System.out.println(" "+'\n'+'\n');

            pica.arPiedevu(Piedevas);
            pizzas.add(pica);
        }
       
        // 2. Izveido Picas pasutijumu (PicaPasutijums) objektu un sareikina kopejas izmaksas
        PicaPasutijums order = new PicaPasutijums(pizzas);
        order.aprekinatPasParskats();
        order.printPasParskats();


        // 3. Aizver scanner funkciju
        scanner.close();


	}

}
