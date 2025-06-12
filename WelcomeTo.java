import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.ArrayList;

public class WelcomeTo
{
	//creating 
	public static final String localDir = System.getProperty("system.dir");
	public static final int CARDBACK_SIZE_X = 120;
	public static final int CARDBACK_SIZE_Y = 175;
    private JFrame frame;
	private JPanel mainPanel;
	private JLabel BoardLabel;
	private JLabel[] oldCards = new JLabel[4];
	private ArrayList<Card> currCards = new ArrayList<Card>();
    private ArrayList<JTextField> visibleTextFields = new ArrayList<>();

	// set up card display - load card backs into Java
	public static final ImageIcon[] cardBacks = {
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Bis.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Construction.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Fence.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Market.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Park.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Pool.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
	};

	// set up new cards - load face images into Java
	public static final ImageIcon[] cardFronts = {
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Bis.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Construction.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Fence.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Market.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Park.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
		new ImageIcon(new ImageIcon("Welcome To/Welcome To/B_Pool.png").getImage().getScaledInstance(CARDBACK_SIZE_X, CARDBACK_SIZE_Y, Image.SCALE_SMOOTH)),
	};

    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeTo window = new WelcomeTo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    public WelcomeTo() {
		initialize();
	}

    private void initialize() {
		//creating the frame
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1750, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//creating the panel
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBounds(0, 0, 1750, 1000);
		frame.getContentPane().add(mainPanel); 
		
		//making the label to put a image on
		BoardLabel = new JLabel();
		BoardLabel.setBounds(0, 0, 975, 975);
		mainPanel.add(BoardLabel);
		
		// Making the board set to a image
		ImageIcon board = new ImageIcon("Welcometo.png");
		BoardLabel.setIcon(board);
		frame.setTitle("Welcome to");
		
		// old cards 
		oldCards[0] = new JLabel();
		oldCards[1] = new JLabel();
		oldCards[2] = new JLabel();
		oldCards[3] = new JLabel();

	    	//declaring card values
		oldCards[0].setBounds(1000, 200, CARDBACK_SIZE_X, CARDBACK_SIZE_Y);
		oldCards[0].setVisible(true);
		mainPanel.add(oldCards[0]);

		oldCards[1].setBounds(1000, 150, CARDBACK_SIZE_X, CARDBACK_SIZE_Y);
		oldCards[1].setVisible(true);
		mainPanel.add(oldCards[1]);

		oldCards[2].setBounds(1000, 150, CARDBACK_SIZE_X, CARDBACK_SIZE_Y);
		oldCards[2].setVisible(true);
		mainPanel.add(oldCards[2]);

		oldCards[3].setBounds(1000, 150, CARDBACK_SIZE_X, CARDBACK_SIZE_Y);
		oldCards[3].setVisible(true);
		mainPanel.add(oldCards[3]);

	    	//Adding cards to the card list
		currCards.add(new Card("Fence", 1));
		currCards.add(new Card("Market", 1));
		currCards.add(new Card("Park", 1));

		currCards.add(new Card("Fence", 2));
		currCards.add(new Card("Market", 2));
		currCards.add(new Card("Park", 2));

		currCards.add(new Card("Bis", 3));
		currCards.add(new Card("Construction", 3));
		currCards.add(new Card("Fence", 3));
		currCards.add(new Card("Pool", 3));

		currCards.add(new Card("Bis", 4));
		currCards.add(new Card("Construction", 4));
		currCards.add(new Card("Market", 4));
		currCards.add(new Card("Park", 4));
		currCards.add(new Card("Pool", 4));

		currCards.add(new Card("Fence", 5));
		currCards.add(new Card("Market", 5));
		currCards.add(new Card("Park", 5));

		currCards.add(new Card("Fence", 6));
		currCards.add(new Card("Bis", 6));
		currCards.add(new Card("Construction", 6));
		currCards.add(new Card("Market", 6));
		currCards.add(new Card("Park", 6));
		currCards.add(new Card("Pool", 6));

		currCards.add(new Card("Construction", 7));
		currCards.add(new Card("Fence", 7));
		currCards.add(new Card("Market", 7));
		currCards.add(new Card("Park", 7));
		currCards.add(new Card("Pool", 7));
		
		currCards.add(new Card("Bis", 8));
		currCards.add(new Card("Construction", 8));
		currCards.add(new Card("Fence", 8));
		currCards.add(new Card("Market", 8));
		currCards.add(new Card("Pool", 8));
		currCards.add(new Card("Fence", 9));
		currCards.add(new Card("Construction", 9));
		currCards.add(new Card("Park", 9));
		currCards.add(new Card("Market", 9));
		
		currCards.add(new Card("Construction", 10));
		currCards.add(new Card("Fence", 10));
		currCards.add(new Card("Pool", 10));

		currCards.add(new Card("Fence", 11));
		currCards.add(new Card("Market", 11));
		currCards.add(new Card("Park", 11));

		currCards.add(new Card("Construction", 12));
		currCards.add(new Card("Market", 12));
		currCards.add(new Card("Park", 12));

		currCards.add(new Card("Bis", 13));
		currCards.add(new Card("Construction", 13));
		currCards.add(new Card("Fence", 13));
		currCards.add(new Card("Pool", 13));

		currCards.add(new Card("Fence", 14));
		currCards.add(new Card("Market", 14));
		currCards.add(new Card("Park", 14));

		currCards.add(new Card("Fence", 15));
		currCards.add(new Card("Market", 15));
		currCards.add(new Card("Park", 15));

		//Making Jlabels for the images
		JLabel Image1 = new JLabel();
		Image1.setBounds(1000,200,200,300);
		mainPanel.add(Image1);
		
		JLabel Image2 = new JLabel();
		Image2.setBounds(1250, 200, 200, 300); 
		mainPanel.add(Image2);
		
		JLabel Image3 = new JLabel();
		Image3.setBounds(1500, 200, 200, 300);
		mainPanel.add(Image3);

		JLabel ImageBack1 = new JLabel();
		ImageBack1.setBounds(1000, 600, 200, 300);
		mainPanel.add(ImageBack1);
		JLabel ImageBack2 = new JLabel();
		ImageBack2.setBounds(1250, 600, 200, 300);
		mainPanel.add(ImageBack2);
		JLabel ImageBack3 = new JLabel();
		ImageBack3.setBounds(1500, 600, 200, 300);
		mainPanel.add(ImageBack3);

	    	//next button creating
		JButton nextCards = new JButton("Next Cards");
		nextCards.setBounds(1000, 100, 100, 50);
		mainPanel.add(nextCards);

	    	//making the next button work
		nextCards.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				ImageIcon Ione = new ImageIcon("Welcome To/Welcome To/card(i).png");
				ImageIcon ITwo = new ImageIcon("Welcome To/Welcome To/card(i).png");
				ImageIcon IThree = new ImageIcon("Welcome To/Welcome To/card(i).png");

				Image1.setIcon(Ione);

				Image2.setIcon(ITwo);

				Image3.setIcon(IThree);
				
				nextCards.setVisible(false);
			}
		}
		
		//calling all methods
		constructionx();
		textFields();
		poolButtons();
		fiances();
		bis();
		subtracting();
		parkCrossOff();
	}

	//adding text fields
	private void textFields()
	{
		//row 1
		JTextField house1 = new JTextField();
		house1.setBounds(260, 115, 25, 25);
		mainPanel.add(house1);
		JTextField house2 = new JTextField();
		house2.setBounds(325, 115, 25, 25);
		mainPanel.add(house2);
		JTextField house3 = new JTextField();
		house3.setBounds(395, 115, 25, 25);
		mainPanel.add(house3);
		JTextField house4 = new JTextField();
		house4.setBounds(465, 115, 25, 25);
		mainPanel.add(house4);
		JTextField house5 = new JTextField();
		house5.setBounds(530, 115, 25, 25);
		mainPanel.add(house5);
		JTextField house6 = new JTextField();
		house6.setBounds(600, 115, 25, 25);
		mainPanel.add(house6);
		JTextField house7 = new JTextField();
		house7.setBounds(670, 115, 25, 25);
		mainPanel.add(house7);
		JTextField house8 = new JTextField();
		house8.setBounds(740, 115, 25, 25);
		mainPanel.add(house8);
		JTextField house9 = new JTextField();
		house9.setBounds(805, 115, 25, 25);
		mainPanel.add(house9);
		JTextField house10 = new JTextField();
		house10.setBounds(880, 115, 25, 25);
		mainPanel.add(house10);

		//row 2
		JTextField house11 = new JTextField();
		house11.setBounds(190, 295, 25, 25);
		mainPanel.add(house11);
		JTextField house12 = new JTextField();
		house12.setBounds(260, 295, 25, 25);
		mainPanel.add(house12);
		JTextField house13 = new JTextField();
		house13.setBounds(325, 295, 25, 25);
		mainPanel.add(house13);
		JTextField house14 = new JTextField();
		house14.setBounds(395, 295, 25, 25);
		mainPanel.add(house14);
		JTextField house15 = new JTextField();
		house15.setBounds(465, 295, 25, 25);
		mainPanel.add(house15);
		JTextField house16 = new JTextField();
		house16.setBounds(530, 295, 25, 25);
		mainPanel.add(house16);
		JTextField house17 = new JTextField();
		house17.setBounds(600, 295, 25, 25);
		mainPanel.add(house17);
		JTextField house18 = new JTextField();
		house18.setBounds(670, 295, 25, 25);
		mainPanel.add(house18);
		JTextField house19 = new JTextField();
		house19.setBounds(740, 295, 25, 25);
		mainPanel.add(house19);
		JTextField house20 = new JTextField();
		house20.setBounds(805, 295, 25, 25);
		mainPanel.add(house20);
		JTextField house21 = new JTextField();
		house21.setBounds(880, 295, 25, 25);
		mainPanel.add(house21);

		//row 3
		JTextField house22 = new JTextField();
		house22.setBounds(120, 475, 25, 25);
		mainPanel.add(house22);
		JTextField house23 = new JTextField();
		house23.setBounds(190, 475, 25, 25);
		mainPanel.add(house23);
		JTextField house24 = new JTextField();
		house24.setBounds(260, 475, 25, 25);
		mainPanel.add(house24);
		JTextField house25 = new JTextField();
		house25.setBounds(325, 475, 25, 25);
		mainPanel.add(house25);
		JTextField house26 = new JTextField();
		house26.setBounds(395, 475, 25, 25);
		mainPanel.add(house26);
		JTextField house27 = new JTextField();
		house27.setBounds(465, 475, 25, 25);
		mainPanel.add(house27);
		JTextField house28 = new JTextField();
		house28.setBounds(530, 475, 25, 25);
		mainPanel.add(house28);
		JTextField house29 = new JTextField();
		house29.setBounds(600, 475, 25, 25);
		mainPanel.add(house29);
		JTextField house30 = new JTextField();
		house30.setBounds(670, 475, 25, 25);
		mainPanel.add(house30);
		JTextField house31 = new JTextField();
		house31.setBounds(740, 475, 25, 25);
		mainPanel.add(house31);
		JTextField house32 = new JTextField();
		house32.setBounds(805, 475, 25, 25);
		mainPanel.add(house32);
		JTextField house33 = new JTextField();
		house33.setBounds(880, 475, 25, 25);
		mainPanel.add(house33);

		//Town Name
		JTextField TownName = new JTextField();
		TownName.setBounds(100,150,75,25);
		mainPanel.add(TownName);

		//N# and Parks
		JTextField N1 = new JTextField();
		N1.setBounds(65,670,25,25);
		mainPanel.add(N1);
		JTextField N2 = new JTextField();
		N2.setBounds(65,755,25,25);
		mainPanel.add(N2);
		JTextField N3 = new JTextField();
		N3.setBounds(65,830,25,25);
		mainPanel.add(N3);
		//Parks
		JTextField Parks1 = new JTextField();
		Parks1.setBounds(147,730,25,25);
		mainPanel.add(Parks1);
		JTextField Parks2 = new JTextField();
		Parks2.setBounds(147,780,25,25);
		mainPanel.add(Parks2);
		JTextField Parks3 = new JTextField();
		Parks3.setBounds(147,830,25,25);
		mainPanel.add(Parks3);
		
		//Calclating numbers
		JTextField NTotal = new JTextField();
		NTotal.setBounds(65,905,25,25);
		mainPanel.add(NTotal);
		JTextField parksTotal = new JTextField();
		parksTotal.setBounds(147,905,25,25);
		mainPanel.add(parksTotal);
		JTextField poolsTotal = new JTextField();
		poolsTotal.setBounds(240,905,25,25);
		mainPanel.add(poolsTotal);
		JTextField constructionTotal = new JTextField();
		constructionTotal.setBounds(345,905,25,25);
		mainPanel.add(constructionTotal);
		JTextField neighborhood1Total = new JTextField();
		neighborhood1Total.setBounds(450,905,25,25);
		mainPanel.add(neighborhood1Total);
		JTextField neighborhood2Total = new JTextField();
		neighborhood2Total.setBounds(495,905,25,25);
		mainPanel.add(neighborhood2Total);
		JTextField neighborhood3Total = new JTextField();
		neighborhood3Total.setBounds(545,905,25,25);
		mainPanel.add(neighborhood3Total);
		JTextField neighborhood4Total = new JTextField();
		neighborhood4Total.setBounds(590,905,25,25);
		mainPanel.add(neighborhood4Total);
		JTextField neighborhood5Total = new JTextField();
		neighborhood5Total.setBounds(640,905,25,25);
		mainPanel.add(neighborhood5Total);
		JTextField neighborhood6Total = new JTextField();
		neighborhood6Total.setBounds(695,905,25,25);
		mainPanel.add(neighborhood6Total);
		JTextField bisTotal = new JTextField();
		bisTotal.setBounds(785,905,25,25);
		mainPanel.add(bisTotal);
		JTextField roundAboutsRefusealTotal = new JTextField();
		roundAboutsRefusealTotal.setBounds(875,905,25,25);
		mainPanel.add(roundAboutsRefusealTotal);
		JTextField finalScore = new JTextField();
		finalScore.setBounds(935,905,25,25);
		mainPanel.add(finalScore);
	}

	//creating buttons for the pools
	private void poolButtons()
	{
		//Creating pool check boxes
		JCheckBox poolOne = new JCheckBox();
		poolOne.setBounds(395,85, 25, 25);
		mainPanel.add(poolOne);

		JCheckBox poolTwo = new JCheckBox();
		poolTwo.setBounds(670,85, 25, 25);
		mainPanel.add(poolTwo);

		JCheckBox poolThree = new JCheckBox();
		poolThree.setBounds(740,85,25, 25);
		mainPanel.add(poolThree);

		JCheckBox poolFour = new JCheckBox();
		poolFour.setBounds(190,270,25, 25);
		mainPanel.add(poolFour);

		JCheckBox poolFive = new JCheckBox();
		poolFive.setBounds(395,270,25, 25);
		mainPanel.add(poolFive);

		JCheckBox poolSix = new JCheckBox();
		poolSix.setBounds(670,270,25, 25);
		mainPanel.add(poolSix);
		
		JCheckBox poolSeven = new JCheckBox();
		poolSeven.setBounds(190,450,25, 25);
		mainPanel.add(poolSeven);

		JCheckBox poolEight = new JCheckBox();
		poolEight.setBounds(530,450,25, 25);
		mainPanel.add(poolEight);

		JCheckBox poolNine = new JCheckBox();
		poolNine.setBounds(805,450,25, 25);
		mainPanel.add(poolNine);

		JCheckBox poolOneTotal = new JCheckBox();
		poolOneTotal.setBounds(215,715,15, 15);
		mainPanel.add(poolOneTotal);
		JCheckBox poolTwoTotal = new JCheckBox();
		poolTwoTotal.setBounds(275,715,15, 15);
		mainPanel.add(poolTwoTotal);
		JCheckBox poolThreeTotal = new JCheckBox();
		poolThreeTotal.setBounds(215,745,15, 15);
		mainPanel.add(poolThreeTotal);
		JCheckBox poolFourTotal = new JCheckBox();
		poolFourTotal.setBounds(275,745,15, 15);
		mainPanel.add(poolFourTotal);
		JCheckBox poolFiveTotal = new JCheckBox();
		poolFiveTotal.setBounds(210,780,15, 15);
		mainPanel.add(poolFiveTotal);
		JCheckBox poolSixTotal = new JCheckBox();
		poolSixTotal.setBounds(280,780,15, 15);
		mainPanel.add(poolSixTotal);
		JCheckBox poolSevenTotal = new JCheckBox();
		poolSevenTotal.setBounds(210,815,15, 15);
		mainPanel.add(poolSevenTotal);
		JCheckBox poolEightTotal = new JCheckBox();
		poolEightTotal.setBounds(280,815,15, 15);
		mainPanel.add(poolEightTotal);
		JCheckBox poolNineTotal = new JCheckBox();
		poolNineTotal.setBounds(210,850,15, 15);
		mainPanel.add(poolNineTotal);
	}

	//creating buttons for construction
   private void constructionx()
   {
	JCheckBox constructionOne = new JCheckBox();
	constructionOne.setBounds(325,690, 15, 15);
	mainPanel.add(constructionOne);
	JCheckBox constructionTwo = new JCheckBox();
	constructionTwo.setBounds(375,690, 15, 15);
	mainPanel.add(constructionTwo);
	JCheckBox constructionThree = new JCheckBox();
	constructionThree.setBounds(350,710, 15, 15);
	mainPanel.add(constructionThree);

	JCheckBox constructionFour = new JCheckBox();
	constructionFour.setBounds(325,730, 15, 15);
	mainPanel.add(constructionFour);
	JCheckBox constructionFive = new JCheckBox();
	constructionFive.setBounds(375,730, 15, 15);
	mainPanel.add(constructionFive);
	JCheckBox constructionSix = new JCheckBox();
	constructionSix.setBounds(350,750, 15, 15);
	mainPanel.add(constructionSix);

	JCheckBox constructionSeven = new JCheckBox();
	constructionSeven.setBounds(325,770, 15, 15);
	mainPanel.add(constructionSeven);
	JCheckBox constructionEight = new JCheckBox();
	constructionEight.setBounds(375,770, 15, 15);
	mainPanel.add(constructionEight);
	JCheckBox constructionNine = new JCheckBox();
	constructionNine.setBounds(350,790, 15, 15);
	mainPanel.add(constructionNine);

	JCheckBox constructionTen = new JCheckBox();
	constructionTen.setBounds(325,810, 15, 15);
	mainPanel.add(constructionTen);
	JCheckBox constructionEleven = new JCheckBox();
	constructionEleven.setBounds(375,810, 15, 15);
	mainPanel.add(constructionEleven);

	JCheckBox constructionT1 = new JCheckBox();
	constructionT1.setBounds(320,840, 15, 15);
	mainPanel.add(constructionT1);
	JCheckBox constructionT2 = new JCheckBox();
	constructionT2.setBounds(380,840, 15, 15);
	mainPanel.add(constructionT2);
	JCheckBox constructionT3 = new JCheckBox();
	constructionT3.setBounds(350,840, 15, 15);
	mainPanel.add(constructionT3);

   }
