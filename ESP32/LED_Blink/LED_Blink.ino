void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(18, OUTPUT);
}

void loop() {

  digitalWrite(18, HIGH);
  delay(500);
  digitalWrite(18,LOW);
  delay(500);
}

