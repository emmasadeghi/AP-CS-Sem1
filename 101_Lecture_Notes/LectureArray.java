/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 5, 9, 8, 8, 3, 8, 8};
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        int dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if(dupeCheck == arr[i]){
                System.out.println(i);
            }
        }
	}
}