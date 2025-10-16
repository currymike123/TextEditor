import simpleUi.Editor;
import simpleUi.SimpleEditor;

public class Main {
  public static void main(String[] args) {
    Editor ui = new SimpleEditor("CS2 Text Editor");

    // You will be adding your code within each one of these button actions.
    // The "-> { ... }" syntax defines a Runnable (a block of code to run later).

    // ANALYZE BUTTON
    // Purpose: build data structures from current text and report analysis.
    // TODO: count steps while building structures (ArrayList/LinkedList/BST) and computing stats
    ui.addButton("Analyze", () -> {
      // TODO: build data structures from Text.words(ui.getText()); count steps for inserts
      // TODO: compute statistics (word count, unique words); report step counts
      // ADD CODE HERE!
    
    });

    // REPLACE BUTTON
    // Purpose: perform replacement and record steps for the operation.
    // TODO: push current text onto undo stack (for undo), clear redo
    // TODO: count steps performed during replace (e.g., scans/comparisons) and report
    ui.addButton("Replace", () -> {
      // TODO: save state for undo
      // TODO: prompt for target/replacement, perform replace while counting steps
      // TODO: ui.alert with step count
      // ADD CODE HERE!

    });

    // CLEAR BUTTON
    // Purpose: clear editor text and record previous state for undo.
    // TODO: push current text onto undo stack and clear redo stack
    ui.addButton("Clear", () -> {
        // TODO: push current text to undo stack
        // TODO: clear redo stack
        // TODO: call ui.clearText()
        // ADD CODE HERE!

    });

    // UNDO BUTTON
    // Purpose: restore previous state using undo/redo stacks.
    // TODO: implement undo semantics and count steps for restoring (if desired)
    ui.addButton("Undo", () -> {
     // TODO: if undo stack not empty, push current text to redo and setText(pop undo)
     // TODO: ui.alert action/result
     // ADD CODE HERE!

    });

    // REDO BUTTON
    // Purpose: reapply last undone change.
    // TODO: implement redo semantics and optionally count steps
    ui.addButton("Redo", () -> {
     // TODO: if redo stack not empty, push current text to undo and setText(pop redo)
     // TODO: ui.alert action/result
     // ADD CODE HERE!

    });

    // PRINT QUEUE BUTTON
    // Purpose: manage virtual print queue (view/start jobs). Counting steps is optional.
    // TODO: add current doc to queue or start printing; simulate delay in background thread
    ui.addButton("Print Queue", () -> {
     // TODO: show queue contents or start next print job (simulate 20s per job)
     // ADD CODE HERE!

    });

    // SEARCH - ArrayList
    // Purpose: Use ArrayList and perform a linear search while counting steps (comparisons).
    ui.addButton("Search ArrayList", () -> {
        // TODO: build ArrayList 
        // TODO: prompt for search term
        // TODO: perform linear search counting comparisons; ui.alert found/not found + steps
        // ADD CODE HERE!
        
    });

    // SEARCH - LinkedList
    // Purpose: Use LinkedList and perform a linear search while counting steps (node visits).
    ui.addButton("Search LinkedList", () -> {
       // TODO: build LinkedList
       // TODO: prompt for search term
       // TODO: perform linear search counting node visits; ui.alert found/not found + steps
       // ADD CODE HERE!

    });

    // SEARCH - BST
    // Purpose: USe BST and perform search while counting comparison steps.
    ui.addButton("Search BST", () -> {
        // TODO: build BST 
        // TODO: prompt for search term
        // TODO: perform BST search counting comparisons; ui.alert found/not found + steps
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