public enum Strings {
    SIX, TWELVE;

    public String toString()
    {
        switch(this){
            case TWELVE: return "Twelve";
            default: return "Six";
        }
    }
}
