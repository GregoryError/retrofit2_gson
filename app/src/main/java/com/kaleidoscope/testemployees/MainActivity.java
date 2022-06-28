package com.kaleidoscope.testemployees;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kaleidoscope.testemployees.adapters.Employee_adapter;
import com.kaleidoscope.testemployees.pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewEmployee;
    private Employee_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewEmployee = findViewById(R.id.recyclerViewEmployees);
        adapter = new Employee_adapter();
        recyclerViewEmployee.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewEmployee.setAdapter(adapter);
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setfName("Иван");
        employee1.setlName("Петров");
        employee2.setlName("Дарья");
        employee2.setfName("Иванова");
        employees.add(employee1);
        employees.add(employee2);
        adapter.setEmployees(employees);
    }
}