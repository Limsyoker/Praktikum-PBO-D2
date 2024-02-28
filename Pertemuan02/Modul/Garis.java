public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }
    
    public double getPanjang(){
        double deltaX = titikAkhir.absis - titikAwal.absis;
        double deltaY = titikAkhir.ordinat - titikAkhir.ordinat;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getGradien(){
        double deltaX = titikAkhir.absis - titikAwal.absis;
        double deltaY = titikAkhir.ordinat - titikAkhir.ordinat;
        if (deltaX != 0){
            return (double) deltaX/deltaY;
        }
        else{
            return 0;
        }
    }

    public Garis getRefleksiY(){
        Titik refleksiAwal = titikAwal.getRefleksiY();
        Titik refleksiAkhir = titikAkhir.getRefleksiX();

        return new Garis(refleksiAwal, refleksiAkhir);
    }

    public boolean isTegakLurus(Garis G){
        double gradien1 = this.getGradien();
        double gradienG = G.getGradien();
        return gradien1 * gradienG == -1;
    }



}
