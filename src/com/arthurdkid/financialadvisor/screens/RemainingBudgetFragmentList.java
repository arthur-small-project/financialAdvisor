package com.arthurdkid.financialadvisor.screens;

import android.app.ListFragment;

/**
 * 
 * Displays a list of budgets with 
 * their corresponding remaining balance.
 * 
 * Summary specs:
 *  > Drop down on top left corner;
 *  	>> format: Remaining budget for: [today|this week|this month]
 *  	>> when clicked, the focus of the information is only within 
 *  			the scope
 *  > Label on top right corner;
 *  	>> format: Month(abbreviation) [date,| start date - end date] year
 *  > budget balance color conditions:
 *  	>> under budget: black
 *		>> below budget: red
 *	> List items are clickable and will display daily expenses of the user
 * 
 * @author ArthurDKid
 */

public class RemainingBudgetFragmentList extends ListFragment {

}
