# DesignPatterns : Singleton (Singleton)
Des exemples d'utilisation du Design Patterns GoF : Singleton.

## Avec méthode synchronisée
Lors de la demande de l'instance, la méthode est **synchronisée**, donc chaque thread attend que le précédent est fini d'éxécuter la méthode avant de l'éxécuter. Cette synchro est **nécéssaire** uniquement au premier appel. Après elle est totalement inutile.


## Avec new en static
Avec cette staratégie, pas de "synchronized", l'instance est créé de façon static directement lors de la création de la variable.
Cela fonctionne tant que la création et l'affectation de la variables sont effectuées de façon atomique du point de vue des thread.
