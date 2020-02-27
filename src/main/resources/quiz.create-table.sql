CREATE TABLE Quiz
( quizId INT NOT NULL,
  score FLOAT(6,2),
  userId INT NOT NULL,
  PRIMARY KEY (quizId),
  CONSTRAINT 'fk_quiz_user'
      FOREIGN KEY (userId) REFERENCES User (userId)
)