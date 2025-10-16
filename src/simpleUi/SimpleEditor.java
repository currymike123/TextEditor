package simpleUi;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public final class SimpleEditor extends AbstractEditor {
  private final JFrame frame;
  private final JTextArea area;
  private final JPanel buttonRow;

  public SimpleEditor(String title) {
    frame = new JFrame(title);
    area = new JTextArea();
    buttonRow = new JPanel(new FlowLayout(FlowLayout.LEFT));
    init();
  }

  private void init() {
    area.setLineWrap(true);
    area.setWrapStyleWord(true);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1300, 800);

    JPanel content = new JPanel(new BorderLayout(5, 5));
    content.add(new JScrollPane(area), BorderLayout.CENTER);
    content.add(buttonRow, BorderLayout.SOUTH);

    frame.setContentPane(content);
  }

  @Override
  protected void uiShow() {
    SwingUtilities.invokeLater(() -> frame.setVisible(true));
  }

  @Override
  protected String uiGetText() { return area.getText(); }

  @Override
  protected void uiSetText(String text) { area.setText(text); }

  @Override
  protected void uiClearText() { area.setText(""); clearHighlights(); }

  @Override
  protected void uiAddButton(String label, Runnable action) {
    JButton b = new JButton(label);
    b.addActionListener(e -> action.run());
    buttonRow.add(b);
    buttonRow.revalidate();
    buttonRow.repaint();
  }

  @Override
  protected void uiAlert(String message) {
    JOptionPane.showMessageDialog(frame, message);
  }

  @Override
  protected String uiPrompt(String message) {
    return JOptionPane.showInputDialog(frame, message);
  }

  @Override
  protected void uiHighlight(String term) {
    clearHighlights();
    if (term == null || term.isEmpty()) return;

    Highlighter hl = area.getHighlighter();
    Highlighter.HighlightPainter painter =
        new DefaultHighlighter.DefaultHighlightPainter(new Color(255, 255, 0, 128));

    String text = area.getText();
    String hay = text.toLowerCase();
    String needle = term.toLowerCase();

    int index = 0;
    while (true) {
      index = hay.indexOf(needle, index);
      if (index < 0) break;
      try {
        hl.addHighlight(index, index + term.length(), painter);
      } catch (BadLocationException ignored) { }
      index += term.length();
    }
  }

  @Override
  protected void uiReplace(String target, String replacement) {
    if (target == null || target.isEmpty()) return;
    String current = area.getText();
    String updated = current.replace(target, replacement == null ? "" : replacement);
    area.setText(updated);
    clearHighlights();
  }

  private void clearHighlights() {
    area.getHighlighter().removeAllHighlights();
  }
}
