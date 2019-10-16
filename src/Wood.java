public enum Wood {
    ALDERWOOD, CEDAR, MAHOGANY, PINE;
    public String toString()
    {
        switch(this)
        {
            case ALDERWOOD: return "Alderwood";
            case CEDAR: return "Cedar";
            case MAHOGANY: return "Mahogany";
            case PINE: return "Pine";
            default: return "Alderwood";
        }
    }
}
