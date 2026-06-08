# Projekt: Sokoban (Gra 2D w Javie)

[![Tests](https://github.com/TheVarius/Sokoban/actions/workflows/java_tests.yml/badge.svg)](https://github.com/TheVarius/Sokoban/actions)

## Opis zadania

Ten projekt to klasyczna gra logiczna Sokoban napisana w Javie.

Aby to działało poprawnie, gra opiera się na prostych zasadach:

1. **Gracz** – porusza się po planszy i może pchać skrzynki.
2. **Skrzynki** – można je tylko pchać, nie da się ich ciągnąć ani pchać kilku na raz.
3. **Cele** – miejsca, na które trzeba przepchnąć wszystkie skrzynki, żeby ukończyć poziom.

Wszystkie skrzynki muszą znaleźć się na celach, aby wygrać i przejść do kolejnego etapu.

## Sterowanie

Gra reaguje na klawisze:

- **`Strzałki`** – ruch postacią w czterech kierunkach (lewo, prawo, góra, dół).
- **`Klawisz R`** – restartuje obecny poziom, jeśli zablokujesz skrzynkę w kącie.

## Opis implementacji i plików źródłowych

Projekt jest napisany w Javie i korzysta z biblioteki `Swing` do wyświetlania okna gry.

**Główny folder:**

- `SokobanGUI.java` – główny plik uruchomieniowy. Odpowiada za wyświetlenie okna gry oraz odbieranie klawiszy od gracza.
- `GameEngine.java` – zarządza poziomami gry, ich wczytywaniem i restartowaniem.
- `GameBoard.java` – trzyma informacje o aktualnej planszy, obsługuje ruch gracza i skrzynek oraz sprawdza, czy poziom jest ukończony.
- `GamePanel.java` – rysuje grafikę gry na ekranie i dopasowuje jej rozmiar do okna.
- `LevelManager.java` – zawiera gotowe układy dla 10 poziomów gry.
- `GameObject.java` – bazowy plik, po którym dziedziczą wszystkie obiekty na planszy.
- `Player.java` – skrypt reprezentujący gracza.
- `Box.java` – skrypt reprezentujący skrzynkę (zmienia swój wygląd, gdy stoi na celu).
- `Target.java` – reprezentuje punkty docelowe, na które trzeba pchać skrzynki.
- `Wall.java` – reprezentuje ściany, przez które nie można przejść ani przepchnąć skrzynki.
- `ResourceLoader.java` – wczytuje pliki graficzne z folderu resources.

**Folder `resources/`:**

- `player.png` – grafika gracza.
- `wall.png` – grafika ściany.
- `box.png` – grafika skrzynki stojącej na zwykłym polu.
- `box_on_target.png` – grafika skrzynki stojącej na celu.
- `target.png` – grafika celu (punktu docelowego).

**Folder `tests/`:**

- `TestSokoban.java` – testy sprawdzające, czy kod nie ma błędów (ładowanie poziomu, ruch gracza itp.).

**Folder `.github/workflows/`:**

- `java_tests.yml` – konfiguracja GitHub Actions. Mówi GitHubowi, żeby za każdym razem, gdy wrzucisz nowy kod, automatycznie go przetestował.

## Jak to uruchomić?

1. Przygotuj folder `resources/` i wrzuć do niego potrzebne grafiki (wzór poniżej):

   ```text
   player.png
   wall.png
   box.png
   box_on_target.png
   target.png
   ```

2. Skompiluj pliki wpisując w terminalu:

   ```bash
   javac SokobanGUI.java
   ```

3. Odpal grę wpisując:
   ```bash
   java SokobanGUI
   ```

## Plany na przyszłość

Projekt jest stale rozwijany. W zakładce **Issues** na GitHubie będę dodawał nowe pomysły.
