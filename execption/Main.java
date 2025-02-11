public class Main {
    static String[] cours = {"Dev JAva", "Management", "Cyber"};

    public static String getElement(int index) throws ArrayIndexOutOfBoundsException {
        if (cours.length < index) {
            throw new ArrayIndexOutOfBoundsException("Vous cherchez un element qui est hors du tableau !");
        }

        return cours[index];
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(getElement(6));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur capturée : " + e.getMessage());
        }
    }
}