#!/usr/bin/env python
# coding: utf-8

# In[51]:


get_ipython().system('pip install pyautogui')
get_ipython().system('pip install pyperclip')


# In[52]:


import pyautogui
import pyperclip
import time

pyautogui.PAUSE=1

#Passo 1: Entrar no sistema da empresa
pyautogui.hotkey("ctrl","t")
#demorar alguns segundos para a próxima etapa
pyautogui.write("https://drive.google.com/drive/folders/149xknr9JvrlEnhNWO49zPcw0PW5icxga")
pyautogui.press("enter")
time.sleep(5)

#Passo 2: Navegar e encontrar a base de dados
pyautogui.click(x=384, y=297, clicks=2)
time.sleep(2)

#Passo 3: Fazer download o banco de dados
pyautogui.click(x=365, y=405) #clicar no arquivo
time.sleep(1)
pyautogui.click(x=1719, y=179) #clickar nos 3 pontinhos
time.sleep(1)
pyautogui.click(x=1534, y=593) #clickar em fazr download
time.sleep(5)

#Passo 4: Importar a base de dados p/ o Python


# In[ ]:





# In[53]:


#Passo 4: Importar a base de dados p/ o Python
import pandas as pd
tabela = pd.read_excel(r"C:\Users\leocr\Downloads\Vendas - Dez.xlsx")
display(tabela)


# In[54]:


#Passo 5 : Calcular os indicadores
#faturamento - soma da coluna valor final

faturamento = tabela["Valor Final"].sum()



#quantidades de produtos - soma da coluna quantidade

quantidade = tabela["Quantidade"].sum()


# In[55]:


#Passo 6: Enviar email para empresa com os dados obtidos
#Entrar no email
pyautogui.hotkey("ctrl","t")
pyperclip.copy("https://mail.google.com/mail/u/0/#inbox")
pyautogui.hotkey("ctrl", "v")
pyautogui.press("enter")
time.sleep(7)

#clicar em escrever email:
pyautogui.click(x=118, y=219)
time.sleep(2)

#Escrever o destinatário:
pyautogui.write("pythonimpressionador@gmail.com")
pyautogui.press("tab") #seleciona o destinatário
pyautogui.press("tab") #pula para o assunto do email


#Escrever o assunto:
pyperclip.copy("Relatório de Vendas")
pyautogui.hotkey("ctrl","v")
pyautogui.press("tab")

#Escrever o corpo do email:
texto = f"""

Prezados, bom dia

O faturamento de ontem foi de : R${faturamento:,.2f}
A quantidade de produtos de foi: {quantidade:,}

Abs
Leonard"""


pyperclip.copy(texto)
pyautogui.hotkey("ctrl","v")

#Enviar o email:
pyautogui.hotkey("ctrl","enter")


# In[56]:


#codigo para encontrar a coordenada do mouse para o click certo


time.sleep(5)
pyautogui.position()


# In[ ]:




