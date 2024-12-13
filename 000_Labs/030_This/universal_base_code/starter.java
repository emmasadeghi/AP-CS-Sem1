/*
 *	Author:  
 *  Date: 
*/

 public static String randName(){
        int rand = (int)(Math.random()7);
        switch(rand){
            case 0: return "Happy"; 
            case 1: return "Bashful";
            case 2: return "Sleepy";
            case 3: return "Grumpy";
            case 4: return "Sneezy";
            case 5: return "Happy";
            case 6: return "Doc";
            default: return "Dopey";
        }
    }

    public static void main(String args[]) {
        PooleDwarf dwarf = new PooleDwarf(randName(), 1);
        PooleDwarf dwarf2 = new PooleDwarf(randName(), 2);
        PooleDwarf dwarf3 = new PooleDwarf(randName(), 3);
        PooleDwarf dwarf4 = new PooleDwarf(randName(), 4);
        PooleDwarf dwarf5 = new PooleDwarf(randName(), 5);
        PooleDwarf dwarf6 = new PooleDwarf(randName(), 6);
        PooleDwarf dwarf7 = new PooleDwarf(randName(), 7);
        int lol = 0;
        if(dwarf.isSameName(dwarf2.getName())){
            lol++;
        }
        if(dwarf.isSameName(dwarf3.getName())){
            lol++;
        }
        if(dwarf.isSameName(dwarf4.getName())){
            lol++;
        }
        if(dwarf.isSameName(dwarf5.getName())){
            lol++;
        }
        if(dwarf.isSameName(dwarf6.getName())){
            lol++;
        }
        if(dwarf.isSameName(dwarf7.getName())){
            lol++;
        }
            System.out.println(lol + " dwarfs are named "+ dwarf.getName());
        }
}

