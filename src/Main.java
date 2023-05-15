public class Main {
    public static void main(String[] args) {
        SolarSystemPlanet planet = SolarSystemPlanet.EARTH;
        System.out.println("Порядковий номер від Сонця: " + planet.getOrderFromSun());
        System.out.println("Відстань від попередньої планети: " + planet.getDistanceFromPreviousPlanet());
        System.out.println("Відстань від Сонця: " + planet.getDistanceFromSun());
        System.out.println("Радіус: " + planet.getRadius());
        System.out.println("Попередня планета: " + planet.getPreviousPlanet());
        System.out.println("Наступна планета: " + planet.getNextPlanet());
    }
}