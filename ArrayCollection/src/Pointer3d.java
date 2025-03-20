public class Pointer3d {
    public int x;
    public int y;
    public int z;

    public Pointer3d(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "x: " + x + ", y: " + y + ", z: " + z;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pointer3d){
            Pointer3d p = (Pointer3d) obj;
            return x == p.x && y == p.y && z == p.z;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.x + this.y + this.z;
    } 


    
}
