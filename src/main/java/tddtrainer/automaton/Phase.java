package tddtrainer.automaton;

public enum Phase {

    RED, // a new failing test should be created
    GREEN, // code to pass the failing test should be entered
    REFACTOR, // code and tests can be improved
    RETROSPECT // review the code and go back to phase RED

}
