public class Entities {
    public class rectangle {
        public double w;
        public double h;

        public double Area() {
            return w*h;
        }

        public double Perimetro(){
            return 2*(w+h);
        }

        public double Diagonal (){
            return Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
        }
    }
}
