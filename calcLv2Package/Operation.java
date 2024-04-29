package calcLv2Package;

enum Operation implements Operator {
    ADDITION('+'){
        public double operate(double a, double b){
            return a+b;
        }
    },
    SUBTRACKTION('-') {
        public double operate(double a, double b){
            return a-b;
        }
    },
    MULTIPLICATION('*') {
        public double operate(double a, double b){
            return a*b;
        }
    },
    DIVISION('/') {
        public double operate(double a, double b){
            return a/b;
        }
    },
    MODULATION('%') {
        public double operate(double a, double b){
            return a%b;
        }
    };

    public final char op;
    Operation(char op) {
        this.op = op;
    }

    public char getOp(){
        return op;
    }
//    public abstract double operate(double a, double b);
}