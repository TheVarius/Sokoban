public class TestSokoban {
    public static void main(String[] args) {
        System.out.println("Uruchamianie testów Sokoban...");
        int failed = 0;

        try {
            LevelManager.Level level = LevelManager.getLevel(1);
            if (level == null) throw new RuntimeException("Nie załadowano poziomu 1.");
            System.out.println("✅ Test 1: Ładowanie poziomu powiodło się.");
        } catch (Exception e) {
            System.out.println("❌ Test 1: Błąd - " + e.getMessage());
            failed++;
        }

        try {
            GameBoard board = new GameBoard(5, 5);
            Player player = new Player(2, 2);
            board.addObject(player);
            boolean moved = board.movePlayer(1, 0);
            if (!moved || player.getX() != 3) {
                throw new RuntimeException("Gracz nie wykonał ruchu.");
            }
            System.out.println("✅ Test 2: Ruch gracza powiódł się.");
        } catch (Exception e) {
            System.out.println("❌ Test 2: Błąd - " + e.getMessage());
            failed++;
        }

        if (failed > 0) {
            System.err.println("Testy zakończone błędem: " + failed);
            System.exit(1);
        } else {
            System.out.println("Wszystkie testy zakończone pomyślnie.");
            System.exit(0);
        }
    }
}
