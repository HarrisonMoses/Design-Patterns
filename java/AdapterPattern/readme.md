# 🏥 Hospital Insurance Adapter Pattern

This project demonstrates the **Adapter Design Pattern** using the analogy of a hospital integrating with multiple insurance companies, each with a different API. The Adapter Pattern allows the hospital billing system to interact with all insurance providers through a unified interface — without modifying either the hospital system or the insurance companies.

---

## 📌 Problem Statement

A hospital system needs to obtain patient coverage details from different insurance providers. However, each insurance company exposes its own unique API:

- `InsuranceA` → `fetchPlanDetails(patientId)`
- `InsuranceB` → `retrieveCoverage(patientId)`

These APIs are incompatible with the hospital's expected interface.

---

## ✅ Solution

We can use the **Adapter Pattern** to solve this integration problem.

- Define a common interface: `InsuranceAdapter`
- Implement an adapter for each insurance provider that conforms to this interface
- The hospital billing system interacts only with the `InsuranceAdapter` interface

This allows for **easy integration** of new insurance companies with **no changes** to the hospital system.

---

## 🏗️ Project Structure

