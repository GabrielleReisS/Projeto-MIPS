import java.util.HashMap;
public class Dicionario {
    static HashMap<String,Integer> reg=  new HashMap<>();
    static HashMap<String, Integer>op=new HashMap<>();
    static HashMap<String, Integer> funct= new HashMap<>();

    static{
        reg.put("$r0",0);
        reg.put("$zero",0);
        reg.put("$at",1);
        reg.put("$v0",2);
        reg.put("$v1",3);
        reg.put("$a0",4);
        reg.put("$a1",5);
        reg.put("$a2",6);
        reg.put("$a3",7);
        reg.put("$t0",8);
        reg.put("$t1",9);
        reg.put("$t2",10);
        reg.put("$t3",11);
        reg.put("$t4",12);
        reg.put("$t5",13);
        reg.put("$t6",14);
        reg.put("$t7",15);
        reg.put("$s0",16);
        reg.put("$s1",17);
        reg.put("$s2",18);
        reg.put("$s3",19);
        reg.put("$s4",20);
        reg.put("$s5",21);
        reg.put("$s6",22);
        reg.put("$s7",23);
        reg.put("$t8",24);
        reg.put("$t9",25);
        reg.put("$k0",26);
        reg.put("$k1",27);
        reg.put("$gp",28);
        reg.put("$sp",29);
        reg.put("$s8",30);
        reg.put("$ra",31);



    }
    static{
        op.put("lb",32);
        op.put("lh",33);
        op.put("lw",35);
        op.put("sb",40);
        op.put("sh",41);
        op.put("sw",43);
        op.put("add",0);
        op.put("sub",0);
        op.put("and",0);
        op.put("or",0);
        op.put("xor",0);
        op.put("addi",8);
        op.put("andi",12);
        op.put("ori",13);
        op.put("xori",14);
        op.put("lui",15);
        op.put("sll",0);
        op.put("srl",0);
        op.put("jr",0);
        op.put("j",2);
        op.put("beq",4);
        op.put("bne",5);
        op.put("blez",6);
        op.put("bgtz",7);

    }
    static{
        funct.put("add",32);
        funct.put("sub",34);
        funct.put("and",36);
        funct.put("or",37);
        funct.put("xor",38);
        funct.put("srl",2);
        funct.put("sll",0);
        funct.put("jr",8);
    }






}