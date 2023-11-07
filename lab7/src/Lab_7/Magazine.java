package Lab_7;

class Magazine implements Lab_7.Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println("Printing: " + title);
    }

    public static void printMagazines(Lab_7.Printable[] printables) {
        for (Lab_7.Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}