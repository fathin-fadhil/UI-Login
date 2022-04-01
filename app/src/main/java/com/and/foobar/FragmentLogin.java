package com.and.foobar;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.MessageFormat;

public class FragmentLogin extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        Button btnLogin = v.findViewById(R.id.login_button);
        EditText emailText = v.findViewById(R.id.editTextTextEmailAddress);
        EditText passText = v.findViewById(R.id.editTextTextPassword);
        TextView signUp = v.findViewById(R.id.signup);

        SpannableString underline1 = new SpannableString(signUp.getText().toString());
        underline1.setSpan(new UnderlineSpan(), 0, signUp.length(), 0);
        signUp.setText(underline1);

        btnLogin.setOnClickListener(view ->
                Toast.makeText(requireActivity().getApplicationContext(),
                        MessageFormat.format("Email = {0} dan Pass = {1}", emailText.getText(), passText.getText()),
                        Toast.LENGTH_SHORT).show());

        signUp.setOnClickListener(view ->
                Toast.makeText(requireActivity().getApplicationContext(),
                    "Sign up terclick!",
                    Toast.LENGTH_SHORT).show());
        return v;
    }
}
