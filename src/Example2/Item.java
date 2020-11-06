package Example2;

public class Item {

    private String ItemName;
    private int durability;
    private int difficulty;
    private int maxQuality;
    private int craftsmanship;
    private int level;


    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getMaxQuality() {
        return maxQuality;
    }

    public void setMaxQuality(int maxQuality) {
        this.maxQuality = maxQuality;
    }

    public int getCraftsmanship() {
        return craftsmanship;
    }

    public void setCraftsmanship(int craftsmanship) {
        this.craftsmanship = craftsmanship;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public String printInfo(){

        return "Item Name = " + getItemName() + "\ndurability = "
                + getDurability() + "\ndifficulty = " + getDifficulty() + "\nmaxQuality = "
                + getMaxQuality() + "\ncraftsmanship = " + getCraftsmanship() + "\nlevel = " + getLevel();

    }


}
