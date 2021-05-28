@ECHO off
cls
:start
COLOR E
ECHO.
ECHO.
ECHO.
ECHO  *****************************************************************************
ECHO  *                    Limpando os arquivos *.exe, *.pdb ..                   *
ECHO  *****************************************************************************
ECHO.
ECHO.Excluindo os arquivos *.class, *.pdb dos diretorios recursivamente 
ECHO.
del *.class /s
del *.~* /s
del *.jar /s
pause
COLOR 7
goto end