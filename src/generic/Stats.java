package generic;

 class Stats<T extends Number> {
     T[] nums; //array of numbers

     Stats(T[] O) {
         nums = O;
     }

     double average() {
         double sum = 0.0;

         for (int i = 0; i < nums.length; i++)
             sum += nums[i].doubleValue();

         return sum / nums.length;

     }

     boolean sameAvg(Stats<?> obj) {
         if (average() == obj.average())
             return true;

         return false;
     }
}

