
import java.util.HashMap;
import java.util.Set;


public class dz_5{
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Иванов Иван Иванович 28 м");
        hashMap.put(2, "Сидоров Петр Валерьевич 16 м");
        hashMap.put(3, "Степанова Татьяна Михайловна 23 ж");
        hashMap.put(4, "Михайлов Иван Петрович 68 м");
        hashMap.put(5, "Пичкалева Светлана Юрьевна 10 ж");

    changeLetter(hashMap);

    Set<Integer> keys = hashMap.keySet();
    for (Integer key: keys) {
        String data1 = hashMap.get(key).split(" ")[0];
        String data = data1.toUpperCase().charAt(0)+data1.toLowerCase().substring(1, data1.length());
        data1 = hashMap.get(key).split(" ")[1].toUpperCase().charAt(0)+".";
        data = data + " " + data1;
        data1 = hashMap.get(key).split(" ")[2].toUpperCase().charAt(0)+".";
        data = data + data1;
        System.out.println(data);
    }
}

    static void changeLetter(HashMap<Integer, String> hashMap){
    System.out.println();

    for (Integer key: hashMap.keySet()){
        String str = hashMap.get(key);
        int index = str.length() - 1;
        char ch = Character.toUpperCase(str.charAt(index));
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, ch);
        str = sb.toString();
        hashMap.put(key, str);
    }
    System.out.println(hashMap);
}


} 



