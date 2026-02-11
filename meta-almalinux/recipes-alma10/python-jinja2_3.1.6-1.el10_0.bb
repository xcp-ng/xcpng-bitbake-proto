
PN = "python-jinja2"
PE = "0"
PV = "3.1.6"
PR = "1.el10_0"
PACKAGES = "python3-jinja2 python3-jinja2+i18n"


URI_python3-jinja2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jinja2-3.1.6-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-jinja2 = "python(abi) ( =  3.12) python3.12dist(markupsafe) ( >=  2)"
RPROVIDES:python3-jinja2 = "python-jinja2 ( =  3.1.6-1.el10_0) python3-jinja2 ( =  3.1.6-1.el10_0) python3.12-jinja2 ( =  3.1.6-1.el10_0) python3.12dist(jinja2) ( =  3.1.6) python3dist(jinja2) ( =  3.1.6)"

URI_python3-jinja2+i18n = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-jinja2+i18n-3.1.6-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-jinja2+i18n = "python(abi) ( =  3.12) python3-jinja2 ( =  3.1.6-1.el10_0) python3.12dist(babel) ( >=  2.7)"
RPROVIDES:python3-jinja2+i18n = "python-jinja2+i18n ( =  3.1.6-1.el10_0) python3-jinja2+i18n ( =  3.1.6-1.el10_0) python3.12-jinja2+i18n ( =  3.1.6-1.el10_0) python3.12dist(jinja2[i18n]) ( =  3.1.6) python3dist(jinja2[i18n]) ( =  3.1.6)"
