package org.dimigo.oop;

    public class ArrayTest<i> {

        public static void main(String[] args) {
            String[] groupName = {"방탄", "2NE1", "걸스데이"};

            String[ ][ ] memberName = {
                    {"정국","지민","뷔","슈가","진"},
                    {"CL","산다라박","박봄","민지"},
                    {"유라","혜리","소진","민아"}
            };
            for (int i = 0; i < 3; i++)
            {
                System.out.print("<< " + groupName[i] + " >>\n");
                for(String Name : memberName[i])
                {
                    System.out.println(Name);
                }

                System.out.println();
            }

        }


    }