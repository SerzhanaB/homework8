public enum Season {
    Summer("Желтый"), Autumn("Оранжевый"), Spring("Зеленый"), Winter( "Белый");

    public String color;
    Season(String color){
        this.color=color;

    }


    public String getColor() {
        return this.color;


    }


}
