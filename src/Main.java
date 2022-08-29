public class Main {
    public static void main(String[] args) {
        //1
        {
            int var1=231;
            byte var2=127;
            short var3=2232;
            long var4=2424244424l;
            float var5=2323232.32f;
            double var6=2332323231.32323232d;
            System.out.println("Значение переменной var1 с типом int равно "+var1);
            System.out.println("Значение переменной var2 с типом byte равно "+var2);
            System.out.println("Значение переменной var3 с типом short равно "+var3);
            System.out.println("Значение переменной var4 с типом long равно "+var4);
            System.out.println("Значение переменной var5 с типом float равно "+var5);
            System.out.println("Значение переменной var6 с типом double равно "+var6);
        }
        //2
        {
            float var1=27.12f;
            long var2=987_678_965_549l;
            float var3=2.786f;
            boolean var4=false;
            short var5=569;
            short var6=-159;
            int var7=27897;
            byte var8=67;
        }
        //3
        {
            int studentCount1=23;
            int studentCount2=27;
            int studentCount3=30;
            int pages=480;
            System.out.println("На каждого ученика рассчитано "+ pages/(studentCount1+studentCount2+studentCount3) +" листов бумаги");
        }
        //4
        {
            int speedPerTwoMin=16;
            int speedPerMin=speedPerTwoMin/2;
            System.out.println("За 20 минут машина произвела бутылок "+speedPerMin*20+" штук");
            System.out.println("В сутки машина произвела бутылок "+speedPerMin*60*24+" штук");
            System.out.println("За 3 дня машина произвела бутылок "+speedPerMin*60*24*3+" штук");
            System.out.println("За 1 месяц машина произвела бутылок "+speedPerMin*60*24*31+" штук");
        }
        //5
        {
            int allTinForSchool=120;
            int whiteTinPerRoom=2;
            int brownTinPerRoom=4;
            int rooms=allTinForSchool/(whiteTinPerRoom+brownTinPerRoom);
            System.out.println("В школе, где "+rooms+" классов, нужно "+whiteTinPerRoom*rooms+" банок белой краски и "+brownTinPerRoom*rooms+" банок коричневой краски.");

        }
        //6
        {
            int bananaCount=5;
            int milkCount=2;
            int icecreamCount=2;
            int eggsCount=4;
            int bananaMas=80;
            int milkMas=105;
            int icecreamMas=100;
            int eggMas=70;
            int weightGr=bananaCount*bananaMas+milkCount*milkMas+icecreamCount*icecreamMas+eggsCount*eggMas;
            float weightKg=weightGr/1000f%2;
            System.out.println("Вес питания в граммах "+weightGr);
            System.out.println("Вес питания в килограммах "+weightKg);
        }
        //7
        {
            int lossWeight1=250;
            int lossWeight2=500;
            int weight=7;
            System.out.println("Дней для потери веса в 1 случае: "+(float)weight*1000/lossWeight1);
            System.out.println("Дней для потери веса в 2 случае: "+(float)weight*1000/lossWeight2);
            System.out.println("Среднее количество дней: "+(float)weight*1000/((lossWeight2+lossWeight1)/2));
        }
        //8
        {
            int MashaSalary=67_760;
            int DenisSalary=83_690;
            int KristinaSalary=76_230;
            double newMashaSalary=MashaSalary*1.1;
            double newDenisSalary= DenisSalary*1.1;
            double newKristinaSalary= KristinaSalary*1.1;
            System.out.println("Маша теперь получает "+newMashaSalary+" рублей. Годовой доход вырос на "+(newMashaSalary-(double)MashaSalary)*12+" рублей.");
            System.out.println("Денис теперь получает "+newDenisSalary+" рублей. Годовой доход вырос на "+(newDenisSalary-(double)DenisSalary)*12+" рублей.");
            System.out.println("Кристина теперь получает "+newKristinaSalary+" рублей. Годовой доход вырос на "+(newKristinaSalary-(double)KristinaSalary)*12+" рублей.");
        }
    }
}