//adds fiance buttons
   private void fiances()
   {
	JCheckBox onesHouse = new JCheckBox();
	onesHouse.setBounds(450,755, 15, 15);
	mainPanel.add(onesHouse);

	JCheckBox twoHousesOne = new JCheckBox();
	twoHousesOne.setBounds(495,740, 15, 15);
	mainPanel.add(twoHousesOne);
	JCheckBox twoHousesTwo = new JCheckBox();
	twoHousesTwo.setBounds(495,770, 15, 15);
	mainPanel.add(twoHousesTwo);
	
	JCheckBox threeHousesOne = new JCheckBox();
	threeHousesOne.setBounds(535,725, 15, 15);
	mainPanel.add(threeHousesOne);
	JCheckBox threeHousesTwo = new JCheckBox();
	threeHousesTwo.setBounds(535,755, 15, 15);
	mainPanel.add(threeHousesTwo);
	JCheckBox threeHousesThree = new JCheckBox();
	threeHousesThree.setBounds(535,780, 15, 15);
	mainPanel.add(threeHousesThree);

	JCheckBox fourHousesOne = new JCheckBox();
	fourHousesOne.setBounds(580,710, 15, 15);
	mainPanel.add(fourHousesOne);
	JCheckBox fourHousesTwo = new JCheckBox();
	fourHousesTwo.setBounds(580,740, 15, 15);
	mainPanel.add(fourHousesTwo);
	JCheckBox fourHousesThree = new JCheckBox();
	fourHousesThree.setBounds(580,770,15, 15);
	mainPanel.add(fourHousesThree);
	JCheckBox fourHousesFour = new JCheckBox();
	fourHousesFour.setBounds(580,800, 15, 15);
	mainPanel.add(fourHousesFour);

	JCheckBox fiveHousesOne = new JCheckBox();
	fiveHousesOne.setBounds(630,690, 15, 15);
	mainPanel.add(fiveHousesOne);
	JCheckBox fiveHousesTwo = new JCheckBox();
	fiveHousesTwo.setBounds(630,720, 15, 15);
	mainPanel.add(fiveHousesTwo);
	JCheckBox fiveHousesThree = new JCheckBox();
	fiveHousesThree.setBounds(630,750,15, 15);
	mainPanel.add(fiveHousesThree);
	JCheckBox fiveHousesFour = new JCheckBox();
	fiveHousesFour.setBounds(630,780, 15, 15);
	mainPanel.add(fiveHousesFour);

	JCheckBox sixHousesOne = new JCheckBox();
	sixHousesOne.setBounds(675,675, 15, 15);
	mainPanel.add(sixHousesOne);
	JCheckBox sixHousesTwo = new JCheckBox();
	sixHousesTwo.setBounds(675,705, 15, 15);
	mainPanel.add(sixHousesTwo);
	JCheckBox sixHousesThree = new JCheckBox();
	sixHousesThree.setBounds(675,735,15, 15);
	mainPanel.add(sixHousesThree);
	JCheckBox sixHousesFour = new JCheckBox();
	sixHousesFour.setBounds(675,765, 15, 15);
	mainPanel.add(sixHousesFour);
   }
