# File Handling in Java

File Handling in Java permits us to create, read, update, and delete the
files, which are stored on the local file system. There are two types of
File handling in Java – FileWriter, and FileReader, which can perform
all the file operations in Java Program.

# Types of File Handling in Java 

FileWriter and FileReader classes are
very frequently used to write and read data from text files (they are
character stream classes). For any Byte stream classes, if you want to
read and write them it is not recommended to use FileInputStream.

Let’s discuss types of File handling in Java:-

1.  *Java FileWriter*

    FileWriter in Java is very useful in creating a file
    writing characters.

    This class inherits from the OutputStream class. The constructors of the
    class FileWriter usually assume that the byte-buffer size and default
    character encoding is acceptable. To declare them by oneself we need to
    construct OutputStreamWriter on a FileOutputStream. Java FileWriter is
    meant for writing streams of characters.

2.  *Java FileReader*

    FileReader (File Handling in Java) uses for reading
    the data, which are in the form of characters, and it is done from a
    ‘text’ file. This class inherits from the InputStreamReader Class.

    The constructors of this class are assuming that the default character
    encoding and the default byte are appropriate. To confirm these values
    by your own, construct an InputStreamReader on a FileInputStream.

3.  *BufferedReader and BufferedWriter*

    BufferedReader and BufferedWriter use an internal buffer to store data
    while reading and writing, respectively. BufferedReader provides a new
    method readLine(), which reads a line and returns a String (without the
    line delimiter).
