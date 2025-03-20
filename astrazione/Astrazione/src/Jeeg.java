public class Jeeg {
    public Arm armSx;
    public Arm armDx;
    public Leg legSx;
    public Leg legDx;

    public Jeeg(Arm armSx, Arm armDx, Leg legSx, Leg legDx) {
        this.armSx = armSx;
        this.armDx = armDx;
        this.legSx = legSx;
        this.legDx = legDx;
    }   
    //dependency injection

    public void attack(){
        armSx.attack();
        armDx.attack();
    }

    public void defence(){
        legSx.defence();
        legDx.defence();
    }
}
