package justcompany.noughtsandcrosses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class TicTacToe {

    private Map<Integer, Status> field = new HashMap<>();
    private List<Integer> clearCells = new ArrayList<>();

    TicTacToe(List<Integer> btns) {
        for (Integer id : btns) {
            field.put(id, Status.CLEAR);
        }
        clearCells.addAll(btns);
    }

    Status getButtonStatus(Integer idButton) {
        return cells.get(idButton).status;
    }

    void setStatus(Integer id, Status status) {
        field.put(id, status);
        clearCells.remove(id);
    }

    Integer idButtonForComputerTurn() {
        Random rnd = new Random();
        Integer idBttnForTurn = clearCells.get(rnd.nextInt(clearCells.size()));
        setStatus(idBttnForTurn, Status.NOUGHT);
        return idBttnForTurn;
    }

    boolean canDoTurn() {
        boolean rsl = true;
        if (clearCells.size() == 0) {
            rsl = false;
        }
        return rsl;
    }

    boolean win() {
        boolean rsl = false;





        return rsl;
    }
}