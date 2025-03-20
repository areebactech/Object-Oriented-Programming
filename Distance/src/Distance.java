public class Distance {
        private double x;
        private double y;

        Distance(){
        }
        Distance(double a, double b){
            x = a;
            y = b;
        }
        void calculate_distance (Distance p2){
            System.out.println("Distance:"+(Math.sqrt((Math.pow(p2.x-x, 2))+(Math.pow(p2.y-y, 2)))));
        }
    }
