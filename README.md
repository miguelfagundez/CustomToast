# CustomToast
Custom Toast in Android


## Create a Custom Toast Layout file (custom_toast_layout.xml):

```
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/custom_layout_container"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal"
    android:layout_margin="8dp"
    android:padding="8dp"
    android:background="#80CC28">

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/ic_problem"/>
    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="4dp"
        android:layout_gravity="center_vertical"
        android:textColor="#FFF"
        android:textStyle="bold"
        android:textSize="15dp"/>
</LinearLayout>
```

## Include Buttons in main_activity.xml

```
    ...
    <Button
        android:id="@+id/btnButtonCenter"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Toast (Center)"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"/>
    ...
```

## MainActivity.java

Define views and listeners (checking code for details), then inflate the custom_toast_layout, and modify toast in listeners.

```
btnPushToastCenter = findViewById(R.id.btnButtonCenter) as Button
...
layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_layout_container))
...
btnPushToastCenter.setOnClickListener { 
...
...
toast.view = layout
toast.show()
```

## Final result:
<p align = "center">
<img src="/images/02.gif" width="300">
</p>
