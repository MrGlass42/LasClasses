function HideAndShowElement(Element) 
{
            var x = document.getElementById(Element);

            if (x.style.display === "none") 
			{
                x.style.display = "block";
            } 
			else 
			{
                x.style.display = "none";
            }
        }

        function FormataCpf(evt) 
		{
            vr = (navigator.appName == 'Netscape')
                ? evt.target.value : evt.srcElement.value;
            if (vr.length == 3)
                vr = vr + ".";
            if (vr.length == 7)
                vr = vr + ".";
            if (vr.length == 11)
                vr = vr + "-";
            return vr;

        }

        function FormataCnpj(evt) 
		{
            vr = (navigator.appName == 'Netscape')
                ? evt.target.value : evt.srcElement.value;
            if (vr.length == 2)
                vr = vr + ".";
            if (vr.length == 6)
                vr = vr + ".";
            if (vr.length == 10)
                vr = vr + "/";
            if (vr.length == 15)
                vr = vr + "-";
            return vr;
        }


        function setData() 
		{
            var ano = document.getElementById('ano').value;
            var mes = document.getElementById('mes').value;
            var dia = document.getElementById('dia').value;


            if (ano < 1999)
            {
                document.getElementById('ano').value = "";
                HideAndShowElement('tempa');
            }
            else
                document.getElementByName('DataNascimento').value = dia + "/" + mes + "/" + ano;
        }