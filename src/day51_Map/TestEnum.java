package day51_Map;

public class TestEnum {
    public static void main(String[] args) {

        //String browser = "Wooden Spoon";

        Browsers browser = Browsers.CHROME;

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;
            case OPERA:
                System.out.println("Opera");
                break;
            case EDGE:
                System.out.println("Edge");
                break;
            default:
                System.out.println("Chrome");
        }

        System.out.println("-------------------------------");

        Seasons season = Seasons.SPRING;
    }



}
