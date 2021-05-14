
/**
 * Write a description of class FindAndReplaceDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindAndReplaceDriver
{
    public static void main(String[] args)
    {
        String text = "I love cats! I have a cat named Coco. My cat is very smart!";
        String find = "cat";
        String replace = "dog";
        String result = FindAndReplace.findAndReplace(text, find, replace);
        System.out.println("Now checking the following text:");
        System.out.println("\"" + text + "\"");
        System.out.println("     find \"" + find + "\" and replace with \"" + replace + "\"");
        System.out.println("\"" + result + "\"");
    }
}
