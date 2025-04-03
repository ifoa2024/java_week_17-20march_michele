public class RubricaKey {
    public String cf;

    public RubricaKey(String cf) {
        this.cf = cf;
    }

    @Override
    public boolean equals(Object obj) {
        //sovrascrittura di una classe che java conosce e non creata da noi
        //return as soon as possible
        System.err.println(this);
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        RubricaKey key =  (RubricaKey) obj;
        String pippo = key.cf;

        return pippo == this.cf;
    }

    @Override
    public int hashCode() {
        return this.cf.hashCode();
    }

}
