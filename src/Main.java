class Main {
    public static <T extends ListOfNumbers> T findWithMaxAverage(T... lists) {
        if (lists.length == 0) {
            return null;
        }

        T maxAverageList = lists[0];
        double maxAverage = maxAverageList.getAverage();

        for (T list : lists) {
            double currentAverage = list.getAverage();
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
                maxAverageList = list;
            }
        }

        return maxAverageList;
    }

    public static void main(String[] args) {
        ListOfNumbers listObject1 = new ListOfNumbers();
        listObject1.addNumber(1.0);
        listObject1.addNumber(10.0);
        listObject1.addNumber(2.5);

        ListOfNumbers listObject2 = new ListOfNumbers();
        listObject2.addNumber(0.0);

        ListOfNumbers listObject3 = new ListOfNumbers();
        listObject3.addNumber(100.0);

        ListOfNumbers result1 = findWithMaxAverage(listObject1, listObject2, listObject3);
        ListOfNumbers result2 = findWithMaxAverage(listObject1, listObject2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
