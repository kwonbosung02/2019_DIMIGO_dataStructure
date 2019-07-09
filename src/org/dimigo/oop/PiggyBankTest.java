package org.dimigo.oop;

public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember[] familyMembers = {
            new FamilyMember( "아빠" ),
            new FamilyMember( "엄마" ),
            new FamilyMember( "나" ),
            new FamilyMember( "남동생" )
        };

        FamilyMember.printMemberCnt();
        PiggyBank.putMoney( familyMembers[0],10000 );
        PiggyBank.putMoney( familyMembers[1],5000 );
        PiggyBank.putMoney( familyMembers[2],2000 );
        PiggyBank.putMoney( familyMembers[3],1000 );
        PiggyBank.printBalance();
        PiggyBank.putMoney( familyMembers[2],1000 );
        PiggyBank.printBalance();

    }
}
