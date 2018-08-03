 
import java.util.ArrayList;
import java.util.Random;

public class FootballGroups {

    public static void main(String[] args){
        Random ran1 = new Random(10);
        ArrayList<String> randomCountries = new ArrayList<String>();
        ArrayList<String> countryList = new ArrayList<String>();
        countryList.add("Coate d'Ivoire");
        countryList.add("Argentina");
        countryList.add("Australia");
        countryList.add("Serbia");
        countryList.add("Netherland");
        countryList.add("Nigeria");
        countryList.add("Japan");
        countryList.add("USA");
        countryList.add("China");
        countryList.add("New Zealand");
        countryList.add("Brazil");
        countryList.add("Belgium");
        countryList.add("Korea");
        countryList.add("Cameron");
        countryList.add("Honduras");
        countryList.add("Italy");
        ArrayList<String> Group1 = new ArrayList<String>();
        ArrayList<String> Group2 = new ArrayList<String>();
        ArrayList<String> Group3 = new ArrayList<String>();
        ArrayList<String> Group4 = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i <= countryList.size(); i++){
            nums.add(i);
        }
        while (true){
            Integer rannum = ran1.nextInt(countryList.size());
            String added = countryList.get(rannum);
            randomCountries.add(added);
            countryList.remove(added);
            if (countryList.size() == 0){
                break;
            }
        }
        for (int j = 0; j <= 3; j++){
            Group1.add(randomCountries.get(j));
            Group2.add(randomCountries.get(j+4));
            Group3.add(randomCountries.get(j+8));
            Group4.add(randomCountries.get(j+12));
        }

        System.out.println("Group 1 has:");
        for (int k = 0; k <= 3; k++){
            System.out.print(Group1.get(k) + "  ");

        }
        System.out.println("\nGroup 2 has:");
        for (int l = 0; l <= 3; l++){
            System.out.print(Group2.get(l) + "  ");
        }
        System.out.println("\nGroup 3 has:");
        for (int m = 0; m <= 3; m++){
            System.out.print(Group3.get(m) + "  ");
        }
        System.out.println("\nGroup 4 has:");
        for (int n = 0; n <= 3; n++){
            System.out.print(Group4.get(n) + "  ");
        }
    }
}
