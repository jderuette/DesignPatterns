# DesignPatterns : Builder (Monteur)
Des exemples d'utilisation du Design Patterns GoF : Builder.

## Faux Builders
### Inner Class
Plusieurs "faux" Patterne Builder utilisant une classe interne.

#### Bad 
Un Builder qui aide un peu mais pas trop.

#### Good
Un Builder un peu mieux, il sécurise le "Bad". 
Il pourait ausis être réalisé en faisant un héritage et en rendant privé les constructeur de Bad.

#### Perfect
Un Builder qui utilise une API "fluent" le rendant plus agréable à utiliser.
Cependant il n'empèche pas la création d'un Objet incomplet.
Le but du Design Pattern "Builder" est d'aider à la construction, pas d'empecher l'instanciation, c'est donc acceptable, mais il possède le même défaut que Bad.

## Vraies builder
### Pizzeria, très fortement inspiré du WikiBook
Plus d'info sur le Design Pattern sur https://fr.wikibooks.org/wiki/Patrons_de_conception/Monteur.
