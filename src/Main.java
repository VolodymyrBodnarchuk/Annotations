public class Main {
    public static void main(String[] args) {

        var annotation = MagicClass.class.getAnnotation(Marker.class);

            System.out.println(annotation.value());
    }
}