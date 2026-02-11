
PN = "python-jinja2"
PE = "0"
PV = "3.1.6"
PR = "1.el10_0"
PACKAGES = "python3-jinja2 python3-jinja2+i18n"


URI_python3-jinja2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-jinja2-3.1.6-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-jinja2 = " \
 python3 \
 python3-markupsafe \
"

URI_python3-jinja2+i18n = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-jinja2+i18n-3.1.6-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:python3-jinja2+i18n = " \
 python3 \
 python3-jinja2 \
 python3-babel \
"
