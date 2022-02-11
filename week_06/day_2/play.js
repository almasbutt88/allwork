const assert = require("assert"); // you can call that const assert anything. like const banana

// assert.strictEqual(1, "1"); // will fail coz we are doing strict equal ===

const firstArray = [1, 2];
const secondArray = firstArray;
assert.strictEqual(firstArray, secondArray);// this will return false because they are two separate objects, not the same

assert.deepEqual([1,2,3], ["1","2","3"]);// looks inside the arrays to compare values
assert.deepStrictEqual([1,2,3], ["1","2","3"]);// looks inside the arrays to compare values but does a strict equal

//so the above assert Equal isnt informative enough when it comes to test fails,
//so we are gonna use something called Mocha which is a BDD 