public class HomeWork4 {
    public static void main(String[] args) {
        //Задание 1. Из исходного слова путем "вырезок" и "склеек"
        //его подстрок получить другие слова
        //интерфейс: интерес, фитнес.
        String word = "интерфейс";
        String newWord1=" ";
        String newWord2=" ";
        char[] ch = word.toCharArray();
        for(int i=0; i<word.length();i++) {
                char c1 = ch[0], c2 = ch[1], c3 = ch[2], c4 = ch[3], c5 = ch[4],
                        c6 = ch[5], c7 = ch[6], c8 = ch[7], c9 = ch[8];
                newWord1 = "" + c1 + c2 + c3 + c4 + c5 + c7 + c9;
                newWord2 = "" + c6 + c1 + c3 + c2 + c4 + c9;
        }
        System.out.println("Задание 1. "+newWord1 +" "+ newWord2);

        //Задание 2. Дано предложение. Все его символы, стоящие
        //на чётных местах, заменить буквой ы.
        String sentens = "Такая весна, когда было непонятно, кто больше врет: календарь или окно.";
        StringBuilder sb = new StringBuilder(sentens);
        for (int i=2; i<sentens.length(); i++){
            if (i%2==0)
                sb.setCharAt(i,'ы');
        }
        System.out.println("Задание 2. "+sb);

        //Задание 3. Программа должна обрабатывать все строки, подобные указанным
        //Из пути файла Windows извлечь каталог, краткое имя и расширение
        //С:\Windows\System32\calc.exe
        String nameOfFile = "С:\\Windows\\System32\\calc.exe";
        String fileName = nameOfFile.substring(nameOfFile.lastIndexOf('\\')+1);
        System.out.println("Задание 3. "+fileName);
    }
}
