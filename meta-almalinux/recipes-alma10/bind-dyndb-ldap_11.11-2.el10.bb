
inherit dnf-bridge

PN = "bind-dyndb-ldap"
PE = "0"
PV = "11.11"
PR = "2.el10"
PACKAGES = "bind-dyndb-ldap"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/bind-dyndb-ldap-11.11-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bind-dyndb-ldap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-dyndb-ldap-11.11-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bind-dyndb-ldap}"
RDEPENDS:bind-dyndb-ldap = " \
 softhsm \
 libuuid \
 bind-libs \
 pkcs11-provider \
 krb5-libs \
 bash \
 glibc \
 bind \
 openldap \
"
