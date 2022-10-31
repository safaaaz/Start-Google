package week2.enums;

public enum birds {
    PEAFOWL("Pavo cristatus"){
        @Override
        public void sing() {
            System.out.println("pia-owey-awe");
        }
    },
    CUCKOO("Cuculus canorus"){
        @Override
        public void sing() {
            System.out.println("ku-ku");
        }
    },
    HORNEDOWL("Bubo virginianus"){
        @Override
        public void sing() {
            System.out.println("hoot-a-hoot-hoo-hoo");
        }
    },
    LOON("Gavia immer"){
        @Override
        public void sing() {
            System.out.println("cooo-leee");
        }
    };

    birds(String scientificName){
        this.scientificName=scientificName;
    }

    public final String scientificName;
    public abstract void sing();

}
