/*
 * NÃO É PERMITIDO MODIFICAR NADA NESTE ARQUIVO,
 * EXCETO PELO CONSTRUTOR E OS MÉTODOS INDICADOS.
 */

package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;

public class Translator {
    private Node root;
    private Node a;
    private Node b;
    private Node c;
    private Node d;
    private Node e;
    private Node f;
    private Node g;
    private Node h;
    private Node i;
    private Node j;
    private Node k;
    private Node l;
    private Node m;
    private Node n;
    private Node o;
    private Node p;
    private Node q;
    private Node r;
    private Node s;
    private Node t;
    private Node u;
    private Node v;
    private Node w;
    private Node x;
    private Node y;
    private Node z;
    private Node zero;
    private Node um;
    private Node dois;
    private Node tres;
    private Node quatro;
    private Node cinco;
    private Node seis;
    private Node sete;
    private Node oito;
    private Node nove;
    private Node espaco1;
    private Node espaco2;
    private Node espaco3;
    private Node espaco4;
    private Node espaco5;
    private Node espaco6;
    private Node espaco7;
    private Node espaco8;
    private Node espaco9;
    private Node espaco10;
    private Node espaco11;
    private Node espaco12;
    private Node espaco13;
    private Node espaco14;
    private Node espaco15;
    private Node espaco16;
    private Node espaco17;
    private Node espaco18;
    private Node espaco19;
    private Node espaco20;
    private Node espaco21;
    private Node espaco22;
    private Node espaco23;
    private Node espaco24;
    private Node espaco25;
    private Node espaco26;


    private HashMap<Character, Node> map;


    // Você deve mudar o recheio do construtor,
    // de acordo com os requisitos do projeto.
    public Translator() {
        root = new Node();

        a = new Node('a');

        b = new Node('b');

        c = new Node('c');

        d = new Node('d');

        e = new Node('e');

        f = new Node('f');

        g = new Node('g');

        h = new Node('h');

        i = new Node('i');

        j = new Node('j');

        k = new Node('k');

        l = new Node('l');

        m = new Node('m');

        n = new Node('n');

        o = new Node('o');

        p = new Node('p');

        q = new Node('q');

        r = new Node('r');

        s = new Node('s');

        t = new Node('t');

        u = new Node('u');

        v = new Node('v');

        w = new Node('w');

        x = new Node('x');

        y = new Node('y');

        z = new Node('z');

        zero = new Node('0');

        um = new Node('1');

        dois = new Node('2');

        tres = new Node('3');

        quatro = new Node('4');

        cinco = new Node('5');

        seis = new Node('6');

        sete = new Node('7');

        oito = new Node('8');

        nove = new Node('9');

        espaco1 = new Node(' ');

        espaco2 = new Node(' ');

        espaco3 = new Node(' ');

        espaco4 = new Node(' ');

        espaco5 = new Node(' ');

        espaco6 = new Node(' ');

        espaco7 = new Node(' ');

        espaco8 = new Node(' ');

        espaco9 = new Node(' ');

        espaco10 = new Node(' ');

        espaco11 = new Node(' ');

        espaco12 = new Node(' ');

        espaco13 = new Node(' ');

        espaco14 = new Node(' ');

        espaco15 = new Node(' ');

        espaco16 = new Node(' ');

        espaco17 = new Node(' ');

        espaco18 = new Node(' ');

        espaco19 = new Node(' ');

        espaco20 = new Node(' ');

        espaco21 = new Node(' ');

        espaco22 = new Node(' ');

        espaco23 = new Node(' ');

        espaco24 = new Node(' ');

        espaco25 = new Node(' ');

        espaco26 = new Node(' ');

        n.setParent(t);
        m.setParent(t);
        d.setParent(n);
        k.setParent(n);
        g.setParent(m);
        o.setParent(m);
        b.setParent(d);
        x.setParent(d);
        c.setParent(k);
        y.setParent(k);
        z.setParent(g);
        q.setParent(g);
        espaco1.setParent(o);
        espaco2.setParent(o);
        seis.setParent(b);
        espaco3.setParent(b);
        espaco4.setParent(x);
        espaco5.setParent(x);
        espaco6.setParent(c);
        espaco7.setParent(c);
        espaco8.setParent(y);
        espaco9.setParent(y);
        sete.setParent(z);
        espaco10.setParent(z);
        espaco11.setParent(q);
        espaco12.setParent(q);
        oito.setParent(espaco1);
        espaco13.setParent(espaco1);
        nove.setParent(espaco2);
        zero.setParent(espaco2);
        i.setParent(e);
        a.setParent(e);
        s.setParent(i);
        u.setParent(i);
        r.setParent(a);
        w.setParent(a);
        h.setParent(s);
        v.setParent(s);
        f.setParent(u);
        espaco14.setParent(u);
        l.setParent(r);
        espaco15.setParent(r);
        p.setParent(w);
        j.setParent(w);
        cinco.setParent(h);
        quatro.setParent(h);
        espaco16.setParent(v);
        tres.setParent(v);
        espaco17.setParent(f);
        espaco18.setParent(f);
        espaco19.setParent(espaco14);
        dois.setParent(espaco14);
        espaco20.setParent(l);
        espaco21.setParent(l);
        espaco22.setParent(espaco15);
        espaco23.setParent(espaco15);
        espaco24.setParent(p);
        espaco25.setParent(p);
        espaco26.setParent(j);
        um.setParent(j);
    }


    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public char moseToChar(String code) { //decode
        return ' ';
    }


    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    private String charToMorse(Node node) { //encode
        return " ";
    }


    // Este método deve permanecer como está.
    public String charToMorse(char c) {
        return charToMorse(map.get(c));
    }


    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public LinkedList<String> getCodes() {
        return new LinkedList<>();
    }
}





