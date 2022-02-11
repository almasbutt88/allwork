public enum Plane {
    Boeing747(200,412);

    private int _seatCapacity;
    private int _weightInTonnes;
    Plane(int seatCapacity, int weightInTonnes) {
        this._seatCapacity = seatCapacity;
        this._weightInTonnes = weightInTonnes;
    }

    public int get_seatCapacity() {
        return _seatCapacity;
    }


    public int get_weightInTonnes() {
        return _weightInTonnes;
    }

}

