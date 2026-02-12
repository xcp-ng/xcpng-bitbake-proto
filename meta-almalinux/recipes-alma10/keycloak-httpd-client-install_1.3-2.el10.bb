
inherit dnf-bridge

PN = "keycloak-httpd-client-install"
PE = "0"
PV = "1.3"
PR = "2.el10"
PACKAGES = "keycloak-httpd-client-install python3-keycloak-httpd-client-install"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/keycloak-httpd-client-install-1.3-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_keycloak-httpd-client-install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keycloak-httpd-client-install-1.3-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_keycloak-httpd-client-install}"
RDEPENDS:keycloak-httpd-client-install = " \
 python3-keycloak-httpd-client-install \
"

URI_python3-keycloak-httpd-client-install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-keycloak-httpd-client-install-1.3-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-keycloak-httpd-client-install}"
RDEPENDS:python3-keycloak-httpd-client-install = " \
 python3 \
 python3-requests \
 keycloak-httpd-client-install \
 python3-jinja2 \
 python3-lxml \
 python3-requests-oauthlib \
"
