'''
Description: Create a program that encrypts or
decrypts the contents of a text file using a simple
encryption algorithm. Prompt the user to choose
between encryption or decryption, and input the
file name or path. Encrypt or decrypt the file
accordingly and save the result to a new file.'''
import java.util.Scanner;
import java.io.*;

public class EncryptionDecryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write  your choice (Encryption/Decryption)");
        String choice = scanner.nextLine();
        System.out.println ("Enter the path of file you want to " +  choice);
        String fileName = scanner.nextLine();
       
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("File not found.");
                return;
            }
            
            String fileContent = readFile(file);
            String result = "";
            if (choice.equalsIgnoreCase("Encryption")) {
                result = encrypt(fileContent);
            } else if (choice.equalsIgnoreCase("Decryption")) {
                result = decrypt(fileContent);
            } else {
                System.out.println("Invalid choice.");
                return;
            }
            
            writeFile("output.txt", result);
            System.out.println("Your " + choice  + " process is completed. Result saved to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static String readFile(File file) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            fileContent.append(line).append("\n");
        }
        reader.close();
        return fileContent.toString();
    }

    private static void writeFile(String fileName, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(content);
        writer.close();
    }

    private static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                c = (char) (c + 2);
                if ((Character.isUpperCase(text.charAt(i)) && c > 'Z') ||
                        (Character.isLowerCase(text.charAt(i)) && c > 'z')) {
                    c -= 25;
                }
            }
            encryptedText.append(c);
        }
        return encryptedText.toString();
    }

    private static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                c = (char) (c - 2);
                if ((Character.isUpperCase(text.charAt(i)) && c < 'A') ||
                        (Character.isLowerCase(text.charAt(i)) && c < 'a')) {
                    c += 25;
                }
            }
            decryptedText.append(c);
        }
        return decryptedText.toString();
    }
}
