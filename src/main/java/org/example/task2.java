package org.example;
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class task2 {

        private static File log;
        private static FileWriter fileWriter;

        public static void main(String[] args) {
            try {
                log = new File("log.json");
                log.createNewFile();
                fileWriter = new FileWriter(log);
                int[] sortArr = { -5, -2, 0, 3, 2, 4, -1, -4, 1,-3, 5};
                Sort(sortArr);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        public static void Sort(int[] sortArr){
            for (int i = 0; i < sortArr.length - 1; i++) {
                for(int j = 0; j < sortArr.length - i - 1; j++) {
                    if(sortArr[j + 1] < sortArr[j]) {
                        int swap = sortArr[j];
                        sortArr[j] = sortArr[j + 1];
                        sortArr[j + 1] = swap;
                    }
                }
                writeLogTxt(Arrays.toString(sortArr));
            }
        }

        public static void writeLogTxt(String note) {

            try(FileWriter writer = new FileWriter("log.txt"))
            {
                fileWriter.write(note + "\n");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }





