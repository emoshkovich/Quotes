import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;


public class QuoteView {
private JPanel mainPanel;
private JButton quoteButton;
private JLabel quoteLabel;
private Color purple = new Color(165, 197, 250);
private Quotes quotes = new Quotes();
private String[] categoriesStr = quotes.getCategories();
private HashMap<String, ArrayList<String>> quotesMap = quotes.createQuotesMap();
private ArrayList<String> quotesList = quotesMap.get(categoriesStr[0]);
private String displayedQuote;
private int prev = -1;

	public JPanel mainPanel(){
		mainPanel = new JPanel();
		mainPanel.setBackground(purple);
		mainPanel.setLayout(new BorderLayout(100,100));
		mainPanel.add(categoriesPanel(), BorderLayout.WEST);
		mainPanel.add(quotesPanel(), BorderLayout.CENTER);
		mainPanel.add(emptyPanel(), BorderLayout.EAST);
		
		quoteButton = new JButton("Pick a quote");
		quoteButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				displayedQuote = quotesList.get(pickAQuote());
				quoteLabel.setText("<html><p style=\"width:300px\">"+displayedQuote+"</p></html>");
			}
			
		});
		mainPanel.add(quoteButton, BorderLayout.SOUTH);
		return mainPanel;
		
	}
	
	private JPanel categoriesPanel(){
		int categoriesNum = categoriesStr.length;
		GridLayout categoriesLayout = new GridLayout(categoriesNum, 1);
		JPanel categories = new JPanel();
		categories.setBackground(purple);
		categories.setLayout(categoriesLayout);
		
		ButtonGroup bg = new ButtonGroup();
		final JRadioButton buttons[] = new JRadioButton[categoriesNum];
		buttons[0] = new JRadioButton(categoriesStr[0]);
		buttons[0].setSelected(true);
		buttons[0].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (buttons[0].isSelected()){
					quotesList = quotesMap.get(categoriesStr[0]);
				}
				
			}
			
		});
		buttons[1] = new JRadioButton(categoriesStr[1]);
		buttons[1].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (buttons[1].isSelected()){
					pickAQuote();
					quotesList = quotesMap.get(categoriesStr[1]);
				}
				
			}
			
		});
		buttons[2] = new JRadioButton(categoriesStr[2]);
		buttons[2].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (buttons[2].isSelected()){
					pickAQuote();
					quotesList = quotesMap.get(categoriesStr[2]);
				}
				
			}
			
		});
		buttons[3] = new JRadioButton(categoriesStr[3]);
		buttons[3].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (buttons[3].isSelected()){
					pickAQuote();
					quotesList = quotesMap.get(categoriesStr[3]);
				}
				
			}
			
		});
		

		buttons[4] = new JRadioButton(categoriesStr[4]);
		buttons[4].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				pickAQuote();
				if (buttons[4].isSelected()){
					quotesList = quotesMap.get(categoriesStr[4]);
				}
				
			}
			
		});

		buttons[5] = new JRadioButton(categoriesStr[5]);
		buttons[5].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				pickAQuote();
				if (buttons[5].isSelected()){
					quotesList = quotesMap.get(categoriesStr[5]);
				}
				
			}
			
		});

		buttons[6] = new JRadioButton(categoriesStr[6]);
		buttons[6].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (buttons[6].isSelected()){
					pickAQuote();
					quotesList = quotesMap.get(categoriesStr[6]);
				}
				
			}
			
		});

		buttons[7] = new JRadioButton(categoriesStr[7]);
		buttons[7].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (buttons[7].isSelected()){
					pickAQuote();
					quotesList = quotesMap.get(categoriesStr[7]);
				}
				
			}
			
		});

		buttons[8] = new JRadioButton(categoriesStr[8]);
		buttons[8].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (buttons[8].isSelected()){
					pickAQuote();
					quotesList = quotesMap.get(categoriesStr[8]);
				}
				
			}
			
		});

		buttons[9] = new JRadioButton(categoriesStr[9]);
		buttons[9].addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				pickAQuote();
				if (buttons[9].isSelected()){
					quotesList = quotesMap.get(categoriesStr[9]);
				}
				
			}
			
		});
		for (int i = 0; i < buttons.length; i++){
			categories.add(buttons[i]);
			bg.add(buttons[i]);
		}
		
		return categories;
	}
	
	private JPanel quotesPanel(){
		JPanel quotePanel = new JPanel();
		quotePanel.setBackground(new Color(203, 220, 250));
		quotePanel.setLayout(new GridBagLayout());
		Border b = BorderFactory.createLineBorder(new Color(0, 0, 102), 7);
		quotePanel.setBorder(b);
		quoteLabel = new JLabel();
		quoteLabel.setFont(new Font("Monaco", Font.BOLD, 20));
		quoteLabel.setForeground(new Color(0, 0, 102));
		quotePanel.add(quoteLabel);
		
		return quotePanel;
	}
	
	private JPanel emptyPanel(){
		JPanel emptyPanel = new JPanel();
		emptyPanel.setBackground(purple);
		return emptyPanel;
	}
	
	private int pickAQuote(){
		Random rand = new Random();
		int qindex = rand.nextInt(quotesList.size());
		while (qindex == prev){
			 rand = new Random();
			 qindex = rand.nextInt(quotesList.size());
		}
		prev = qindex;
		return qindex;
	}
}
