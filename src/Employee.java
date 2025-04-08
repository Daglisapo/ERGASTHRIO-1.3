public class Employee {
    //Dilosi Metavliton
    int am, etoi;
    String onoma, epitheto;
    double misthos, bonus;

    //Constractor
    Employee() {
        etoi = 0;
        am = 2021031;
        onoma = "Apostolos";
        epitheto = "Dagklhs";
        misthos = 10000.34;
        bonus = 23.1;
    }

    //Getter and Setters
    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public int getEtoi() {
        return etoi;
    }

    public void setEtoi(int etoi) {
        this.etoi = etoi;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public double getMisthos() {
        return misthos;
    }

    public void setMisthos(double misthos) {
        this.misthos = misthos;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Methodos toString()
    public String toString(){
        return "Ergazomenos:" + onoma + epitheto + "\nArothmosMitrou:" + am ;
    }

    //Methodos salary()
    public double salary(){
        double Tmisthos=0;
        Tmisthos=misthos+etoi*10+bonus;
        return Tmisthos;
    }

}
