import simpleUi.Editor;
import simpleUi.SimpleEditor;

public class Main {
  public static void main(String[] args) {
    Editor ui = new SimpleEditor("CS2 Text Editor");

    // You will be adding your code within each one of these button actions.
    // The "-> { ... }" syntax defines a Runnable (a block of code to run later).
    // The block of code to be run is your implementation for that button.

    // ANALYZE BUTTON
    // Purpose: build data structures from current text and report analysis.
    ui.addButton("Analyze", () -> {
      // ADD CODE HERE!

    });

    // REPLACE BUTTON
    // Purpose: perform replacement and record steps for the operation.
    ui.addButton("Replace", () -> {
      // ADD CODE HERE!

    });

    // CLEAR BUTTON
    // Purpose: clear editor text and record previous state for undo once
    // implemented.
    ui.addButton("Clear", () -> {
      // ADD CODE HERE!

    });

    // UNDO BUTTON
    // Purpose: restore previous state using undo/redo stacks.
    ui.addButton("Undo", () -> {
      // ADD CODE HERE!

    });

    // REDO BUTTON
    // Purpose: reapply last undone change.
    ui.addButton("Redo", () -> {
      // ADD CODE HERE!

    });

    // PRINT QUEUE BUTTON
    // Purpose: manage virtual print queue (view/start jobs).
    ui.addButton("Print Queue", () -> {
      // ADD CODE HERE!

    });

    // SEARCH - ArrayList
    // Purpose: Use ArrayList and perform a linear search while counting steps
    ui.addButton("Search ArrayList", () -> {
      // ADD CODE HERE!

    });

    // SEARCH - LinkedList
    // Purpose: Use LinkedList and perform a linear search while counting steps
    ui.addButton("Search LinkedList", () -> {
      // ADD CODE HERE!

    });

    // SEARCH - BST
    // Purpose: USe BST and perform search while counting comparison steps.
    ui.addButton("Search BST", () -> {
      // ADD CODE HERE!

    });

    // LOAD FILE BUTTON
    // Purpose: load text from a file into the editor.
    ui.addButton("Load File", () -> {
      // ADD CODE HERE!

    });

    // Load demo text for testing.
    ui.addButton("Load Demo", () -> ui.setText(
        "If you’re going to try, go all the way.\n" +
            "Otherwise, don’t even start.\n" +
            "If you're going to try, go all the way.\n" +
            "This could mean losing girlfriends, wives, relatives, jobs and maybe even your mind.\n" +
            "It could mean not eating for three or four days.\n" +
            "It could mean freezing on a park bench.\n" +
            "It could mean jail.\n" +
            "It could mean derision, mockery, isolation.\n" +
            "Isolation is the gift.\n" +
            "All the others are a test of your endurance, of how much you really want to do it.\n" +
            "And, you’ll do it, despite rejection and the worst odds.\n" +
            "And it will be better than anything else you can imagine.\n" +
            "If you’re going to try, go all the way.\n" +
            "There is no other feeling like that.\n\n" +
            "You will be alone with the gods, and the nights will flame with fire.\n" +
            "DO IT. DO IT. DO IT. All the way\n" +
            "You will ride life straight to perfect laughter. It’s the only good fight there is.\n\n" +
            "– Charles Bukowski"

    ));

    ui.show();
  }
}