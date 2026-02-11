
PN = "keycloak-httpd-client-install"
PE = "0"
PV = "1.3"
PR = "2.el10"
PACKAGES = "keycloak-httpd-client-install python3-keycloak-httpd-client-install"


URI_keycloak-httpd-client-install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keycloak-httpd-client-install-1.3-2.el10.noarch.rpm;unpack=0"
RDEPENDS:keycloak-httpd-client-install = "/usr/bin/keycloak-httpd-client-install ( )"
RPROVIDES:keycloak-httpd-client-install = "keycloak-httpd-client-install ( =  1.3-2.el10)"

URI_python3-keycloak-httpd-client-install = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-keycloak-httpd-client-install-1.3-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-keycloak-httpd-client-install = "/usr/bin/python3 ( ) python3-requests ( ) python3-lxml ( ) python3-jinja2 ( ) python3-requests-oauthlib ( ) python(abi) ( =  3.12) keycloak-httpd-client-install ( =  1.3-2.el10)"
RPROVIDES:python3-keycloak-httpd-client-install = "python-keycloak-httpd-client-install ( =  1.3-2.el10) python3-keycloak-httpd-client-install ( =  1.3-2.el10) python3.12-keycloak-httpd-client-install ( =  1.3-2.el10) python3.12dist(keycloak-httpd-client-install) ( =  1.3) python3dist(keycloak-httpd-client-install) ( =  1.3)"
