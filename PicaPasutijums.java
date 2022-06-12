import java.util.ArrayList;

public class PicaPasutijums {
    private double kopaApmaksa;

    private final ArrayList<Picca> picas;

    public PicaPasutijums(ArrayList<Picca> picas) {
        this.picas = picas;
    }
    // 5. Aprekina un izvada picu cenas
    public void aprekinatPasParskats() {
        final double LIELA_CENA = 9.99;
        final double VIDEJA_CENA = 7.99;
        final double MAZA_CENA = 5.99;
        final double IZMAKSAS_PAR_PIEDEVU = 0.5;

        for (Picca pica : picas) {
            switch (pica.dabIzm()) {
                case "Liels":
                	kopaApmaksa += LIELA_CENA;
                    break;
                case "Lielu":
                	kopaApmaksa += LIELA_CENA;
                    break;
                case "liels":
                	kopaApmaksa += LIELA_CENA;
                    break;
                case "lielu":
                	kopaApmaksa += LIELA_CENA;
                    break;
                case "Vidējs":
                	kopaApmaksa += VIDEJA_CENA;
                    break;
                case "Vidēju":
                	kopaApmaksa += VIDEJA_CENA;
                    break;
                case "vidējs":
                	kopaApmaksa += VIDEJA_CENA;
                    break;
                case "vidēju":
                	kopaApmaksa += VIDEJA_CENA;
                    break;
                case "Mazs":
                	kopaApmaksa += MAZA_CENA;
                    break;
                case "Mazu":
                	kopaApmaksa += MAZA_CENA;
                    break;
                case "mazs":
                	kopaApmaksa += MAZA_CENA;
                    break;
                case "mazu":
                	kopaApmaksa += MAZA_CENA;
                    break;
                default:
                	kopaApmaksa += 0.0;
                    break;
            }
            // 6. Aprekina izmaksas par piedevam
            int kopPiedevas = pica.dabPiedevas().size();
            kopaApmaksa += kopPiedevas * IZMAKSAS_PAR_PIEDEVU;
        }
    }

    public double pasParskats() {
        return kopaApmaksa;
    }
    // 7. Aprekina picas un pasutijuma cenu
    public void printPasParskats() {
        for (Picca pica : picas) {
            String str;
			System.out.println("Klienta "+str+" Pasūtījums Pasūtījāt " + pica.dabIzm() + " picu/as ar " +    pica.dabPiedevas() + " piedevām.");
        }
        System.out.println("KOPĒJĀ PASŪTĪJUMA SUMMA (€): " + pasParskats());
    }
}