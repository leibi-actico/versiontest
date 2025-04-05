# Initial setup. 

Projects whch works with reckon and semantic versioning to determine a good way to incorporate this with head first development 

create initial version : 
```shell
./gradlew -Preckon.stage=final reckonTagCreate
```

```shell
Executing 'reckonTagCreate -Preckon.stage=final'...

> Configure project :
Reckoned version: 0.0.1
```

## Easy cases: one version jump by the commit

This means its clear from that one (merge) commit which version jump we want to make. 
This can be inferred by the jump indicated in the commit version. 

The general form is:

```
<scope>(optional area of codebase): rest of message

body is not used
```

Where `<scope>` is `major`, `minor`, or `patch` (must be lowercase).
patch is used as the default and can be omitted.

If a merge contains more that one commit the one with the highest severity "wins" to get to the new version 
major > minor > patch

So this approach is fine for Bugfixes, Vulnerability fixes and small features/tasks.

## Hard case: We develop a slightly larger feature 
So we have multiple commits contributing to this feature but the feature is not yet ready. 

We can not simply put it in a patch release as we do not want the consumer of the code to use parts of this feature already. 
However, we also can not put it in a minor release as it is not ready to use yet and prune to change. 

We also want to create a release with every green main build for continuous deployment.

The logical consequence is that we need to slice our feature stories very carefully. 

The thing is we can not reliably make one commit per feature to main as the feature might still be too big. 
To solve this lets have a thought about a similar scenario (avoiding to use unwanted code): deprecation.

A dependency might have a deprecated functionality which we can technially use but are encouraged not to use. 
To indicate this the class or method is annotated with the @Deprecated annotation. 

So what if we do the same? 
We create an annotation which indicates that this functionality is in the context of an unfinished feature and that it must not be used outside of it. 

i.e. 
```java 
@Beta(forFeature = "New cool feature")
```

With either a custom annotation processor or the use of Archunit tests we can check for the usage of such a functionality (outside a place with is annotated for the same features ideally.)
This way we can avoid the unintended usage of this functionality. 


## We want to adhere to the conventional commits as well 

example:
```
git commit -m "fix(Readme): add some text"
````


