public class TeamTest {
    public static void main(String[] args) {
        FootballPlayer joe =new FootballPlayer("Joe");
        BaseballPlayer pat=new BaseballPlayer("Pat");
       SoccerPlayer backham=new SoccerPlayer("Beckham");
       Team liverpool=new Team("liverpool");
       liverpool.addPlayer(joe);
       liverpool.addPlayer(pat);
       liverpool.addPlayer(backham);
        System.out.println("liverpool.numPlayer() = " + liverpool.numPlayer());

//        Team<String> broken= new Team<>("this not work");
//        broken.addPlayer("broken");
//        System.out.println("broken.numPlayer() = " + broken.numPlayer());
    }
}