//adds bis buttons
   private void bis()
   {
	JCheckBox bisOne = new JCheckBox();
	bisOne.setBounds(750,680, 15, 15);
	mainPanel.add(bisOne);
	JCheckBox bisTwo = new JCheckBox();
	bisTwo.setBounds(750,720, 15, 15);
	mainPanel.add(bisTwo);
	JCheckBox bisThree = new JCheckBox();
	bisThree.setBounds(750,760, 15, 15);
	mainPanel.add(bisThree);
	JCheckBox bisFour = new JCheckBox();
	bisFour.setBounds(750,800, 15, 15);
	mainPanel.add(bisFour);
	JCheckBox bisFive = new JCheckBox();
	bisFive.setBounds(750,840, 15, 15);
	mainPanel.add(bisFive);

	JCheckBox bisSix = new JCheckBox();
	bisSix.setBounds(825,680, 15, 15);
	mainPanel.add(bisSix);
	JCheckBox bisSeven = new JCheckBox();
	bisSeven.setBounds(825,720, 15, 15);
	mainPanel.add(bisSeven);
	JCheckBox bisEight = new JCheckBox();
	bisEight.setBounds(825,760, 15, 15);
	mainPanel.add(bisEight);
	JCheckBox bisNine = new JCheckBox();
	bisNine.setBounds(825,800, 15, 15);
	mainPanel.add(bisNine);
   }
	//adds subtracting text fields
   private void subtracting()
   {
	JCheckBox roundAboutOne = new JCheckBox();
	roundAboutOne.setBounds(860,615, 15, 15);
	mainPanel.add(roundAboutOne);
	JCheckBox roundAboutTwo = new JCheckBox();
	roundAboutTwo.setBounds(860,650, 15, 15);
	mainPanel.add(roundAboutTwo);

	JCheckBox subtractOne = new JCheckBox();
	subtractOne.setBounds(860,740, 15, 15);
	mainPanel.add(subtractOne);
	JCheckBox subtractTwo = new JCheckBox();
	subtractTwo.setBounds(860,780, 15, 15);
	mainPanel.add(subtractTwo);
	JCheckBox subtractThree = new JCheckBox();
	subtractThree.setBounds(860,820, 15, 15);
	mainPanel.add(subtractThree);
   }
 //adds park crossing off
   private void parkCrossOff()
   {
	JCheckBox rowOneParkOne = new JCheckBox();
	rowOneParkOne.setBounds(815,15, 15, 15);
	mainPanel.add(rowOneParkOne);
	JCheckBox rowOneParkTwo = new JCheckBox();
	rowOneParkTwo.setBounds(850,15, 15, 15);
	mainPanel.add(rowOneParkTwo);
	JCheckBox rowOneParkThree = new JCheckBox();
	rowOneParkThree.setBounds(885,15, 15, 15);
	mainPanel.add(rowOneParkThree);

	JCheckBox rowTwoParkOne = new JCheckBox();
	rowTwoParkOne.setBounds(780,195, 15, 15);
	mainPanel.add(rowTwoParkOne);
	JCheckBox rowTwoParkTwo = new JCheckBox();
	rowTwoParkTwo.setBounds(815,195, 15, 15);
	mainPanel.add(rowTwoParkTwo);
	JCheckBox rowTwoParkThree = new JCheckBox();
	rowTwoParkThree.setBounds(850,195, 15, 15);
	mainPanel.add(rowTwoParkThree);
	JCheckBox rowTwoParkFour = new JCheckBox();
	rowTwoParkFour.setBounds(885,195, 15, 15);
	mainPanel.add(rowTwoParkFour);

	JCheckBox rowThreeParkOne = new JCheckBox();
	rowThreeParkOne.setBounds(745,372, 15, 15);
	mainPanel.add(rowThreeParkOne);
	JCheckBox rowThreeParkTwo = new JCheckBox();
	rowThreeParkTwo.setBounds(780,372, 15, 15);
	mainPanel.add(rowThreeParkTwo);
	JCheckBox rowThreeParkThree = new JCheckBox();
	rowThreeParkThree.setBounds(815,372, 15, 15);
	mainPanel.add(rowThreeParkThree);
	JCheckBox rowThreeParkFour = new JCheckBox();
	rowThreeParkFour.setBounds(850,372, 15, 15);
	mainPanel.add(rowThreeParkFour);
	JCheckBox rowThreeParkFive = new JCheckBox();
	rowThreeParkFive.setBounds(885,372, 15, 15);
	mainPanel.add(rowThreeParkFive);
   }

	
	
}
