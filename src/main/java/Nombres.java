public class Nombres {
    public int nb1;
    public int nb2;

    public Nombres(int n1, int n2){
        nb1 = n1;
        nb2 = n2;
    }

    public void EchangerNombres(){
        int temp = nb2;
        nb2 = nb1;
        nb1 = temp;
        System.out.println("Echange des nombres !!!!!!!!!!");
    }

    public void AfficherNombres()
    {
        System.out.println("Nb1 = " + nb1 + " Nb2 = " + nb2);
    }
}
