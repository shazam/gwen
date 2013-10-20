Gwen
=========
*Gwen* is a simple library that allows writing acceptance tests in a Given-When-Then syntax.

Using Gwen, we can transform a very verbose and implementation specific test like this:

```java
public void testNotGonnaTellYou() {
    final Instrumentation instrumentation = getInstrumentation();
    final Context targetContext = instrumentation.getTargetContext();
 
    File cacheDir = targetContext.getCacheDir();
    try {
        File file1 = File.createTempFile("file1", "txt", cacheDir);
        File file2 = File.createTempFile("file2", "txt", cacheDir);
    } catch (IOException e) {
        e.printStackTrace();
        Assert.fail("Failed to create files " + e.getMessage());
    }
 
    Intent intent = new Intent(targetContext, DirectoryBrowserActivity.class);
    intent.setData(Uri.parse(cacheDir.getAbsolutePath()));
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    targetContext.startActivity(intent);
 
    final Solo solo = new Solo(instrumentation);
    final boolean file1Displayed = solo.searchText("file1.txt");
    final boolean file2Displayed = solo.searchText("file2.txt");
    if (!file1Displayed || !file2Displayed) {
        Assert.fail("Activity did not display files");
    }
}
```

into a readable, reusable, extensible and maintainable test like this:

```java
public void testDisplaysDirectoryContents() {
    given(directory).contains(SOME_FILES);
     
    when(user).isViewing(directory);
     
    then(user).canSee(THESE_FILES);
}
```

License
----

Apache v2.0
