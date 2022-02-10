public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(1000_60, true);
        //        boolean registered = true;
//        int percent = registered ? 3 : 1;
//        long amount = 1000_60;
////        long bonus = amount * percent/100/100;
//        long limit = 500;
//        if(bonus > limit){
//            bonus = limit;
//        }
        System.out.println(bonus);


    }
}
