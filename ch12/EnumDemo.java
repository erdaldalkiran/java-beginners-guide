class EnumDemo{
    public static void main(String[] args){
        var e = Transport.valueOf("AirplanE");
        System.out.println(e);
    }
}

enum Transport{
    Car,
    Train,
    Airplane
}