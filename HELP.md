# Spring Core: basic navigation for supertype

Spring: NavigateToAutowiredCandidates for interface 
should consider the implementation components injection:

https://youtrack.jetbrains.com/issue/IDEA-343849

NavigateToAutowiredCandidates for interface doesn't work for the qualified injections:

https://youtrack.jetbrains.com/issue/IDEA-344690


Spring: NavigateToAutowiredDependencies  should not consider the dependencies of same super type but different implicit qualifier:

https://youtrack.jetbrains.com/issue/IDEA-344698