
CREATE TABLE Question
(
  questionId INT NOT NULL,
  question VARCHAR(250) NOT NULL,
  answer1 VARCHAR(100),
  answer2 VARCHAR(100),
  answer3 VARCHAR(100),
  answer4 VARCHAR(100),
  questionLevel VARCHAR(5),
  correctAnswer VARCHAR(100),
  questionId INT NOT NULL,
  userAnswer VARCHAR(3) NOT NULL,
  isCorrect BOOLEAN,
 questionNumber VARCHAR(4),
 PRIMARY KEY(questionId)
 );




