# Data Binding

## The idea

- The big idea about data binding is to create an object that connects/maps/binds two pieces of distant information together at compile time, so that you don't have to look for it at runtime.
- The object that surfaces these bindings to you is called the Binding object. It is created by the compiler, and while understanding how it works under the hood is interesting, it is not necessary to know for basic uses of data binding.

## Data Binding and findById

- `findViewById` is a **costly operation** because it traverses the view hierarchy every time it is called.
- With data binding enabled, the compiler creates references to all views in a <layout> that have an id, and gathers them in a Binding object.
- In your code, you create an instance of the binding object, and then reference views through the binding object with no extra overhead.

![With Data Binding](images/layoutsdata-binding-intro-slide.png)

**Data Binding Views and Data**

- Updating data and then updating the data displayed in views is cumbersome and a source of errors. Keeping the data in the view also violates separation of data and presentation.
- Data binding solves both of these problems. You keep data in a data class. You add a `<data>` block to the `<layout>` to identify the data as variables to use with the views. Views reference the variables.
- The **_compiler generates a binding object_** that binds the views and data.
- In your code, you reference and update the data through the binding object, which updates the data, and thus what is displayed in the view.
- Binding views to data sets a foundation for more advanced techniques using data binding.

![Data Binding](images/layoutsdata-binding-data-slide.png)

## Do the following:

1. Enable data binding in your build.gradle file in the app module inside the android section:

```js
dataBinding {
enabled = true
}
```

2. Wrap all views in _activity_main.xml_ into a `<layout>` tag, and move the namespace declarations into the the `<layout>` tag.

3. In MainActivity, create a binding object

```kotlin
private lateinit var binding: ActivityMainBinding
```

4. In onCreate, use DataBindingUtil to set the content view:

```kotlin
binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
```

5. Use the binding object to replace all calls to findViewById, for example:

```kotlin
binding.doneButton.setOnClickListener….etc
```

**Hint:** You can use `apply()` in the click handler to make your code more concise and readable

1. Create a data class MyName for the name and nickname

```kotlin
data class MyName(var name: String = "", var nickname: String = "")
```

2. Add a `<data>` block to activity_main.xml. The data block goes inside the layout tag but before the view tags. Inside the data block, add a variable for the MyName class.

```kotlin
<data>
<!-- Declare a variable by specifying a name and a data type. -->
<!-- Use fully qualified name for the type. -->
<variable
    name="myName"
    type="com.example.android.aboutme.MyName" />
</data>
```

3. In name_text, nickname_edit, and nickname_text, replace the references to string text resources with references to the variables, for example>

```kotlin
android:text="@={myName.name}"
```

4. In MainActivity, create an instance of MyName.

```kotlin
// Instance of MyName data class.
private val myName: MyName = MyName("Aleks Haecky")
```

5. And in onCreate(), set binding.myName to it.

```kotlin
binding.myName = myName
```

6. In addNickname, set the value of nickname in myName, call invalidateAll(), and the data should show in your views.

```kotlin
myName?.nickname = nicknameEdit.text.toString()
// Invalidate all binding expressions and request a new rebind to refresh UI
invalidateAll()
```

When you run your code, it should have no errors and look and work exactly the same!

## Constraint Layout

A constraint is a conection or alignment to another UI element, to the parent layout, or an invisible guideline.