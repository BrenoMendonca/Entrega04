const fibonacci = require('../JavaScript/Fibonacci');

test('Os 10 primeiros números da Sequência de Fibonacci devem ser os corretos', () => {
  expect(fibonacci(5)).toMatchObject([0, 1, 1, 2, 3, 5, 8, 13, 21, 34]);
});
test('Os dois primeiros numeros da contagem de fibonacci devem ser 0 e 1', () => {
    expect(fibonacci(9)).toMatchObject([0, 1]);
  });