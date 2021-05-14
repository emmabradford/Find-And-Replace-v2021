
/**
 * This class method takes a String of text, searches for 'find' and 
 * replaces it with 'replace'. Both 'find' and 'replace' are case sensitive.
 *
 * @author Emma B
 * @version january 7, 2021
 */
public class FindAndReplace
{
    public static String findAndReplace(String text, String find, String replace)
    {
        // declare a String variable called 'result' and set it to the empty String.
        // declare an integer variable called 'start' and set it to zero.
        // declare an integer variable called 'end' and set it to the first position of 'find' in 'text'
        //     (hint: use 'indexOf')
        String result = "";
        int start = 0;
        int end = text.indexOf(find);
        // create a while loop so long as end does not equal -1
        //    append to result a substring of text, from 'start' to 'end', and then append 'replace'
        //    set 'start' to the value of 'end' plus the length of 'find'
        //    set 'end' to the value of the first position of 'find' in 'text' starting at 'start'
        while(end != -1)
        {
            result = result + text.substring(start, end) + replace;
            start = end + find.length();
            end = text.indexOf(find, start);
        }
        // if 'start' is less than the length of 'text'
        //    then append to result the rest of 'text' starting at 'start'
        if(start < text.length())
        {
            result += text.substring(start);
        }
        // return the result;
        return result;    // change this line
    }
}
