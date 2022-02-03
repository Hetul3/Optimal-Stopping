# Optimal-Stopping
The Secretary Problem from Optimal Stopping.
<br/>
<br/>
https://en.wikipedia.org/wiki/Optimal_stopping
<br/>
<br/>
Observing a sequence of objects that can be numerically ranked best and worst. What is the optimal time using the stopping rule to maximise your chances of picking the best object? 
<br/>
<br/>
Q: A sample problem might be something like. An admissions officer wants to select the best student to admit based purely off of their grade point average, there are N number of applications and only 1 spot left to choose. The admissions officer, once seeing an application must decide on the spot whether to reject or admit the student. The problem is when is the optimal time to choose a student that will give the highest likelyhood that the admissions officer choose the best student?
<br/>
<br/>
A: Divide and round the N number of applicants by e (2.71828...), review that number of applications and keep in mind the highest score, then choose the next application with a score higher than that. This will result in a 1/e probability that the admissions officer chose the best student. Ex. Let there be 100 applicants, review but don't choose up to 100/e (37) applications, keep in mind the highest GPA, let that equal J. Then, choose the next application with a GPA higher than J. 
