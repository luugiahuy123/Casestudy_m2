package utils;

import model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadWrite {

    private final String PATH_FILE = "/Users/luuhuy/Desktop/md2/1/Casestudy_m2/src/data/personStorage.csv";

    public List<Person> readCSV() {
        List<Person> personList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(PATH_FILE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Person person;

            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String name = temp[0];
                int age = Integer.parseInt(temp[1]);
                int pass = Integer.parseInt(temp[2]);
                String room = temp[3];
                person = new Person(name, age, pass, room);
                personList.add(person);

            }
        } catch (IOException e) {
            System.out.println("Path of file is invalid");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing bufferReader");
                }
            }
        }
        return personList;
    }

    public void writeListToCSV(String list) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(PATH_FILE, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(list);
        } catch (IOException e) {
            System.out.println("Path of file is invalid");
        } finally {
            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    System.out.println("Error closing bufferWriter");
                }
            }
        }
    }
    public String convertListToStringCSV(List<Person> personList){
        String content = "";
        for (Person person: personList) {
            content += person.getName() + "," + person.getAge() + "," + person.getPassport() + "," + person.getKindOfRoom() + "\n";
        }
        return content;
    }
}
