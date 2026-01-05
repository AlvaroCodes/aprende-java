# Ejercicio 02: Formulario de Registro

## 📝 Introducción

Este ejercicio te ayudará a dominar el manejo de diferentes tipos de datos en Java. Crearás un formulario que solicita información variada del usuario y aprenderás a manejar las particularidades de cada tipo de dato.

## 🎯 Objetivos de Aprendizaje

- Trabajar con múltiples tipos de datos (String, int, double, boolean)
- Entender el problema del buffer del Scanner
- Usar `nextLine()`, `nextInt()`, `nextDouble()`, `nextBoolean()`
- Aplicar el operador ternario para condicionales simples
- Practicar la presentación de datos al usuario

## 📋 Requisitos

Tu programa debe solicitar:

1. **Datos personales**
   - Nombre completo (String)
   - Edad (int)
   - Altura en metros (double)
   - Ciudad (String)
   - ¿Es estudiante? (boolean)

2. **Mostrar un resumen**
   - Presentar todos los datos ingresados
   - Formatear la altura con 2 decimales
   - Convertir el boolean a "Sí" o "No"

## 💡 Conceptos Clave

- **Tipos de datos primitivos**: int, double, boolean
- **Tipo String**: para texto
- **Limpieza del buffer**: `nextLine()` después de números
- **Operador ternario**: `condición ? valorSi : valorNo`
- **Formato de salida**: `printf()` para números decimales

## ⚠️ Consideraciones Importantes

- **Problema del buffer**: Después de leer números con `nextInt()` o `nextDouble()`, el salto de línea queda en el buffer. Debes usar `nextLine()` para limpiarlo antes de leer el siguiente texto.

- **Booleanos**: El usuario debe escribir exactamente `true` o `false` (en minúsculas)

## 🎨 Nota Importante

**El código proporcionado es solo UNA posible solución.** Cada persona puede llegar al mismo resultado de diferentes maneras. Lo importante es que tu programa cumpla con los requisitos y funcione correctamente. ¡No hay una única forma correcta de programar!

Siéntete libre de:
- Solicitar datos adicionales (email, teléfono, etc.)
- Cambiar el orden de las preguntas
- Mejorar el formato del resumen
- Agregar validaciones (edad positiva, altura razonable)
- Usar diferentes estructuras para mostrar los datos
