var User = /** @class */ (function () {
    function User(name, lastName) {
        this.credito = 0;
        this.numeroChiamate = 0;
        this.minutiChiamata = 0;
        this.name = name;
        this.lastName = lastName;
    }
    User.prototype.ricarica = function (ammontare) {
        this.credito += ammontare;
    };
    User.prototype.chiamata = function (minutiDurata) {
        this.credito -= (minutiDurata * 0.20);
        this.numeroChiamate += 1;
        this.minutiChiamata += minutiDurata;
    };
    User.prototype.azzeraChiamate = function () {
        this.numeroChiamate = 0;
    };
    Object.defineProperty(User.prototype, "numero404", {
        get: function () {
            return this.credito;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "getNumeroChiamate", {
        get: function () {
            return this.numeroChiamate;
        },
        enumerable: false,
        configurable: true
    });
    return User;
}());
var me = new User("Dany", "Luise");
me.ricarica(40);
me.chiamata(5);
me.chiamata(3);
me.chiamata(2);
console.log(me.numero404);
console.log(me.getNumeroChiamate);
me.azzeraChiamate();
