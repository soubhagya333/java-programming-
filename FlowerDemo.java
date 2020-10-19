class FlowerDemo{

public static void main (String args[]){

 Flower rose  =  new Flower();
rose.name = "rose";
rose.color = "red";

Flower jasmine  =  new Flower();
jasmine.name = "jasmine";
jasmine.color = "white";

rose.blooming();
jasmine.blooming();
}
}