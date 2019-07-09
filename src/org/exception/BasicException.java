package org.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        try {
            //uncheckedException
            //checkedException
            checkedException();
            String id = "dsd"   ;
            validate( id );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
/*
    private static void validate(String id) {
        try {
            if (id == null || "".equals( id )) {
                Exception e = new Exception( "ID를 입력하세요" );
                throw e;

            }

            if (id.length() < 8) {
                throw new Exception( "8자 이상 입력하세요" );

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
*/

    private static void validate(String id) throws Exception{
        try {
            if (id == null || "".equals( id )) {
                Exception e = new Exception( "ID를 입력하세요" );
                throw e;

            }

            if (id.length() < 8) {
                throw new Exception( "8자 이상 입력하세요" );

            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }


    //강제로 예외처리 해야한다고 컴파일러가 알려줌
    private static void checkedException(){
        try{
        BufferedReader br = new BufferedReader(
                new FileReader( "input.txt" ));
            String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
        }
        catch(FileNotFoundException fne){
            System.out.println("노 파일");
        }catch (IOException ie){
            System.out.println("노 파일 리딩");
        }

    }
//사용자가 알아서 해야한다.
    private static void uncheckedException(String s){
        try {
//            System.out.println( s.length() );
            Integer.parseInt( "123a" );
            //NullPointerException npe = new NullpointerException();
        }catch (NullPointerException npe){
            System.out.println("문자열 입력 노노");
        }catch (NumberFormatException nfe){
            System.out.println("숫자 노노");
            nfe.printStackTrace();
        }catch (Exception e){
            System.out.println("알수가없다");
        }



    }
}
