Plan Financial Advisor
	==> main purpose... yung ginagawa kong budgeting maging app
	==> malagyan ng additional features na magpapaganda sa budgeting system ko

Normal Flow:
* Main Activity
	<- info about the page: what to expect
	<- list view
		<- budget categories: remaining budgets (per day/week/month) 
			~> kung per day, normal color
			~> otherwise, compute for budget per day(computed/budget set ng user?) kung below maglagay ng red
			-> (DailyExpenseFragment)
				~> carousel type na makikita yung expenses of the day
				~> swipe left to view prev expenses for the month
				~> kapag sobra sa month, need load for next
				~> may goto sa isang date
				~> red font color sa date kapag sobra yung expected expense (computation for the month dapat)
				~> blue font color warning ... galing sa user yung allowance ng warning
	<- action list
		<- (---Money Flow---)
			<- add income/allowance/bonus
				-> (AddIncomeFragment)
					~> default date today
					~> option to change date
			<- add budget
				-> (BudgetFragment)
			<- add expense
				-> (AddExpenseFragment)
					~> dependent sa kung ano nakaopen na category sa dailyexpense
			<- manage expense/income/budget
				-> (ManageMoneyFlowFragment)
					~> limited sa month ngayon
					~> after select sa drowdown list ipapakita yung mga in-enter for this month liban expense
					~> dropdown list:
						- expense
							~> display first yung today
							~> may day selection
						- income
						- 
						
			
		<- (---Report Category---)
			<- View Report
				<- Month Summary Report 
					-> (MonthReportFragment) 
						~>yung same sa style ko na lang na per week summary + left
				<- Daily Expense Report
					->List of categories
						-> (DailyExpenseFragment)
				<- Money saved
					-> For this month 
						-> (MonthlySavingsFragment)
							~> (per day checking)
					-> Total money saved
						-> (TotalMoneySavedFragment)
							~> same style kay (DailyExpenseFragment) pero instead of per day, per month ang checking
						
				<- View Graph
			<- Save report to my docs
				~> 
				~> Month Summary Report sa cells
				~> graph? ng naipon/current Budget againsts sa expected/ goal
		<- (---Other Utilities---)
			<- Reminders
				<- add reminders
				<- manage reminders
			<- Money Goals
				<- add goals 
				<- manage goals