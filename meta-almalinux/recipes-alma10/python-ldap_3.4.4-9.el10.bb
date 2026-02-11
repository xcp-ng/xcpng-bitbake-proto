
PN = "python-ldap"
PE = "0"
PV = "3.4.4"
PR = "9.el10"
PACKAGES = "python3-ldap"


URI_python3-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-ldap-3.4.4-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-ldap = " \
 python3 \
 python3-pyasn1 \
 python3-pyasn1-modules \
 python3-setuptools \
 bash \
 glibc \
 openldap \
"
