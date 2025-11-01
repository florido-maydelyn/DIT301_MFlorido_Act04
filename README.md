<h1 align="center">EventPracticeApp<h1>

---

## Short Reflection:
### 1. How did you implement event handling for user actions?
> * Event handling was implemented by attaching a setOnClickListener to the Submit button using View Binding. This listener executes on every tap, reading text from the input fields, performing validation, and updating the UI with either a Toast (for errors) or a success message in the TextView.
### 2. What techniques ensured smooth and stable interaction?
> * Input Validation
> * Clear User Feedback
> * Proactive UX: Setting android:inputType in the XML automatically provides the correct keyboard (text or numeric), reducing user errors from the start.
### 3. What improvements would you add in future versions?
> * Inline Errors: Use the EditText.error property to show validation messages directly on the invalid field, which is more user-friendly than a Toast.
