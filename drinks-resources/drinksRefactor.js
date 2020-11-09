const data = require('./drinks.json');
//console.log("data: ", data);
let j = 1;
let d = data["drinks"]
for(obj in d){
  let drink = d[obj]
  let id = drink["idDrink"]
  let name = drink["strDrink"]
  let category = drink["strCategory"]
  let instructions = drink["strInstructions"]

  let listIngredients = []
  let listMeasures = []
  let listOfIngredients = []

  if(j<3){
    j++
    for(element in drink){
      if(element.slice(3,13) == "Ingredient"){
        if (drink[element] != null){
          listIngredients.push(drink[element])
          //drinkObject.push(drink[element])
        }
      }
      else if(element.slice(3,10) == "Measure"){
        if (drink[element] != null){
          listMeasures.push(drink[element])
        }
      }
     
    }
    for(i=0; i<listIngredients.length; i++){
      console.log(listIngredients[0])
      let o = listIngredients[i]
      letdrinkObject = {
        o: listMeasures[i]
      } 
    }
    console.log(drinkObject)

    console.log(listIngredients)
    console.log(listMeasures)



   


  }
}
  
 