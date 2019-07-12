import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Label;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.ScrollPane;
import javax.swing.Box;


public class finalprojtextarea extends JFrame {

	private JPanel contentPane;
	private JTextField textField; // name
	private JTextField textField_1; // date of reservation
	private JTextField textField_2; // number of days you wish to stay
	private JTextField nametext;
	private JTextField hoteltext;
	private JTextField datetext;
	private JTextField roomtypetext;
	private JTextField totalcosttext;
	private JTextField discountchosentext;
	private JTextField priceafterdiscounttext;
	private JTextField nightstext;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalprojtextarea frame = new finalprojtextarea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public finalprojtextarea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{260, 137, 0};
		gbl_panel.rowHeights = new int[]{16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblWelcomeToNorthwoods = new JLabel("Welcome to Northwood's Reservation System");
		lblWelcomeToNorthwoods.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblWelcomeToNorthwoods = new GridBagConstraints();
		gbc_lblWelcomeToNorthwoods.gridwidth = 2;
		gbc_lblWelcomeToNorthwoods.anchor = GridBagConstraints.NORTH;
		gbc_lblWelcomeToNorthwoods.insets = new Insets(0, 0, 5, 0);
		gbc_lblWelcomeToNorthwoods.gridx = 0;
		gbc_lblWelcomeToNorthwoods.gridy = 0;
		panel.add(lblWelcomeToNorthwoods, gbc_lblWelcomeToNorthwoods);
		
		JLabel lblPleaseEnterYou = new JLabel("Please login with your name:");
		GridBagConstraints gbc_lblPleaseEnterYou = new GridBagConstraints();
		gbc_lblPleaseEnterYou.insets = new Insets(0, 0, 5, 5);
		gbc_lblPleaseEnterYou.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblPleaseEnterYou.gridx = 0;
		gbc_lblPleaseEnterYou.gridy = 1;
		panel.add(lblPleaseEnterYou, gbc_lblPleaseEnterYou);
		
		// Text Field to enter your name
				textField = new JTextField();
				GridBagConstraints gbc_textField = new GridBagConstraints();
				gbc_textField.insets = new Insets(0, 0, 5, 0);
				gbc_textField.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField.gridx = 1;
				gbc_textField.gridy = 1;
				panel.add(textField, gbc_textField);
				textField.setColumns(10);
				
				//displays name that is entered
				JLabel label = new JLabel("");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 0;
				gbc_label.gridy = 2;
				panel.add(label, gbc_label);
	
		JButton button = new JButton("Login");
		//action listener for the login button to display name
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String outputname = textField.getText();
				label.setText(outputname);
			}
		});
		
		
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 1;
		gbc_button.gridy = 2;
		panel.add(button, gbc_button);
		
		// Label to choose the hotel you wish to book
		JLabel lblChooseTheHotel = new JLabel("Choose the hotel you wish to book:");
		GridBagConstraints gbc_lblChooseTheHotel = new GridBagConstraints();
		gbc_lblChooseTheHotel.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseTheHotel.anchor = GridBagConstraints.EAST;
		gbc_lblChooseTheHotel.gridx = 0;
		gbc_lblChooseTheHotel.gridy = 3;
		panel.add(lblChooseTheHotel, gbc_lblChooseTheHotel);
		
		// Drop down to choose the hotel you wish to book
		JComboBox comboBox = new JComboBox();
		
		// add items to combo box
		
		comboBox.addItem("Ritz Carlton (Chicago, IL)");
		comboBox.addItem("Comfort Inn (Madison, WI)");
		comboBox.addItem("Hyatt (Los Angeles, CA)");
		comboBox.addItem("The View Hotel (Sussex, UK)");
		comboBox.addItem("Grand Hotel (Macklinac, MI)");
		comboBox.addItem("Plaza Hotel (New York, NY)");
		comboBox.setSelectedItem(null);
		
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panel.add(comboBox, gbc_comboBox);
		
		// Label to enter date of reservation
		JLabel lblEnterTheDate = new JLabel("Enter the date of your reservation:");
		GridBagConstraints gbc_lblEnterTheDate = new GridBagConstraints();
		gbc_lblEnterTheDate.anchor = GridBagConstraints.EAST;
		gbc_lblEnterTheDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterTheDate.gridx = 0;
		gbc_lblEnterTheDate.gridy = 4;
		panel.add(lblEnterTheDate, gbc_lblEnterTheDate);
		
		// Text field to enter date of reservation
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		// Label to choose the type of room
		JLabel lblChooseTypeOf = new JLabel("Choose type of room:");
		GridBagConstraints gbc_lblChooseTypeOf = new GridBagConstraints();
		gbc_lblChooseTypeOf.anchor = GridBagConstraints.EAST;
		gbc_lblChooseTypeOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseTypeOf.gridx = 0;
		gbc_lblChooseTypeOf.gridy = 5;
		panel.add(lblChooseTypeOf, gbc_lblChooseTypeOf);
		
		// Drop down menu to choose type of room (Single, Double, Suite)
		JComboBox comboBox_1 = new JComboBox();
		
		// add options to choose from combo box
		comboBox_1.addItem("Single");
		comboBox_1.addItem("Double");
		comboBox_1.addItem("Suite");
		comboBox_1.setSelectedItem(null);
		
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 5;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		// Label to enter the number of days you wish to stay
		JLabel lblEnterNumberOf = new JLabel("Enter number of days you wish to stay:");
		GridBagConstraints gbc_lblEnterNumberOf = new GridBagConstraints();
		gbc_lblEnterNumberOf.anchor = GridBagConstraints.EAST;
		gbc_lblEnterNumberOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterNumberOf.gridx = 0;
		gbc_lblEnterNumberOf.gridy = 6;
		panel.add(lblEnterNumberOf, gbc_lblEnterNumberOf);
		
		// Text Field to enter number of days you wish to stay
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 6;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		// Label to choose the discount applicable
		JLabel lblChooseDiscountIf = new JLabel("Choose discount if applicable:");
		GridBagConstraints gbc_lblChooseDiscountIf = new GridBagConstraints();
		gbc_lblChooseDiscountIf.anchor = GridBagConstraints.EAST;
		gbc_lblChooseDiscountIf.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseDiscountIf.gridx = 0;
		gbc_lblChooseDiscountIf.gridy = 7;
		panel.add(lblChooseDiscountIf, gbc_lblChooseDiscountIf);
		
		//	Drop down menu for the Discounts applicable (Student, Senior, Birthday, Corporate, No Discount)
		JComboBox comboBox_2 = new JComboBox();
		
		//add items to combo box
		comboBox_2.addItem("Student (5%)");
		comboBox_2.addItem("Senior (20%)");
		comboBox_2.addItem("Birthday (15%)");
		comboBox_2.addItem("Corporate (25%)");
		comboBox_2.addItem("No Discount");
		comboBox_2.setSelectedItem(null);
		
		
		
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 7;
		panel.add(comboBox_2, gbc_comboBox_2);
		
		// Button to CALCULATE TOTAL PRICE (DISPLAYS RESULT OF THE PROGRAM)
		JButton btnNewButton = new JButton("See Reservation Details and Price");
		//add function to button to print all calculated values to Text Area
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			String outputname = textField.getText();
			String hotelchosen = (String) comboBox.getSelectedItem();
			String outputdate = textField_1.getText();
			String roomchosen = (String) comboBox_1.getSelectedItem();
			String days_stay = textField_2.getText();
			String discountchosen = (String) comboBox_2.getSelectedItem();
			double days_staydouble = Double.parseDouble(days_stay);
			 
			double SinglePrice = 0;
		    double DoublePrice= 0;
			double SuitePrice= 0;
			double SalesTaxCalc= 0;
			String SalesTax = "0";
			
			//assigning room prices for hotel chosen
			
			if (hotelchosen.equals("Ritz Carlton (Chicago, IL)")) {
				SalesTaxCalc = 0.09;
			    SalesTax = "Sales Tax = 9%";
			    SinglePrice = 200;
			    DoublePrice = 350;
			    SuitePrice = 500;
			}
			else if (hotelchosen.equals("Comfort Inn (Madison, WI)")) {
			    SalesTaxCalc = 0.07;
			    SalesTax = "Sales Tax = 7%";
			    SinglePrice = 141;
			    DoublePrice = 240;
			    SuitePrice = 400;
			}
			else if (hotelchosen.equals("Hyatt (Los Angeles, CA)")) {
				SalesTaxCalc= 0.10;
				SalesTax = "Sales Tax = 10%";
				SinglePrice = 70;
			    DoublePrice = 100;
			    SuitePrice = 150;
			}
			else if (hotelchosen.equals("The View Hotel (Sussex, UK)")) {
				SalesTaxCalc= 0.01;
				SalesTax= "Sales Tax = 1%";
				SinglePrice = 61;
			    DoublePrice = 100;
			    SuitePrice = 130;
			}
			else if (hotelchosen.equals("Grand Hotel (Macklinac, MI)")) {
				SalesTaxCalc= 0.06;
			    SalesTax = "Sales Tax = 6%";
				SinglePrice = 220;
			    DoublePrice = 380;
			    SuitePrice = 480;
			}
			else if(hotelchosen.equals("Plaza Hotel (New York, NY)")) {
				SalesTaxCalc= 0.08;
				SalesTax= "Sales Tax = 8%";
				SinglePrice = 40;
			    DoublePrice = 60;
			    SuitePrice = 80;
			}
			
			double totalCost = 0;
			double taxTotal = 0;
			double totalwithTax = 0;
			String RoomType = "";
			
		// calculations for type of room chosen
		   if (roomchosen.equals("Single")) {
			   totalCost = SinglePrice;
			   taxTotal = SinglePrice + (SinglePrice * SalesTaxCalc);
			   totalwithTax = days_staydouble * taxTotal;
			   RoomType = "Single Room";
		   }
		   else if (roomchosen.equals("Double")) {
			   totalCost = DoublePrice;
			   taxTotal = DoublePrice + (DoublePrice* SalesTaxCalc);
			   totalwithTax = days_staydouble * taxTotal;
			   RoomType = "Double Room";
		   }
		   else if (roomchosen.equals("Suite")) {
			   totalCost = SuitePrice;
			   taxTotal = SuitePrice + (SuitePrice * SalesTaxCalc);
			   totalwithTax = days_staydouble * taxTotal;
			   RoomType = "Suite Room";
		   }
		   
		   //calculations for discount chosen
		   double disCalc =0;
		   if (discountchosen.equals("Student (5%)")) {
			   disCalc = totalwithTax * 0.95;
		   }
		   if (discountchosen.equals("Senior (20%)")) {
			   disCalc = totalwithTax * 0.80;
		   } 
		   if (discountchosen.equals("Birthday (15%)")) {
			   disCalc = totalwithTax * 0.85;
		   } 
		   if (discountchosen.equals("Corporate (25%)")) {
			   disCalc = totalwithTax * 0.75;
		   }
		   if (discountchosen.equals("No Discount")) {
			   disCalc = totalwithTax * 1;
		   }
		   
		   // convert values to string to display in text area
		   // - disCalc (gives final price after discount)
		   // - totalCost (gives total cost of room for one night)
		   // - totalwithTax (gives total cost before discount is applied)
		   
		   String disCalcstring = Double.toString(disCalc);
		   String totalCoststring = Double.toString(totalCost);
		   String totalwithTaxstring = Double.toString(totalwithTax);
		     
		   
		   //textfields to display
		  
		   nametext.setText(outputname);
		   hoteltext.setText(hotelchosen);
		   datetext.setText(outputdate);
		   roomtypetext.setText(RoomType);
		   totalcosttext.setText(totalCoststring);
		   discountchosentext.setText(discountchosen);
		   priceafterdiscounttext.setText(disCalcstring);
		   nightstext.setText(days_stay);
		   
			}
		});
				
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 8;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 9;
		panel.add(lblName, gbc_lblName);
		
		nametext = new JTextField();
		nametext.setEditable(false);
		GridBagConstraints gbc_nametext = new GridBagConstraints();
		gbc_nametext.anchor = GridBagConstraints.SOUTH;
		gbc_nametext.insets = new Insets(0, 0, 5, 0);
		gbc_nametext.fill = GridBagConstraints.HORIZONTAL;
		gbc_nametext.gridx = 1;
		gbc_nametext.gridy = 9;
		panel.add(nametext, gbc_nametext);
		nametext.setColumns(10);
		
		JLabel lblHotel = new JLabel("Hotel");
		GridBagConstraints gbc_lblHotel = new GridBagConstraints();
		gbc_lblHotel.anchor = GridBagConstraints.EAST;
		gbc_lblHotel.insets = new Insets(0, 0, 5, 5);
		gbc_lblHotel.gridx = 0;
		gbc_lblHotel.gridy = 10;
		panel.add(lblHotel, gbc_lblHotel);
		
		hoteltext = new JTextField();
		hoteltext.setEditable(false);
		GridBagConstraints gbc_hoteltext = new GridBagConstraints();
		gbc_hoteltext.insets = new Insets(0, 0, 5, 0);
		gbc_hoteltext.fill = GridBagConstraints.HORIZONTAL;
		gbc_hoteltext.gridx = 1;
		gbc_hoteltext.gridy = 10;
		panel.add(hoteltext, gbc_hoteltext);
		hoteltext.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		GridBagConstraints gbc_lblDate = new GridBagConstraints();
		gbc_lblDate.anchor = GridBagConstraints.EAST;
		gbc_lblDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblDate.gridx = 0;
		gbc_lblDate.gridy = 11;
		panel.add(lblDate, gbc_lblDate);
		
		datetext = new JTextField();
		datetext.setEditable(false);
		GridBagConstraints gbc_datetext = new GridBagConstraints();
		gbc_datetext.insets = new Insets(0, 0, 5, 0);
		gbc_datetext.fill = GridBagConstraints.HORIZONTAL;
		gbc_datetext.gridx = 1;
		gbc_datetext.gridy = 11;
		panel.add(datetext, gbc_datetext);
		datetext.setColumns(10);
		
		JLabel lblRoomType = new JLabel("Room Type");
		GridBagConstraints gbc_lblRoomType = new GridBagConstraints();
		gbc_lblRoomType.anchor = GridBagConstraints.EAST;
		gbc_lblRoomType.insets = new Insets(0, 0, 5, 5);
		gbc_lblRoomType.gridx = 0;
		gbc_lblRoomType.gridy = 12;
		panel.add(lblRoomType, gbc_lblRoomType);
		
		roomtypetext = new JTextField();
		roomtypetext.setEditable(false);
		GridBagConstraints gbc_roomtypetext = new GridBagConstraints();
		gbc_roomtypetext.insets = new Insets(0, 0, 5, 0);
		gbc_roomtypetext.fill = GridBagConstraints.HORIZONTAL;
		gbc_roomtypetext.gridx = 1;
		gbc_roomtypetext.gridy = 12;
		panel.add(roomtypetext, gbc_roomtypetext);
		roomtypetext.setColumns(10);
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		GridBagConstraints gbc_lblTotalCost = new GridBagConstraints();
		gbc_lblTotalCost.anchor = GridBagConstraints.EAST;
		gbc_lblTotalCost.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalCost.gridx = 0;
		gbc_lblTotalCost.gridy = 13;
		panel.add(lblTotalCost, gbc_lblTotalCost);
		
		totalcosttext = new JTextField();
		totalcosttext.setEditable(false);
		GridBagConstraints gbc_totalcosttext = new GridBagConstraints();
		gbc_totalcosttext.insets = new Insets(0, 0, 5, 0);
		gbc_totalcosttext.fill = GridBagConstraints.HORIZONTAL;
		gbc_totalcosttext.gridx = 1;
		gbc_totalcosttext.gridy = 13;
		panel.add(totalcosttext, gbc_totalcosttext);
		totalcosttext.setColumns(10);
		
		JLabel lblDiscountChosen = new JLabel("Discount Chosen");
		GridBagConstraints gbc_lblDiscountChosen = new GridBagConstraints();
		gbc_lblDiscountChosen.anchor = GridBagConstraints.EAST;
		gbc_lblDiscountChosen.insets = new Insets(0, 0, 5, 5);
		gbc_lblDiscountChosen.gridx = 0;
		gbc_lblDiscountChosen.gridy = 14;
		panel.add(lblDiscountChosen, gbc_lblDiscountChosen);
		
		discountchosentext = new JTextField();
		discountchosentext.setEditable(false);
		GridBagConstraints gbc_discountchosentext = new GridBagConstraints();
		gbc_discountchosentext.insets = new Insets(0, 0, 5, 0);
		gbc_discountchosentext.fill = GridBagConstraints.HORIZONTAL;
		gbc_discountchosentext.gridx = 1;
		gbc_discountchosentext.gridy = 14;
		panel.add(discountchosentext, gbc_discountchosentext);
		discountchosentext.setColumns(10);
		
		JLabel lblPriceAfterDiscount = new JLabel("Price after Discount");
		GridBagConstraints gbc_lblPriceAfterDiscount = new GridBagConstraints();
		gbc_lblPriceAfterDiscount.anchor = GridBagConstraints.EAST;
		gbc_lblPriceAfterDiscount.insets = new Insets(0, 0, 5, 5);
		gbc_lblPriceAfterDiscount.gridx = 0;
		gbc_lblPriceAfterDiscount.gridy = 15;
		panel.add(lblPriceAfterDiscount, gbc_lblPriceAfterDiscount);
		
		priceafterdiscounttext = new JTextField();
		priceafterdiscounttext.setEditable(false);
		GridBagConstraints gbc_priceafterdiscounttext = new GridBagConstraints();
		gbc_priceafterdiscounttext.insets = new Insets(0, 0, 5, 0);
		gbc_priceafterdiscounttext.fill = GridBagConstraints.HORIZONTAL;
		gbc_priceafterdiscounttext.gridx = 1;
		gbc_priceafterdiscounttext.gridy = 15;
		panel.add(priceafterdiscounttext, gbc_priceafterdiscounttext);
		priceafterdiscounttext.setColumns(10);
		
		JLabel lblNights = new JLabel("Nights");
		GridBagConstraints gbc_lblNights = new GridBagConstraints();
		gbc_lblNights.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNights.insets = new Insets(0, 0, 5, 5);
		gbc_lblNights.gridx = 0;
		gbc_lblNights.gridy = 16;
		panel.add(lblNights, gbc_lblNights);
		
		nightstext = new JTextField();
		nightstext.setEditable(false);
		GridBagConstraints gbc_nightstext = new GridBagConstraints();
		gbc_nightstext.insets = new Insets(0, 0, 5, 0);
		gbc_nightstext.anchor = GridBagConstraints.NORTH;
		gbc_nightstext.fill = GridBagConstraints.HORIZONTAL;
		gbc_nightstext.gridx = 1;
		gbc_nightstext.gridy = 16;
		panel.add(nightstext, gbc_nightstext);
		nightstext.setColumns(10);
		
		JLabel paymentmethod = new JLabel("Payment options:");
		GridBagConstraints gbc_paymentmethod = new GridBagConstraints();
		gbc_paymentmethod.anchor = GridBagConstraints.EAST;
		gbc_paymentmethod.insets = new Insets(0, 0, 5, 5);
		gbc_paymentmethod.gridx = 0;
		gbc_paymentmethod.gridy = 17;
		panel.add(paymentmethod, gbc_paymentmethod);
		
		
		JComboBox comboBox_3 = new JComboBox();
		//add payment method options
		comboBox_3.addItem("VISA");
		comboBox_3.addItem("Mastercard");
		comboBox_3.addItem("Discover Card");
		comboBox_3.addItem("PayPal");
		comboBox_3.addItem("Apple Pay");
		comboBox_3.setSelectedItem(null);
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 17;
		panel.add(comboBox_3, gbc_comboBox_3);
		
		JButton btnRestartnew = new JButton("Restart/New");
		btnRestartnew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		//set fields back to default
		//name
		textField.setText("");
		//choose hotel
		comboBox.setSelectedItem(null);
		//date
		textField_1.setText("");
		//type of room
		comboBox_1.setSelectedItem(null);
		//number of days you wish to stay
		textField_2.setText("");
		//choose discount
		comboBox_2.setSelectedItem(null);
		//name text field
		nametext.setText("");
		//hotel text field
		hoteltext.setText("");
		//date text field
		datetext.setText("");
		//room type text field
		roomtypetext.setText("");
		//total cost text field
		totalcosttext.setText("");
		//discount chosen text field
		discountchosentext.setText("");
		//price after discount text field
		priceafterdiscounttext.setText("");
		//nights text field
		nightstext.setText("");
		//payment options drop down
	    comboBox_3.setSelectedItem(null);
		
			}
		});
		
		GridBagConstraints gbc_btnRestartnew = new GridBagConstraints();
		gbc_btnRestartnew.gridwidth = 2;
		gbc_btnRestartnew.insets = new Insets(0, 0, 0, 5);
		gbc_btnRestartnew.gridx = 0;
		gbc_btnRestartnew.gridy = 18;
		panel.add(btnRestartnew, gbc_btnRestartnew);

	}

}
